package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Driver;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
/////////////////////////////////////////////////
import vista.proveedores;
import vista.nuevoproveedor;
import controlador.ControladorProveedor;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Modelo;

public class Modelo {
    nuevoproveedor nuev = new nuevoproveedor();
    public Connection con;
    String usuario;
    String contraseña;
    int tipo = nuev.BOXTipoTelefono.getSelectedIndex();

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    
    public boolean conectar(){
        try{
            Driver driver =  new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver);
            String cadenaDeConexion = "jdbc:mysql://" + "localhost" + ":3306/" + "proyectobasepoo" ;
            con = DriverManager.getConnection(cadenaDeConexion, this.usuario, this.contraseña);
            return true;
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: Usuario o contraseña incorrecta");
            System.out.println("Error: " + e);
            System.out.println("No concte");
            return false;
        }
    }
    //Obtener ticket
    public String[] ticketConsultar(){
        try{
            //Cambiar el usuario y la contrasena cuando ya este todo anidado
                Statement s = con.createStatement();
                int x = 0;
                ResultSet rs = s.executeQuery("call ticket(" +x +")");
                String[] columnas = {"Cantidad", "PrecioDeVenta", "DescripcionProducto"};
                String[] values = new String[3];
                int i=0;
                for(String column : columnas){
                    values [i] = rs.getObject(column).toString();
                    i++;
                }            
                return values;
        }catch(SQLException e){
            return null;
        }catch(Exception e){
            System.out.println("catch: " +e.getMessage());
            return null;
        }
    }
    //MOSTAR TABLAS
    public DefaultTableModel MostrarTablas(String query){
        try{
            Statement s= con.createStatement();
            ResultSet rs = s.executeQuery(query);
            DefaultTableModel dtm = new DefaultTableModel();
            ResultSetMetaData rsMd = rs.getMetaData(); //Aun no se sabew cuantas columnas hay
            int columnas = rsMd.getColumnCount(); // Regresa el número de columnas
            //Cliclo para columnas
            for(int i = 1; i <= columnas; i++) { // Sirve para obtener los nombres de cada columna (encabezado)
                dtm.addColumn(rsMd.getColumnName(i));
            }
            //Ciclo para filas o datos de la tabla
            while(rs.next()) {
                Object[] fila = new Object[columnas];
                for(int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                dtm.addRow(fila);
            }
            return dtm;
        }catch(SQLException e){

            return null;
        }

    }
    
    //Nuevo Producto
    public boolean nuevoProducto(String codigo, String nombreProducto, String Descripcion,
                                    int perecedero, int proveedor, int tipo, float precioCompra,
                                    float ganancia, int departamento, int hay, int minimo, int maximo, float precioFinal){
        try {
            Statement s = con.createStatement();
            String query = "call ingresarproductos(\"" +codigo +"\",\"" +nombreProducto +"\",\"" +Descripcion +"\"," +perecedero +"," +proveedor
                           +"," +tipo +"," +precioCompra +"," +ganancia +"," +departamento +"," +hay +"," +minimo +"," +maximo +"," +precioFinal +");";
            s.execute(query);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Consultas de Departamentos">
    public DefaultTableModel mostrarDepartamentos(){
        DefaultTableModel depas = new DefaultTableModel();
        depas.addColumn("id");
        depas.addColumn("Departamentos");
        try {
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("Select * from departamentos;");
            ResultSetMetaData rsMd = rs.getMetaData();
            int columnas = rsMd.getColumnCount(); // Regresa el número de columnas
            //Ciclo para filas o datos de la tabla
            while(rs.next()) {
                Object[] fila = new Object[columnas];
                for(int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                depas.addRow(fila);
            }
            return depas;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return depas;
        }
    }

    public DefaultTableModel mostrarDepartamentos(int id){
        DefaultTableModel depas = new DefaultTableModel();
        depas.addColumn("id");
        depas.addColumn("Departamentos");
        try {
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("call AllDepartamentsid("+id+");");
            ResultSetMetaData rsMd = rs.getMetaData();
            int columnas = rsMd.getColumnCount(); // Regresa el número de columnas
            //Ciclo para filas o datos de la tabla
            while(rs.next()) {
                Object[] fila = new Object[columnas];
                for(int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                depas.addRow(fila);
            }
            return depas;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return depas;
        }
    }

    public boolean agregarDepartamentos(String nomDepa){
        try {
            Statement s = con.createStatement();
            String query = "call insertDepartaments(\""+nomDepa+"\");";
            s.executeUpdate(query);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public boolean eliminarDepartamentos(int Id){
        try {
            Statement s = con.createStatement();
            String query = "call Departamentsdelete("+Id+");";
            s.executeUpdate(query);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Consultas de Catalogo">
    public DefaultTableModel defaultTablaCatalogo(){
        DefaultTableModel catalogo = new DefaultTableModel();
        catalogo.addColumn("IdProducto");
        catalogo.addColumn("NombreProducto");
        catalogo.addColumn("Codigo de Barras");
        catalogo.addColumn("Precio Compra");
        catalogo.addColumn("Precio Venta");
        catalogo.addColumn("Minimo");
        catalogo.addColumn("Maximo");
        catalogo.addColumn("Existencia");
        catalogo.addColumn("Departamento");
        catalogo.addColumn("TipoProducto");
        catalogo.addColumn("Caducidad");
        catalogo.addColumn("Proveedor");
        return catalogo;
    }

    public DefaultTableModel catalogoMinimo(){
        try {
            DefaultTableModel catalogo = defaultTablaCatalogo();
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("call busquedaExistencia();");
            ResultSetMetaData rsMd = rs.getMetaData();
            int columnas = rsMd.getColumnCount(); // Regresa el número de columnas
            //Ciclo para filas o datos de la tabla
            while(rs.next()) {
                Object[] fila = new Object[columnas];
                for(int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                catalogo.addRow(fila);
            }
            return catalogo;
        } catch (SQLException ex) {
            return defaultTablaCatalogo();
        }
    }

    public DefaultTableModel catalogoDepartamento(String nombre){
        try {
            DefaultTableModel catalogo = new DefaultTableModel();
            Statement s = con.createStatement();
            String query = "call inventarioNombre(\"" +nombre +"\");";
            ResultSet rs = s.executeQuery(query);
            ResultSetMetaData rsMd = rs.getMetaData();
            int columnas = rsMd.getColumnCount(); // Regresa el número de columnas
            for(int i=1; i <= columnas; i++){  // sirve para obtener los nombres de cada columna (encabezado)
                catalogo.addColumn(rsMd.getColumnLabel(i));
            }
            //Ciclo para filas o datos de la tabla
            while(rs.next()) {
                Object[] fila = new Object[columnas];
                for(int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                catalogo.addRow(fila);
            }
            return catalogo;
        } catch (SQLException ex) {
            return defaultTablaCatalogo();
        }
    }

    public DefaultTableModel catalogoCodigo(int id){
        try {
            DefaultTableModel catalogo = new DefaultTableModel();
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("call inventario(" +id +");");
            ResultSetMetaData rsMd = rs.getMetaData();
            int columnas = rsMd.getColumnCount(); // Regresa el número de columnas
            for(int i=1; i <= columnas; i++){  // sirve para obtener los nombres de cada columna (encabezado)
                catalogo.addColumn(rsMd.getColumnLabel(i));
            }
            //Ciclo para filas o datos de la tabla
            while(rs.next()) {
                Object[] fila = new Object[columnas];
                for(int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                catalogo.addRow(fila);
            }
            return catalogo;
        } catch (SQLException ex) {
            return defaultTablaCatalogo();
        }
    }
    // </editor-fold>

    public boolean actualizarProducto(int id, String codigo, String nombreProducto, String Descripcion,
                                    int perecedero, int proveedor, int tipo, float precioCompra,
                                    float ganancia, int departamento, int hay, int minimo, int maximo, float precioFinal){
        try {
            Statement s = con.createStatement();
            String query = "call ActualizarProducto(\"" +id +",\""+codigo +"\",\"" +nombreProducto +"\",\"" +Descripcion +"\"," +proveedor
                           +"," +tipo +"," +precioCompra +"," +ganancia +"," +departamento +"," +hay +"," +minimo +"," +maximo +"," +perecedero +"," + +precioFinal +");";
            System.out.println(query);
            s.executeUpdate(query);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public String[] buscarProducto(int id){
        try {
            Statement s = con.createStatement();
            String query = "select * from productos where idProductos = " +id +";";
            System.out.println(query);
            ResultSet rs = s.executeQuery(query);
            ResultSetMetaData rsMd = rs.getMetaData();
            int columnas = rsMd.getColumnCount();
            String[] producto = new String[columnas];
            if(rs.next()){
                for(int i = 0; i < columnas; i++){
                producto[i] = rs.getString(i+1);
                }
                System.out.println("exito");
                return producto;
            }else{
                return null;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public String[] MostrarProductos(int IDProducto ){
        try{
            Statement N = con.createStatement();
            String query = "call VerificadorPrecio(" + (IDProducto) + ");";
            ResultSet rs = N.executeQuery(query);
            String[] values = new String[2];

            if(rs.next()){
                for(int i = 0; i < 2; i++){
                values[i] = rs.getString(i+1);
                }
                return values;
            }else{
                return null;
            }
        }catch (SQLException ex){
            System.out.println("Error 2");
            System.out.println("hola: " + ex.getMessage());
            return null;
        }
    }

    public DefaultTableModel consultarProductos(int id){
        DefaultTableModel producto = defaultTablaAgregar();
        try {
            Statement s = con.createStatement();
            String query = "call AgregarProductbsq(" +id +");";
            ResultSet rs = s.executeQuery(query);

            ResultSetMetaData rsMd = rs.getMetaData();
            int columnas = rsMd.getColumnCount();

            while(rs.next()) {
                Object[] fila = new Object[columnas];
                for(int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                producto.addRow(fila);
            }
                return producto;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public DefaultTableModel defaultTablaAgregar(){
        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("NomProducto");
        tabla.addColumn("Existencias");
        tabla.addColumn("Maximo");
        tabla.addColumn("Minimo");
        return tabla;
    }

    public boolean agregarProducto(int id, int cant){
        try {
            Statement s = con.createStatement();
            String query = "call AgregarProduct(" +id +"," +cant +");";
            s.executeUpdate(query);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public boolean eliminarProducto(int id){
        try{
            Statement s = con.createStatement();
            String query = "call EliminarProducto(" +id +");";
            s.executeUpdate(query);
            return true;
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public DefaultTableModel defaultTablaEliminar(){
        DefaultTableModel producto = new DefaultTableModel();
        producto.addColumn("Nombre Producto");
        producto.addColumn("Tipo Producto");
        producto.addColumn("Precio compra");
        producto.addColumn("Precio Venta");
        producto.addColumn("Departamento");
        producto.addColumn("Existencia");
        return producto;
    }

    public DefaultTableModel buscarEliminarProducto(int id){
        DefaultTableModel producto = new DefaultTableModel();
        producto.addColumn("Nombre Producto");
        producto.addColumn("Tipo Producto");
        producto.addColumn("Precio compra");
        producto.addColumn("Precio Venta");
        producto.addColumn("Departamento");
        producto.addColumn("Existencia");
        try {
            Statement s = con.createStatement();
            String query = "call BuscaEliminarProducto(" +id +");";
            ResultSet rs = s.executeQuery(query);

            ResultSetMetaData rsMd = rs.getMetaData();
            int columnas = rsMd.getColumnCount();

            while(rs.next()) {
                Object[] fila = new Object[columnas];
                for(int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                producto.addRow(fila);
            }
                return producto;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
    
    public DefaultTableModel defaultTablaClientes(){
        DefaultTableModel cliente = new DefaultTableModel();
        cliente.addColumn("Folio");
        cliente.addColumn("Nombre");
        return cliente;
    }
    
    public DefaultTableModel consultaClientes(){
        DefaultTableModel cliente = defaultTablaClientes();
        try {
            Statement s = con.createStatement();
            String query = "select idClientes,Nombres from clientes";
            ResultSet rs = s.executeQuery(query);
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int columnas = rsMd.getColumnCount();
            
            while(rs.next()) {
                Object[] fila = new Object[columnas];
                for(int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                cliente.addRow(fila);
            }
                return cliente;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
    
    public DefaultTableModel consultaClientes(int id){
        DefaultTableModel cliente = defaultTablaClientes();
        try {
            Statement s = con.createStatement();
            String query = "call buscarClientes(" +id +");";
            ResultSet rs = s.executeQuery(query);
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int columnas = rsMd.getColumnCount();
            
            while(rs.next()) {
                Object[] fila = new Object[columnas];
                for(int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                cliente.addRow(fila);
            }
                return cliente;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
    
    public boolean eliminarCliente(int id){
        try{
            Statement s = con.createStatement();
            String query = "call EliminarCliente(" +id +");";
            s.executeUpdate(query);
            return true;
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public String[] consultarColonia(int columna){
        switch(columna){
            case 1:
            try {
                Statement s = con.createStatement();
                String query = "select idColonia from colonia";
                System.out.println(query);
                ResultSet rs = s.executeQuery(query);
                ArrayList<String> List = new ArrayList<String>();
                int i=0;
                while(rs.next()){
                    List.add(rs.getString("idColonia"));
                }
                String[] consulta = new String[List.size()];
                for(int x = 0; x < List.size(); x++){
                    consulta[x] = List.get(x);
                }
                System.out.println("exito");
                return consulta;
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                return null;
            }
            break;
            case2:
            try {
                Statement s = con.createStatement();
                String query = "select NombreColonia from colonia";
                System.out.println(query);
                ResultSet rs = s.executeQuery(query);
                ArrayList<String> List = new ArrayList<String>();
                int i=0;
                while(rs.next()){
                    List.add(rs.getString("NombreColonia"));
                }
                String[] consulta = new String[List.size()];
                for(int x = 0; x < List.size(); x++){
                    consulta[x] = List.get(x);
                }
                System.out.println("exito");
                return consulta;
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                return null;
            }
            break;
        }
        
    }
    
    public String[] consultarTipoTelefono(int columna){
        switch(columna){
            case 1:
            try {
                Statement s = con.createStatement();
                String query = "select idTipotelefono from tipotelefono";
                System.out.println(query);
                ResultSet rs = s.executeQuery(query);
                ArrayList<String> List = new ArrayList<String>();
                int i=0;
                while(rs.next()){
                    List.add(rs.getString("idTipotelefono"));
                }
                String[] consulta = new String[List.size()];
                for(int x = 0; x < List.size(); x++){
                    consulta[x] = List.get(x);
                }
                System.out.println("exito");
                return consulta;
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                return null;
            }
            break;
            case2:
            try {
                Statement s = con.createStatement();
                String query = "select tipo from tipotelefono";
                System.out.println(query);
                ResultSet rs = s.executeQuery(query);
                ArrayList<String> List = new ArrayList<String>();
                int i=0;
                while(rs.next()){
                    List.add(rs.getString("tipo"));
                }
                String[] consulta = new String[List.size()];
                for(int x = 0; x < List.size(); x++){
                    consulta[x] = List.get(x);
                }
                System.out.println("exito");
                return consulta;
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                return null;
            }
            break;
        }
        
    }
    
    public String[] consultarMunicipio(int columna){
        switch(columna){
            case 1:
            try {
                Statement s = con.createStatement();
                String query = "select idMunicipio from municipio";
                System.out.println(query);
                ResultSet rs = s.executeQuery(query);
                ArrayList<String> List = new ArrayList<String>();
                int i=0;
                while(rs.next()){
                    List.add(rs.getString("idMunicipio"));
                }
                String[] consulta = new String[List.size()];
                for(int x = 0; x < List.size(); x++){
                    consulta[x] = List.get(x);
                }
                System.out.println("exito");
                return consulta;
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                return null;
            }
            break;
            case2:
            try {
                Statement s = con.createStatement();
                String query = "select NombreMunicipio from municipio";
                System.out.println(query);
                ResultSet rs = s.executeQuery(query);
                ArrayList<String> List = new ArrayList<String>();
                int i=0;
                while(rs.next()){
                    List.add(rs.getString("NombreMunicipio"));
                }
                String[] consulta = new String[List.size()];
                for(int x = 0; x < List.size(); x++){
                    consulta[x] = List.get(x);
                }
                System.out.println("exito");
                return consulta;
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                return null;
            }
            break;
        }
        
    }
    
    public String[] consultarEstado(int columna){
        switch(columna){
            case 1:
            try {
                Statement s = con.createStatement();
                String query = "select idEstado from estado";
                System.out.println(query);
                ResultSet rs = s.executeQuery(query);
                ArrayList<String> List = new ArrayList<String>();
                int i=0;
                while(rs.next()){
                    List.add(rs.getString("idEstado"));
                }
                String[] producto = new String[List.size()];
                for(int x = 0; x < List.size(); x++){
                    producto[x] = List.get(x);
                }
                System.out.println("exito");
                return producto;
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                return null;
            }
            break;
            case2:
            try {
                Statement s = con.createStatement();
                String query = "select NombreEstado from estado";
                System.out.println(query);
                ResultSet rs = s.executeQuery(query);
                ArrayList<String> List = new ArrayList<String>();
                int i=0;
                while(rs.next()){
                    List.add(rs.getString("NombreEstado"));
                }
                String[] producto = new String[List.size()];
                for(int x = 0; x < List.size(); x++){
                    producto[x] = List.get(x);
                }
                System.out.println("exito");
                return producto;
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                return null;
            }
            break;
        }
        
    }
}
