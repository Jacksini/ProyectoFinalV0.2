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

public class ControladorInventario implements ActionListener, MouseListener{
    
    //Vistas Inventario
    private VentanaVentas ventasInicial;
    private Clientes ventanaClientes;
    private Productos Product;
    private proveedores Proveedor;
    private Inventario Inv;
    private Configuracion Config;
    
    //Modelo
    private Modelo model;
    
    public ControladorInventario(Modelo model, 
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
        
        //Botones para cambiar entre ventanas sourse: Inventario
        this.Inv.BtnMenuVentas.addMouseListener(this);
        this.Inv.BtnMenuClientes.addMouseListener(this);
        this.Inv.BtnMenuProductos.addMouseListener(this);
        this.Inv.BtnMenuProveedores.addMouseListener(this);
        this.Inv.BtnMenuConfiguracion.addMouseListener(this);
    }
    
    //Ventanas Inventario
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
        if(Inv.BtnMenuVentas == e.getSource()){
            Inv.setVisible(false); 
            ventanaVentas();
        }else if(Inv.BtnMenuProductos == e.getSource()){
            Inv.setVisible(false);
            ventanaProductos();
        }else if(Inv.BtnMenuProveedores == e.getSource()){
            Inv.setVisible(false);
            ventanaProveedores();
        }else if(Inv.BtnMenuClientes == e.getSource()){
            Inv.setVisible(false);
            ventanaClientes();
        }else if(Inv.BtnMenuConfiguracion == e.getSource()){
            Inv.setVisible(false);
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
