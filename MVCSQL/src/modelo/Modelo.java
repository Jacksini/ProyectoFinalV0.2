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
    public void MostrarProveedores(){
        DefaultTableModel modo = new DefaultTableModel();
        modo.addColumn("IdProveedores");
        modo.addColumn("Nombre");
        modo.addColumn("RFC");
        modo.addColumn("Correo");
        modo.addColumn("Direcciones");
        modo.addColumn("Colonia");
        modo.addColumn("Municipio");
        modo.addColumn("Estado");
        modo.addColumn("Telefono");
        modo.addColumn("Tipo");
        vista.proveedores.TablaProveedores.setModel(modo);
        String sql="select idProveedores ,proveedores.Nombre as Nombre,RFC,CorreoPro as Correo,CalleYNumero as Direccion,NombreColonia as Colonia,NombreMunicipio as Municipio ,NombreEstado as Estado,TelefonoPro as Telefono,Tipo \n" +
                    "from proveedores inner join estado on Estado_idEstado=idEstado inner join colonia on idColonia=Colonia_idColonia\n" +
                    "inner join Municipio on idMunicipio=Municipio_idMunicipio inner join telefonospro on\n" +
                    " Proveedores_idProveedores=idProveedores inner join tipotelefono on idTipoTelefono= TipoTelefono_idTipoTelefono inner join Correospro on correospro.Proveedores_idProveedores \n" +
                    " where idProveedores=telefonospro.Proveedores_idProveedores and idProveedores=correospro.Proveedores_idProveedores  ;";
        String datos[] = new String[10];
        
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                datos[9] = rs.getString(10);
                datos[10] = rs.getString(11);
                modo.addRow(datos);
            }
            vista.proveedores.TablaProveedores.setModel(modo);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "NO HUBO SEXO :c");
        }
    }
}
