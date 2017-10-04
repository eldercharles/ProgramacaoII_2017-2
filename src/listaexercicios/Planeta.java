/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Planeta extends javax.swing.JFrame {

    /**
     * Creates new form Planeta
     */
    public Planeta() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPeso = new javax.swing.JLabel();
        btnCalcPeso = new javax.swing.JButton();
        lblPlaneta = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        jRadioMercurio = new javax.swing.JRadioButton();
        jRadioVenus = new javax.swing.JRadioButton();
        jRadioMarte = new javax.swing.JRadioButton();
        jRadioJupiter = new javax.swing.JRadioButton();
        jRadioUrano = new javax.swing.JRadioButton();
        jRadioSaturno = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPeso.setText("Peso na Terra (kg):");

        btnCalcPeso.setText("Calcular Peso");
        btnCalcPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcPesoActionPerformed(evt);
            }
        });

        lblPlaneta.setText("Selecione o Planeta:");

        jRadioMercurio.setText("Mercúrio");
        jRadioMercurio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioMercurioActionPerformed(evt);
            }
        });

        jRadioVenus.setText("Vênus");

        jRadioMarte.setText("Marte");
        jRadioMarte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioMarteActionPerformed(evt);
            }
        });

        jRadioJupiter.setText("Júpiter");
        jRadioJupiter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioJupiterActionPerformed(evt);
            }
        });

        jRadioUrano.setText("Urano");
        jRadioUrano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioUranoActionPerformed(evt);
            }
        });

        jRadioSaturno.setText("Saturno");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPeso)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioMercurio)
                            .addComponent(jRadioVenus))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioMarte)
                            .addComponent(jRadioJupiter))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioSaturno)
                            .addComponent(jRadioUrano)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPlaneta)
                            .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnCalcPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblPeso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcPeso))
                .addGap(17, 17, 17)
                .addComponent(lblPlaneta)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioMercurio)
                    .addComponent(jRadioMarte)
                    .addComponent(jRadioSaturno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioVenus)
                    .addComponent(jRadioJupiter)
                    .addComponent(jRadioUrano, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioMercurioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioMercurioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioMercurioActionPerformed

    private void jRadioMarteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioMarteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioMarteActionPerformed

    private void jRadioJupiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioJupiterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioJupiterActionPerformed

    private void jRadioUranoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioUranoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioUranoActionPerformed

    private void btnCalcPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcPesoActionPerformed
       double pesoDaTerra = Double.parseDouble(txtPeso.getText());
        if(jRadioMercurio.isSelected()){
         double peso = pesoDaTerra /10 * 0.37;
            JOptionPane.showMessageDialog(btnCalcPeso, " O seu peso em Mercúrio é: " + peso);
       }
          
        else if (jRadioMarte.isSelected()) {
        double peso = pesoDaTerra /10 * 0.38;
         JOptionPane.showMessageDialog(btnCalcPeso, " O seu peso em Marte é: " + peso);
        
        }
        else if (jRadioSaturno.isSelected()) {
        double peso = pesoDaTerra /10 * 1.15;
         JOptionPane.showMessageDialog(btnCalcPeso, " O seu peso em Saturno é: " + peso);
        
    }//GEN-LAST:event_btnCalcPesoActionPerformed
       else if (jRadioVenus.isSelected()) {
        double peso = pesoDaTerra /10 * 0.88;
         JOptionPane.showMessageDialog(btnCalcPeso, " O seu peso em Vênus é: " + peso);
       }
        else if (jRadioJupiter.isSelected()) {
        double peso = pesoDaTerra /10 * 2.64;
         JOptionPane.showMessageDialog(btnCalcPeso, " O seu peso em Júpiter é: " + peso);
        } 
         else if (jRadioUrano.isSelected()) {
        double peso = pesoDaTerra /10 * 1.17;
         JOptionPane.showMessageDialog(btnCalcPeso, " O seu peso em Urano é: " + peso);
         }
       }
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
            java.util.logging.Logger.getLogger(Planeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Planeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Planeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Planeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Planeta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcPeso;
    private javax.swing.JRadioButton jRadioJupiter;
    private javax.swing.JRadioButton jRadioMarte;
    private javax.swing.JRadioButton jRadioMercurio;
    private javax.swing.JRadioButton jRadioSaturno;
    private javax.swing.JRadioButton jRadioUrano;
    private javax.swing.JRadioButton jRadioVenus;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblPlaneta;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
