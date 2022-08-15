/*
 * Descripcion: Ventana para ver, eliminar o agregar departamentos
 * Fecha: 24-06-2022
 * Autor: Quiroz Vega Kevin Alexis
 * 
 */
package vista;

/**
 *
 * @author Tanya
 */
public class Departamentos extends javax.swing.JFrame {

    /**
     * Creates new form Inventario
     */
    public Departamentos() {
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

        etiquetaDepartamento = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnNuevo = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnDepartamentos = new javax.swing.JButton();
        btnCatalogo = new javax.swing.JButton();
        etiquetaIdDepartamento = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtIdDepartamento = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        etiquetaProductos1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDepartamentos = new javax.swing.JTable();
        txtAddName = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        etiquetaNombre = new javax.swing.JLabel();
        btnEliminarDepartamento = new javax.swing.JButton();
        etiquetaAtiende = new javax.swing.JLabel();
        etiquetaDepartamentos = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnMostrarDepartamentos = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        BtnMenuVentas = new javax.swing.JMenu();
        BtnMenuClientes = new javax.swing.JMenu();
        BtnMenuProductos = new javax.swing.JMenu();
        BtnMenuProveedores = new javax.swing.JMenu();
        BtnMenuInventario = new javax.swing.JMenu();
        BtnMenuConfiguracion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaDepartamento.setBackground(new java.awt.Color(255, 153, 51));
        etiquetaDepartamento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiquetaDepartamento.setForeground(new java.awt.Color(255, 153, 51));
        etiquetaDepartamento.setText("Departamento");
        getContentPane().add(etiquetaDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 89, 194, 24));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 693, 10));

        btnNuevo.setText("Nuevo");
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 41, -1, -1));

        btnAgregar.setText("Agregar");
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 41, -1, -1));

        btnModificar.setText("Modificar");
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 41, -1, -1));

        btnEliminar.setText("Eliminar");
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 41, -1, -1));

        btnDepartamentos.setText("Departamentos");
        getContentPane().add(btnDepartamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 41, -1, -1));

        btnCatalogo.setText("Catalogo");
        getContentPane().add(btnCatalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 41, -1, -1));

        etiquetaIdDepartamento.setText("Id departamento:");
        getContentPane().add(etiquetaIdDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 140, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 75, 693, 10));
        getContentPane().add(txtIdDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 137, 148, -1));

        btnBuscar.setText("Buscar");
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 137, -1, -1));

        etiquetaProductos1.setBackground(new java.awt.Color(255, 153, 51));
        etiquetaProductos1.setText("PRODUCTOS");
        getContentPane().add(etiquetaProductos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 91, 24));

        tblDepartamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblDepartamentos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 220, 350));
        getContentPane().add(txtAddName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 212, -1));

        btnGuardar.setText("Guardar");
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, -1));

        etiquetaNombre.setText("Nombre:");
        getContentPane().add(etiquetaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        btnEliminarDepartamento.setText("Eliminar");
        getContentPane().add(btnEliminarDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 137, -1, -1));

        etiquetaAtiende.setText("Lo atiende");
        getContentPane().add(etiquetaAtiende, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 8, -1, -1));

        etiquetaDepartamentos.setBackground(new java.awt.Color(255, 153, 51));
        etiquetaDepartamentos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiquetaDepartamentos.setForeground(new java.awt.Color(255, 153, 51));
        etiquetaDepartamentos.setText("Agregar Departamento");
        getContentPane().add(etiquetaDepartamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 194, 24));

        btnCancelar.setText("Cancelar");
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, -1, -1));

        btnMostrarDepartamentos.setText("Mostrar todos los departamentos");
        getContentPane().add(btnMostrarDepartamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, -1));

        BtnMenuVentas.setText("Ventas");
        jMenuBar1.add(BtnMenuVentas);

        BtnMenuClientes.setText("Clientes");
        jMenuBar1.add(BtnMenuClientes);

        BtnMenuProductos.setText("Productos");
        jMenuBar1.add(BtnMenuProductos);

        BtnMenuProveedores.setText("Proveedores");
        jMenuBar1.add(BtnMenuProveedores);

        BtnMenuInventario.setText("Inventario");
        jMenuBar1.add(BtnMenuInventario);

        BtnMenuConfiguracion.setText("Configuracion");
        jMenuBar1.add(BtnMenuConfiguracion);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Departamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Departamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Departamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Departamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Departamentos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenu BtnMenuClientes;
    public javax.swing.JMenu BtnMenuConfiguracion;
    public javax.swing.JMenu BtnMenuInventario;
    public javax.swing.JMenu BtnMenuProductos;
    public javax.swing.JMenu BtnMenuProveedores;
    public javax.swing.JMenu BtnMenuVentas;
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnCatalogo;
    public javax.swing.JButton btnDepartamentos;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnEliminarDepartamento;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnModificar;
    public javax.swing.JButton btnMostrarDepartamentos;
    public javax.swing.JButton btnNuevo;
    private javax.swing.JLabel etiquetaAtiende;
    private javax.swing.JLabel etiquetaDepartamento;
    private javax.swing.JLabel etiquetaDepartamentos;
    private javax.swing.JLabel etiquetaIdDepartamento;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaProductos1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JTable tblDepartamentos;
    public javax.swing.JTextField txtAddName;
    public javax.swing.JTextField txtIdDepartamento;
    // End of variables declaration//GEN-END:variables
}
