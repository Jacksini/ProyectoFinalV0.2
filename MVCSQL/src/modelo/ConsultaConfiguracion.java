/*
Descripción: Clase para la interaccion con la base de datos para el ticket
Fecha: 12-agosto-2022
Nombre: David Enrique Garcia Olvera
 */
package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Las lineas que esten comentadas asi:
//        System.out.print();
//Descomentarlas ya que se tenga conexion con el modelo nuevo de conexion.


public class ConsultaConfiguracion {
    // Atributo
    private ConexionBD conexion = new ConexionBD();
//    private Modelo conexion = new Modelo();
    
    public String[] ticketConsultar(){
        try{
            //Cambiar el usuario y la contrasena cuando ya este todo anidado
//            if(!conexion.conectar()){
//                return null;
//            }else{
                Connection con = conexion.abrirConexion("root", "admin");  //<-Esta se eliminara al usar el modelo actualizado para conectarse
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
//            }
        }catch(SQLException e){
            return null;
        }catch(Exception e){
            return null;
        }
    }
}
