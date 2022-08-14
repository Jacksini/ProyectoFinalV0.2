package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import modelo.Modelo;
import vista.Agregarproducto;
import vista.Clientes;
import vista.Configuracion;
import vista.Departamentos;
import vista.EliminarProducto;
import vista.Inventario;
import vista.ModificarProducto;
import vista.NuevoProducto;
import vista.Productos;
import vista.VentanaVentas;
import vista.proveedores;
import vista.sesion;

public class ControladorNuevoProducto implements ActionListener, MouseListener{
    //vistas de Ventas
    private sesion vistaInicioSesion;
    private VentanaVentas ventasInicial;
    private Clientes ventanaClientes;
    private Productos Product;
    private proveedores Proveedor;
    private Inventario Inv;
    private Configuracion Config;
    
    //Vista Ventanas secundarias
    private Agregarproducto Agregarproduct;
    private Departamentos Depart;
    private EliminarProducto ElimProdu;
    private ModificarProducto ModProdu;
    private NuevoProducto NewProdu;
    
    //Conexion a BD y consultas de SQL
    private Modelo model;
    
    public ControladorNuevoProducto(Modelo model, 
           sesion vistaInicioSesion, 
           VentanaVentas ventasInicial, 
           Clientes ventanaClientes, 
           Productos Product, 
           proveedores Proveedor, 
           Inventario Inv, 
           Configuracion Config,
           Agregarproducto Agregarproduct,
           Departamentos Depart,
           EliminarProducto ElimProdu,
           ModificarProducto ModProdu,
           NuevoProducto NewProdu){
        
        //Ventanas Productos
        this.vistaInicioSesion = vistaInicioSesion;
        this.ventasInicial = ventasInicial;
        this.ventanaClientes = ventanaClientes;
        this.Product = Product;
        this.Proveedor = Proveedor;
        this.Inv = Inv;
        this.Config = Config;
        
        //Ventanas emergentes
        this.Agregarproduct = Agregarproduct;
        this.Depart = Depart;
        this.ElimProdu = ElimProdu;
        this.ModProdu = ModProdu;
        this.NewProdu = NewProdu;
        
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
        this.NewProdu.btnModificar.addMouseListener(this);
        this.NewProdu.btnEliminar.addMouseListener(this);
        this.NewProdu.btnDepartamentos.addMouseListener(this);
        this.NewProdu.btnCatalogo.addMouseListener(this);
        
        //Botones con procesos
        this.NewProdu.btnGuardar.addMouseListener(this);
        this.NewProdu.btnCancelar.addMouseListener(this);
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
        Product.setTitle("Productos");
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
        }else if(NewProdu.btnModificar == e.getSource()){
            NewProdu.setVisible(false);
            ventanaModificarProducto();
        }else if(NewProdu.btnEliminar == e.getSource()){
            NewProdu.setVisible(false);
            ventanaEliminarProducto();
        }else if(NewProdu.btnDepartamentos == e.getSource()){
            NewProdu.setVisible(false);
            ventanaDepartamentos();
        }else if(NewProdu.btnCatalogo == e.getSource()){
            NewProdu.setVisible(false);
            ventanaInventario();
        }else if(NewProdu.btnGuardar == e.getSource()){
            
        }else if(NewProdu.btnCancelar == e.getSource()){
            
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
