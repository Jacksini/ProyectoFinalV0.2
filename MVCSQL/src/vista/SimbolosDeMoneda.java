/*
Descripción: Ventana Simbolo de Moneda del Proyecto
Fecha: 26/Junio/2022
Nombre: David Enrique Garcia Olvera
 */
package vista;

import Modelo.ConsultaArchivos;
import Modelo.Settings;
import controlador.ControladorConfiguracion;
import javax.swing.JOptionPane;

public class SimbolosDeMoneda extends javax.swing.JFrame implements Settings{
    
    private ConsultaArchivos settings = new ConsultaArchivos();
    
    public SimbolosDeMoneda(){
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblConfiguracion = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblSimbolo = new javax.swing.JLabel();
        btnConfHome = new javax.swing.JButton();
        lblSimboloMoneda = new javax.swing.JLabel();
        txtSimboloMoneda = new javax.swing.JTextField();
        lblSeparadorMiles = new javax.swing.JLabel();
        txtSimboloMiles = new javax.swing.JTextField();
        lblSeparadorDecimal = new javax.swing.JLabel();
        txtSimboloDecimal = new javax.swing.JTextField();
        btnChanges = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuVentas = new javax.swing.JMenu();
        menuClientes = new javax.swing.JMenu();
        menuProductos = new javax.swing.JMenu();
        menuProveedores = new javax.swing.JMenu();
        menuInventario = new javax.swing.JMenu();
        menuConfiguracion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Configuración");

        lblConfiguracion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblConfiguracion.setText("Configuración");

        lblSimbolo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSimbolo.setText("Símbolo de moneda");

        btnConfHome.setText("Mostrar todas las opciones");
        btnConfHome.setToolTipText("");
        btnConfHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfHomeActionPerformed(evt);
            }
        });

        lblSimboloMoneda.setText("Símbolo de Moneda:");

        txtSimboloMoneda.setText("$");

        lblSeparadorMiles.setText("Separador de Miles:");

        txtSimboloMiles.setText(",");

        lblSeparadorDecimal.setText("Separador Decimal:");

        txtSimboloDecimal.setText(".");

        btnChanges.setText("Guardar Cambios");
        btnChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangesActionPerformed(evt);
            }
        });

        menuVentas.setText("Ventas");
        jMenuBar1.add(menuVentas);

        menuClientes.setText("Clientes");
        jMenuBar1.add(menuClientes);

        menuProductos.setText("Productos");
        jMenuBar1.add(menuProductos);

        menuProveedores.setText("Proveedores");
        jMenuBar1.add(menuProveedores);

        menuInventario.setText("Inventario");
        jMenuBar1.add(menuInventario);

        menuConfiguracion.setText("Configuración");
        jMenuBar1.add(menuConfiguracion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblConfiguracion)
                            .addComponent(lblSimbolo)
                            .addComponent(btnConfHome)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnChanges)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSimboloMoneda)
                                    .addComponent(lblSeparadorMiles)
                                    .addComponent(lblSeparadorDecimal))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSimboloMoneda, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                    .addComponent(txtSimboloMiles)
                                    .addComponent(txtSimboloDecimal))))))
                .addContainerGap(979, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConfiguracion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfHome)
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSimbolo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSimboloMoneda)
                    .addComponent(txtSimboloMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSeparadorMiles)
                    .addComponent(txtSimboloMiles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSeparadorDecimal)
                    .addComponent(txtSimboloDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnChanges)
                .addGap(0, 410, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangesActionPerformed
        //Guardar datos de los txt fields
        settings.setMoneda(txtSimboloMoneda.getText());
        settings.setMiles(txtSimboloMiles.getText());
        settings.setDecimal(txtSimboloDecimal.getText());
        settings.writeDocument("Configuracion", "simbolos", settings.settingsSimbolos());
        JOptionPane.showMessageDialog(null, "Se guardo exitosamente");
    }//GEN-LAST:event_btnChangesActionPerformed

    private void btnConfHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfHomeActionPerformed
        Configuracion Config = new Configuracion();
        ControladorConfiguracion CtrlConf = new ControladorConfiguracion(Config, settings);
        CtrlConf.iniciarVista();
        this.dispose();
    }//GEN-LAST:event_btnConfHomeActionPerformed

    @Override
    public void updateSettings(){
        //Actualizacion de los datos
        settings.setSimbols("Configuracion", "simbolos" );
        txtSimboloMoneda.setText(settings.getMoneda());
        txtSimboloMiles.setText(settings.getMiles());
        txtSimboloDecimal.setText(settings.getDecimal());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnChanges;
    private javax.swing.JButton btnConfHome;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblConfiguracion;
    private javax.swing.JLabel lblSeparadorDecimal;
    private javax.swing.JLabel lblSeparadorMiles;
    private javax.swing.JLabel lblSimbolo;
    private javax.swing.JLabel lblSimboloMoneda;
    private javax.swing.JMenu menuClientes;
    private javax.swing.JMenu menuConfiguracion;
    private javax.swing.JMenu menuInventario;
    private javax.swing.JMenu menuProductos;
    private javax.swing.JMenu menuProveedores;
    private javax.swing.JMenu menuVentas;
    public javax.swing.JTextField txtSimboloDecimal;
    public javax.swing.JTextField txtSimboloMiles;
    public javax.swing.JTextField txtSimboloMoneda;
    // End of variables declaration//GEN-END:variables
}
