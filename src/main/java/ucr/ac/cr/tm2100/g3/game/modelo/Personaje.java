/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.tm2100.g3.game.modelo;

import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author danar
 */
public class Personaje {
    private ImageIcon personajeFrente,personajeAtras,personajeLadoD,personajeLadoI;
    private int x, y;
    private ImageIcon imagen;
    private int vidas = 3;

    public Personaje(int x, int y) {
        this.x = x;
        this.y = y;
        personajeFrente = new ImageIcon("./src/main/resources/CaraFrente.png");
        personajeAtras = new ImageIcon("./src/main/resources/CaraAtras.png");
        personajeLadoD = new ImageIcon("./src/main/resources/CaraLado.png");
        personajeLadoI = new ImageIcon("./src/main/resources/CaraLadoIz.png");
        this.imagen = personajeFrente;

    }

    public void mover(int dx, int dy,String direcion) { //Permite mover. stos parametros los recibe en la clase Controller panel, que escucha eventos de teclado
        x += dx;
        y += dy;
        
        switch (direcion) {  //Este switch recibe un String  por parametros, segun este, se pintara una imagen diferente.
            case "arriba":
                this.imagen = personajeAtras;
                break;
                
            case "abajo":
                this.imagen = personajeFrente;
                break;
                
            case "derecha":
                this.imagen = personajeLadoD;
                break;
                
            case "izquierda":
                this.imagen = personajeLadoI;
                break;
        }
    }

    public ImageIcon getImage() {
        return imagen;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
    

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void dibujar(Graphics g) {
        imagen.paintIcon(null, g, x, y);
    }

    public int getVidas() {
        return vidas;
    }

    public void perderVida() {
        vidas = vidas - 1;
    }
}
