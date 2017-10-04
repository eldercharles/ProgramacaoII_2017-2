
package listaexercicios;

import java.awt.Color;
import javax.swing.JOptionPane;


public class PedraPapelTesoura extends javax.swing.JFrame {

    
    public PedraPapelTesoura() {
        initComponents();
    }
    
    public static int randInt(int min, int max) {
    java.util.Random rand = new java.util.Random();
    int randomNum = rand.nextInt((max - min) + 1) + min;
    
    return randomNum;
    
    }
    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblPedraPaTe = new javax.swing.JLabel();
        rbPedra = new javax.swing.JRadioButton();
        rbPapel = new javax.swing.JRadioButton();
        rbTesoura = new javax.swing.JRadioButton();
        butJogar = new javax.swing.JButton();
        rbPedraComputador = new javax.swing.JRadioButton();
        rbPapelComputador = new javax.swing.JRadioButton();
        rbTesouraComputador = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(450, 250));

        lblPedraPaTe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPedraPaTe.setText("                                 Pedra, Papel ou Tesoura?");

        buttonGroup1.add(rbPedra);
        rbPedra.setText("Pedra");
        rbPedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPedraActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbPapel);
        rbPapel.setText("Papel");
        rbPapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPapelActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbTesoura);
        rbTesoura.setText("Tesoura");
        rbTesoura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTesouraActionPerformed(evt);
            }
        });

        butJogar.setText("Jogar");
        butJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butJogarActionPerformed(evt);
            }
        });

        rbPedraComputador.setText("Pedra Oponente");
        rbPedraComputador.setEnabled(false);
        rbPedraComputador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPedraComputadorActionPerformed(evt);
            }
        });

        rbPapelComputador.setText("Papel Oponente");
        rbPapelComputador.setEnabled(false);
        rbPapelComputador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPapelComputadorActionPerformed(evt);
            }
        });

        rbTesouraComputador.setText("Tesoura Oponente");
        rbTesouraComputador.setEnabled(false);

        jLabel1.setText("Escolha seu item:");

        jLabel2.setText("Oponente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPedraPaTe, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbPedra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(butJogar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rbPapel)
                            .addComponent(rbTesoura))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbPapelComputador)
                            .addComponent(rbPedraComputador)
                            .addComponent(rbTesouraComputador))
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(90, 90, 90))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblPedraPaTe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbPedra)
                            .addComponent(butJogar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbPapel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbTesoura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(rbPedraComputador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbPapelComputador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbTesouraComputador)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbPedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPedraActionPerformed
        rbPapel.setSelected(false);
        rbTesoura.setSelected(false);
    }//GEN-LAST:event_rbPedraActionPerformed

    private void rbPapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPapelActionPerformed
        rbPedra.setSelected(false);
        rbTesoura.setSelected(false);
    }//GEN-LAST:event_rbPapelActionPerformed

    private void rbTesouraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTesouraActionPerformed
        rbPapel.setSelected(false);
        rbPedra.setSelected(false);
    }//GEN-LAST:event_rbTesouraActionPerformed

    private void butJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butJogarActionPerformed
        int numUsuario;
        int numComputador;
        
       numComputador = randInt(0,2);
      
       if (rbPedra.isSelected()) {
            numUsuario = 0;
        } 
       else if (rbPapel.isSelected()) {
            numUsuario = 1;
        } 
       else {
            numUsuario = 2;
        }
        
       switch (numComputador) {
            case 0: rbPedraComputador.setSelected(true); 
                    rbPedraComputador.setForeground(Color.red);
                    rbPapelComputador.setForeground(Color.black);
                    rbTesouraComputador.setForeground(Color.black);       
                            
                    rbPapelComputador.setSelected(false);
                    
                    rbTesouraComputador.setSelected(false);
                    
                 break;
            
            case 1: rbPapelComputador.setSelected(true);
                    rbPapelComputador.setForeground(Color.red);
                    rbPedraComputador.setForeground(Color.black);
                    rbTesouraComputador.setForeground(Color.black);
                    
                    rbPedraComputador.setSelected(false);
                
                    rbTesouraComputador.setSelected(false);
                break;
                
            case 2: rbTesouraComputador.setSelected(true);
                    rbTesouraComputador.setForeground(Color.red);
                    rbPedraComputador.setForeground(Color.black);
                    rbPapelComputador.setForeground(Color.black);
                    
                    rbPapelComputador.setSelected(false);
                
                    rbPedraComputador.setSelected(false);
                break;
               
        }
       
        if (numComputador == 0 && numUsuario == 1) {
            JOptionPane.showMessageDialog(this, "Parabéns você venceu!");
        } 
        else if (numComputador == 0 && numUsuario == 2) {
            JOptionPane.showMessageDialog(this, "Você perdeu!");
            
        } 
        else if (numComputador == 1 && numUsuario == 0) {
            JOptionPane.showMessageDialog(this, "Você perdeu!");
            
        } 
        else if (numComputador == 1 && numUsuario == 2) {
            JOptionPane.showMessageDialog(this, "Parabéns você venceu!");
        } 
        else if (numComputador == 2 && numUsuario == 0) {
            JOptionPane.showMessageDialog(this, "Parabéns você venceu!");
        } 
        else if (numComputador == 2 && numUsuario == 1) {
            JOptionPane.showMessageDialog(this, "Você perdeu!");
            
        }    
        else {
            JOptionPane.showMessageDialog(this, "Empate!");
        }
    }//GEN-LAST:event_butJogarActionPerformed

    private void rbPedraComputadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPedraComputadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbPedraComputadorActionPerformed

    private void rbPapelComputadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPapelComputadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbPapelComputadorActionPerformed

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
            java.util.logging.Logger.getLogger(PedraPapelTesoura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PedraPapelTesoura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PedraPapelTesoura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PedraPapelTesoura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PedraPapelTesoura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butJogar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblPedraPaTe;
    private javax.swing.JRadioButton rbPapel;
    private javax.swing.JRadioButton rbPapelComputador;
    private javax.swing.JRadioButton rbPedra;
    private javax.swing.JRadioButton rbPedraComputador;
    private javax.swing.JRadioButton rbTesoura;
    private javax.swing.JRadioButton rbTesouraComputador;
    // End of variables declaration//GEN-END:variables
}
