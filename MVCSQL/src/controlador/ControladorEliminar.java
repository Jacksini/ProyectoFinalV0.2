package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Modelo;
import vista.Clientes;
import vista.Configuracion;
import vista.Inventario;
import vista.NuevoProducto;
import vista.VentanaVentas;
import vista.eliminar;
import vista.modificarprovedor;
import vista.nuevoproveedor;
import vista.proveedores;
import vista.sesion;

public class ControladorEliminar implements ActionListener, MouseListener{

    //Vistas Inventario
    private VentanaVentas ventasInicial;
    private Clientes ventanaClientes;
    private NuevoProducto Product;
    private proveedores Proveedor;
    private Inventario Inv;
    private Configuracion Config;
    
    //Ventanas emergentes
    private nuevoproveedor nuevoProv;
    private modificarprovedor modProv;
    private eliminar elim;
    
    //Modelo
    private Modelo model;
    
    public ControladorEliminar(Modelo model, 
           sesion vistaInicioSesion, 
           VentanaVentas ventasInicial, 
           Clientes ventanaClientes, 
           NuevoProducto Product, 
           proveedores Proveedor, 
           Inventario Inv, 
           Configuracion Config,
           nuevoproveedor nuevoProv,
           modificarprovedor modProv,
           eliminar elim){
        
        //Ventana Inventario
        this.ventasInicial = ventasInicial;
        this.ventanaClientes = ventanaClientes;
        this.Product = Product;
        this.Proveedor = Proveedor;
        this.Inv = Inv;
        this.Config = Config;
        
        //ventanas emergentes
        this.nuevoProv = nuevoProv;
        this.modProv = modProv;
        this.elim = elim;
        
        //Modelo
        this.model = model;
        
        //Botones para cambiar entre ventanas sourse: Proveedores
        this.elim.BtnMenuVentas.addMouseListener(this);
        this.elim.BtnMenuClientes.addMouseListener(this);
        this.elim.BtnMenuProductos.addMouseListener(this);
        this.elim.BtnMenuInventario.addMouseListener(this);
        this.elim.BtnMenuConfiguracion.addMouseListener(this);
        
        //Botones para abrir ventanas emergentes sourse: Proveedores
        this.elim.BTTNuevoProveedor.addMouseListener(this);
        this.elim.BTTModificarProveedor.addMouseListener(this);
        this.elim.BTTEliminarProveedor.addMouseListener(this);
        
        //BOTONES PARA MOSTRAR EN TABLA
        this.elim.BTTMostrarPro.addMouseListener(this);
        this.elim.BTTBuscar.addMouseListener(this);
        this.elim.BTTEliminarBuscado.addMouseListener(this);

    }
    
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
    
    public void ventanaProductos(){
        Product.setTitle("Nuevo Producto");
        Product.setLocationRelativeTo(null);
        Product.pack(); //Abre la ventana al tamaño preferido de los componentes
        Product.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        Product.setLocationRelativeTo(null);
        Product.setVisible(true); 
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
    
    public void ventanaConfiguracion(){
        Config.setTitle("Configuracion");
        Config.setLocationRelativeTo(null);
        Config.pack(); //Abre la ventana al tamaño preferido de los componentes
        Config.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        Config.setLocationRelativeTo(null);
        Config.setVisible(true);
    }
    
    //Ventanas emergentes
    public void ventanaNuevoProveedor(){
        nuevoProv.setTitle("Nuevo Proveedor");
        nuevoProv.setLocationRelativeTo(null);
        nuevoProv.pack(); //Abre la ventana al tamaño preferido de los componentes
        nuevoProv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        nuevoProv.setLocationRelativeTo(null);
        nuevoProv.setVisible(true);
    }
    
    public void ventanaEditarProveedor(){
        modProv.setTitle("Editar Proveedor");
        modProv.setLocationRelativeTo(null);
        modProv.pack(); //Abre la ventana al tamaño preferido de los componentes
        modProv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        modProv.setLocationRelativeTo(null);
        modProv.setVisible(true);
    }
    
    public void ventanaEliminarProveedor(){
        elim.setTitle("Eliminar Proveedor");
        elim.setLocationRelativeTo(null);
        elim.pack(); //Abre la ventana al tamaño preferido de los componentes
        elim.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        elim.setLocationRelativeTo(null);
        elim.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(elim.BtnMenuVentas == e.getSource()){
            elim.setVisible(false); 
            ventanaVentas();
        }else if(elim.BtnMenuClientes == e.getSource()){
            elim.setVisible(false);
            ventanaClientes();
        }else if(elim.BtnMenuProductos == e.getSource()){
            elim.setVisible(false);
            ventanaProductos();
        }else if(elim.BtnMenuInventario == e.getSource()){
            elim.setVisible(false);
            ventanaInventario();
        }else if(elim.BtnMenuConfiguracion == e.getSource()){
            elim.setVisible(false);
            ventanaConfiguracion();
        }else if(elim.BTTNuevoProveedor == e.getSource()){
            elim.setVisible(false);
            ventanaNuevoProveedor();
        }else if(elim.BTTModificarProveedor == e.getSource()){
            JOptionPane.showMessageDialog(null, "No se ha implementado esta funcion en la version actual del programa", "No implementado", 1);
//            elim.setVisible(false);
//            ventanaEditarProveedor();
        }else if(elim.BTTEliminarProveedor == e.getSource()){
            elim.setVisible(false);
            ventanaEliminarProveedor();
        }else if(elim.BTTMostrarPro == e.getSource()){
            String mostrar = "call MostrarProveedores();";
            DefaultTableModel tabla = model.MostrarTablas(mostrar);
            elim.tablaprov.setModel(tabla);
        }else if(elim.BTTBuscar == e.getSource()){
            String buscar = "call buscarProveedorid("+ elim.TXTNombreProveedor.getText() +");";
            DefaultTableModel tabla = model.MostrarTablas(buscar);
            elim.tablaprov.setModel(tabla); 
        }else if(elim.BTTEliminarBuscado == e.getSource()){
            String eliminar = "call EliminarProveedor('"+ elim.TXTNombreProveedor.getText() +"')";
            DefaultTableModel tabla = model.MostrarTablas(eliminar);
            try{
                elim.tablaprov.setModel(tabla);
            }catch(IllegalArgumentException exc){
                
            }
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
