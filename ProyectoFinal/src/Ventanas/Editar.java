package Ventanas;

import static Ventanas.Planilla.model;
import java.awt.Color;


public class Editar extends javax.swing.JFrame {

    
    int selected = 0, hrs,val,bruto, ROW;
    double por, bono,SPN, neto;
    
    public Editar() {
        initComponents();
        this.getContentPane().setBackground(new Color(54,141,199) );
        this.setLocationRelativeTo(null); ;
    }

    public void setTxtNewNom(String n) {
        txtNewNom.setText(n);
    }
    
    public void setTxtNewApe(String n ) {
        txtNewApe.setText(n);
    }
    
    public void setRbtnNewSoltero(boolean n) {
        rbtnNewSoltero.setSelected(n);
    }
    
    public void setRbtnNewCasado(boolean n) {
        rbtnNewCasado.setSelected(n);
    }
   
    public void setTxtNewCant_Hrs(String n) {
        txtNewCant_Hrs.setText(n);
    }
    
    public void setTxtNewVal_Hrs(String n) {
        txtNewVal_Hrs.setText(n);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNewNom = new javax.swing.JTextField();
        txtNewApe = new javax.swing.JTextField();
        txtNewVal_Hrs = new javax.swing.JTextField();
        rbtnNewCasado = new javax.swing.JRadioButton();
        rbtnNewSoltero = new javax.swing.JRadioButton();
        btnCancelar = new javax.swing.JButton();
        btnAplicar = new javax.swing.JButton();
        txtNewCant_Hrs = new javax.swing.JTextField();

        setTitle("EDICIÓN");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellido:");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Estado civil:");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cantidad de horas trabajadas");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Valor de hora:");

        txtNewNom.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N

        txtNewApe.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N

        txtNewVal_Hrs.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        txtNewVal_Hrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewVal_HrsActionPerformed(evt);
            }
        });

        rbtnNewCasado.setBackground(new java.awt.Color(54, 141, 199));
        buttonGroup1.add(rbtnNewCasado);
        rbtnNewCasado.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        rbtnNewCasado.setForeground(new java.awt.Color(255, 255, 255));
        rbtnNewCasado.setText("Casado(a)");
        rbtnNewCasado.setFocusPainted(false);

        rbtnNewSoltero.setBackground(new java.awt.Color(54, 141, 199));
        buttonGroup1.add(rbtnNewSoltero);
        rbtnNewSoltero.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        rbtnNewSoltero.setForeground(new java.awt.Color(255, 255, 255));
        rbtnNewSoltero.setText("Soltero(a)");
        rbtnNewSoltero.setFocusPainted(false);

        btnCancelar.setBackground(new java.awt.Color(34, 87, 122));
        btnCancelar.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorderPainted(false);
        btnCancelar.setFocusPainted(false);
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCancelarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCancelarMouseReleased(evt);
            }
        });
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAplicar.setBackground(new java.awt.Color(34, 87, 122));
        btnAplicar.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        btnAplicar.setForeground(new java.awt.Color(255, 255, 255));
        btnAplicar.setText("Aplicar");
        btnAplicar.setBorderPainted(false);
        btnAplicar.setFocusPainted(false);
        btnAplicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAplicarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAplicarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAplicarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAplicarMouseReleased(evt);
            }
        });
        btnAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarActionPerformed(evt);
            }
        });

        txtNewCant_Hrs.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        txtNewCant_Hrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewCant_HrsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnNewSoltero)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNewNom, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                .addComponent(txtNewApe))
                            .addComponent(rbtnNewCasado))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNewCant_Hrs, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNewVal_Hrs, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(122, 122, 122))))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAplicar)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNewNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNewApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rbtnNewSoltero))
                .addGap(18, 18, 18)
                .addComponent(rbtnNewCasado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNewCant_Hrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNewVal_Hrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAplicar))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNewVal_HrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewVal_HrsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewVal_HrsActionPerformed

    private void txtNewCant_HrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewCant_HrsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewCant_HrsActionPerformed

    private void btnAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarActionPerformed
        String nom, ape, civ;
        nom = txtNewNom.getText();
        ape = txtNewApe.getText();
        
        model.setValueAt(nom,selected,0);
        model.setValueAt(ape,selected,1);
        if (rbtnNewSoltero.isSelected()) {
            model.setValueAt(rbtnNewSoltero.getText(),selected,2);
            por = 0;
        }else if (rbtnNewCasado.isSelected()) {
            model.setValueAt(rbtnNewCasado.getText(),selected,2);
            por = 0.07;
        }
        
        hrs = Integer.parseInt(txtNewCant_Hrs.getText());
        val = Integer.parseInt(txtNewVal_Hrs.getText());
        bruto = hrs*val;
        SPN = bruto*0.13;
        bono = bruto*por;
        neto = (bruto-SPN)+bono;
        
        model.setValueAt(hrs,selected,3);
        model.setValueAt(val,selected,4);
        model.setValueAt(bruto,selected,5);
        model.setValueAt(SPN,selected,6);
        model.setValueAt(bono,selected,7);
        model.setValueAt(neto,selected,8);
        this.dispose();
    }//GEN-LAST:event_btnAplicarActionPerformed

                                        
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        btnCancelar.setBackground(new java.awt.Color(15,125,197));
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        btnCancelar.setBackground(new java.awt.Color(34,87,122));
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMousePressed
        btnCancelar.setBackground(new java.awt.Color(169,221,255));
    }//GEN-LAST:event_btnCancelarMousePressed

    private void btnCancelarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseReleased
        btnCancelar.setBackground(new java.awt.Color(34,87,122));
    }//GEN-LAST:event_btnCancelarMouseReleased

    private void btnAplicarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAplicarMouseEntered
        btnAplicar.setBackground(new java.awt.Color(15,125,197));
    }//GEN-LAST:event_btnAplicarMouseEntered

    private void btnAplicarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAplicarMouseExited
        btnAplicar.setBackground(new java.awt.Color(34,87,122));
    }//GEN-LAST:event_btnAplicarMouseExited

    private void btnAplicarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAplicarMousePressed
        btnAplicar.setBackground(new java.awt.Color(169,221,255));
    }//GEN-LAST:event_btnAplicarMousePressed

    private void btnAplicarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAplicarMouseReleased
        btnAplicar.setBackground(new java.awt.Color(34,87,122));
    }//GEN-LAST:event_btnAplicarMouseReleased

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editar().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAplicar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton rbtnNewCasado;
    private javax.swing.JRadioButton rbtnNewSoltero;
    private javax.swing.JTextField txtNewApe;
    private javax.swing.JTextField txtNewCant_Hrs;
    private javax.swing.JTextField txtNewNom;
    private javax.swing.JTextField txtNewVal_Hrs;
    // End of variables declaration//GEN-END:variables
}
