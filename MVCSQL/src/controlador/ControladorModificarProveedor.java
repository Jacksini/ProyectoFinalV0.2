package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
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
import javax.swing.DefaultComboBoxModel;

public class ControladorModificarProveedor implements ActionListener, MouseListener{
    
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
    
    public ControladorModificarProveedor(Modelo model, 
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
        this.modProv.BtnMenuVentas.addMouseListener(this);
        this.modProv.BtnMenuClientes.addMouseListener(this);
        this.modProv.BtnMenuProductos.addMouseListener(this);
        this.modProv.BtnMenuInventario.addMouseListener(this);
        this.modProv.BtnMenuConfiguracion.addMouseListener(this);
        
        //Botones para abrir ventanas emergentes sourse: Proveedores
        this.modProv.BTTNuevoProveedor.addMouseListener(this);
        this.modProv.BTTModificarProveedor.addMouseListener(this);
        this.modProv.BTTEliminarProveedor.addMouseListener(this);
        
        //Botones con procesos
        this.modProv.BTTBuscar.addMouseListener(this);
        this.modProv.BTTModificar.addMouseListener(this);
        this.modProv.BTTActualizar.addMouseListener(this);

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
        if(modProv.BtnMenuVentas == e.getSource()){
            modProv.setVisible(false); 
            ventanaVentas();
        }else if(modProv.BtnMenuClientes == e.getSource()){
            modProv.setVisible(false); 
            ventanaClientes();
        }else if(modProv.BtnMenuProductos == e.getSource()){
            modProv.setVisible(false); 
            ventanaProductos();
        }else if(modProv.BtnMenuInventario == e.getSource()){
            modProv.setVisible(false); 
            ventanaInventario();
        }else if(modProv.BtnMenuConfiguracion == e.getSource()){
            modProv.setVisible(false); 
            ventanaConfiguracion();
        }else if(modProv.BTTNuevoProveedor == e.getSource()){
            modProv.setVisible(false); 
            ventanaNuevoProveedor();
        }else if(modProv.BTTModificarProveedor == e.getSource()){
            modProv.setVisible(false); 
            ventanaEditarProveedor();
        }else if(modProv.BTTEliminarProveedor == e.getSource()){
            modProv.setVisible(false); 
            ventanaEliminarProveedor();
        }else if(modProv.BTTBuscar == e.getSource()){
            //String col = "select *from colonia;"; //MOSTRAR ID Y NOMBRE DE COLONIAS
//                    modProv.TXTNombrePersonal.setText("PERSONAL DEPARTAMENTO");//NOMBRE DEL PERSONAL
//                    modProv.TXTnombreProveedor.setText("NOMBRE PROVEEDOR");//NOMBRE DEL PROVEEDOR
//                    modProv.TXTRFCproveedor.setText("RFC PROVEEDOR");//RFC DEL PROVEEDOR
//                    modProv.TXTCorreoProveedor.setText("CORREO PROVEEDOR");//CORREO DEL PROVEEDOR
//                    modProv.TXTCalleNumeroProveedor.setText("DIRECCION");//CALLE Y NUMERO DEL PROVEEDOR
//                    modProv.TXTTelefonoProveedor.setText("TELEFONO");//TELEFONO DEL PROVEEDOR
            String buscar = "call buscarProveedorid(" + modProv.TXTIDproveedor.getText() + ");";
            try {
                //PROVEEDORES ID
                Statement st = model.con.createStatement();
                //Statement Col = model.con.createStatement();

                //COLONIA
                //ResultSet mostrarCol = Col.executeQuery(col);
                ResultSet mostrar = st.executeQuery(buscar);
                System.out.println(buscar);

                if (modProv.TXTIDproveedor != null){
                    System.out.println(buscar);

                    String nombreProv = mostrar.getString("proveedores.Nombre"); //NOMBRE DEL PROVEEDOR
                    String Rfcc = mostrar.getString("RFC");         //RFC DEL PROVEEDOR
                    String Correo = mostrar.getString("CorreoPro"); //CORREO DEL PROVEEDOR
                    String Call = mostrar.getString("CalleYNumero"); //CALLE Y NUM DEL PROVEEDOR
                    //String col2 = mostrar.getString("NombreColonia"); //NOMBRE COLONIA
                    //String muni = mostrar.getString("NombreMunicipio"); //NOMBRE DEL MUNICIPO
                    //String estado = mostrar.getString("NombreEstado"); //NOMBRE DEL ESTADO
                    String teled = mostrar.getString("TelefonoPro"); //TELEFONO DEL PROVEEDOR
                    String nombredepaa = mostrar.getString("NombreTPro");//NOMBRE DEL PERSONAL DEL DEPARTAMENTO
                    String depa = mostrar.getString("Departamento"); //NOMBRE DEL DEPARTAMENTO
                    //String tipotel = mostrar.getString("Tipo"); //TIPO DE TELEFONO
                    
                    //int IDCOL = mostrarCol.getInt("idColonia"); //EXTRAE EL INT ID DE COLONIA
                    //modProv.BOXColonia.addItem(mostrarCol.getString("NombreEstado"));
                    System.out.println(buscar);

                    modProv.TXTNombrePersonal.setText(nombredepaa);//NOMBRE DEL PERSONAL
                    modProv.TXTnombreProveedor.setText(nombreProv);//NOMBRE DEL PROVEEDOR
                    modProv.TXTRFCproveedor.setText(Rfcc);//RFC DEL PROVEEDOR
                    modProv.TXTCorreoProveedor.setText(Correo);//CORREO DEL PROVEEDOR
                    modProv.TXTCalleNumeroProveedor.setText(Call);//CALLE Y NUMERO DEL PROVEEDOR
                    modProv.TXTTelefonoProveedor.setText(teled);//TELEFONO DEL PROVEEDOR
                    modProv.TXTDepartamentoTelefono.setText(depa);//DEPARTAMENTO
                    System.out.println(buscar);

                    System.out.println(modProv.TXTnombreProveedor.getText()+" : HOLA SOY PROVEEDOR");

                    
                    //modProv.BOXColonia.setSelectedIndex(IDCOL);
                                        
                }
            } catch (SQLException ex){
                
            }
            
        }else if(modProv.BTTModificar == e.getSource()){
            try {
                Statement s = model.con.createStatement();
                String query = "call ModificarProveedor("+modProv.TXTIDproveedor.getText()+",'" + modProv.TXTnombreProveedor.getText() + "', '" + modProv.TXTRFCproveedor.getText() + "', '" + modProv.TXTCalleNumeroProveedor.getText() + "', '" + modProv.TXTTelefonoProveedor.getText() + "', '" + modProv.TXTDepartamentoTelefono.getText() + "', '" + nuevoProv.TXTNombrePersonal.getText() + "', '" + nuevoProv.TXTDepartamentoTelefono.getText() + "', '" + modProv.TXTNombrePersonal.getText() + "','" + modProv.TXTCorreoProveedor.getText() + "', "+ getCbTipo() + ", "+ getCbEstado() + ", "+ getCbMunicipios() + ", "+ getCbColonia() + ");";
                System.out.println(query);
                s.execute(query);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo modificar, "+ex.getMessage());
                System.out.println(ex.getMessage());
            }            
        }else if(modProv.BTTActualizar == e.getSource()){
            setCbColonia(-1);
            setCbEstado(-1);
            setCbMunicipio(-1);
            setCbTel(-1);
            /*String consultaEstado = "Select *from estado";
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
                    modProv.BOXEstado.addItem(estado.getString("NombreEstado"));
                }  
                while (municipio.next()){
                    modProv.BOXMunicipio.addItem(municipio.getString("NombreMunicipio"));
                } 
               while (colonia.next()){
                    modProv.BOXColonia.addItem(colonia.getString("NombreColonia"));
                } 
                while (tipoTelefono.next()){
                    modProv.BOXTipoTelefono.addItem(tipoTelefono.getString("Tipo"));
                }
            } catch (SQLException ex) {

            }
            */        
        }
    }

