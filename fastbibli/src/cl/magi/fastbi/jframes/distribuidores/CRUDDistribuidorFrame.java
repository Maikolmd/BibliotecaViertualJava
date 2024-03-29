/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.magi.fastbi.jframes.distribuidores;

import cl.magi.fastbi.dao.Distribuidor;
import cl.magi.fastbi.dto.DistribuidorService;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jmfix
 */
public class CRUDDistribuidorFrame extends javax.swing.JFrame {

    /**
     * Creates new form CRUDDistribuidorFrame
     */
    public CRUDDistribuidorFrame() {
        initComponents();
    }
    
    
    private void CargarCombo(){
        this.EliminarCbo.removeAllItems();
        DistribuidorService ds = new DistribuidorService(); 
        
    }
    private void CargarTabla(){
        DistribuidorService ds = new DistribuidorService();
        List<Distribuidor> distribuidores = ds.obtenerDistribuidores();
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("Rut");
        model.addColumn("Nombre Empresa ");
        model.addColumn("Direccion");
        model.addColumn("Telefono");
        model.addColumn("Anio dist");
        
        for(Distribuidor dist: distribuidores){
            Object[] fila=new Object[5];
            fila[0]=dist.getRut_empresa();
            fila[1]=dist.getNombre_empresa();
            fila[2]=dist.getAno_inicio();
            fila[3]=dist.getDireccion_empresa();
            fila[4]=dist.getTelefono_empresa();
            
            model.addRow(fila);
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Rut_Txt = new javax.swing.JTextField();
        NomEmp_Txt = new javax.swing.JTextField();
        Anio_Txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        DireccionEm_Txt = new javax.swing.JTextField();
        FonoEm_Txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DistribuidorJTable = new javax.swing.JTable();
        ModDistBtn = new javax.swing.JButton();
        IngrearDistBtn = new javax.swing.JButton();
        EliminarDisBtn = new javax.swing.JButton();
        EliminarCbo = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Rut Empresa :");

        jLabel2.setText("Nombre Empresa :");

        jLabel3.setText("Año de que Distribuye");
        jLabel3.setToolTipText("");

        jLabel4.setText("Direccion :");

        jLabel5.setText("Telefono :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Eliminar Distribuidor");

        jLabel8.setText("Buscar Por Rut :");

        DistribuidorJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        DistribuidorJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DistribuidorJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DistribuidorJTable);

        ModDistBtn.setText("Modificar");
        ModDistBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModDistBtnActionPerformed(evt);
            }
        });

        IngrearDistBtn.setText("Ingresar");

        EliminarDisBtn.setText("Eliminar");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Ingresar Distribuidor");

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel16.setText("*Seleccione distribuidor desde la tabla para modificar");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Gestionar Distribuidores ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Rut_Txt)
                                    .addComponent(NomEmp_Txt)
                                    .addComponent(Anio_Txt, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(EliminarCbo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(EliminarDisBtn))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(DireccionEm_Txt)
                                            .addComponent(FonoEm_Txt, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(IngrearDistBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(ModDistBtn, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addComponent(jLabel14))
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addComponent(jLabel17)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel17)
                .addGap(54, 54, 54)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rut_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DireccionEm_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IngrearDistBtn))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomEmp_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FonoEm_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ModDistBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Anio_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EliminarCbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EliminarDisBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DistribuidorJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DistribuidorJTableMouseClicked

        int a = DistribuidorJTable.getSelectedRow();
        
        NomMod_Txt.setText(String.valueOf(DistribuidorJTable.getValueAt(a,1 )));
        RutMod_Txt.setText(String.valueOf(DistribuidorJTable.getValueAt(a, 0)));
        AnioDisMod_Txt.setText(String.valueOf(DistribuidorJTable.getValueAt(a, 2)));
        DireMod_Txt.setText(String.valueOf(DistribuidorJTable.getValueAt(a, 3)));
        FonoMod_Txt.setText(String.valueOf(DistribuidorJTable.getValueAt(a, 4)));
    }//GEN-LAST:event_DistribuidorJTableMouseClicked

    private void ModDistBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModDistBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModDistBtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        CargarTabla();
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Anio_Txt;
    private javax.swing.JTextField DireccionEm_Txt;
    private javax.swing.JTable DistribuidorJTable;
    private javax.swing.JComboBox<Distribuidor> EliminarCbo;
    private javax.swing.JButton EliminarDisBtn;
    private javax.swing.JTextField FonoEm_Txt;
    private javax.swing.JButton IngrearDistBtn;
    private javax.swing.JButton ModDistBtn;
    private javax.swing.JTextField NomEmp_Txt;
    private javax.swing.JTextField Rut_Txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
