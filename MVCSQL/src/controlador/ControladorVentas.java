package controlador;

//Librerias Java
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//Packages Locales
import modelo.Modelo;
import vista.Clientes;
import vista.Configuracion;
import vista.Inventario;
import vista.NuevoProducto;
import vista.VentaBuscador;
import vista.VentaVerificador;
import vista.VentanaCobro;
import vista.VentanaEntradas;
import vista.VentanaSalida;
import vista.VentanaVentas;
import vista.proveedores;
import vista.sesion;

public class ControladorVentas implements ActionListener, MouseListener{
    
//vistas de Ventas
    private sesion vistaInicioSesion;
    private VentanaVentas ventasInicial;
    private Clientes ventanaClientes;
    private NuevoProducto Product;
    private proveedores Proveedor;
    private Inventario Inv;
    private Configuracion Config;
    
    //vista Ventanas emergentes
    private VentanaEntradas Entradas;
    private VentanaSalida Salidas;
    private VentaBuscador Buscador;
    private VentaVerificador Verificador;
    private VentanaCobro Cobro;
    
    //Conexion a BD y consultas de SQL
    private Modelo model;
    modelo.ConsultaArchivos settings = new modelo.ConsultaArchivos("Configuracion");
    
    public ControladorVentas(Modelo model, 
           sesion vistaInicioSesion, 
           VentanaVentas ventasInicial, 
           Clientes ventanaClientes, 
           NuevoProducto Product, 
           proveedores Proveedor, 
           Inventario Inv, 
           Configuracion Config,
           VentanaEntradas Entradas,
           VentanaSalida Salidas,
           VentaBuscador Buscador,
           VentaVerificador Verificador,
           VentanaCobro Cobro){
        
        //Ventana Ventas
        this.vistaInicioSesion = vistaInicioSesion;
        this.ventasInicial = ventasInicial;
        this.ventanaClientes = ventanaClientes;
        this.Product = Product;
        this.Proveedor = Proveedor;
        this.Inv = Inv;
        this.Config = Config;
        
        //Ventanas emergentes
        this.Entradas = Entradas;
        this.Salidas = Salidas;
        this.Buscador = Buscador;
        this.Verificador = Verificador;
        this.Cobro = Cobro;
        
        //Modelo
        this.model = model;
        
        
        //Boton de Inicio de sesion
        this.vistaInicioSesion.btnIngresar.addActionListener(this);
        //Botones para cambiar entre ventanas sourse: Ventas
        this.ventasInicial.BtnMenuClientes.addMouseListener(this);
        this.ventasInicial.BtnMenuProductos.addMouseListener(this);
        this.ventasInicial.BtnMenuProveedores.addMouseListener(this);
        this.ventasInicial.BtnMenuInventario.addMouseListener(this);
        this.ventasInicial.BtnMenuConfiguracion.addMouseListener(this);
        
        //Botones para abirir ventanas emergentes
        this.ventasInicial.BtnEntradas.addMouseListener(this);
        this.ventasInicial.BtnSalidas.addMouseListener(this);
        this.ventasInicial.BtnBuscar.addMouseListener(this);
        this.ventasInicial.BtnVerificador.addMouseListener(this);
        this.ventasInicial.BtnCobrar.addMouseListener(this);
        
        //Botones de ventanas emergentes        
        //Botones de entradas
        this.Entradas.BtnGuardar.addMouseListener(this);
        this.Entradas.BtnCancelar.addMouseListener(this);
        //Botones de salidas
        this.Salidas.BtnGuardar.addMouseListener(this);
        this.Salidas.BtnCancelar.addMouseListener(this);
        //Botones de verificador
        this.Verificador.BtnAgregar.addMouseListener(this);
        this.Verificador.BtnCancelar.addMouseListener(this);
        //Botones de buscador
        this.Buscador.BtnAceptar.addMouseListener(this);
        this.Buscador.BtnCancelar.addMouseListener(this);
        this.Buscador.btnBuscar.addMouseListener(this);
        //Botones de cobro
        this.Cobro.BtnCobrar.addMouseListener(this);
        this.Cobro.BtnCancelar.addMouseListener(this);
        this.Cobro.btnGenerarFactura.addMouseListener(this);
                
        //Botones con procesos en ventana ventas
        this.ventasInicial.btnActualizar.addMouseListener(this);
        this.ventasInicial.BtnBorrar.addMouseListener(this);
        
        //Cajas de texto de ventana ventas
        this.ventasInicial.TFCodigoProducto.addMouseListener(this);
    }
    
