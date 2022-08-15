package controlador;

//Librerias Java
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//Packages Locales
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

public class ControladorInventario implements ActionListener, MouseListener{
    
    //Vistas Inventario
    private VentanaVentas ventasInicial;
    private Clientes ventanaClientes;
    private NuevoProducto Product;
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
    
    public ControladorInventario(Modelo model, 
           sesion vistaInicioSesion, 
           VentanaVentas ventasInicial, 
           Clientes ventanaClientes, 
           NuevoProducto Product, 
           proveedores Proveedor, 
           Inventario Inv, 
           Configuracion Config,
           Agregarproducto Agregarproduct,
           Departamentos Depart,
           EliminarProducto ElimProdu,
           ModificarProducto ModProdu){
        
        //Ventana Clientes
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
        
        //Modelo
        this.model = model;
        
        //Botones para cambiar entre ventanas sourse: Inventario
        this.Inv.BtnMenuVentas.addMouseListener(this);
        this.Inv.BtnMenuClientes.addMouseListener(this);
        this.Inv.BtnMenuProductos.addMouseListener(this);
        this.Inv.BtnMenuProveedores.addMouseListener(this);
        this.Inv.BtnMenuConfiguracion.addMouseListener(this);
        
        //Botones para abrir ventanas emergentes
        this.Inv.btnNuevo.addMouseListener(this);
        this.Inv.btnAgregar.addMouseListener(this);
        this.Inv.btnModificar.addMouseListener(this);
        this.Inv.btnEliminar.addMouseListener(this);
        this.Inv.btnDepartamentos.addMouseListener(this);
        this.Inv.btnCatalogo.addMouseListener(this);
        
        //Botones con funciones
        this.Inv.btnBuscarCodigo.addMouseListener(this);
        this.Inv.btnBuscarDepartamento.addMouseListener(this);
        this.Inv.btnBuscarMinimo.addMouseListener(this);
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
        ventanaProductos();
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
        }else if(Inv.btnNuevo == e.getSource()){
            Inv.setVisible(false);
            ventanaNuevoProducto();
        }else if(Inv.btnAgregar == e.getSource()){
            Inv.setVisible(false);
            ventanaAgregarProducto();
        }else if(Inv.btnModificar == e.getSource()){
            Inv.setVisible(false);
            ventanaModificarProducto();
        }else if(Inv.btnEliminar == e.getSource()){
            Inv.setVisible(false);
            ventanaEliminarProducto();
        }else if(Inv.btnDepartamentos == e.getSource()){
            Inv.setVisible(false);
            ventanaDepartamentos();
        }else if(Inv.btnBuscarCodigo == e.getSource()){
            //Boton buscar por codigo
            try{
                int id = Integer.parseInt(Inv.txtCodigoProducto.getText());
                if(model.catalogoCodigo(id).getRowCount() == model.defaultTablaCatalogo().getRowCount()){
                    JOptionPane.showMessageDialog(null, "No se encontro");
                    Inv.tblCatalogo.setModel(model.defaultTablaCatalogo());
                }else{
                    Inv.tblCatalogo.setModel(model.catalogoCodigo(id));
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Por favor, cheque que el codigo tenga datos correctos");
            }
        }else if(Inv.btnBuscarDepartamento == e.getSource()){
            //Boton buscar por departamento
            try{
                if(Inv.txtDepartamento.getText().isBlank()){
                    throw new Exception("Por favor llene el campo de departamentos");
                }
                if(model.catalogoDepartamento(Inv.txtDepartamento.getText()).getRowCount() == model.defaultTablaCatalogo().getRowCount()){
                    JOptionPane.showMessageDialog(null, "No se encontro");
                    Inv.tblCatalogo.setModel(model.defaultTablaCatalogo());
                }else{
                    Inv.tblCatalogo.setModel(model.catalogoDepartamento(Inv.txtDepartamento.getText()));
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Hubo un error inesperado: "+ex.getMessage());
            }
        }else if(Inv.btnBuscarMinimo == e.getSource()){
            //Boton buscar minimo
            if(model.catalogoMinimo().getRowCount() == model.defaultTablaCatalogo().getRowCount()){
                JOptionPane.showMessageDialog(null, "No se encontro");
                Inv.tblCatalogo.setModel(model.defaultTablaCatalogo());
            }else{
                Inv.tblCatalogo.setModel(model.catalogoMinimo());
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
