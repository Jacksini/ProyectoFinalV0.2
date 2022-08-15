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

public class ControladorModificarProducto implements ActionListener, MouseListener{
    //vistas de Ventas
    private sesion vistaInicioSesion;
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
    
    public ControladorModificarProducto(Modelo model, 
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
        
        //Modelo
        this.model = model;
        
        //Botones para cambiar entre ventanas sourse: Ventas
        this.ModProdu.BtnMenuVentas.addMouseListener(this);
        this.ModProdu.BtnMenuClientes.addMouseListener(this);
        this.ModProdu.BtnMenuProductos.addMouseListener(this);
        this.ModProdu.BtnMenuProveedores.addMouseListener(this);
        this.ModProdu.BtnMenuInventario.addMouseListener(this);
        this.ModProdu.BtnMenuConfiguracion.addMouseListener(this);
        
        //Botones para abrir ventanas emergentes
        this.ModProdu.btnNuevo.addMouseListener(this);
        this.ModProdu.btnAgregar.addMouseListener(this);
        this.ModProdu.btnModificar.addMouseListener(this);
        this.ModProdu.btnEliminar.addMouseListener(this);
        this.ModProdu.btnDepartamentos.addMouseListener(this);
        this.ModProdu.btnCatalogo.addMouseListener(this);
        
        //Botones con funciones
        this.ModProdu.btnBuscar.addMouseListener(this);
        this.ModProdu.btnGuardar.addMouseListener(this);
        this.ModProdu.btnCancelar.addMouseListener(this);
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
        ventanaProductos();
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(ModProdu.BtnMenuClientes == e.getSource()){
            ModProdu.setVisible(false); 
            ventanaClientes();  
        }else if(ModProdu.BtnMenuVentas == e.getSource()){
            ModProdu.setVisible(false); 
            ventanaVentas();
        }else if(ModProdu.BtnMenuProductos == e.getSource()){
            ModProdu.setVisible(false); 
            ventanaProductos();
        }else if(ModProdu.BtnMenuProveedores == e.getSource()){
            ModProdu.setVisible(false);
            ventanaProveedores();
        }else if(ModProdu.BtnMenuInventario == e.getSource()){
            ModProdu.setVisible(false);
            ventanaInventario();
        }else if(ModProdu.BtnMenuConfiguracion == e.getSource()){
            ModProdu.setVisible(false);
            ventanaConfiguracion();
        }else if(ModProdu.btnNuevo == e.getSource()){
            ModProdu.setVisible(false);
            ventanaNuevoProducto();
        }else if(ModProdu.btnAgregar == e.getSource()){
            ModProdu.setVisible(false);
            ventanaAgregarProducto();
        }else if(ModProdu.btnModificar == e.getSource()){
            ModProdu.setVisible(false);
            ventanaModificarProducto();
        }else if(ModProdu.btnEliminar == e.getSource()){
            ModProdu.setVisible(false);
            ventanaEliminarProducto();
        }else if(ModProdu.btnDepartamentos == e.getSource()){
            ModProdu.setVisible(false);
            ventanaDepartamentos();
        }else if(ModProdu.btnCatalogo == e.getSource()){
            ModProdu.setVisible(false);
            ventanaInventario();
        }else if(ModProdu.btnBuscar == e.getSource()){
            //Buuscar
            rellenarInformacion();
        }else if(ModProdu.btnGuardar == e.getSource()){
            //Guardar cambios
            if(updateProducto()){
                JOptionPane.showMessageDialog(null, "Se actualizo con exito");
            }else{
                JOptionPane.showMessageDialog(null, "Hubo un problema al modificar el producto");
            }
        }else if(ModProdu.btnCancelar == e.getSource()){
            //Cancelar
            limpiarInformacion();
        }
    }

