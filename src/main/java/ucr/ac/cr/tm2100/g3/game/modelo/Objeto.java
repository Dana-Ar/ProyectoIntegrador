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
public class Objeto {
    private int x, y;
    private boolean recolectado;
    private ImageIcon imagen;

    public Objeto(int x, int y,ImageIcon imagen) {
        this.x = x;
        this.y = y;
        this.imagen = imagen;
        this.recolectado = false;
    }
    
    public void dibujar(Graphics g) {
        if (!recolectado) { // Solo dibuja el elemento si no ha sido recolectado
            g.drawImage(imagen.getImage(), x*34, (y*34)-10, null);
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isRecolectado() {
        return recolectado;
    }

    public void recolectar() {
        this.recolectado = true;
    }
    
}
