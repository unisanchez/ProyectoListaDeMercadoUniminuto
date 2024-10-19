/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.uniminuto.gui;

/**
 *
 * @author Victor Manuel Sanchez Narvaez
 *         NRC 50 - 55257
 *         ID 001000940
 *         Arli Jaidybe Gaita Jara
 *         NRC 50 - 55257
 *         ID 981058
 */
public class Desktop extends javax.swing.JFrame {

    /**
     * Creates new form Desktop
     */
    public Desktop() {
        initComponents();
        //ConexionDB conexionDB = new ConexionDB();
        //conexionDB.getConexionDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDesktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuLista = new javax.swing.JMenu();
        itemRegistrar = new javax.swing.JMenuItem();
        itemActualizar = new javax.swing.JMenuItem();
        btnListaDeMercado = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelDesktopLayout = new javax.swing.GroupLayout(panelDesktop);
        panelDesktop.setLayout(panelDesktopLayout);
        panelDesktopLayout.setHorizontalGroup(
            panelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 513, Short.MAX_VALUE)
        );
        panelDesktopLayout.setVerticalGroup(
            panelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
        );

        mnuLista.setText("Lista");

        itemRegistrar.setText("Agregar Producto");
        itemRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegistrarActionPerformed(evt);
            }
        });
        mnuLista.add(itemRegistrar);

        itemActualizar.setText("Actualizar/Eliminar Productos");
        itemActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActualizarActionPerformed(evt);
            }
        });
        mnuLista.add(itemActualizar);

        btnListaDeMercado.setText("Lista de Mercado");
        btnListaDeMercado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaDeMercadoActionPerformed(evt);
            }
        });
        mnuLista.add(btnListaDeMercado);

        jMenuBar1.add(mnuLista);

        jMenu2.setText("Help");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDesktop)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelDesktop)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistrarActionPerformed
        // TODO add your handling code here:
        RegistrarProducto registrarProducto = new RegistrarProducto();
        panelDesktop.add(registrarProducto);
        registrarProducto.show();
    }//GEN-LAST:event_itemRegistrarActionPerformed

    private void itemActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActualizarActionPerformed
        // TODO add your handling code here:
        ActualizarProducto producto = new ActualizarProducto();
        panelDesktop.add(producto);
        producto.show();
    }//GEN-LAST:event_itemActualizarActionPerformed

    private void btnListaDeMercadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaDeMercadoActionPerformed
        // TODO add your handling code here:
        ListaDeMercado listaDeMercado = new ListaDeMercado();
        panelDesktop.add(listaDeMercado);
        listaDeMercado.show();
    }//GEN-LAST:event_btnListaDeMercadoActionPerformed

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
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Desktop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnListaDeMercado;
    private javax.swing.JMenuItem itemActualizar;
    private javax.swing.JMenuItem itemRegistrar;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuLista;
    private javax.swing.JDesktopPane panelDesktop;
    // End of variables declaration//GEN-END:variables
}
