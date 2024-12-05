/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.tm2100.g3.game.modelo;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author danar
 */
public class Enemigo {
    private int x, y;
    private Random random = new Random();
    private ImageIcon imagen;

    public Enemigo(int x, int y, ImageIcon imagen) {
        this.x = x;
        this.y = y;
        this.imagen = imagen;
    }
    
    
    public void moverConLogica(int maxX, int maxY, LaberintoModel matrizLaberinto) {
        List<int[]> direccionesValidas = new ArrayList<>();

        if (y > 0 && matrizLaberinto.esCamino(x, y - 1)) {
            direccionesValidas.add(new int[]{x, y - 1}); // Arriba
        }
        if (y < maxY - 1 && matrizLaberinto.esCamino(x, y + 1)) {
            direccionesValidas.add(new int[]{x, y + 1}); // Abajo
        }
        if (x > 0 && matrizLaberinto.esCamino(x - 1, y)) {
            direccionesValidas.add(new int[]{x - 1, y}); // Izquierda
        }
        if (x < maxX - 1 && matrizLaberinto.esCamino(x + 1, y)) {
            direccionesValidas.add(new int[]{x + 1, y}); // Derecha
        }

        // Si hay direcciones válidas, elige una aleatoriamente
        if (!direccionesValidas.isEmpty()) {
            int[] nuevaPosicion = direccionesValidas.get(random.nextInt(direccionesValidas.size()));
            x = nuevaPosicion[0];
            y = nuevaPosicion[1];
        }
    }
    
    public ImageIcon getImage(){
        return imagen;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public void dibujar(Graphics g){
        imagen.paintIcon(null, g, x, y);
    }
    
}
