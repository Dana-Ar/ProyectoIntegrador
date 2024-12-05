/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ucr.ac.cr.tm2100.g3.game.view;

import java.awt.event.ActionListener;
/**
 *
 * @author danar
 */
public class GUIFrameMenu extends javax.swing.JFrame {
    
    /**
     * Creates new form GUIFrameMenu
     */
    public GUIFrameMenu() {
        initComponents();
    }
    
    public void setController(ActionListener controller){
        this.btnHistoria.addActionListener(controller);
        this.btnInstrucciones.addActionListener( controller);
        this.btnExtit.addActionListener( controller);
        this.btnJugar.addActionListener(controller);
    }
    
    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHistoria = new javax.swing.JButton();
        btnInstrucciones = new javax.swing.JButton();
        btnJugar = new javax.swing.JButton();
        btnExtit = new javax.swing.JButton();
        menuLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHistoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InstruccionesPro-ButtonHistoria.png"))); // NOI18N
        btnHistoria.setActionCommand("historia");
        getContentPane().add(btnHistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 240, 80));

        btnInstrucciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InstruccionesPro-ButtonInstrucciones.png"))); // NOI18N
        btnInstrucciones.setActionCommand("instrucciones");
        getContentPane().add(btnInstrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 340, 80));

        btnJugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InstruccionesPro-ButtonJugar.png"))); // NOI18N
        btnJugar.setActionCommand("jugar");
        getContentPane().add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, 240, 110));

        btnExtit.setBackground(new java.awt.Color(3, 36, 48));
        btnExtit.setForeground(javax.swing.UIManager.getDefaults().getColor("nb.startpage.contentheader.color1"));
        btnExtit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InstruccionesPro-ButtonSalir.png"))); // NOI18N
        btnExtit.setActionCommand("salir");
        getContentPane().add(btnExtit, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 680, 100, 50));

        menuLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InstruccionesPro.png"))); // NOI18N
        getContentPane().add(menuLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public static void main (String args[]){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIFrameMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExtit;
    private javax.swing.JButton btnHistoria;
    private javax.swing.JButton btnInstrucciones;
    private javax.swing.JButton btnJugar;
    private javax.swing.JLabel menuLabel;
    // End of variables declaration//GEN-END:variables
}
