/* 
* Descripcion: Controldores encargados de manejar los botones de las ventanas
* Fecha:12/08/2022
* Nombres: 
    Quiroz Vega Kevin Alexis
    Arellano Sandoval Luis Jackniel
    García Olvera David Enrique
    Rocha Lopez Jose Luis
    Aguirre Ventura Hiory Antonio
 */
package controlador;

import modelo.ConsultaArchivos;
import vista.Configuracion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Modelo;
import vista.Clientes;
import vista.Impuestos;
import vista.Inventario;
import vista.NuevoProducto;
import vista.SimbolosDeMoneda;
import vista.Ticket;
import vista.VentaBuscador;
import vista.VentaVerificador;
import vista.VentanaCobro;
import vista.VentanaEntradas;
import vista.VentanaSalida;
import vista.VentanaVentas;
import vista.proveedores;
import vista.sesion;

public class ControladorConfiguracion implements ActionListener, MouseListener{
    
    //Vistas de ventanas
    private sesion vistaInicioSesion;
    private VentanaVentas ventasInicial;
    private Clientes ventanaClientes;
    private NuevoProducto Product;
    private proveedores Proveedor;
    private Inventario Inv;
    private Configuracion vista;
    
    //Vista Ventanas emergentes
    private Ticket ticket;
    private Impuestos impuestos;
    private SimbolosDeMoneda simbolos;
    
    //Conexion a BD, consultas y consultas de archivos locales
    private Modelo modelo;
    private ConsultaArchivos settings;

    //private int filaEnMouse;
    
