package controlador;

//Librerias Java
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

//Packages Locales
import modelo.Modelo;
import vista.Clientes;
import vista.Configuracion;
import vista.Inventario;
import vista.Productos;
import vista.VentanaVentas;
import vista.proveedores;
import vista.sesion;

public class ControladorClientes implements ActionListener, MouseListener{
    
    //Vistas Clientes
    private VentanaVentas ventasInicial;
    private Clientes ventanaClientes;
    private Productos Product;
    private proveedores Proveedor;
    private Inventario Inv;
    private Configuracion Config;
    
    //Modelo
    private Modelo model;
    
    public ControladorClientes(Modelo model, 
           sesion vistaInicioSesion, 
           VentanaVentas ventasInicial, 
           Clientes ventanaClientes, 
           Productos Product, 
           proveedores Proveedor, 
           Inventario Inv, 
           Configuracion Config){
        
        //Ventana Clientes
        this.ventasInicial = ventasInicial;
        this.ventanaClientes = ventanaClientes;
        this.Product = Product;
        this.Proveedor = Proveedor;
        this.Inv = Inv;
        this.Config = Config;
        
        //Modelo
        this.model = model;
        
        //Botones para cambiar entre ventanas sourse: Ventas
        this.ventanaClientes.BtnMenuVentas.addMouseListener(this);
        this.ventanaClientes.BtnMenuProductos.addMouseListener(this);
        this.ventanaClientes.BtnMenuProveedores.addMouseListener(this);
        this.ventanaClientes.BtnMenuInventario.addMouseListener(this);
        this.ventanaClientes.BtnMenuConfiguracion.addMouseListener(this);
    }
    
    //Ventanas Clientes
    public void ventanaVentas(){
        ventasInicial.setTitle("Ventas");
        ventasInicial.setLocationRelativeTo(null);
        ventasInicial.pack(); //Abre la ventana al tamaño preferido de los componentes
        ventasInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        ventasInicial.setLocationRelativeTo(null);
        ventasInicial.setVisible(true); 
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

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(ventanaClientes.BtnMenuVentas == e.getSource()){
            ventanaClientes.setVisible(false); 
            ventanaVentas();
        }else if(ventanaClientes.BtnMenuProductos == e.getSource()){
            ventanaClientes.setVisible(false); 
            ventanaProductos();
        }else if(ventanaClientes.BtnMenuProveedores == e.getSource()){
            ventanaClientes.setVisible(false);
            ventanaProveedores();
        }else if(ventanaClientes.BtnMenuInventario == e.getSource()){
            ventanaClientes.setVisible(false);
            ventanaInventario();
        }else if(ventanaClientes.BtnMenuProductos == e.getSource()){
            ventanaClientes.setVisible(false);
            ventanaProductos();
        }else if(ventanaClientes.BtnMenuConfiguracion == e.getSource()){
            ventanaClientes.setVisible(false);
            ventanaConfiguracion();
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
