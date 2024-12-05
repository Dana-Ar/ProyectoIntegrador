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
    private FrameInstructions instructionsFrame;
    private FrameHistory historyFrame;
    private JugarFrame jugarFrame;
    private ControllerButtons controllerButtons;
    private ControllerPanel controllerPanel;

    public ControllerGame() {   //Se crean los objetos de los frames
        guiFrameG = new GUIFrameMenu();
        guiFrameG.setLocationRelativeTo(null);

        instructionsFrame = new FrameInstructions();
        historyFrame = new FrameHistory();
        jugarFrame = new JugarFrame();
        controllerPanel = new ControllerPanel(jugarFrame);
        controllerButtons = new ControllerButtons(guiFrameG, instructionsFrame, historyFrame, jugarFrame);
        controllerButtons.setControllers();

        guiFrameG.setVisible(true);
    }
}
