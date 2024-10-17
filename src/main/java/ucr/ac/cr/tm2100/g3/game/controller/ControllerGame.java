/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.tm2100.g3.game.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.tm2100.g3.game.view.GUIFrameMenu;

/**
 *
 * @author danar
 */
public class ControllerGame implements ActionListener{
    private GUIFrameMenu guiFrameG;
    

    public ControllerGame() {
        guiFrameG = new GUIFrameMenu();
        
        this.guiFrameG.listenButton((ActionListener) this);
        guiFrameG.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case "->":
                System.exit(0);
                break;
        }
    }
}