    //Ventana Inicio de sesion
    public void inicioDeSesion(){
        vistaInicioSesion.setTitle("Inicio de sesion");
        vistaInicioSesion.setLocationRelativeTo(null);
        vistaInicioSesion.pack(); //Abre la ventana al tamaño preferido de los componentes
        vistaInicioSesion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        vistaInicioSesion.setLocationRelativeTo(null);
        vistaInicioSesion.setVisible(true); 
    }
    
    //Ventanas Ventas
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
        Product.setTitle("Nuevo Producto");
        Product.setLocationRelativeTo(null);
        Product.pack(); //Abre la ventana al tamaño preferido de los componentes
        Product.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        Product.setLocationRelativeTo(null);
        Product.setVisible(true); 
    }
    
    public void ventanaConfiguracion(){
        Config.setTitle("Configuracion");
        Config.setLocationRelativeTo(null);
        Config.pack(); //Abre la ventana al tamaño preferido de los componentes
        Config.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        Config.setLocationRelativeTo(null);
        Config.setVisible(true);
    }
    
    //Ventanas Emergentes
    public void ventanaEntradas(){
        Entradas.setTitle("Entradas");
        Entradas.setLocationRelativeTo(null);
        Entradas.pack(); //Abre la ventana al tamaño preferido de los componentes
        Entradas.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 
        Entradas.setLocationRelativeTo(null);
        Entradas.setVisible(true);
    }
    
    public void ventanaSalidas(){
        Salidas.setTitle("Salidas");
        Salidas.setLocationRelativeTo(null);
        Salidas.pack(); //Abre la ventana al tamaño preferido de los componentes
        Salidas.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        Salidas.setLocationRelativeTo(null);
        Salidas.setVisible(true);
    }
    
    public void ventanaBuscador(){
        Buscador.setTitle("Buscador");
        Buscador.setLocationRelativeTo(null);
        Buscador.pack(); //Abre la ventana al tamaño preferido de los componentes
        Buscador.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 
        Buscador.setLocationRelativeTo(null);
        Buscador.setVisible(true);
    }
    
    public void ventanaVerificador(){
        Verificador.setTitle("Verificador");
        Verificador.setLocationRelativeTo(null);
        Verificador.pack(); //Abre la ventana al tamaño preferido de los componentes
        Verificador.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 
        Verificador.setLocationRelativeTo(null);
        Verificador.setVisible(true);
    }
    
    public void ventanaCobro(){
        Cobro.setTitle("Cobro");
        Cobro.setLocationRelativeTo(null);
        Cobro.pack(); //Abre la ventana al tamaño preferido de los componentes
        Cobro.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 
        Cobro.setLocationRelativeTo(null);
        Cobro.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        model.setUsuario(vistaInicioSesion.txtUsuario.getText());
        model.setContraseña(String.valueOf(vistaInicioSesion.passUsuario.getPassword()));
        model.conectar();
        if(model.conectar() == true){
            vistaInicioSesion.setVisible(false); 
            ventanaVentas();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(ventasInicial.BtnMenuClientes == e.getSource()){
            ventasInicial.setVisible(false); 
            ventanaClientes();  
        }else if(ventasInicial.BtnMenuProductos == e.getSource()){
            ventasInicial.setVisible(false); 
            ventanaProductos();
        }else if(ventasInicial.BtnMenuProveedores == e.getSource()){
            ventasInicial.setVisible(false);
            ventanaProveedores();
        }else if(ventasInicial.BtnMenuInventario == e.getSource()){
            ventasInicial.setVisible(false);
            ventanaInventario();
        }else if(ventasInicial.BtnMenuProductos == e.getSource()){
            ventasInicial.setVisible(false);
            ventanaProductos();
        }else if(ventasInicial.BtnMenuConfiguracion == e.getSource()){
            ventasInicial.setVisible(false);
            ventanaConfiguracion();
        }else if(ventasInicial.BtnEntradas == e.getSource()){
            ventanaEntradas();
        }else if(ventasInicial.BtnSalidas == e.getSource()){
            ventanaSalidas();
        }else if(ventasInicial.BtnBuscar == e.getSource()){
            ventanaBuscador();
        }else if(ventasInicial.BtnVerificador == e.getSource()){
            ventanaVerificador();
        }else if(ventasInicial.BtnCobrar == e.getSource()){
            ventanaCobro();
        }else if(ventasInicial.btnActualizar == e.getSource()){
            String consulta = "call mostrarfacturasventa();";
            try{
                DefaultTableModel tabla = model.MostrarTablas(consulta);
                ventasInicial.TablaProductos.setModel(tabla);
            }catch(IllegalArgumentException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            
        }else if(ventasInicial.BtnBorrar == e.getSource()){
            DefaultTableModel model = (DefaultTableModel) ventasInicial.TablaProductos.getModel(); 
            model.setRowCount(0);
        }
        // <editor-fold defaultstate="collapsed" desc="Botones de ventnas emergentes">
        else if(Entradas.BtnGuardar == e.getSource()){
            //Pendiente
            JOptionPane.showMessageDialog(null, "No se ha implementado esta funcion en la version actual del programa", "No implementado", 1);
        }else if(Entradas.BtnCancelar == e.getSource()){
            Entradas.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            Entradas.setLocationRelativeTo(null);
            Entradas.setVisible(false);
        }else if(Salidas.BtnGuardar == e.getSource()){
            //Pendinete
            JOptionPane.showMessageDialog(null, "No se ha implementado esta funcion en la version actual del programa", "No implementado", 1);
        }else if(Salidas.BtnCancelar == e.getSource()){
            Salidas.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            Salidas.setLocationRelativeTo(null);
            Salidas.setVisible(false);
        }else if(Verificador.BtnAgregar == e.getSource()){
            //Pendiente
            JOptionPane.showMessageDialog(null, "No se ha implementado esta funcion en la version actual del programa", "No implementado", 1);
//            String[] Valores = model.MostrarProductos(Integer.parseInt(Verificador.TFBuscador.getText()));
//            Verificador.LblNombreArticulo.setText(Valores[0]);
//            Verificador.LblPrecioArticulo.setText(putPrices(Valores[1]));
        }else if(Verificador.BtnCancelar == e.getSource()){
            Verificador.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            Verificador.setLocationRelativeTo(null);
            Verificador.setVisible(false);
        }else if(Buscador.BtnAceptar == e.getSource()){
            //Pendiente
            JOptionPane.showMessageDialog(null, "No se ha implementado esta funcion en la version actual del programa", "No implementado", 1);
        }else if(Buscador.BtnCancelar == e.getSource()){
            Buscador.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            Buscador.setLocationRelativeTo(null);
            Buscador.setVisible(false);
        }else if(Buscador.btnBuscar == e.getSource()){
            //Pendiente
            JOptionPane.showMessageDialog(null, "No se ha implementado esta funcion en la version actual del programa", "No implementado", 1);
        }else if(Cobro.BtnCobrar == e.getSource()){
            //Pendiente
            JOptionPane.showMessageDialog(null, "No se ha implementado esta funcion en la version actual del programa", "No implementado", 1);
        }else if(Cobro.BtnCancelar == e.getSource()){
            Cobro.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            Cobro.setLocationRelativeTo(null);
            Cobro.setVisible(false);
        }else if(Cobro.btnGenerarFactura == e.getSource()){
            //Pendiente
            JOptionPane.showMessageDialog(null, "No se ha implementado esta funcion en la version actual del programa", "No implementado", 1);
        }
        // </editor-fold>  
    }

    public String putPrices(String floatingNum){
        //Metodo para asignar a los String de numero los simbolos customizados.
        String[] valores = new String[2];
        valores = floatingNum.split("\\.");
        String end = settings.moneda + valores[0] +settings.decimal +valores[1];
        return end;
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}