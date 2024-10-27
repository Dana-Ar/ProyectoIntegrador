/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ucr.ac.cr.tm2100.g3.game.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.tm2100.g3.game.controller.ControllerButtons;
import ucr.ac.cr.tm2100.g3.game.controller.ControllerGame;

/**
 *
 * @author danar
 */
public class JugarFrame extends javax.swing.JFrame {
    
    private ControllerGame controllerG;

    /**
     * Creates new form JugarFrame
     */
    public JugarFrame() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
    }
    
    public void setController(ActionListener controller){
        this.btnVolverMenu.addActionListener(controller);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelJugar1 = new ucr.ac.cr.tm2100.g3.game.view.PanelJugar();
        btnVolverMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelJugar1.setPreferredSize(new java.awt.Dimension(1067, 800));

        btnVolverMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laberinto 2024-Final-ButtonVolverMenu.png"))); // NOI18N
        btnVolverMenu.setActionCommand("volverMenu");
        btnVolverMenu.setPreferredSize(new java.awt.Dimension(205, 86));

        javax.swing.GroupLayout panelJugar1Layout = new javax.swing.GroupLayout(panelJugar1);
        panelJugar1.setLayout(panelJugar1Layout);
        panelJugar1Layout.setHorizontalGroup(
            panelJugar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJugar1Layout.createSequentialGroup()
                .addContainerGap(816, Short.MAX_VALUE)
                .addComponent(btnVolverMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        panelJugar1Layout.setVerticalGroup(
            panelJugar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJugar1Layout.createSequentialGroup()
                .addContainerGap(661, Short.MAX_VALUE)
                .addComponent(btnVolverMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelJugar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelJugar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main (String args[]){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JugarFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolverMenu;
    private ucr.ac.cr.tm2100.g3.game.view.PanelJugar panelJugar1;
    // End of variables declaration//GEN-END:variables
}
