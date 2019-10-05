/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.magi.fastbi.jframes;

import cl.magi.fastbi.jframes.autor.MostrarAutorFrame;
import cl.magi.fastbi.jframes.autor.RegistroAutorFrame;
import cl.magi.fastbi.jframes.categoria.IngresarCategoriaFrame;
import cl.magi.fastbi.jframes.distribuidores.borrarDistribuidorFrame;
import cl.magi.fastbi.jframes.distribuidores.buscarDistribuidorFrame;
import cl.magi.fastbi.jframes.distribuidores.modificarDistFrame;
import cl.magi.fastbi.jframes.distribuidores.mostrarDistFrame;
import cl.magi.fastbi.jframes.distribuidores.registDistFrame;
import cl.magi.fastbi.jframes.editorial.CRUDIEditorialFrame;
import cl.magi.fastbi.jframes.estado.CRUDEstadoFrame;
import cl.magi.fastbi.jframes.factura.IngresarFacturaFrame;
import cl.magi.fastbi.jframes.idiomas.CRUDIdiomaFrame;
import cl.magi.fastbi.jframes.libros.registrarLibroFrame;
import cl.magi.fastbi.jframes.metodopago.CRUDMetodoPagoFrame;



/**
 *
 * @author sistemas
 */
public class PrincipalFrame extends javax.swing.JFrame {
    private registrarLibroFrame regLibroFrame = new registrarLibroFrame();
    private borrarDistribuidorFrame borrarDistFrame = new borrarDistribuidorFrame();
    private buscarDistribuidorFrame buscarDistFrame = new buscarDistribuidorFrame();
    private modificarDistFrame modificarDistFrame = new modificarDistFrame();
    private mostrarDistFrame mostrarDistFrame = new mostrarDistFrame();
    private registDistFrame registDistFrame = new registDistFrame();
    private MostrarAutorFrame mostrarAutorFrame = new MostrarAutorFrame();
    private RegistroAutorFrame registroAutorFrame = new RegistroAutorFrame();
    private IngresarCategoriaFrame ingresarCategoriaFrame = new IngresarCategoriaFrame();
    private CRUDIEditorialFrame crudIEditorialFrame = new CRUDIEditorialFrame();
    private CRUDEstadoFrame crudEstadoFrame = new CRUDEstadoFrame();
    private CRUDIdiomaFrame crudIdiomaFrame = new CRUDIdiomaFrame();
    private IngresarFacturaFrame ingresarFacturaFrame = new IngresarFacturaFrame();
    private CRUDMetodoPagoFrame crudMetodoPagoFrame = new CRUDMetodoPagoFrame();
    
    /**
     * Creates new form NewJFrame
     */
    public PrincipalFrame() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        librosMenu = new javax.swing.JMenu();
        librosMenuItem = new javax.swing.JMenu();
        registrarLibrosItem = new javax.swing.JMenuItem();
        modificarLibrosItem = new javax.swing.JMenuItem();
        BuscarLibrosItem = new javax.swing.JMenuItem();
        todoLibrosItem = new javax.swing.JMenuItem();
        borrarLibrosItem = new javax.swing.JMenuItem();
        detalleMenuItem = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        registAutoresMI = new javax.swing.JMenuItem();
        mostrarAutoresMI = new javax.swing.JMenuItem();
        editorialDetallesItem = new javax.swing.JMenuItem();
        catDetallesItem = new javax.swing.JMenuItem();
        idiomDetallesItem = new javax.swing.JMenuItem();
        estadoDetallesItem = new javax.swing.JMenuItem();
        distribuidoresMenu = new javax.swing.JMenu();
        registrarDistrib = new javax.swing.JMenuItem();
        modificarDistrib = new javax.swing.JMenuItem();
        todoDistrib = new javax.swing.JMenuItem();
        buscarDistrib = new javax.swing.JMenuItem();
        borrarDistrib = new javax.swing.JMenuItem();
        gesfacturaMenu = new javax.swing.JMenu();
        genfacturaFact = new javax.swing.JMenuItem();
        buscarFact = new javax.swing.JMenuItem();
        modificarFact = new javax.swing.JMenuItem();
        borrarFact = new javax.swing.JMenuItem();
        gescomprMenu = new javax.swing.JMenu();
        metodoPagoItem = new javax.swing.JMenuItem();
        transaccionMenuItem = new javax.swing.JMenu();
        comprarTrans = new javax.swing.JMenuItem();
        buscarCompTrans = new javax.swing.JMenuItem();
        modComprasTrans = new javax.swing.JMenuItem();
        anularTrans = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        librosMenu.setText("Libros");

        librosMenuItem.setText("Libros");