    public void setCbMunicipio(int index){
        int i = 0;
        String[] ids = model.consultarMunicipio(1);
        String[] datos = model.consultarMunicipio(2);
        DefaultComboBoxModel<String> municipio = new javax.swing.DefaultComboBoxModel<>(datos);
        modProv.BOXMunicipio.setModel(municipio);
        if(index == -1){
            modProv.BOXMunicipio.setSelectedIndex(-1);
        }else{
            try{
                for(String id:ids){
                    if(Integer.parseInt(ids[Integer.parseInt(id)]) == index){
                        i = Integer.parseInt(id);
                        break;
                    }
                }
                Proveedor.BOXMunicipio.setSelectedIndex(i);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Hubo un error en la consulta del municipio.")
            }
        }
    }

    public void setCbEstado(int index){
        int i = 0;
        String[] ids = model.consultarMunicipio(1);
        String[] datos = model.consultarMunicipio(2);
        DefaultComboBoxModel<String> estado = new javax.swing.DefaultComboBoxModel<>(datos);
        modProv.BOXEstado.setModel(estado);
        if(index == -1){
            modProv.BOXEstado.setSelectedIndex(-1);
        }else{
            try{
                for(String id:ids){
                    if(Integer.parseInt(ids[Integer.parseInt(id)]) == index){
                        i = Integer.parseInt(id);
                        break;
                    }
                }
                modProv.BOXEstado.setSelectedIndex(i);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Hubo un error en la consulta del estado.")
            }
        }
    }

