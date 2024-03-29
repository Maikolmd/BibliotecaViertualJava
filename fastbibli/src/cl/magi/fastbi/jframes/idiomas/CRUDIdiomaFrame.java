/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.magi.fastbi.jframes.idiomas;

import cl.magi.fastbi.dto.Idioma;
import cl.magi.fastbi.jframes.estado.*;
import cl.magi.fastbi.jframes.idiomas.*;
import cl.magi.fastbi.jframes.categoria.*;

/**
 *
 * @author jmfix
 */
public class CRUDIdiomaFrame extends javax.swing.JFrame {

    /**
     * Creates new form IngresarCategoriaFrame
     */
    public CRUDIdiomaFrame() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        IidomaJTable = new javax.swing.JTable();
        IngresarIdiomaBtn = new javax.swing.JButton();
        CboBoxEliminarIdioma = new javax.swing.JComboBox<>();
        ModificarIdiomaBtn = new javax.swing.JButton();
        EliminarIdiomaBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        IngresarIdiomaTxt = new javax.swing.JTextField();
        IdIdiomaTxt = new javax.swing.JTextField();
        ModificarIdiomaTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        IidomaJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(IidomaJTable);

        IngresarIdiomaBtn.setText("Ingresar");
        IngresarIdiomaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarIdiomaBtnActionPerformed(evt);
            }
        });

        ModificarIdiomaBtn.setText("Modificar");
        ModificarIdiomaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarIdiomaBtnActionPerformed(evt);
            }
        });

        EliminarIdiomaBtn.setText("Eliminar");
        EliminarIdiomaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarIdiomaBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingresar Idioma");

        jLabel2.setText("Eliminar Idioma");

        jLabel3.setText("ID :");

        jLabel4.setText("Modificar Idioma");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IngresarIdiomaTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(IdIdiomaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CboBoxEliminarIdioma, 0, 189, Short.MAX_VALUE)
                            .addComponent(ModificarIdiomaTxt))))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IngresarIdiomaBtn)
                    .addComponent(EliminarIdiomaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ModificarIdiomaBtn))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IngresarIdiomaBtn)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IngresarIdiomaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CboBoxEliminarIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EliminarIdiomaBtn)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdIdiomaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(ModificarIdiomaBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ModificarIdiomaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.IdIdiomaTxt.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void IngresarIdiomaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarIdiomaBtnActionPerformed
        
        
        
    }//GEN-LAST:event_IngresarIdiomaBtnActionPerformed

    private void EliminarIdiomaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarIdiomaBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarIdiomaBtnActionPerformed

    private void ModificarIdiomaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarIdiomaBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarIdiomaBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Idioma> CboBoxEliminarIdioma;
    private javax.swing.JButton EliminarIdiomaBtn;
    private javax.swing.JTextField IdIdiomaTxt;
    private javax.swing.JTable IidomaJTable;
    private javax.swing.JButton IngresarIdiomaBtn;
    private javax.swing.JTextField IngresarIdiomaTxt;
    private javax.swing.JButton ModificarIdiomaBtn;
    private javax.swing.JTextField ModificarIdiomaTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
