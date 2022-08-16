package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Modelo;
import vista.Agregarproducto;
import vista.Clientes;
import vista.Configuracion;
import vista.Departamentos;
import vista.EliminarProducto;
import vista.Inventario;
import vista.ModificarProducto;
import vista.NuevoProducto;
import vista.VentanaVentas;
import vista.proveedores;
import vista.sesion;

public class ControladorNuevoProducto implements ActionListener, MouseListener{
    //vistas de Ventas
    private sesion vistaInicioSesion;
    private VentanaVentas ventasInicial;
    private Clientes ventanaClientes;
    private NuevoProducto NewProdu;
    private proveedores Proveedor;
    private Inventario Inv;
    private Configuracion Config;
    
    //Vista Ventanas secundarias
    private Agregarproducto Agregarproduct;
    private Departamentos Depart;
    private EliminarProducto ElimProdu;
    private ModificarProducto ModProdu;
    
    //Conexion a BD y consultas de SQL
    private Modelo model;
    
    public ControladorNuevoProducto(Modelo model, 
           sesion vistaInicioSesion, 
           VentanaVentas ventasInicial, 
           Clientes ventanaClientes, 
           NuevoProducto NewProdu, 
           proveedores Proveedor, 
           Inventario Inv, 
           Configuracion Config,
           Agregarproducto Agregarproduct,
           Departamentos Depart,
           EliminarProducto ElimProdu,
           ModificarProducto ModProdu){
        
        //Ventanas Productos
        this.vistaInicioSesion = vistaInicioSesion;
        this.ventasInicial = ventasInicial;
        this.ventanaClientes = ventanaClientes;
        this.NewProdu = NewProdu;
        this.Proveedor = Proveedor;
        this.Inv = Inv;
        this.Config = Config;
        
        //Ventanas emergentes
        this.Agregarproduct = Agregarproduct;
        this.Depart = Depart;
        this.ElimProdu = ElimProdu;
        this.ModProdu = ModProdu;
        
        //Modelo
        this.model = model;
        
        //Botones para cambiar entre ventanas sourse: Ventas
        this.NewProdu.BtnMenuClientes.addMouseListener(this);
        this.NewProdu.BtnMenuProductos.addMouseListener(this);
        this.NewProdu.BtnMenuProveedores.addMouseListener(this);
        this.NewProdu.BtnMenuInventario.addMouseListener(this);
        this.NewProdu.BtnMenuConfiguracion.addMouseListener(this);
        
        //Botones para abrir ventanas emergentes
        this.NewProdu.btnNuevo.addMouseListener(this);
        this.NewProdu.btnAgregar.addMouseListener(this);
        this.NewProdu.btnEliminar.addMouseListener(this);
        this.NewProdu.btnDepartamentos.addMouseListener(this);
        this.NewProdu.btnCatalogo.addMouseListener(this);
        
        //Botones con procesos
        this.NewProdu.btnGuardar.addActionListener(this);
        this.NewProdu.btnCancelar.addActionListener(this);
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
        NewProdu.setTitle("Nuevo Productos");
        NewProdu.setLocationRelativeTo(null);
        NewProdu.pack(); //Abre la ventana al tamaño preferido de los componentes
        NewProdu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        NewProdu.setLocationRelativeTo(null);
        NewProdu.setVisible(true); 
    }
    
    public void ventanaConfiguracion(){
        Config.setTitle("Configuracion");
        Config.setLocationRelativeTo(null);
        Config.pack(); //Abre la ventana al tamaño preferido de los componentes
        Config.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        Config.setLocationRelativeTo(null);
        Config.setVisible(true);
    }
    
    //ventanas emergentes
    public void ventanaAgregarProducto(){
        Agregarproduct.setTitle("Agregar Producto");
        Agregarproduct.setLocationRelativeTo(null);
        Agregarproduct.pack(); //Abre la ventana al tamaño preferido de los componentes
        Agregarproduct.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        Agregarproduct.setLocationRelativeTo(null);
        Agregarproduct.setVisible(true);
    }
    
    public void ventanaDepartamentos(){
        Depart.setTitle("Departamentos");
        Depart.setLocationRelativeTo(null);
        Depart.pack(); //Abre la ventana al tamaño preferido de los componentes
        Depart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        Depart.setLocationRelativeTo(null);
        Depart.setVisible(true);
    }
    
    public void ventanaEliminarProducto(){
        ElimProdu.setTitle("Eliminar Producto");
        ElimProdu.setLocationRelativeTo(null);
        ElimProdu.pack(); //Abre la ventana al tamaño preferido de los componentes
        ElimProdu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        ElimProdu.setLocationRelativeTo(null);
        ElimProdu.setVisible(true);
    }
    
    public void ventanaModificarProducto(){
        ModProdu.setTitle("Modificar Producto");
        ModProdu.setLocationRelativeTo(null);
        ModProdu.pack(); //Abre la ventana al tamaño preferido de los componentes
        ModProdu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        ModProdu.setLocationRelativeTo(null);
        ModProdu.setVisible(true);
    }
    