    public void setCbColonia(int index){
        int i = 0;
        String[] ids = model.consultarMunicipio(1);
        String[] datos = model.consultarMunicipio(2);
        DefaultComboBoxModel<String> colonia = new javax.swing.DefaultComboBoxModel<>(datos);
        modProv.BOXColonia.setModel(colonia);
        if(index == -1){
            modProv.BOXColonia.setSelectedIndex(-1);
        }else{
            try{
                for(String id:ids){
                    if(Integer.parseInt(ids[Integer.parseInt(id)]) == index){
                        i = Integer.parseInt(id);
                        break;
                    }
                }
                modProv.BOXColonia.setSelectedIndex(i);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Hubo un error en la consulta de la colonia.")
            }
        }
    }

    public void setCbTel(int index){
        int i = 0;
        String[] ids = model.consultarMunicipio(1);
        String[] datos = model.consultarMunicipio(2);
        DefaultComboBoxModel<String> tel = new javax.swing.DefaultComboBoxModel<>(datos);
        modProv.BOXTipoTelefono.setModel(tel);
        if(index == -1){
            modProv.BOXTipoTelefono.setSelectedIndex(-1);
        }else{
            try{
                for(String id:ids){
                    if(Integer.parseInt(ids[Integer.parseInt(id)]) == index){
                        i = Integer.parseInt(id);
                        break;
                    }
                }
                modProv.boxEstado.setSelectedIndex(i);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Hubo un error en la consulta del tipo telefono.")
            }
        }
    }

    public int getCbMunicipios(){
        String[] ids = model.consultarMunicipio(1);
        String[] datos = model.consultarMunicipio(2);
        String dato = modProv.BOXColonia.getSelectedItem().toString();
        int i = 0;
        while(!dato.equals(datos[Integer.parseInt(ids[i])])){
            i++;
        }
        return Integer.parseInt(ids[i]);
    }

    public int getCbEstado(){
        String[] ids = model.consultarEstado(1);
        String[] datos = model.consultarEstado(2);
        String dato = modProv.BOXColonia.getSelectedItem().toString();
        int i = 0;
        while(!dato.equals(datos[Integer.parseInt(ids[i])])){
            i++;
        }
        return Integer.parseInt(ids[i]);
    }
    
    public int getCbColonia(){
        String[] ids = model.consultarColonia(1);
        String[] datos = model.consultarColonia(2);
        String dato = modProv.BOXColonia.getSelectedItem().toString();
        int i = 0;
        while(!dato.equals(datos[Integer.parseInt(ids[i])])){
            i++;
        }
        return Integer.parseInt(ids[i]);
    }

    public int getCbTipo(){
        String[] ids = model.consultarTipoTelefono(1);
        String[] datos = model.consultarTipoTelefono(2);
        String dato = modProv.BOXColonia.getSelectedItem().toString();
        int i = 0;
        while(!dato.equals(datos[Integer.parseInt(ids[i])])){
            i++;
        }
        return Integer.parseInt(ids[i]);
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
