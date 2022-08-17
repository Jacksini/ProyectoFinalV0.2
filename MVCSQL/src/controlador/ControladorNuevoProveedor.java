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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
//import javax.swing.JOptionPane;
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

public class ControladorNuevoProveedor implements ActionListener, MouseListener{

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
    
    public ControladorNuevoProveedor(Modelo model, 
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
        this.nuevoProv.BtnMenuVentas.addMouseListener(this);
        this.nuevoProv.BtnMenuClientes.addMouseListener(this);
        this.nuevoProv.BtnMenuProductos.addMouseListener(this);
        this.nuevoProv.BtnMenuInventario.addMouseListener(this);
        this.nuevoProv.BtnMenuConfiguracion.addMouseListener(this);
        this.nuevoProv.BtnMenuProveedores.addMouseListener(this);
        
        //Botones para abrir ventanas emergentes sourse: Proveedores
        this.nuevoProv.BTTNuevoProveedor.addMouseListener(this);
//        this.nuevoProv.BTTModificarProveedor.addMouseListener(this);
        this.nuevoProv.BTTEliminarProveedor.addMouseListener(this);
        
        //Botones con pocesos
        this.nuevoProv.BTTAgregar.addMouseListener(this);
        this.nuevoProv.BTTActualizar.addMouseListener(this);
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
        Product.setTitle("Productos");
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
       if(nuevoProv.BtnMenuVentas == e.getSource()){
            nuevoProv.setVisible(false); 
            ventanaVentas();
        }else if(nuevoProv.BtnMenuClientes == e.getSource()){
            nuevoProv.setVisible(false); 
            ventanaClientes();
        }else if(nuevoProv.BtnMenuProductos == e.getSource()){
            nuevoProv.setVisible(false); 
            ventanaProductos();
        }else if(nuevoProv.BtnMenuInventario == e.getSource()){
            nuevoProv.setVisible(false); 
            ventanaInventario();
        }else if(nuevoProv.BtnMenuConfiguracion == e.getSource()){
            nuevoProv.setVisible(false); 
            ventanaConfiguracion();
        }else if(nuevoProv.BTTNuevoProveedor == e.getSource()){
            nuevoProv.setVisible(false); 
            ventanaNuevoProveedor();
//        }else if(nuevoProv.BTTModificarProveedor == e.getSource()){
//            JOptionPane.showMessageDialog(null, "No se ha implementado esta funcion en la version actual del programa", "No implementado", 1);

//            nuevoProv.setVisible(false); 
//            ventanaEditarProveedor();
        }else if(nuevoProv.BTTEliminarProveedor == e.getSource()){
            nuevoProv.setVisible(false); 
            ventanaEliminarProveedor();
        }else if(nuevoProv.BTTAgregar == e.getSource()){
            try {
            Statement s = model.con.createStatement();
            String query = "call NuevoProveedor('" + nuevoProv.TXTnombreProveedor.getText() + "', '" + nuevoProv.TXTRFCproveedor.getText() + "', '" + nuevoProv.TXTCalleNumeroProveedor.getText() + "', '" + nuevoProv.TXTTelefonoProveedor.getText() + "', " + nuevoProv.BOXTipoTelefono.getSelectedIndex() + ", '" + nuevoProv.TXTNombrePersonal.getText() + "', '" + nuevoProv.TXTDepartamentoTelefono.getText() + "', '" + nuevoProv.TXTCorreoProveedor.getText() + "'," + nuevoProv.BOXEstado.getSelectedIndex() + ", "+ nuevoProv.BOXMunicipio.getSelectedIndex() + ", "+ nuevoProv.BOXColonia.getSelectedIndex() + ");";
            s.execute(query);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
            
        }else if(nuevoProv.BTTActualizar == e.getSource()){
            String consultaEstado = "Select *from estado";
            String consultaMunicipio = "Select *from municipio";
            String consultaColonia = "Select *from colonia";
            String consultaTipoTelefono = "Select *from tipotelefono";

            try {
                Statement f = model.con.createStatement();
                Statement m = model.con.createStatement();
                Statement c = model.con.createStatement();
                Statement t = model.con.createStatement();

                ResultSet estado = f.executeQuery(consultaEstado);
                ResultSet municipio = m.executeQuery(consultaMunicipio);
                ResultSet colonia = c.executeQuery(consultaColonia);
                ResultSet tipoTelefono = t.executeQuery(consultaTipoTelefono);


                while (estado.next()){
                    nuevoProv.BOXEstado.addItem(estado.getString("NombreEstado"));
                }  
                while (municipio.next()){
                    nuevoProv.BOXMunicipio.addItem(municipio.getString("NombreMunicipio"));
                } 
               while (colonia.next()){
                    nuevoProv.BOXColonia.addItem(colonia.getString("NombreColonia"));
                } 
                while (tipoTelefono.next()){
                    nuevoProv.BOXTipoTelefono.addItem(tipoTelefono.getString("Tipo"));
                }
            } catch (SQLException ex) {

            }        
        }else if(nuevoProv.BtnMenuProveedores == e.getSource()){
            nuevoProv.setVisible(false); 
            ventanaProveedores();
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