    //Constructor de parametros
    public ControladorConfiguracion(Modelo modelo, sesion vistaInicioSesion, VentanaVentas ventasInicial, //Ventanas principales
                                    Clientes ventanaClientes, NuevoProducto Product, proveedores Proveedor, Inventario Inv,
     /*Archivos de configuracion*/  Configuracion vista, ConsultaArchivos settings,
                                    Ticket ticket, Impuestos impuestos, SimbolosDeMoneda simbolos) {
        
        this.vistaInicioSesion = vistaInicioSesion;
        this.ventasInicial = ventasInicial;
        this.ventanaClientes = ventanaClientes;
        this.Product = Product;
        this.Proveedor = Proveedor;
        this.Inv = Inv;
        this.vista = vista;
        this.modelo = modelo;
        this.settings = settings;
        this.ticket = ticket;
        this.impuestos = impuestos;
        this.simbolos = simbolos;
        
        this.vista.btnImpuestos.addActionListener(this);
        this.vista.btnTicket.addActionListener(this);
        this.vista.btnMoneda.addActionListener(this);
        this.vista.btnConfHome.addActionListener(this);
        this.vista.menuClientes.addMouseListener(this);
        this.vista.menuConfiguracion.addMouseListener(this);
        this.vista.menuVentas.addMouseListener(this);
        this.vista.menuProductos.addMouseListener(this);
        this.vista.menuProveedores.addMouseListener(this);
        this.vista.menuInventario.addMouseListener(this);
        
        // <editor-fold defaultstate="collapsed" desc="Botones de Ticket">
        this.ticket.btnChanges.addActionListener(this);
        this.ticket.btnPrintTrial.addActionListener(this);
        this.ticket.btnConfHome.addActionListener(this);
        this.ticket.menuClientes.addMouseListener(this);
        this.ticket.menuProductos.addMouseListener(this);
        this.ticket.menuProveedores.addMouseListener(this);
        this.ticket.menuInventario.addMouseListener(this);
        this.ticket.menuVentas.addMouseListener(this);
        // </editor-fold>  
        
        // <editor-fold defaultstate="collapsed" desc="Botones de Impuestos"> 
        this.impuestos.btnDesactivarImpuesto.addActionListener(this);
        this.impuestos.btnGuardarImpuesto.addActionListener(this);
        this.impuestos.btnNuevoImpuesto.addActionListener(this);
        this.impuestos.checkImpuestos.addMouseListener(this);
        this.impuestos.tablaImpuestos.addMouseListener(this);
        this.impuestos.btnConfHome.addActionListener(this);
        this.impuestos.menuClientes.addMouseListener(this);
        this.impuestos.menuProductos.addMouseListener(this);
        this.impuestos.menuProveedores.addMouseListener(this);
        this.impuestos.menuInventario.addMouseListener(this);
        this.impuestos.menuVentas.addMouseListener(this);
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="Botones de Simbolos"> 
        this.simbolos.btnChanges.addActionListener(this);
        this.simbolos.btnConfHome.addActionListener(this);
        this.simbolos.menuClientes.addMouseListener(this);
        this.simbolos.menuProductos.addMouseListener(this);
        this.simbolos.menuProveedores.addMouseListener(this);
        this.simbolos.menuInventario.addMouseListener(this);
        this.simbolos.menuVentas.addMouseListener(this);
        // </editor-fold>
        
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Metodos a iniciar Ventanas">
    //Ventana Inicio de sesion
    public void inicioDeSesion(){
        vistaInicioSesion.setTitle("Inicio de sesion");
        vistaInicioSesion.setLocationRelativeTo(null);
        vistaInicioSesion.pack(); //Abre la ventana al tamaño preferido de los componentes
        vistaInicioSesion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        vistaInicioSesion.setLocationRelativeTo(null);
        vistaInicioSesion.setVisible(true); 
    }
    
    //Ventanas principales 
    public void ventanaVentas(){
        ventasInicial.setTitle("Ventas");
        ventasInicial.setLocationRelativeTo(null);
        ventasInicial.pack(); //Abre la ventana al tamaño preferido de los componentes
        ventasInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        ventasInicial.setLocationRelativeTo(null);
        ventasInicial.setVisible(true); 
    }
    
    public void ventanaClientes(){
        ventanaClientes.setTitle("Clientes");
        ventanaClientes.setLocationRelativeTo(null);
        ventanaClientes.pack(); //Abre la ventana al tamaño preferido de los componentes
        ventanaClientes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        ventanaClientes.setLocationRelativeTo(null);
        ventanaClientes.setVisible(true); 
    }
    
    public void ventanaProveedores(){
        Proveedor.setTitle("Proveedores");
        Proveedor.setLocationRelativeTo(null);
        Proveedor.pack(); //Abre la ventana al tamaño preferido de los componentes
        Proveedor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        Proveedor.setLocationRelativeTo(null);
        Proveedor.setVisible(true);
        
    }
    
    public void ventanaInventario(){
        Inv.setTitle("Inventario");
        Inv.setLocationRelativeTo(null);
        Inv.pack(); //Abre la ventana al tamaño preferido de los componentes
        Inv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        Inv.setLocationRelativeTo(null);
        Inv.setVisible(true); 
    }
    
    public void ventanaProductos(){
        Product.setTitle("Productos");
        Product.setLocationRelativeTo(null);
        Product.pack(); //Abre la ventana al tamaño preferido de los componentes
        Product.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        Product.setLocationRelativeTo(null);
        Product.setVisible(true); 
    }
    
    public void ventanaConfiguracion() {
        //pone el titulo
        vista.setTitle("Configuracion");
        vista.pack(); //Abre la ventana al tamaño preferido de los componentes
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Que hacer al cerrar, supongo
        vista.setLocationRelativeTo(null);
        vista.setVisible(true); //Supongo que establece que sea visible
    }
    
    //Iniciar ventanas de configuracion
    public void iniciarSimbolos() {
        simbolos.setTitle("Simbolos");
        simbolos.pack(); 
        simbolos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        simbolos.setLocationRelativeTo(null);
        simbolos.setVisible(true); 
        updateSettingsSimbolos();
    }
    
    public void iniciarTicket() {
        ticket.setTitle("Ticket");
        ticket.pack();
        ticket.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        ticket.setLocationRelativeTo(null);
        ticket.setVisible(true); 
        updateSettingsTicket();
    }
    
    public void iniciarImpuestos() {
        impuestos.setTitle("Impuestos");
        impuestos.pack(); 
        impuestos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        impuestos.setLocationRelativeTo(null);
        impuestos.setVisible(true); 
        updateSettingsImpuestos();
    }
    // </editor-fold>  

    //Opciones de Configuracion que dirijen a otras ventanas
    @Override
    public void actionPerformed(ActionEvent e) {
        if(vista.btnImpuestos == e.getSource()){
            //Ventana Impuestos
            this.vista.dispose();
            iniciarImpuestos();
        }else if(vista.btnTicket == e.getSource()){
            //Ventana Ticket
            iniciarTicket();
            this.vista.dispose();
        }else if(vista.btnMoneda == e.getSource()){
            //Ventana Simbolos de Moneda
            iniciarSimbolos();
            this.vista.dispose();
        }else if(ticket.btnConfHome == e.getSource() || impuestos.btnConfHome == e.getSource() || simbolos.btnConfHome == e.getSource()){
            ticket.setVisible(false); impuestos.setVisible(false); simbolos.setVisible(false);
            ventanaConfiguracion();
        }
        // <editor-fold defaultstate="collapsed" desc="Acciones de Botones de ticket"> 
        else if(ticket.btnChanges == e.getSource()){
            //Guarda Cambios
            settings.setNombreTienda(ticket.txtNombreTienda.getText());
            settings.setDireccion(ticket.txtDireccion.getText());
            settings.setTelefono(ticket.txtTelefono.getText());
            settings.setRfc(ticket.txtRFC.getText());
            settings.setEndLine(ticket.txtEndLine.getText());
            settings.setUrl(ticket.txtURL.getText());
            settings.writeDocument("Configuracion", "ticket", settings.settingsTicket());
            JOptionPane.showMessageDialog(null, "Se guardo exitosamente");
        }else if(ticket.btnPrintTrial == e.getSource()){
            //Creacion de un archivo de ejemplo
            crearEjemplo();
        }else if(ticket.btnConfHome == e.getSource()){
            ventanaConfiguracion();
            this.ticket.setVisible(false);
        }
        // </editor-fold>
        // <editor-fold defaultstate="collapsed" desc="Acciones de Botones de impuestos"> 
        else if(impuestos.btnNuevoImpuesto == e.getSource()){
            // Nuevo Impuesto
            enableModificar(impuestos.checkImpuestos.isSelected());
            impuestos.txtModImpuesto.setText("Nuevo Impuesto");
            impuestos.comboTipoImpuesto.setSelectedIndex(-1);
        }else if(impuestos.btnDesactivarImpuesto == e.getSource()){
            //Quitar impuesto
            int x = JOptionPane.showConfirmDialog(null, "Esta seguro que quiere eliminar el impuesto seleccionado?", "Eliminacion de impuesto", 0);
            switch(x){
                case 0:
                    JOptionPane.showMessageDialog(null, "Confirmado, se eliminara");
                    impuestos.tablaImpuestos.setModel(settings.eliminarImpuestos(impuestos.tablaImpuestos.getSelectedRow())); //Eliminacion de la fila de impuesto
                    updateData();
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Enterado. No se eliminara");
                    break;
                default:
                    break;
            }
        }else if(impuestos.btnGuardarImpuesto == e.getSource()){
            //Guardar impuesto nuevo/modificado
            switch(impuestos.txtModImpuesto.getText()){
                case "Nuevo Impuesto":
                    addToTabla(); //Meterlo a la tabla y escribe datos dentro del metodo
                    break;
                case "Modificar Impuesto":
                    modifyData(); //Meterlo a la tabla
                    updateData(); //Escritura del archivo en base a la tabla
                    break;
            }
        }
        // </editor-fold>
        // <editor-fold defaultstate="collapsed" desc="Acciones de botones de Simbolos"> 
        else if(simbolos.btnChanges == e.getSource()){
            //Guardar datos de los txt fields
            settings.setMoneda(simbolos.txtSimboloMoneda.getText());
            settings.setMiles(simbolos.txtSimboloMiles.getText());
            settings.setDecimal(simbolos.txtSimboloDecimal.getText());
            settings.writeDocument("Configuracion", "simbolos", settings.settingsSimbolos());
            JOptionPane.showMessageDialog(null, "Se guardo exitosamente");
        }
        // </editor-fold> 
    }
    
    
    //Barra de menu y acciones con MouseEvents
    @Override
    public void mouseClicked(MouseEvent e) {
        if(vista.menuClientes == e.getSource() || ticket.menuClientes == e.getSource() || impuestos.menuClientes == e.getSource() || simbolos.menuClientes == e.getSource()){
            //Ventana de Clientes
            vista.setVisible(false); ticket.setVisible(false); impuestos.setVisible(false); simbolos.setVisible(false);
            ventanaClientes();
        }else if(vista.menuInventario == e.getSource() || ticket.menuInventario == e.getSource() || impuestos.menuInventario == e.getSource() || simbolos.menuInventario == e.getSource()){
            //Ventana de Inventario
            vista.setVisible(false); ticket.setVisible(false); impuestos.setVisible(false); simbolos.setVisible(false);
            ventanaInventario();
        }else if(vista.menuProductos == e.getSource() || ticket.menuProductos == e.getSource() || impuestos.menuProductos == e.getSource() || simbolos.menuProductos == e.getSource()){
            //Ventana de Productos
            vista.setVisible(false); ticket.setVisible(false); impuestos.setVisible(false); simbolos.setVisible(false);
            ventanaProductos();
        }else if(vista.menuProveedores == e.getSource() || ticket.menuProveedores == e.getSource() || impuestos.menuProveedores == e.getSource() || simbolos.menuProveedores == e.getSource()){
            //Ventana de Proveedores
            vista.setVisible(false); ticket.setVisible(false); impuestos.setVisible(false); simbolos.setVisible(false);
            ventanaProveedores();
        }else if(vista.menuVentas == e.getSource() || ticket.menuVentas == e.getSource() || impuestos.menuVentas == e.getSource() || simbolos.menuVentas == e.getSource()){
            //Ventana de Ventas
            vista.setVisible(false); ticket.setVisible(false); impuestos.setVisible(false); simbolos.setVisible(false);
            ventanaVentas();
        }else if(ticket.menuConfiguracion == e.getSource() || impuestos.menuConfiguracion == e.getSource() || simbolos.menuConfiguracion == e.getSource()){
            ventanaConfiguracion();
            ticket.setVisible(false); impuestos.setVisible(false); simbolos.setVisible(false);
        }
        // <editor-fold defaultstate="collapsed" desc="Acciones de MouseClicked de Impuestos"> 
        else if(impuestos.tablaImpuestos == e.getSource()){
            // Cuando se hace click en la tabla
            if(impuestos.checkImpuestos.isSelected()){
                modificarImpuesto(impuestos.tablaImpuestos.rowAtPoint(e.getPoint()));
                enableModificar(impuestos.checkImpuestos.isSelected());
            }
        }else if(impuestos.checkImpuestos == e.getSource()){
            //Cuando se da click en el check box
            settings.setUsaImpuestos(impuestos.checkImpuestos.isSelected());
            enableTable(impuestos.checkImpuestos.isSelected());
            if(!impuestos.checkImpuestos.isSelected()){
                enableModificar(impuestos.checkImpuestos.isSelected());
            }
        }
        // </editor-fold>  
    } 
    
    // <editor-fold defaultstate="collapsed" desc="Metodos Controladores de Ticket">
    public void crearEjemplo(){
        settings.updateSettings("Configuracion");
        String dialog = "Se imprimio un ticket en la carpeta de configuracion";
        //Obtiene el resultado en una variable para poder evitar errores
        String result = settings.exampleTicket(modelo.ticketConsultar());
        if(result == null || result.isEmpty()){
            settings.writeDocument("Configuracion", "exampleTicket.txt", settings.exampleTicket());
            dialog += ". No se pudo obtener los datos de la ultima consulta, por lo que se usara una default";
        }else{
            settings.writeDocument("Configuracion", "exampleTicket.txt", result);
        }
        JOptionPane.showMessageDialog(null, dialog);
    }
    
    public void updateSettingsTicket(){
        settings.setTicket("Configuracion", "ticket");
        ticket.txtNombreTienda.setText(settings.getNombreTienda());
        ticket.txtDireccion.setText(settings.getDireccion());
        ticket.txtTelefono.setText(settings.getTelefono());
        ticket.txtRFC.setText(settings.getRfc());
        ticket.txtEndLine.setText(settings.getEndLine());
        ticket.txtURL.setText(settings.getUrl());
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Metodos Controladores de Impuestos">
    private void enableTable(boolean check){
        impuestos.tablaImpuestos.setEnabled(check);
        impuestos.tablaImpuestos.setFocusable(check);
    }
    
    //El set y get de los combo box pueden ser dinamicos, pero no existen tantos impuestos que conozca, por lo que se dejaran estos 3
    private void setComboBox(String tax){
        //System.out.println("setComboBox");
        switch(tax){
            case "IVA":
                impuestos.comboTipoImpuesto.setSelectedIndex(0);
                break;
            case "ISH":
                impuestos.comboTipoImpuesto.setSelectedIndex(1);
                break;
            case "IEPS":
                impuestos.comboTipoImpuesto.setSelectedIndex(2);
                break;
        }
    }
    
    private String getComboBox(){
        //System.out.println("ggetComboBox");
        int index = impuestos.comboTipoImpuesto.getSelectedIndex();
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
        impuestos.txtModImpuesto.setText("Modificar Impuesto");
        if(fila > -1){
            setComboBox(String.valueOf(impuestos.tablaImpuestos.getValueAt(fila, 0)));
            String porciento = dividirPorcentaje(String.valueOf(impuestos.tablaImpuestos.getValueAt(fila, 1)));
            impuestos.spinnerPorcentaje.setValue(Integer.parseInt(porciento));
        }
    }
    
    private String dividirPorcentaje(String porciento){
        String [] dividido = porciento.split("%");
        return dividido[0];
    }
    
    private void enableModificar(boolean check){
        impuestos.txtModImpuesto.setEnabled(check);
        impuestos.lblImpuesto.setEnabled(check);
        impuestos.comboTipoImpuesto.setEnabled(check);
        impuestos.lblPorcentaje.setEnabled(check);
        impuestos.spinnerPorcentaje.setEnabled(check);
        impuestos.lblPercent.setEnabled(check);
        impuestos.btnGuardarImpuesto.setEnabled(check);
        if(!check){
            impuestos.comboTipoImpuesto.setSelectedIndex(-1);
        }
    }
    
    public void addToTabla(){
        //Extrae la informacion creada hacia el modelo (el panel de la derecha). reescribe el archivo
        //y lo aggrega al modelo de tabla. La vuelve a sobreescribir
        //System.out.println("addToTabla");
        String [] adicion = new String[2];
        adicion[0] = getComboBox();
        adicion[1] = impuestos.spinnerPorcentaje.getValue().toString().concat("%");
        settings.setImpuestos("Configuracion", "impuestos");
        impuestos.tablaImpuestos.setModel(settings.agregarImpuestos(adicion));
        updateData();
    }
    
    public void updateTabla(){
        //System.out.println("updateTabla");
        //Extrae los datos del archivo, guarda el valor en Modelo.ConsultaArchivos.impuestos
        //Y al final se meten los datos a la tabla.
        //Correr cuando se hagan cambios en el documento
        settings.setImpuestos("Configuracion", "impuestos");
        impuestos.tablaImpuestos.setModel(settings.insertarImpuestos());
    }
    
    public void updateData(){
        //System.out.println("updateData");
        //Extrae los datos de la tabla, guarda el valor en Modelo.ConsultaArchivos.impuestos
        //Y al final sobreescribe el documento de impuestos. Al finalizar se vuelve a meter los datos a la tabla.
        //Correr cuando se hagan cambios en la tabla
        settings.setImpuestos(getDatosTabla());
        settings.writeDocument("configuracion", "impuestos", settings.settingsImpuestos());
        impuestos.tablaImpuestos.setModel(settings.insertarImpuestos());
    }
    
    public void modifyData(){
        //System.out.println("modifyData");
        //Extrae la informacion creada hacia el modelo (el panel de la derecha).
        //y modifica la fila en la que registro
        String [] adicion = new String[2];
        adicion[0] = getComboBox();
        adicion[1] = impuestos.spinnerPorcentaje.getValue().toString().concat("%");
        impuestos.tablaImpuestos.setModel(settings.modificarImpuestos(impuestos.tablaImpuestos.getSelectedRow(), adicion));
    }
    
    public String[][] getDatosTabla(){
        //System.out.println("getDatosTabla");
        //Extrae los datos de la tabla en un array de String
        int filas = impuestos.tablaImpuestos.getModel().getRowCount();
        
        int columnas = impuestos.tablaImpuestos.getModel().getColumnCount();
        String [][] datos = new String[filas][2];
        for(int row = 0; row < filas; row++){
            for(int column = 0; column < columnas; column++){
                datos[row][column] = impuestos.tablaImpuestos.getModel().getValueAt(row, column).toString();
            }
        }
        return datos;
    }
    
    public void updateSettingsImpuestos() {
        updateTabla();
        impuestos.checkImpuestos.setSelected(settings.usesImpuestos());
        impuestos.tablaImpuestos.setEnabled(settings.usesImpuestos());
    }
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Metodos Controladores de SimbolosDeMoneda"> 
    public void updateSettingsSimbolos(){
        //Actualizacion de los datos
        settings.setSimbols("Configuracion", "simbolos" );
        simbolos.txtSimboloMoneda.setText(settings.getMoneda());
        simbolos.txtSimboloMiles.setText(settings.getMiles());
        simbolos.txtSimboloDecimal.setText(settings.getDecimal());
    }
    // </editor-fold>
    
    @Override
    public void mousePressed(MouseEvent e) {
        //System.out.println("mousePressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //System.out.println("mouseReleased");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //System.out.println("mouseEntered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //System.out.println("mouseExited");
    }
    
}
