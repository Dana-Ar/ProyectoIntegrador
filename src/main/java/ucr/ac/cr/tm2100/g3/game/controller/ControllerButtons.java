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
public class ControllerButtons implements ActionListener{
    private GUIFrameMenu guiFrameG;
    private FrameInstructions instructions;
    private FrameHistory history;
    private JugarFrame jugar;

    public ControllerButtons() {

    }

    public void setGuiFrameG(GUIFrameMenu guiFrameG) {
        this.guiFrameG = guiFrameG;
    }
    
    public void setFrameInstructions(FrameInstructions instructions){
        this.instructions = instructions;
        instructions.setController(this);
    }
    
    public void setFrameHistory(FrameHistory history){
        this.history = history;
        history.setController(this);
    }
    
    public void setJugarFrame(JugarFrame jugar){
        this.jugar = jugar;
        jugar.setController(this);
    }
    
    
    
    public void showHistory(){
        guiFrameG.setVisible(false);
        history.setLocationRelativeTo(null);
        history.setVisible(true);
    }
    
    public void showInstructions(){
        guiFrameG.setVisible(false);
        instructions.setLocationRelativeTo(null);
        instructions.setVisible(true);
    }
    
    public void showGame(){
        guiFrameG.setVisible(false);
        jugar.setLocationRelativeTo(null);
        jugar.setVisible(true);
    }
    
    public void extit() {
        System.exit(0);
    }
    
    public void returnMenu(){
        history.setVisible(false);
        instructions.setVisible(false);
        jugar.setVisible(false);
        
        guiFrameG.setLocationRelativeTo(null);
        guiFrameG.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        switch (action){
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
        }
    }
    
}