        registrarLibrosItem.setText("Registrar");
        registrarLibrosItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarLibrosItemActionPerformed(evt);
            }
        });
        librosMenuItem.add(registrarLibrosItem);

        modificarLibrosItem.setText("Modificar / ISBN");
        librosMenuItem.add(modificarLibrosItem);

        BuscarLibrosItem.setText("Buscar / ISBN");
        librosMenuItem.add(BuscarLibrosItem);

        todoLibrosItem.setText("Mostrar todos");
        librosMenuItem.add(todoLibrosItem);

        borrarLibrosItem.setText("Borrar");
        librosMenuItem.add(borrarLibrosItem);

        librosMenu.add(librosMenuItem);

        detalleMenuItem.setText("Detalles");

        jMenu1.setText("Autor");

        registAutoresMI.setText("Registrar");
        registAutoresMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registAutoresMIActionPerformed(evt);
            }
        });
        jMenu1.add(registAutoresMI);

        mostrarAutoresMI.setText("Mostrar autores");
        mostrarAutoresMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarAutoresMIActionPerformed(evt);
            }
        });
        jMenu1.add(mostrarAutoresMI);

        detalleMenuItem.add(jMenu1);

        editorialDetallesItem.setText("Editorial");
        editorialDetallesItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editorialDetallesItemActionPerformed(evt);
            }
        });
        detalleMenuItem.add(editorialDetallesItem);

        catDetallesItem.setText("Categoría");
        catDetallesItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catDetallesItemActionPerformed(evt);
            }
        });
        detalleMenuItem.add(catDetallesItem);

        idiomDetallesItem.setText("Idioma");
        idiomDetallesItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idiomDetallesItemActionPerformed(evt);
            }
        });
        detalleMenuItem.add(idiomDetallesItem);

        estadoDetallesItem.setText("Estado");
        estadoDetallesItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoDetallesItemActionPerformed(evt);
            }
        });
        detalleMenuItem.add(estadoDetallesItem);

        librosMenu.add(detalleMenuItem);

        jMenuBar1.add(librosMenu);

        distribuidoresMenu.setText("Distribuidores");

        registrarDistrib.setText("Registrar");
        registrarDistrib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarDistribActionPerformed(evt);
            }
        });
        distribuidoresMenu.add(registrarDistrib);

        modificarDistrib.setText("Modificar");
        modificarDistrib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarDistribActionPerformed(evt);
            }
        });
        distribuidoresMenu.add(modificarDistrib);

        todoDistrib.setText("Mostrar todos");
        todoDistrib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todoDistribActionPerformed(evt);
            }
        });
        distribuidoresMenu.add(todoDistrib);

        buscarDistrib.setText("Buscar / Cod. distribuidor");
        buscarDistrib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarDistribActionPerformed(evt);
            }
        });
        distribuidoresMenu.add(buscarDistrib);

        borrarDistrib.setText("Borrar");
        borrarDistrib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarDistribActionPerformed(evt);
            }
        });
        distribuidoresMenu.add(borrarDistrib);

        jMenuBar1.add(distribuidoresMenu);

        gesfacturaMenu.setText("Gestión factura");

        genfacturaFact.setText("Generar factura");
        genfacturaFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genfacturaFactActionPerformed(evt);
            }
        });
        gesfacturaMenu.add(genfacturaFact);

        buscarFact.setText("Buscar / Folio");
        gesfacturaMenu.add(buscarFact);

        modificarFact.setText("Modificar / Folio");
        gesfacturaMenu.add(modificarFact);

        borrarFact.setText("Borrar / Folio");
        gesfacturaMenu.add(borrarFact);

        jMenuBar1.add(gesfacturaMenu);

        gescomprMenu.setText("Gestión compra");

        metodoPagoItem.setText("Metodo de pago");
        metodoPagoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metodoPagoItemActionPerformed(evt);
            }
        });
        gescomprMenu.add(metodoPagoItem);

        transaccionMenuItem.setText("Transacción");

        comprarTrans.setText("Comprar");
        transaccionMenuItem.add(comprarTrans);

        buscarCompTrans.setText("Buscar compras / Folio");
        transaccionMenuItem.add(buscarCompTrans);

        modComprasTrans.setText("Modificar compras / Folio");
        modComprasTrans.setToolTipText("");
        transaccionMenuItem.add(modComprasTrans);

        anularTrans.setText("Anular / Borrar compra");
        transaccionMenuItem.add(anularTrans);

        gescomprMenu.add(transaccionMenuItem);

        jMenuBar1.add(gescomprMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 563, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void estadoDetallesItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoDetallesItemActionPerformed
        // TODO add your handling code here:
        this.crudEstadoFrame.setVisible(true);
    }//GEN-LAST:event_estadoDetallesItemActionPerformed

    private void registrarLibrosItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarLibrosItemActionPerformed
        // TODO add your handling code here:
        this.regLibroFrame.setVisible(true);
    }//GEN-LAST:event_registrarLibrosItemActionPerformed

    private void registrarDistribActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarDistribActionPerformed
        // TODO add your handling code here:
        this.registDistFrame.setVisible(true);
    }//GEN-LAST:event_registrarDistribActionPerformed

    private void modificarDistribActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarDistribActionPerformed
        // TODO add your handling code here:
        this.modificarDistFrame.setVisible(true);
    }//GEN-LAST:event_modificarDistribActionPerformed

    private void todoDistribActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todoDistribActionPerformed
        // TODO add your handling code here:
        this.mostrarDistFrame.setVisible(true);
    }//GEN-LAST:event_todoDistribActionPerformed

    private void buscarDistribActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarDistribActionPerformed
        // TODO add your handling code here:
        this.buscarDistFrame.setVisible(true);
    }//GEN-LAST:event_buscarDistribActionPerformed

    private void borrarDistribActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarDistribActionPerformed
        // TODO add your handling code here:
        this.borrarDistFrame.setVisible(true);
    }//GEN-LAST:event_borrarDistribActionPerformed

    private void registAutoresMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registAutoresMIActionPerformed
        // TODO add your handling code here:
        this.registroAutorFrame.setVisible(true);
    }//GEN-LAST:event_registAutoresMIActionPerformed

    private void mostrarAutoresMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarAutoresMIActionPerformed
        // TODO add your handling code here:
        this.mostrarAutorFrame.setVisible(true);
    }//GEN-LAST:event_mostrarAutoresMIActionPerformed

    private void catDetallesItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catDetallesItemActionPerformed
        // TODO add your handling code here:
        this.ingresarCategoriaFrame.setVisible(true);
    }//GEN-LAST:event_catDetallesItemActionPerformed

    private void editorialDetallesItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editorialDetallesItemActionPerformed
        // TODO add your handling code here:
        this.crudIEditorialFrame.setVisible(true);
    }//GEN-LAST:event_editorialDetallesItemActionPerformed

    private void idiomDetallesItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idiomDetallesItemActionPerformed
        // TODO add your handling code here:
        this.crudIdiomaFrame.setVisible(true);
    }//GEN-LAST:event_idiomDetallesItemActionPerformed

    private void genfacturaFactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genfacturaFactActionPerformed
        // TODO add your handling code here:
        this.ingresarFacturaFrame.setVisible(true);
    }//GEN-LAST:event_genfacturaFactActionPerformed

    private void metodoPagoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metodoPagoItemActionPerformed
        // TODO add your handling code here:
        
        this.crudMetodoPagoFrame.setVisible(true);
    }//GEN-LAST:event_metodoPagoItemActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BuscarLibrosItem;
    private javax.swing.JMenuItem anularTrans;
    private javax.swing.JMenuItem borrarDistrib;
    private javax.swing.JMenuItem borrarFact;
    private javax.swing.JMenuItem borrarLibrosItem;
    private javax.swing.JMenuItem buscarCompTrans;
    private javax.swing.JMenuItem buscarDistrib;
    private javax.swing.JMenuItem buscarFact;
    private javax.swing.JMenuItem catDetallesItem;
    private javax.swing.JMenuItem comprarTrans;
    private javax.swing.JMenu detalleMenuItem;
    private javax.swing.JMenu distribuidoresMenu;
    private javax.swing.JMenuItem editorialDetallesItem;
    private javax.swing.JMenuItem estadoDetallesItem;
    private javax.swing.JMenuItem genfacturaFact;
    private javax.swing.JMenu gescomprMenu;
    private javax.swing.JMenu gesfacturaMenu;
    private javax.swing.JMenuItem idiomDetallesItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu librosMenu;
    private javax.swing.JMenu librosMenuItem;
    private javax.swing.JMenuItem metodoPagoItem;
    private javax.swing.JMenuItem modComprasTrans;
    private javax.swing.JMenuItem modificarDistrib;
    private javax.swing.JMenuItem modificarFact;
    private javax.swing.JMenuItem modificarLibrosItem;
    private javax.swing.JMenuItem mostrarAutoresMI;
    private javax.swing.JMenuItem registAutoresMI;
    private javax.swing.JMenuItem registrarDistrib;
    private javax.swing.JMenuItem registrarLibrosItem;
    private javax.swing.JMenuItem todoDistrib;
    private javax.swing.JMenuItem todoLibrosItem;
    private javax.swing.JMenu transaccionMenuItem;
    // End of variables declaration//GEN-END:variables
}