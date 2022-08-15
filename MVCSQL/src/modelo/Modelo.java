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

public class Modelo {
    proveedores p = new proveedores();
    Connection con;
    String usuario;
    String contraseña;

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
    
    public String[] MostrarProductos(int IDProducto ){
        try{
            Statement N = con.createStatement();
            String query = "call VerificadorPrecio(" + (IDProducto) + ");";
            ResultSet rs = N.executeQuery(query);
            String[] Verificador = {"NombreProducto", "preciofinal"};
            String[] values = new String[2];
                
                int i=0;
                rs.first();
                for(String column : Verificador){
                    System.out.println("Error 1");
                    values [i] = rs.getString(column);
                    i++;
                }            
                return values;
        }catch (SQLException ex){
            System.out.println("Error 2");
            System.out.println("hola: " + ex.getMessage());
            return null;
        }
    }
}