    public boolean updateProducto(){
        try{
            int id = Integer.parseInt(ModProdu.txtIdProd.getText());
            int tipo = determinarTipo(ModProdu.cbPerecedero.isSelected(), ModProdu.cbUnidades.isSelected());
            int perecedero = determinarPerecedero(ModProdu.cbPerecedero.isSelected());
            int proveedor = Integer.parseInt(ModProdu.txtProveedor.getText());
            float precioCosto = Float.parseFloat(ModProdu.txtPrecioCosto.getText());
            float ganancia = (Float.parseFloat(ModProdu.txtGanancia.getText()) / 100);
            int departamento = Integer.parseInt(ModProdu.txtDepartamento.getText());
            int hay = Integer.parseInt(ModProdu.txtHay.getText());
            int minimo = Integer.parseInt(ModProdu.txtMinimo.getText());
            int maximo = Integer.parseInt(ModProdu.txtMaximo.getText());
            float precioFinal = 0;
            
            return model.actualizarProducto(id,
                    ModProdu.txtCodigoProducto.getText(), ModProdu.txtNombreProd.getText(), ModProdu.txtDescripcion.getText(), perecedero,
                    proveedor, tipo, precioCosto, ganancia, departamento, hay, minimo, maximo, precioFinal);
        }catch(NumberFormatException e){
            return false;
        }catch(ArithmeticException e){
            JOptionPane.showMessageDialog(null, e.getMessage()+". Por favor intente de Nuevo");
            return false;
        }
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

    public void rellenarInformacion(){
        int id;
        try{
            id = Integer.parseInt(ModProdu.txtIdProd.getText());
            String[] producto = model.buscarProducto(id);
            if(producto == null){
                JOptionPane.showMessageDialog(null, "Hubo un error al buscar este producto.");
            }else{
                ModProdu.txtIdProd.setText(producto[0]);
                ModProdu.txtCodigoProducto.setText(producto[3]);
                ModProdu.txtDepartamento.setText(producto[10]);
                ModProdu.txtDescripcion.setText(producto[2]);
                ModProdu.txtGanancia.setText(producto[8]);
                ModProdu.txtHay.setText(producto[5]);
                ModProdu.txtMaximo.setText(producto[7]);
                ModProdu.txtMinimo.setText(producto[6]);
                ModProdu.txtNombreProd.setText(producto[1]);
                ModProdu.txtPrecioCosto.setText(producto[4]);
                ModProdu.txtProveedor.setText(producto[11]);
                setKiloUnidades(producto[12]);
                setPerecedero(producto[13]);
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Por favor introduzca un id Valido");
        } 
    }
    
    public void limpiarInformacion(){
        ModProdu.txtIdProd.setText("");
        ModProdu.txtCodigoProducto.setText("");
        ModProdu.txtDepartamento.setText("");
        ModProdu.txtDescripcion.setText("");
        ModProdu.txtGanancia.setText("");
        ModProdu.txtHay.setText("");
        ModProdu.txtMaximo.setText("");
        ModProdu.txtMinimo.setText("");
        ModProdu.txtNombreProd.setText("");
        ModProdu.txtPrecioCosto.setText("");
        ModProdu.txtProveedor.setText("");
        ModProdu.cbKilo.setSelected(false);
        ModProdu.cbPerecedero.setSelected(false);
        ModProdu.cbUnidades.setSelected(false);
    }
    
    public void setKiloUnidades(String num){
        switch(num){
            case "1" -> {
                ModProdu.cbKilo.setSelected(true);
                ModProdu.cbUnidades.setSelected(false);
            }
            case "2" -> {
                ModProdu.cbKilo.setSelected(false);
                ModProdu.cbUnidades.setSelected(true);
            }
            default -> {
            }
        }
    }
    
    public void setPerecedero(String num){
        switch(num){
            case "1" -> {
                ModProdu.cbPerecedero.setSelected(true);
            }
            case "2" -> {
                ModProdu.cbPerecedero.setSelected(false);
            }
            default -> {
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
