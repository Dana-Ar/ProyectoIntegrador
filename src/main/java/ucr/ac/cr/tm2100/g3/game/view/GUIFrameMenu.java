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
        
        this.setLocationRelativeTo(null);
        
    }
    
    public void listenButton (ActionListener controller){ // cambiar por boton de salida
        this.btnExtit.addActionListener(controller);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHistoria = new javax.swing.JButton();
        btnInstrucciones = new javax.swing.JButton();
        btnJugar = new javax.swing.JButton();
        btnExtit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHistoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InstruccionesPro-ButtonHistoria.png"))); // NOI18N
        btnHistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoriaActionPerformed(evt);
            }
        });
        getContentPane().add(btnHistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 240, 80));

        btnInstrucciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InstruccionesPro-ButtonInstrucciones.png"))); // NOI18N
        btnInstrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstruccionesActionPerformed(evt);
            }
        });
        getContentPane().add(btnInstrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 340, 80));

        btnJugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InstruccionesPro-ButtonJugar.png"))); // NOI18N
        getContentPane().add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, 240, 100));

        btnExtit.setBackground(new java.awt.Color(3, 36, 48));
        btnExtit.setForeground(javax.swing.UIManager.getDefaults().getColor("nb.startpage.contentheader.color1"));
        btnExtit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InstruccionesPro-ButtonSalir.png"))); // NOI18N
        btnExtit.setText("->");
        btnExtit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExtitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExtit, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 680, 110, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InstruccionesPro.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoriaActionPerformed
        FrameHistory newHistory = new FrameHistory();
        
        newHistory.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHistoriaActionPerformed

    private void btnInstruccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstruccionesActionPerformed
        FrameInstructions newInstructions = new FrameInstructions();
        
        newInstructions.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInstruccionesActionPerformed

    private void btnExtitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExtitActionPerformed
        
    }//GEN-LAST:event_btnExtitActionPerformed
    
     
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
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
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
