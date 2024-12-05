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
public class Cofre{
    private int x, y;
    private ImageIcon imagen;
    
    public Cofre(int x, int y,ImageIcon imagen) {
        this.x = x;
        this.y = y;
        this.imagen = imagen;
    }
    
    public void dibujar(Graphics g) {
        imagen.paintIcon(null, g, x, y);
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public ImageIcon getImage(){
        return imagen;
    }
}
