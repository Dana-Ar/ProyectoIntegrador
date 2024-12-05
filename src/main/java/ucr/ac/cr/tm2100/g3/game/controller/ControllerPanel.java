/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.tm2100.g3.game.controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import ucr.ac.cr.tm2100.g3.game.view.JugarFrame;
import ucr.ac.cr.tm2100.g3.game.view.PanelJugar;

/**
 *
 * @author danar
 */
public class ControllerPanel implements KeyListener {  //Esta clase escucha las teclas que permiten mover el personaje

    private PanelJugar panelJugar;
    private JugarFrame jugarFrame;

    public ControllerPanel(JugarFrame jugarFrame) {
        this.jugarFrame = jugarFrame;
        this.panelJugar = jugarFrame.getPanel();
        this.jugarFrame.listenKey(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) { //Este se encarga de mover el personaje segun la direccion

        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                
                this.panelJugar.moverPersonaje(0, -1,"arriba");
                break;

            case KeyEvent.VK_DOWN:
                this.panelJugar.moverPersonaje(0, 1,"abajo");
                break;

            case KeyEvent.VK_LEFT:
                this.panelJugar.moverPersonaje(-1, 0,"izquierda");
                break;

            case KeyEvent.VK_RIGHT:
                this.panelJugar.moverPersonaje(1, 0,"derecha");
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
