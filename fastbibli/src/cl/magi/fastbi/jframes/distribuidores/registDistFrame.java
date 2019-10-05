/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.magi.fastbi.jframes.distribuidores;

import cl.magi.fastbi.dao.DistribuidorService;
import cl.magi.fastbi.dto.Distribuidor;
import javax.swing.JOptionPane;

/**
 *
 * @author franc
 */
public class registDistFrame extends javax.swing.JFrame {

    /**
     * Creates new form registDistFrame
     */
    public registDistFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        rutTxt = new javax.swing.JTextField();
        anioTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        enviarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setText("Rut:");

        jLabel3.setText("Nombre de Empresa:");

        nombreTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTxtActionPerformed(evt);
            }
        });

        rutTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutTxtActionPerformed(evt);
            }
        });

        anioTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anioTxtActionPerformed(evt);
            }
        });

        jLabel4.setText("Año inicio:");

        enviarBtn.setText("Enviar");
        enviarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(enviarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(anioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rutTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rutTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enviarBtn)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarFormulario() {
        this.rutTxt.setText("");
        this.nombreTxt.setText("");
        this.anioTxt.setText("");
    }
    
    private void nombreTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTxtActionPerformed

    private void rutTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rutTxtActionPerformed

    private void anioTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anioTxtActionPerformed
        limpiarFormulario();
    }//GEN-LAST:event_anioTxtActionPerformed

    private void enviarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarBtnActionPerformed
        try {
            Distribuidor distribuidor = new Distribuidor();
            distribuidor.setRutDist(this.rutTxt.getText().trim());
            distribuidor.setNombreEmpDist(this.nombreTxt.getText().trim());

            distribuidor.setAnioInicioDist(Integer.parseInt(this.anioTxt.getText().trim()));

            DistribuidorService distribuidorService = new DistribuidorService();
            if (distribuidorService.ingresarDist(distribuidor)) {
                JOptionPane.showMessageDialog(rootPane, "Distribuidor ingresado correctamente");
                limpiarFormulario();
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error");
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane,
                "Verifique los datos", "Error de Validación",
                JOptionPane.WARNING_MESSAGE);
            try {
                int i = Integer.parseInt(this.rutTxt.getText().trim());
            } catch (NumberFormatException ex1) {

            }
            try {
                int i = Integer.parseInt(this.anioTxt.getText().trim());
            } catch (NumberFormatException ex1) {

            }
        }
    }//GEN-LAST:event_enviarBtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        rutTxt.setText("");
        limpiarFormulario();
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anioTxt;
    private javax.swing.JButton enviarBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JTextField rutTxt;
    // End of variables declaration//GEN-END:variables
}
