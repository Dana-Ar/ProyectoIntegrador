/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.tm2100.g3.game.controller;

import ucr.ac.cr.tm2100.g3.game.view.FrameHistory;
import ucr.ac.cr.tm2100.g3.game.view.FrameInstructions;
import ucr.ac.cr.tm2100.g3.game.view.GUIFrameMenu;
import ucr.ac.cr.tm2100.g3.game.view.JugarFrame;
/**
 *
 * @author danar
 */
public class ControllerGame {
    private GUIFrameMenu guiFrameG;
    private FrameInstructions instructions;
    private FrameHistory history;
    private JugarFrame jugar;
    private ControllerButtons controllerB;
    
    public ControllerGame() {
        System.out.println("ControlGame");
        guiFrameG = new GUIFrameMenu();
        guiFrameG.setLocationRelativeTo(null);
        
        instructions = new FrameInstructions();
        history = new FrameHistory();
        jugar = new JugarFrame();
        
        controllerB = new ControllerButtons();
        controllerB.setGuiFrameG(guiFrameG);
        controllerB.setFrameInstructions(instructions);
        controllerB.setFrameHistory(history);
        controllerB.setJugarFrame(jugar);
        
        guiFrameG.setController(controllerB);
        guiFrameG.setVisible(true);
    }
}
