/*
Descripción: Ventana Ticket del Proyecto
Fecha: 26/Junio/2022
Nombre: David Enrique Garcia Olvera
 */
package Vista;

import Modelo.Settings;
import Modelo.ConsultaArchivos;
import javax.swing.JOptionPane;

public class Ticket extends javax.swing.JFrame implements Settings{

    private ConsultaArchivos settings = new ConsultaArchivos();
    
    public Ticket() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblConfiguracion = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblTicket = new javax.swing.JLabel();
        btnPrintTrial = new javax.swing.JButton();
        btnConfHome = new javax.swing.JButton();
        panelTicket = new javax.swing.JPanel();
        txtNombreTienda = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtRFC = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblTicketEjemplo = new javax.swing.JTextArea();
        txtEndLine = new javax.swing.JTextField();
        txtURL = new javax.swing.JTextField();
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

        lblTicket.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTicket.setText("Personalización del ticket de venta");

        btnPrintTrial.setText("Probar impresión con último ticket");
        btnPrintTrial.setToolTipText("");
        btnPrintTrial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintTrialActionPerformed(evt);
            }
        });

        btnConfHome.setText("Mostrar todas las opciones");
        btnConfHome.setToolTipText("");
        btnConfHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfHomeActionPerformed(evt);
            }
        });

        panelTicket.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtNombreTienda.setText("Nombre de la tienda");

        txtDireccion.setText("Dirección");

        txtTelefono.setText("(000) 123 4567");

        txtRFC.setText("RFC0865427");

        lblTicketEjemplo.setEditable(false);
        lblTicketEjemplo.setColumns(20);
        lblTicketEjemplo.setRows(5);
        lblTicketEjemplo.setText("Cant.     Descripción\t              Importe\n=================================\n1             Agua Ciel 60ml \t              $7.00\n1             Coca Cola Light \t              $18.00\n\n\t                           No. de Articulos: 4\n\t\tTotal: $33.00");
        jScrollPane1.setViewportView(lblTicketEjemplo);

        txtEndLine.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEndLine.setText("Gracias por su compra");

        txtURL.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtURL.setText("www.ejemplo.com");

        javax.swing.GroupLayout panelTicketLayout = new javax.swing.GroupLayout(panelTicket);
        panelTicket.setLayout(panelTicketLayout);
        panelTicketLayout.setHorizontalGroup(
            panelTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTicketLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreTienda)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(txtRFC, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(txtEndLine, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(txtURL, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelTicketLayout.setVerticalGroup(
            panelTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTicketLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(txtNombreTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(txtEndLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        btnChanges.setText("Guardar Cambios");
        btnChanges.setToolTipText("");
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
                            .addComponent(lblTicket)
                            .addComponent(lblConfiguracion)
                            .addComponent(btnConfHome)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(panelTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPrintTrial, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnChanges, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(534, Short.MAX_VALUE))
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
                .addComponent(lblTicket)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnChanges)
                        .addGap(18, 18, 18)
                        .addComponent(btnPrintTrial)))
                .addGap(0, 50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintTrialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintTrialActionPerformed
        //Creacioon de un archivo de ejemplo
        crearEjemplo();
    }//GEN-LAST:event_btnPrintTrialActionPerformed

    private void btnChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangesActionPerformed
        //Guarda Cambios
        settings.setNombreTienda(txtNombreTienda.getText());
        settings.setDireccion(txtDireccion.getText());
        settings.setTelefono(txtTelefono.getText());
        settings.setRfc(txtRFC.getText());
        settings.setEndLine(txtEndLine.getText());
        settings.setUrl(txtURL.getText());
        settings.writeDocument("Configuracion", "ticket", settings.settingsTicket());
        JOptionPane.showMessageDialog(null, "Se guardo exitosamente");
    }//GEN-LAST:event_btnChangesActionPerformed

    private void btnConfHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfHomeActionPerformed
        Controlador.SesionControlador.iniciarConfiguracion();
        this.dispose();
    }//GEN-LAST:event_btnConfHomeActionPerformed

    
    public void crearEjemplo(){
        Modelo.ConsultaConfiguracion query = new Modelo.ConsultaConfiguracion();
        settings.updateSettings("Configuracion");
        String dialog = "Se imprimio un ticket en la carpeta de configuracion";
        //Obtiene el resultado en una variable para poder evitar errores
        String result = settings.exampleTicket(query.ticketConsultar());
        if(result == null || result.isEmpty()){
            settings.writeDocument("Configuracion", "exampleTicket.txt", settings.exampleTicket());
            dialog += ". No se pudo obtener los datos de la ultima consulta, por lo que se usara una default";
        }else{
            settings.writeDocument("Configuracion", "exampleTicket.txt", result);
        }
        JOptionPane.showMessageDialog(null, dialog);
    }
    
    @Override
    public void updateSettings(){
        settings.setTicket("Configuracion", "ticket");
        txtNombreTienda.setText(settings.getNombreTienda());
        txtDireccion.setText(settings.getDireccion());
        txtTelefono.setText(settings.getTelefono());
        txtRFC.setText(settings.getRfc());
        txtEndLine.setText(settings.getEndLine());
        txtURL.setText(settings.getUrl());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChanges;
    private javax.swing.JButton btnConfHome;
    private javax.swing.JButton btnPrintTrial;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblConfiguracion;
    private javax.swing.JLabel lblTicket;
    private javax.swing.JTextArea lblTicketEjemplo;
    private javax.swing.JMenu menuClientes;
    private javax.swing.JMenu menuConfiguracion;
    private javax.swing.JMenu menuInventario;
    private javax.swing.JMenu menuProductos;
    private javax.swing.JMenu menuProveedores;
    private javax.swing.JMenu menuVentas;
    private javax.swing.JPanel panelTicket;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEndLine;
    private javax.swing.JTextField txtNombreTienda;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtURL;
    // End of variables declaration//GEN-END:variables
}
