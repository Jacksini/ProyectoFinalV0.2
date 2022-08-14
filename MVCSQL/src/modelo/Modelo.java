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
import controlador.ControladorProveedor;
import modelo.Modelo;

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
    //TABLA DE PROVEEDORES
    public void asignarproveedores(){
        DefaultTableModel tabla = MostrarProveedores();
        p.TablaProveedores.setModel(tabla);
    }
    
    public DefaultTableModel MostrarProveedores(){
        try{
            Statement s= con.createStatement();
            ResultSet rs = s.executeQuery("call proyectobasepoo.MostrarProveedores();");
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
}
