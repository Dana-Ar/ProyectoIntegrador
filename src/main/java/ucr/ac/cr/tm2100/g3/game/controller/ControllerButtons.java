/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.tm2100.g3.game.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.tm2100.g3.game.view.FrameHistory;
import ucr.ac.cr.tm2100.g3.game.view.FrameInstructions;
import ucr.ac.cr.tm2100.g3.game.view.GUIFrameMenu;
import ucr.ac.cr.tm2100.g3.game.view.JugarFrame;

/**
 *
 * @author danar
 */
public class ControllerButtons implements ActionListener { //clase encargada de escuchar los botones

    private GUIFrameMenu guiFrameG;
    private FrameInstructions instructionsFrame;
    private FrameHistory historyFrame;
    private JugarFrame jugarFrame;

    public ControllerButtons(GUIFrameMenu guiFrameG, FrameInstructions instructionsFrame, FrameHistory historyFrame, JugarFrame jugarFrame) {
        this.guiFrameG = guiFrameG;
        this.instructionsFrame = instructionsFrame;
        this.historyFrame = historyFrame;
        this.jugarFrame = jugarFrame;
    }

    public void setControllers() {
        guiFrameG.setController(this);
        instructionsFrame.setController(this);
        historyFrame.setController(this);
        jugarFrame.setController(this);
    }

    public void showHistory() {  //Todas estas se encargan de las acciones que se realizan al presionar los botones
        guiFrameG.setVisible(false);
        historyFrame.setLocationRelativeTo(null);
        historyFrame.setVisible(true);
    }

    public void showInstructions() {
        guiFrameG.setVisible(false);
        instructionsFrame.setLocationRelativeTo(null);
        instructionsFrame.setVisible(true);
    }

    public void showGame() {
        guiFrameG.setVisible(false);
        jugarFrame.setLocationRelativeTo(null);
        jugarFrame.setVisible(true);
        jugarFrame.setFocusable(true);
        jugarFrame.requestFocus();
        
        jugarFrame.getPanel().reiniciar();  //Esto 
        jugarFrame.getPanel().repaint();
    }

    public void extit() {
        System.exit(0);
    }

    public void returnMenu() {
        historyFrame.setVisible(false);
        instructionsFrame.setVisible(false);
        jugarFrame.setVisible(false);

        guiFrameG.setLocationRelativeTo(null);
        guiFrameG.setVisible(true);
    }

    public void reiniciarJuego() {
        jugarFrame.getPanel().reiniciar();
        jugarFrame.getPanel().repaint();
        jugarFrame.setFocusable(true);
        jugarFrame.requestFocus();
        jugarFrame.reiniciarJuego();
    }
    
    public void pausar(){
        jugarFrame.pausarJuego();
    }

    @Override
    public void actionPerformed(ActionEvent e) { //El switch que se encarga de que se ejecuten los metodos segun el caso (De los botones)
        String action = e.getActionCommand();
        switch (action) {
            case "instrucciones":
                showInstructions();
                break;
            case "historia":
                showHistory();
                break;
            case "jugar":
                showGame();
                break;
            case "salir":
                extit();
                break;
            case "volverMenu":
                returnMenu();
                break;

            case "Pausa":
                pausar();
                break;
            case "Reiniciar":
                reiniciarJuego();
                break;
        }
    }

}
