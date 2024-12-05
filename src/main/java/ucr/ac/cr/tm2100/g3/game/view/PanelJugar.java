/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ucr.ac.cr.tm2100.g3.game.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import ucr.ac.cr.tm2100.g3.game.modelo.Cofre;
import ucr.ac.cr.tm2100.g3.game.modelo.Enemigo;
import ucr.ac.cr.tm2100.g3.game.modelo.LaberintoModel;
import ucr.ac.cr.tm2100.g3.game.modelo.Objeto;
import ucr.ac.cr.tm2100.g3.game.modelo.Personaje;

/**
 *
 * @author danar
 */
public class PanelJugar extends javax.swing.JPanel implements Runnable {

    private JugarFrame jugarFrame;

    private ImageIcon fondo;
    private LaberintoModel laberintoM;
    private Image camino, pared, puerta;

    private ImageIcon enemigoFrente;
    private ImageIcon cofre1, corazon;
    private Personaje personaje;
    private Enemigo enemigo;
    private Cofre cofre;
    private List<Objeto> objetos;
    private int objetosRecolectados = 0;
    private Thread hilo;

    /**
     * Creates new form PanelJugar
     */
    public PanelJugar() {

        initComponents();
        this.laberintoM = new LaberintoModel();
        cargarImagenes();
        this.setPreferredSize(new Dimension(400, 400));
        this.setFocusable(true);
        this.requestFocusInWindow();
        objetos = new ArrayList<>();
        inicializarObjetos();

    }

    private void cargarImagenes() {
        camino = new ImageIcon("./src/main/resources/laberinto Pasto.png").getImage();
        pared = new ImageIcon("./src/main/resources/laberinto Madera.png").getImage();
        puerta = new ImageIcon("./src/main/resources/puertaLaberinto.png").getImage();

        enemigoFrente = new ImageIcon("./src/main/resources/EnemigoFrente.png");
        cofre1 = new ImageIcon("./src/main/resources/cofre.png");
        corazon = new ImageIcon("./src/main/resources/Corazon.png");

        personaje = new Personaje(0, 15);
        enemigo = new Enemigo(14, 19, enemigoFrente);
        cofre = new Cofre(0, 19, cofre1);
    }

    public void setPanelJugar(JugarFrame jugarFrame) {
        this.jugarFrame = jugarFrame;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int[][] laberinto = this.laberintoM.getlaberinto();

        // tamaño celdas
        int size = 34; //Tamaño correcto para la interfaz

        for (int y = 0; y < laberinto.length; y++) {
            for (int x = 0; x < laberinto[y].length; x++) {
                switch (laberinto[y][x]) {
                    case 0:
                        g.drawImage(camino, x * size, y * size, size, size, this);
                        break;
                    case 1:
                        g.drawImage(pared, x * size, y * size, size, size, this);
                        break;
                    case 2:
                        g.drawImage(puerta, x * size, y * size, size, size, this);
                        break;
                }
            }
        }
        g.drawImage(personaje.getImage().getImage(), personaje.getX() * 34, (personaje.getY() * 34) - 10, null);
        g.drawImage(enemigo.getImage().getImage(), enemigo.getX() * 34, (enemigo.getY() * 34) - 10, null);
        g.drawImage(cofre.getImage().getImage(), cofre.getX() * 34, (cofre.getY() * 34) - 10, null);

        for (Objeto objeto : objetos) {
            objeto.dibujar(g);
        }

    }

    private void inicializarObjetos() {
        objetos.clear();
        objetos.add(new Objeto(4, 4, corazon));
        objetos.add(new Objeto(4, 10, corazon));
        objetos.add(new Objeto(16, 13, corazon));
    }

    public void moverPersonaje(int dx, int dy, String direccion) {
        int nuevaX = personaje.getX() + dx;
        int nuevaY = personaje.getY() + dy;
        int valorCelda = laberintoM.getValor(nuevaX, nuevaY);
        if (valorCelda != 1) {
            if (valorCelda == 2 && objetosRecolectados < 3) {
                JOptionPane.showMessageDialog(this, "Necesitas la magia de 3 corazones para abrir esta puerta"); //solo esta en esta opcion, por que es el unico por el cual se puede llegar a la meta
            } else if (valorCelda == 0 || valorCelda == 2) {
                personaje.mover(dx, dy, direccion);
                this.repaint();
            }
            if (valorCelda == 2 && objetosRecolectados >= 3) {
                JOptionPane.showMessageDialog(this, new ImageIcon("./src/main/resources/pantallaVictoria.png"));
                jugarFrame.reiniciarJuego();
            }
        }

    }

    public int getVidasPersonaje() {
        return personaje.getVidas();
    }

    public void moverEnemigo() {
        int maxX = laberintoM.getColumnas();
        int maxY = laberintoM.getFilas();
        enemigo.moverConLogica(maxX, maxY, laberintoM);
        verificarColision();
    }

    public void reiniciar() {
        personaje.setX(0);
        personaje.setY(15);
        personaje.setVidas(3);

        objetosRecolectados = 0;
        inicializarObjetos();
    }

    private void verificarColision() {
        if (personaje.getX() == enemigo.getX() && personaje.getY() == enemigo.getY()) {
            personaje.perderVida();
            jugarFrame.actualizarVidas(personaje.getVidas());
            if (personaje.getVidas() <= 0) {
                JOptionPane.showMessageDialog(this, new ImageIcon("./src/main/resources/pantallaPerdido.png"));
                jugarFrame.reiniciarJuego();
                return;
            }
        }
        if (personaje.getX() == cofre.getX() && personaje.getY() == cofre.getY()) {
            JOptionPane.showMessageDialog(this, new ImageIcon("./src/main/resources/pantallaHistoria.png"));
        }

        for (Objeto objeto : objetos) {
            if (!objeto.isRecolectado() && personaje.getX() == objeto.getX() && personaje.getY() == objeto.getY()) {
                objeto.recolectar();
                objetosRecolectados = objetosRecolectados + 1;
                System.out.println(objetosRecolectados);
                JOptionPane.showMessageDialog(this, "Ahora tienes mas poder");
                repaint();
            }
        }
    }

    public int getObjetosRecolectados() {  //Metodo para poder mostar el total de corazones recolectados
        return objetosRecolectados;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setPreferredSize(new java.awt.Dimension(500, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void iniciarHilo() {
        hilo = new Thread(this);
        hilo.start();
    }

    @Override
    public void run() {
        while (hilo != null) {
            moverEnemigo();
            this.revalidate();
            this.repaint();

            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(PanelJugar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
