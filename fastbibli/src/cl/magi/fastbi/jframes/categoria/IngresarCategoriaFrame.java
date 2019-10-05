/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.magi.fastbi.jframes.categoria;

import cl.magi.fastbi.dao.CategoriaService;
import cl.magi.fastbi.dto.Categoria;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jmfix
 */
public class IngresarCategoriaFrame extends javax.swing.JFrame {

    /**
     * Creates new form IngresarCategoriaFrame
     */
    Categoria categoria;

    public IngresarCategoriaFrame() {
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
        CatJTable = new javax.swing.JTable();
        IngresarCatBtn = new javax.swing.JButton();
        CboBoxEliminarCat = new javax.swing.JComboBox<>();
        ModificarCatBtn = new javax.swing.JButton();
        EliminarCatBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        IngresarCatTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ModificarCatTxt = new javax.swing.JTextField();
        IdCatTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        IdCatTxt1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        CatJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(CatJTable);

        IngresarCatBtn.setText("Ingresar");
        IngresarCatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarCatBtnActionPerformed(evt);
            }
        });

        ModificarCatBtn.setText("Modificar");
        ModificarCatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarCatBtnActionPerformed(evt);
            }
        });

        EliminarCatBtn.setText("Eliminar");
        EliminarCatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarCatBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingresar Categoria");

        jLabel2.setText("Eliminar Categoria");

        jLabel3.setText("Modificar Categoria");

        jLabel4.setText("ID :");

        jLabel5.setText("ID :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 127, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ModificarCatTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IdCatTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(IngresarCatTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                .addComponent(IdCatTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CboBoxEliminarCat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IngresarCatBtn)
                    .addComponent(EliminarCatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ModificarCatBtn))
                .addGap(18, 18, 18))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IdCatTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IngresarCatBtn)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IngresarCatTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CboBoxEliminarCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EliminarCatBtn)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(IdCatTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ModificarCatBtn)
                            .addComponent(ModificarCatTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarFormulario() {
        this.IdCatTxt1.setText("");
        this.IdCatTxt.setText("");
        this.IngresarCatTxt.setText("");
        this.ModificarCatTxt.setText("");
    }

    private void cargarAutorCbx() {
        this.CboBoxEliminarCat.removeAllItems();
        CategoriaService categoriaService = new CategoriaService();
        List<Categoria> categorias = categoriaService.obtenercategorias();
        for (Categoria categoria : categorias) {
            this.CboBoxEliminarCat.addItem(categoria);
        }
    }

    private void cargarJtable() {

        DefaultTableModel modelo = new DefaultTableModel();
        List<Categoria> categorias = new CategoriaService().obtenercategorias();

        modelo.addColumn("ID");
        modelo.addColumn("Nombre de la categoria");

        Object[] fila = new Object[2];
        for (Categoria cat : categorias) {
            fila[0] = cat.getIdCat();
            fila[1] = cat.getNombreCat();
            modelo.addRow(fila);
        }

        CatJTable.setModel(modelo);

    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        limpiarFormulario();
        cargarAutorCbx();
        cargarJtable();

    }//GEN-LAST:event_formWindowOpened

    private void IngresarCatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarCatBtnActionPerformed
        // TODO add your handling code here:
        try {
            Categoria categoria = new Categoria();
            categoria.setIdCat(Integer.parseInt(IdCatTxt1.getText()));
            categoria.setNombreCat(IngresarCatTxt.getText());

            if (new CategoriaService().ingresarCategoria(categoria)) {
                JOptionPane.showMessageDialog(this, "Se ingresó correctamente", "Ingresado", JOptionPane.INFORMATION_MESSAGE);
                limpiarFormulario();
                cargarJtable();
                cargarAutorCbx();
            } else {
                JOptionPane.showMessageDialog(this, "Error al ingresar categoria", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero", "Error de validación", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_IngresarCatBtnActionPerformed

    private void EliminarCatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarCatBtnActionPerformed
        // TODO add your handling code here:
        try {
            List<Categoria> categorias = new CategoriaService().obtenercategorias();
            int id = Integer.parseInt(CboBoxEliminarCat.getSelectedItem().toString());
            boolean esta = false;
            for (Categoria es : categorias) {
                if (es.getIdCat() == id) {
                    esta = true;
                    if (new CategoriaService().eliminatCategoria(id)) {
                        JOptionPane.showMessageDialog(this, "Se borró correctamente la categoria con ID: " + id, "Borrado", JOptionPane.INFORMATION_MESSAGE);
                        cargarJtable();
                        cargarAutorCbx();
                    } else {
                        JOptionPane.showMessageDialog(this, "Hubo un error al borrar la categoria", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                }
            }
            if (!esta) {
                JOptionPane.showMessageDialog(this, "No se encuentra una categoria con esa ID", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero", "Error de validación", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_EliminarCatBtnActionPerformed

    private void ModificarCatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarCatBtnActionPerformed
        // TODO add your handling code here:

        try {
            categoria.setIdCat(Integer.parseInt(IdCatTxt.getText().trim()));
            categoria.setNombreCat(ModificarCatTxt.getText().trim());

            if (new CategoriaService().actualizarCategoria(categoria)) {
                JOptionPane.showMessageDialog(this, "Categoria con código " + categoria.getIdCat()
                        + "se actualizo correctamente", "Correcto", JOptionPane.INFORMATION_MESSAGE);
                limpiarFormulario();
                cargarJtable();
                cargarAutorCbx();
            } else {
                JOptionPane.showMessageDialog(this, "Ocurrió un error", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero", "Error de validación", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_ModificarCatBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CatJTable;
    private javax.swing.JComboBox<Categoria> CboBoxEliminarCat;
    private javax.swing.JButton EliminarCatBtn;
    private javax.swing.JTextField IdCatTxt;
    private javax.swing.JTextField IdCatTxt1;
    private javax.swing.JButton IngresarCatBtn;
    private javax.swing.JTextField IngresarCatTxt;
    private javax.swing.JButton ModificarCatBtn;
    private javax.swing.JTextField ModificarCatTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
