package controlador;

//Librerias Java
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//Packages Locales
import modelo.Modelo;
import vista.Clientes;
import vista.Configuracion;
import vista.Inventario;
import vista.NuevoProducto;
import vista.VentanaVentas;
import vista.proveedores;
import vista.sesion;

public class ControladorClientes implements ActionListener, MouseListener{
    
    //Vistas Clientes
    private VentanaVentas ventasInicial;
    private Clientes ventanaClientes;
    private NuevoProducto Product;
    private proveedores Proveedor;
    private Inventario Inv;
    private Configuracion Config;
    
    //Modelo
    private Modelo model;
    
    public ControladorClientes(Modelo model, 
           sesion vistaInicioSesion, 
           VentanaVentas ventasInicial, 
           Clientes ventanaClientes, 
           NuevoProducto Product, 
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
        
        //Botones con procesos
        this.ventanaClientes.btnNuevoCliente.addMouseListener(this);
        this.ventanaClientes.btnEliminarCliente.addMouseListener(this);
        this.ventanaClientes.btnBuscar.addMouseListener(this);
        this.ventanaClientes.btnActualizar.addMouseListener(this);
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
        }else if(ventanaClientes.btnActualizar == e.getSource()){
            setComboBox();
        }else if(ventanaClientes.btnNuevoCliente == e.getSource()){
            //Nuevo CLiente
            try{
                setComboBox();
                int idCol = Integer.parseInt(ventanaClientes.cbColonia.getSelectedItem().toString());
                int idMunicipio = Integer.parseInt(ventanaClientes.cbMunicipio.getSelectedItem().toString());
                int idTipoTel = Integer.parseInt(ventanaClientes.cbTipoTel.getSelectedItem().toString());
                int idEst = Integer.parseInt(ventanaClientes.cbEstado.getSelectedItem().toString());
                model.agregarCliente(ventanaClientes.txtNombre.getText(), ventanaClientes.txtApellidos.getText(), ventanaClientes.txtTelefono.getText(), 
                        idCol, idMunicipio, ventanaClientes.txtCP.getText(), idTipoTel, ventanaClientes.txtCorreo.getText(), idEst);
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Ocurrio un error: " +ex.getMessage());
            }
            
        }else if(ventanaClientes.btnEliminarCliente == e.getSource()){
            //Eliminar cliente
            int x = JOptionPane.showConfirmDialog(null, "Esta seguro que quiere eliminar el producto seleccionado?", "Eliminacion de Producto", 0);
            switch(x){
                case 0 -> {
                    try{
                        int id = Integer.parseInt(ventanaClientes.txtFolio.getText());
                        if(model.consultaClientes(id).getRowCount() == model.defaultTablaClientes().getRowCount()){
                            JOptionPane.showMessageDialog(null, "No se encontro el cliente");
                        }else{
                            //Se elimina el cliente
                            if(!model.eliminarCliente(id)){
                                JOptionPane.showMessageDialog(null, "No se pudo eliminar el archivo");
                            }else{
                                JOptionPane.showMessageDialog(null, "Se elimino correctamente");
                                ventanaClientes.tbClientes.setModel(model.consultaClientes());
                            }
                        }
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(null, "Verifique que el codigo sea numerico.");
                    }
                }
                case 1 -> JOptionPane.showMessageDialog(null, "Enterado. No se eliminara");
                default -> {
                }
            }
        }else if(ventanaClientes.btnBuscar == e.getSource()){
            //Buscar cliente
            try{
                int id = Integer.parseInt(ventanaClientes.txtFolio.getText());
                if(model.consultaClientes(id).getRowCount() == model.defaultTablaClientes().getRowCount()){
                    JOptionPane.showMessageDialog(null, "No se encontro el cliente");
                }else{
                    ventanaClientes.tbClientes.setModel(model.consultaClientes(id));
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Verifique que el codigo sea numerico.");
            }
        }
    }
    
    public void setComboBox(){
        DefaultComboBoxModel<String> tipotelefono = new javax.swing.DefaultComboBoxModel<>(model.consultaTipoTelefono());
        DefaultComboBoxModel<String> colonia = new javax.swing.DefaultComboBoxModel<>(model.consultaColonia());
        DefaultComboBoxModel<String> municipio = new javax.swing.DefaultComboBoxModel<>(model.consultaMunicipio());
        DefaultComboBoxModel<String> estado = new javax.swing.DefaultComboBoxModel<>(model.consultaEstado());
        this.ventanaClientes.cbTipoTel.setModel(tipotelefono);
        this.ventanaClientes.cbColonia.setModel(colonia);
        this.ventanaClientes.cbMunicipio.setModel(municipio);
        this.ventanaClientes.cbEstado.setModel(estado);
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