    public void ventanaNuevoProducto(){
        NewProdu.setTitle("Nuevo Producto");
        NewProdu.setLocationRelativeTo(null);
        NewProdu.pack(); //Abre la ventana al tamaño preferido de los componentes
        NewProdu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        NewProdu.setLocationRelativeTo(null);
        NewProdu.setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(NewProdu.btnGuardar == e.getSource()){
            //Accion guardar
            System.out.println("Action save");
            
            if(crearProducto()){
                JOptionPane.showMessageDialog(null, "Se agrego exitosamente");
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo agregar correctamente el producto");
            }
        }else if(NewProdu.btnCancelar == e.getSource()){
            //Accion cancelar
            System.out.println("Action clean");
            limpiarInformacion();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(NewProdu.BtnMenuClientes == e.getSource()){
            NewProdu.setVisible(false); 
            ventanaClientes();  
        }else if(NewProdu.BtnMenuProductos == e.getSource()){
            NewProdu.setVisible(false); 
            ventanaProductos();
        }else if(NewProdu.BtnMenuProveedores == e.getSource()){
            NewProdu.setVisible(false);
            ventanaProveedores();
        }else if(NewProdu.BtnMenuInventario == e.getSource()){
            NewProdu.setVisible(false);
            ventanaInventario();
        }else if(NewProdu.BtnMenuConfiguracion == e.getSource()){
            NewProdu.setVisible(false);
            ventanaConfiguracion();
        }else if(NewProdu.btnNuevo == e.getSource()){
            NewProdu.setVisible(false);
            ventanaNuevoProducto();
        }else if(NewProdu.btnAgregar == e.getSource()){
            NewProdu.setVisible(false);
            ventanaAgregarProducto();
        }else if(NewProdu.btnEliminar == e.getSource()){
            NewProdu.setVisible(false);
            ventanaEliminarProducto();
        }else if(NewProdu.btnDepartamentos == e.getSource()){
            NewProdu.setVisible(false);
            ventanaDepartamentos();
        }else if(NewProdu.btnCatalogo == e.getSource()){
            NewProdu.setVisible(false);
            ventanaInventario();   
        }
    }

    public void limpiarInformacion(){
        NewProdu.txtCodigoProducto.setText("");
        NewProdu.txtDepartamento.setText("");
        NewProdu.txtDescripcion.setText("");
        NewProdu.txtGanancia.setText("");
        NewProdu.txtHay.setText("");
        NewProdu.txtMaximo.setText("");
        NewProdu.txtMinimo.setText("");
        NewProdu.txtNombreProd.setText("");
        NewProdu.txtPrecioCosto.setText("");
        NewProdu.txtProveedor.setText("");
        NewProdu.txtCodigoProducto.setText("");
        NewProdu.cbKilo.setSelected(false);
        NewProdu.cbPerecedero.setSelected(false);
        NewProdu.cbUnidades.setSelected(false);
    }
    
    public int determinarPerecedero(boolean perecedero){
        if(perecedero){
            return 1;
        }else{
            return 2;
        }
    }
    
    public int determinarTipo(boolean kilo, boolean unidades) throws ArithmeticException{
        if(kilo == unidades){
            throw new ArithmeticException("Se seleccionaron dos tipos de producto (Por kilo & Por Unidad)");
        }else{
            if(kilo){
                return 1;
            }else if(unidades){
                return 2;
            }
            else{
                return -1;
            }
        }
    }
    
    public boolean crearProducto(){
        try{
            int tipo = determinarTipo(NewProdu.cbKilo.isSelected(), NewProdu.cbUnidades.isSelected());
            int perecedero = determinarPerecedero(NewProdu.cbPerecedero.isSelected());
            int proveedor = Integer.parseInt(NewProdu.txtProveedor.getText());
            float precioCosto = Float.parseFloat(NewProdu.txtPrecioCosto.getText());
            float ganancia = (Float.parseFloat(NewProdu.txtGanancia.getText()) / 100);
            int departamento = Integer.parseInt(NewProdu.txtDepartamento.getText());
            int hay = Integer.parseInt(NewProdu.txtHay.getText());
            int minimo = Integer.parseInt(NewProdu.txtMinimo.getText());
            int maximo = Integer.parseInt(NewProdu.txtMaximo.getText());
            float precioFinal = 0;
            
            return model.nuevoProducto(
                    NewProdu.txtCodigoProducto.getText(), NewProdu.txtNombreProd.getText(), NewProdu.txtDescripcion.getText(), perecedero,
                    proveedor, tipo, precioCosto, ganancia, departamento, hay, minimo, maximo, precioFinal);
        }catch(NumberFormatException e){
            return false;
        }catch(ArithmeticException e){
            JOptionPane.showMessageDialog(null, e.getMessage()+". Por favor intente de Nuevo");
            return false;
        }
        
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
