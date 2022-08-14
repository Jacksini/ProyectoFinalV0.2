/*
Descripción: Ventana Impuestos del Proyecto
Fecha: 26/Junio/2022
Nombre: David Enrique Garcia Olvera
 */
package vista;

import Modelo.ConsultaArchivos;
import Modelo.Settings;
import controlador.ControladorConfiguracion;
import javax.swing.JOptionPane;

/**
 *
 * @author David García
 */
public class Impuestos extends javax.swing.JFrame implements Settings{

    private int filaEnMouse;
    private ConsultaArchivos settings = new ConsultaArchivos();
    
    public Impuestos() {
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

        lblConfiguracion = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblImpuestos = new javax.swing.JLabel();
        btnConfHome = new javax.swing.JButton();
        checkImpuestos = new javax.swing.JCheckBox();
        comboImpuesto = new javax.swing.JComboBox<>();
        panelImpuestos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaImpuestos = new javax.swing.JTable();
        btnNuevoImpuesto = new javax.swing.JButton();
        btnDesactivarImpuesto = new javax.swing.JButton();
        panelModImpuesto = new javax.swing.JPanel();
        txtModImpuesto = new javax.swing.JTextField();
        lblImpuesto = new javax.swing.JLabel();
        comboTipoImpuesto = new javax.swing.JComboBox<>();
        lblPorcentaje = new javax.swing.JLabel();
        spinnerPorcentaje = new javax.swing.JSpinner();
        lblPercent = new javax.swing.JLabel();
        btnGuardarImpuesto = new javax.swing.JButton();
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

        lblImpuestos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblImpuestos.setText("Impuestos");

        btnConfHome.setText("Mostrar todas las opciones");
        btnConfHome.setToolTipText("");
        btnConfHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfHomeActionPerformed(evt);
            }
        });

        checkImpuestos.setText("Mis productos manejan impuestos (IVA, etc) y me encuentro en:");
        checkImpuestos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkImpuestosMouseClicked(evt);
            }
        });

        comboImpuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "México", "Otro" }));
        comboImpuesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboImpuestoMouseClicked(evt);
            }
        });

        tablaImpuestos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaImpuestos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaImpuestos.setEnabled(false);
        tablaImpuestos.setFocusable(false);
        tablaImpuestos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaImpuestos.setShowGrid(false);
        tablaImpuestos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaImpuestosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaImpuestos);

        javax.swing.GroupLayout panelImpuestosLayout = new javax.swing.GroupLayout(panelImpuestos);
        panelImpuestos.setLayout(panelImpuestosLayout);
        panelImpuestosLayout.setHorizontalGroup(
            panelImpuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelImpuestosLayout.setVerticalGroup(
            panelImpuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImpuestosLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );

        btnNuevoImpuesto.setText("Agregar Nuevo Impuesto");
        btnNuevoImpuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoImpuestoActionPerformed(evt);
            }
        });

        btnDesactivarImpuesto.setText("Desactivar");
        btnDesactivarImpuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesactivarImpuestoActionPerformed(evt);
            }
        });

        panelModImpuesto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelModImpuesto.setName(""); // NOI18N

        txtModImpuesto.setEditable(false);
        txtModImpuesto.setEnabled(false);

        lblImpuesto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblImpuesto.setText("Impuesto");
        lblImpuesto.setEnabled(false);

        comboTipoImpuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Impuesto al Valor Agregado (IVA)", "Impuesto Sobre Hospedaje (ISH)", "Impuesto Especial sobre Productos y Servicio (IEPS)" }));
        comboTipoImpuesto.setSelectedIndex(-1);
        comboTipoImpuesto.setToolTipText("");
        comboTipoImpuesto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comboTipoImpuesto.setEnabled(false);
        comboTipoImpuesto.setFocusable(false);

        lblPorcentaje.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPorcentaje.setText("Porcentaje");
        lblPorcentaje.setEnabled(false);

        spinnerPorcentaje.setEnabled(false);

        lblPercent.setText("%");
        lblPercent.setEnabled(false);

        btnGuardarImpuesto.setText("Guardar Impuesto");
        btnGuardarImpuesto.setEnabled(false);
        btnGuardarImpuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarImpuestoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelModImpuestoLayout = new javax.swing.GroupLayout(panelModImpuesto);
        panelModImpuesto.setLayout(panelModImpuestoLayout);
        panelModImpuestoLayout.setHorizontalGroup(
            panelModImpuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModImpuestoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelModImpuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtModImpuesto)
                    .addGroup(panelModImpuestoLayout.createSequentialGroup()
                        .addComponent(lblPorcentaje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinnerPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPercent)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardarImpuesto))
                    .addGroup(panelModImpuestoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblImpuesto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboTipoImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelModImpuestoLayout.setVerticalGroup(
            panelModImpuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModImpuestoLayout.createSequentialGroup()
                .addComponent(txtModImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelModImpuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblImpuesto)
                    .addComponent(comboTipoImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelModImpuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPorcentaje)
                    .addComponent(spinnerPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPercent)
                    .addComponent(btnGuardarImpuesto))
                .addGap(0, 129, Short.MAX_VALUE))
        );

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panelImpuestos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDesactivarImpuesto)
                                    .addComponent(btnNuevoImpuesto)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(checkImpuestos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(104, 104, 104)
                        .addComponent(panelModImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 376, Short.MAX_VALUE))
                    .addComponent(lblConfiguracion)
                    .addComponent(lblImpuestos)
                    .addComponent(btnConfHome))
                .addGap(88, 88, 88))
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
                .addComponent(lblImpuestos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkImpuestos)
                            .addComponent(comboImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelImpuestos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNuevoImpuesto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDesactivarImpuesto))))
                    .addComponent(panelModImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoImpuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoImpuestoActionPerformed
        // Nuevo Impuesto
        enableModificar(checkImpuestos.isSelected());
        txtModImpuesto.setText("Nuevo Impuesto");
        comboTipoImpuesto.setSelectedIndex(-1);
    }//GEN-LAST:event_btnNuevoImpuestoActionPerformed

    private void btnDesactivarImpuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesactivarImpuestoActionPerformed
        // Quitar impuesto
        //System.out.println("Eliminacion de impuesto");
        int x = JOptionPane.showConfirmDialog(null, "Esta seguro que quiere eliminar el impuesto seleccionado?", "Eliminacion de impuesto", 0);
        switch(x){
            case 0:
                JOptionPane.showMessageDialog(null, "Confirmado, se eliminara");
                tablaImpuestos.setModel(settings.eliminarImpuestos(filaEnMouse)); //Eliminacion de la fila de impuesto
                updateData();
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Enterado. No se eliminara");
                break;
            default:
                break;
        }
        //
        //settings.eliminarImpuestos(filaEnMouse);
    }//GEN-LAST:event_btnDesactivarImpuestoActionPerformed

    private void btnConfHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfHomeActionPerformed
        //Controlador.SesionControlador.iniciarConfiguracion();
        Configuracion Config = new Configuracion();
        ControladorConfiguracion CtrlConf = new ControladorConfiguracion(Config, settings);
        CtrlConf.iniciarVista();
        this.dispose();
    }//GEN-LAST:event_btnConfHomeActionPerformed

    private void tablaImpuestosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaImpuestosMouseClicked
        // Cuando se hace click en la tabla
        //System.out.println("Push at " +tablaImpuestos.rowAtPoint(evt.getPoint()));
        if(checkImpuestos.isSelected()){
            //System.out.println("true");
            modificarImpuesto(tablaImpuestos.rowAtPoint(evt.getPoint()));
            enableModificar(checkImpuestos.isSelected());
        }else{
            //System.out.println("false");
        }
    }//GEN-LAST:event_tablaImpuestosMouseClicked

    private void btnGuardarImpuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarImpuestoActionPerformed
        //Guardar impuesto nuevo/modificado
        switch(txtModImpuesto.getText()){
            case "Nuevo Impuesto":
                //System.out.println("Proceedin to addToTabla");
                addToTabla(); //Meterlo a la tabla y escribe datos dentro del metodo
                break;
            case "Modificar Impuesto":
                //System.out.println("Proceedin to modifyData");
                modifyData(); //Meterlo a la tabla
                //System.out.println("Modified Data, now it will update it");
                updateData(); //Escritura del archivo en base a la tabla
                break;
        }
    }//GEN-LAST:event_btnGuardarImpuestoActionPerformed

    private void checkImpuestosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkImpuestosMouseClicked
        //Cuando se da click en el check box
        //System.out.println("click");
        settings.setUsaImpuestos(checkImpuestos.isSelected());
        enableTable(checkImpuestos.isSelected());
        if(!checkImpuestos.isSelected()){
            enableModificar(checkImpuestos.isSelected());
        }
    }//GEN-LAST:event_checkImpuestosMouseClicked

    private void comboImpuestoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboImpuestoMouseClicked
        //Boton Temporal para la actualizacoin de los datos
        updateSettings();
    }//GEN-LAST:event_comboImpuestoMouseClicked
    
    private void enableTable(boolean check){
        tablaImpuestos.setEnabled(check);
        tablaImpuestos.setFocusable(check);
    }
    
    //El set y get de los combo box pueden ser dinamicos, pero no existen tantos impuestos que conozca, por lo que se dejaran estos 3
    private void setComboBox(String tax){
        //System.out.println("setComboBox");
        switch(tax){
            case "IVA":
                comboTipoImpuesto.setSelectedIndex(0);
                break;
            case "ISH":
                comboTipoImpuesto.setSelectedIndex(1);
                break;
            case "IEPS":
                comboTipoImpuesto.setSelectedIndex(2);
                break;
        }
    }
    
    private String getComboBox(){
        //System.out.println("ggetComboBox");
        int index = comboTipoImpuesto.getSelectedIndex();
        switch(index){
            case 0:
                return "IVA";
            case 1:
                return "ISH";
            case 2:
                return "IEPS";
            default:
                return "error";
        }
    }
    
    private void modificarImpuesto(int fila){
        //System.out.println("midificarImpuesto");
        txtModImpuesto.setText("Modificar Impuesto");
        if(fila > -1){
            setComboBox(String.valueOf(tablaImpuestos.getValueAt(fila, 0)));
            String porciento = dividirPorcentaje(String.valueOf(tablaImpuestos.getValueAt(fila, 1)));
            spinnerPorcentaje.setValue(Integer.parseInt(porciento));
        }
        this.filaEnMouse = fila;
    }
    
    private String dividirPorcentaje(String porciento){
        String [] dividido = porciento.split("%");
        return dividido[0];
    }
    
    private void enableModificar(boolean check){
        txtModImpuesto.setEnabled(check);
        lblImpuesto.setEnabled(check);
        comboTipoImpuesto.setEnabled(check);
        lblPorcentaje.setEnabled(check);
        spinnerPorcentaje.setEnabled(check);
        lblPercent.setEnabled(check);
        btnGuardarImpuesto.setEnabled(check);
        if(!check){
            comboTipoImpuesto.setSelectedIndex(-1);
        }
    }
    
    public void addToTabla(){
        //Extrae la informacion creada hacia el modelo (el panel de la derecha). reescribe el archivo
        //y lo aggrega al modelo de tabla. La vuelve a sobreescribir
        //System.out.println("addToTabla");
        String [] adicion = new String[2];
        adicion[0] = getComboBox();
        adicion[1] = spinnerPorcentaje.getValue().toString().concat("%");
        settings.setImpuestos("Configuracion", "impuestos");
        tablaImpuestos.setModel(settings.agregarImpuestos(adicion));
        updateData();
    }
    
    public void updateTabla(){
        //System.out.println("updateTabla");
        //Extrae los datos del archivo, guarda el valor en Modelo.ConsultaArchivos.impuestos
        //Y al final se meten los datos a la tabla.
        //Correr cuando se hagan cambios en el documento
        settings.setImpuestos("Configuracion", "impuestos");
        tablaImpuestos.setModel(settings.insertarImpuestos());
    }
    
    public void updateData(){
        //System.out.println("updateData");
        //Extrae los datos de la tabla, guarda el valor en Modelo.ConsultaArchivos.impuestos
        //Y al final sobreescribe el documento de impuestos. Al finalizar se vuelve a meter los datos a la tabla.
        //Correr cuando se hagan cambios en la tabla
        settings.setImpuestos(getDatosTabla());
        settings.writeDocument("configuracion", "impuestos", settings.settingsImpuestos());
        tablaImpuestos.setModel(settings.insertarImpuestos());
    }
    
    public void modifyData(){
        //System.out.println("modifyData");
        //Extrae la informacion creada hacia el modelo (el panel de la derecha).
        //y modifica la fila en la que registro
        String [] adicion = new String[2];
        adicion[0] = getComboBox();
        adicion[1] = spinnerPorcentaje.getValue().toString().concat("%");
        tablaImpuestos.setModel(settings.modificarImpuestos(filaEnMouse, adicion));
    }
    
    public String[][] getDatosTabla(){
        //System.out.println("getDatosTabla");
        //Extrae los datos de la tabla en un array de String
        int filas = tablaImpuestos.getModel().getRowCount();
        
        int columnas = tablaImpuestos.getModel().getColumnCount();
        String [][] datos = new String[filas][2];
        for(int row = 0; row < filas; row++){
            for(int column = 0; column < columnas; column++){
                datos[row][column] = tablaImpuestos.getModel().getValueAt(row, column).toString();
            }
        }
        return datos;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfHome;
    private javax.swing.JButton btnDesactivarImpuesto;
    private javax.swing.JButton btnGuardarImpuesto;
    private javax.swing.JButton btnNuevoImpuesto;
    private javax.swing.JCheckBox checkImpuestos;
    private javax.swing.JComboBox<String> comboImpuesto;
    private javax.swing.JComboBox<String> comboTipoImpuesto;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblConfiguracion;
    private javax.swing.JLabel lblImpuesto;
    private javax.swing.JLabel lblImpuestos;
    private javax.swing.JLabel lblPercent;
    private javax.swing.JLabel lblPorcentaje;
    private javax.swing.JMenu menuClientes;
    private javax.swing.JMenu menuConfiguracion;
    private javax.swing.JMenu menuInventario;
    private javax.swing.JMenu menuProductos;
    private javax.swing.JMenu menuProveedores;
    private javax.swing.JMenu menuVentas;
    private javax.swing.JPanel panelImpuestos;
    private javax.swing.JPanel panelModImpuesto;
    private javax.swing.JSpinner spinnerPorcentaje;
    private javax.swing.JTable tablaImpuestos;
    private javax.swing.JTextField txtModImpuesto;
    // End of variables declaration//GEN-END:variables

    @Override
    public void updateSettings() {
        //System.out.println("updateSettings");
        updateTabla();
        checkImpuestos.setSelected(settings.usesImpuestos());
        tablaImpuestos.setEnabled(settings.usesImpuestos());
    }
}
