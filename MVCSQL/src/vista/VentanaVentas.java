/*
Descripcion: Ventanas de proyecto de Poo
Fecha: 24/06/2022
Nombre: Luis Jackniel Arellano Sandoval
*/
package vista;

/**
 *
 * @author Jacksini
 */
public class VentanaVentas extends javax.swing.JFrame {

    /**
     * Creates new form VentanaVentas
     */
    public VentanaVentas() {
        initComponents();
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
        LblCodigoProducto = new javax.swing.JLabel();
        TFCodigoProducto = new javax.swing.JTextField();
        BtnBorrar = new javax.swing.JButton();
        BtnVerificador = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        LblUsuario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        BtnSalir = new javax.swing.JButton();
        LblTotalProductos = new javax.swing.JLabel();
        LblVentaActual = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BtnCobrar = new javax.swing.JButton();
        LblTotal = new javax.swing.JLabel();
        LblFechaYHora = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        BarraMenu = new javax.swing.JMenuBar();
        BtnMenuVentas = new javax.swing.JMenu();
        BtnMenuClientes = new javax.swing.JMenu();
        BtnMenuProductos = new javax.swing.JMenu();
        BtnMenuProveedores = new javax.swing.JMenu();
        BtnMenuInventario = new javax.swing.JMenu();
        BtnMenuConfiguracion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana ventas");

        LblCodigoProducto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblCodigoProducto.setText("Codigo Factura:");

        TFCodigoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFCodigoProductoActionPerformed(evt);
            }
        });

        BtnBorrar.setText("Borrar Art. DEL");

        BtnVerificador.setText("Verificador F9");

        BtnBuscar.setText("Buscar F10");

        LblUsuario.setText("Lo atiende");

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo de barras", "Nombre de producto", "Cantidad", "Precio de venta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaProductos);
        if (TablaProductos.getColumnModel().getColumnCount() > 0) {
            TablaProductos.getColumnModel().getColumn(0).setResizable(false);
            TablaProductos.getColumnModel().getColumn(1).setResizable(false);
            TablaProductos.getColumnModel().getColumn(2).setResizable(false);
            TablaProductos.getColumnModel().getColumn(3).setResizable(false);
        }

        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        LblTotalProductos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LblTotalProductos.setText("0");

        LblVentaActual.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LblVentaActual.setText("Productos en la venta actual.");

        BtnCobrar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BtnCobrar.setText("Cobrar F12");
        BtnCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCobrarActionPerformed(evt);
            }
        });

        LblTotal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LblTotal.setText("$0.00 MXN");

        LblFechaYHora.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblFechaYHora.setText("Hora actual");

        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnActualizar.setText("Actualizar");

        BarraMenu.setAlignmentX(1.0F);
        BarraMenu.setAlignmentY(1.0F);
        BarraMenu.setMaximumSize(new java.awt.Dimension(500, 500));
        BarraMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BarraMenuMouseClicked(evt);
            }
        });

        BtnMenuVentas.setText("Ventas");
        BarraMenu.add(BtnMenuVentas);

        BtnMenuClientes.setText("Clientes");
        BtnMenuClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnMenuClientesMouseClicked(evt);
            }
        });
        BarraMenu.add(BtnMenuClientes);

        BtnMenuProductos.setText("Productos");
        BarraMenu.add(BtnMenuProductos);

        BtnMenuProveedores.setText("Proveedores");
        BarraMenu.add(BtnMenuProveedores);

        BtnMenuInventario.setText("Inventario");
        BarraMenu.add(BtnMenuInventario);

        BtnMenuConfiguracion.setText("Configuración");
        BarraMenu.add(BtnMenuConfiguracion);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(LblCodigoProducto)
                        .addGap(18, 18, 18)
                        .addComponent(TFCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LblUsuario))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnBorrar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnVerificador)
                        .addGap(18, 18, 18)
                        .addComponent(BtnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnSalir)))
                .addGap(32, 32, 32))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblTotalProductos)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnCobrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LblTotal))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LblVentaActual))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LblFechaYHora)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TFCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(LblCodigoProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnBorrar)
                            .addComponent(BtnVerificador)
                            .addComponent(BtnBuscar))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnSalir)
                        .addGap(33, 33, 33)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(61, 61, 61))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblTotalProductos)
                    .addComponent(LblVentaActual))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCobrar)
                    .addComponent(LblTotal))
                .addGap(17, 17, 17)
                .addComponent(LblFechaYHora)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFCodigoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFCodigoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFCodigoProductoActionPerformed

    private void BtnCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCobrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCobrarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BarraMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMenuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BarraMenuMouseClicked

    private void BtnMenuClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMenuClientesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnMenuClientesMouseClicked

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
            java.util.logging.Logger.getLogger(VentanaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuBar BarraMenu;
    public javax.swing.JButton BtnBorrar;
    public javax.swing.JButton BtnBuscar;
    public javax.swing.JButton BtnCobrar;
    public javax.swing.JMenu BtnMenuClientes;
    public javax.swing.JMenu BtnMenuConfiguracion;
    public javax.swing.JMenu BtnMenuInventario;
    public javax.swing.JMenu BtnMenuProductos;
    public javax.swing.JMenu BtnMenuProveedores;
    public javax.swing.JMenu BtnMenuVentas;
    private javax.swing.JButton BtnSalir;
    public javax.swing.JButton BtnVerificador;
    private javax.swing.JLabel LblCodigoProducto;
    private javax.swing.JLabel LblFechaYHora;
    public javax.swing.JLabel LblTotal;
    public javax.swing.JLabel LblTotalProductos;
    private javax.swing.JLabel LblUsuario;
    private javax.swing.JLabel LblVentaActual;
    public javax.swing.JTextField TFCodigoProducto;
    public javax.swing.JTable TablaProductos;
    public javax.swing.JButton btnActualizar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
