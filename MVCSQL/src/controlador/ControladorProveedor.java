package controlador;

//Librerias Java
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

//Packages Locales
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

public class ControladorProveedor implements ActionListener, MouseListener{
    
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
    
    public ControladorProveedor(Modelo model, 
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
        //String consulta= "call proyectobasepoo.MostrarProveedores();";    INCONCLUSO
        //DefaultTableModel datos = consultar(consulta);                    INCONCLUSO
        //TablaProveedores.setModel(datos);                                 INCONCLUSO
        
        //Tabla proveedores
        //this.model.consultar("select idProveedores ,proveedores.Nombre as Nombre,RFC,CorreoPro as Correo,CalleYNumero as calle,NombreColonia as colonia,NombreMunicipio as Municipio ,NombreEstado as Estado,TelefonoPro as Telefono,Tipo "
        //            + "                     from proveedores inner join estado on Estado_idEstado=idEstado inner join colonia on idColonia=Colonia_idColonia"
        //            + "                     inner join Municipio on idMunicipio=Municipio_idMunicipio inner join telefonospro on "
        //            + "                     Proveedores_idProveedores=idProveedores inner join tipotelefono on idTipoTelefono= TipoTelefono_idTipoTelefono inner join Correospro on correospro.Proveedores_idProveedores "
        //            + "                     where idProveedores=telefonospro.Proveedores_idProveedores and idProveedores=correospro.Proveedores_idProveedores;");
        //INCONCLUSO
        
        
        //Botones para cambiar entre ventanas sourse: Proveedores
        this.Proveedor.BtnMenuVentas.addMouseListener(this);
        this.Proveedor.BtnMenuClientes.addMouseListener(this);
        this.Proveedor.BtnMenuProductos.addMouseListener(this);
        this.Proveedor.BtnMenuInventario.addMouseListener(this);
        this.Proveedor.BtnMenuConfiguracion.addMouseListener(this);
        
        //Botones para abrir ventanas emergentes sourse: Proveedores
        this.Proveedor.BTTNuevoProveedor.addMouseListener(this);
        this.Proveedor.BTTModificarProveedor.addMouseListener(this);
        this.Proveedor.BTTEliminarProveedor.addMouseListener(this);
        
        //BOTONES PARA MOSTRAR EN TABLA
        this.Proveedor.BTTActualizar.addMouseListener(this);
        this.Proveedor.BTTBuscar.addMouseListener(this);
        
        //Textfield proveedores
        this.Proveedor.TXTNombreProveedor.addMouseListener(this);

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
    
    public void ventanaProductos(){
        Product.setTitle("Productos");
        Product.setLocationRelativeTo(null);
        Product.pack(); //Abre la ventana al tamaño preferido de los componentes
        Product.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        Product.setLocationRelativeTo(null);
        Product.setVisible(true); 
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
        if(Proveedor.BtnMenuVentas == e.getSource()){
            Proveedor.setVisible(false); 
            ventanaVentas();
        }else if(Proveedor.BtnMenuClientes == e.getSource()){
            Proveedor.setVisible(false);
            ventanaClientes();
        }else if(Proveedor.BtnMenuProductos == e.getSource()){
            Proveedor.setVisible(false);
            ventanaProductos();
        }else if(Proveedor.BtnMenuInventario == e.getSource()){
            Proveedor.setVisible(false);
            ventanaInventario();
        }else if(Proveedor.BtnMenuConfiguracion == e.getSource()){
            Proveedor.setVisible(false);
            ventanaConfiguracion();
        }else if(Proveedor.BTTNuevoProveedor == e.getSource()){
            Proveedor.setVisible(false);
            ventanaNuevoProveedor();
        }else if(Proveedor.BTTModificarProveedor == e.getSource()){
            Proveedor.setVisible(false);
            ventanaEditarProveedor();
        }else if(Proveedor.BTTEliminarProveedor == e.getSource()){
            Proveedor.setVisible(false);
            ventanaEliminarProveedor();
        }else if(Proveedor.BTTActualizar == e.getSource()){
            String consulta = "call MostrarProveedores();";
            DefaultTableModel tabla = model.MostrarTablas(consulta);
            Proveedor.TablaProveedores.setModel(tabla);
        }else if(Proveedor.BTTBuscar == e.getSource()){
            String buscar = "call BuscarProveedor('"+ Proveedor.TXTNombreProveedor.getText() +"')";
            DefaultTableModel tabla = model.MostrarTablas(buscar);
            Proveedor.TablaProveedores.setModel(tabla);            
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
