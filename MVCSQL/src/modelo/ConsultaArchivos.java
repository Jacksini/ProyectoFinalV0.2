/*
Descripción: Clase modelo para i/o de archivos
Fecha: 12-Agosto-2022
Nombre: David Enrique Garcia Olvera
*/
package Modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultaArchivos{
    
    // <editor-fold defaultstate="collapsed" desc="Atributos"> 
    public String moneda;
    public String miles;
    public String decimal;
    public String nombreTienda;
    public String direccion;
    public String telefono;
    public String rfc;
    public String endLine;
    public String url;
    public String[][] impuestos;
    public boolean usaImpuestos;
    // </editor-fold>  
    
    
    // <editor-fold defaultstate="collapsed" desc="Encapsulacion">

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getMiles() {
        return miles;
    }

    public void setMiles(String miles) {
        this.miles = miles;
    }

    public String getDecimal() {
        return decimal;
    }

    public void setDecimal(String decimal) {
        this.decimal = decimal;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getEndLine() {
        return endLine;
    }

    public void setEndLine(String endLine) {
        this.endLine = endLine;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String[][] getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(String[][] impuestos) {
        this.impuestos = impuestos;
    }

    public boolean usesImpuestos() {
        return usaImpuestos;
    }

    public void setUsaImpuestos(boolean usaImpuestos) {
        this.usaImpuestos = usaImpuestos;
    }
    
    
    
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Escritura de Archivos"> 
    public String searchFolder (String folder){
        //Se crea la carpeta
        String location =  "";//C:\\Users\\David García\\Desktop\\temp\\"; Mantener a location vacia causara que se crea la carpeta en la carpeta del proyecto.
        //Si la localizacion del folder desea ser cambiada, introduzca la ruta de acceso en location.
        folder = location + folder;
        File f = new File(folder);
        // check if the directory can be created
        // using the specified path name
        if (f.mkdir() /*mkdir() retorna true si no existe la carpeta, Creo. Falso si ya existe*/) {
            //System.out.println("Directory has been created successfully");
        }
        else {
            //System.out.println("Directory cannot be created. It could already exist at: " +f.getAbsolutePath());
        }
        return f.getAbsolutePath();
    }
    
    public boolean writeDocument(String folder, String file, String settings){
        try{
            //Crea el archivo
            BufferedWriter writer = new BufferedWriter(new FileWriter(searchFolder(folder)+"\\" +file));
            writer.write(settings);
            //Se cierra el archivo
            writer.close();
            //System.out.println("Finish writing");
        }catch (IOException e){
            return false;
        }
        return true;
    }
    
    public ArrayList<String> readDocument(String folder, String file){
        ArrayList<String> datos = new ArrayList<String>();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(searchFolder(folder)+"\\"+file));
            String line;
            //Este while leera la primera linea, despues de cada iteracion se mueve a otra linea. Despues de la ultima linea, el readLine arroja null
            while(( line = reader.readLine() ) != null){
                datos.add(line);
            }
            reader.close();
            //System.out.println("Read file succesfully");
        }catch (IOException e){
            datos.clear();
            return datos;
        }
        return datos;
    }
    // </editor-fold> 
        
    public void updateSettings(String folder){
        setSimbols(folder, "simbolos");
        setTicket(folder, "ticket");
        setImpuestos(folder, "impuestos");
    }
    
    // <editor-fold defaultstate="collapsed" desc="Modelo de Simbolos"> 
    public String settingsSimbolos(){
        String escrito = "";
        escrito += "====Configuracion de los simbolos====";
        escrito += "\nSimbolo de moneda\n";
        escrito += moneda;
        escrito += "\nSeparador de miles\n";
        escrito += miles;
        escrito += "\nSeparador de decimal\n";
        escrito += decimal;
        escrito += "\n=============-----------==============";
        return escrito;
    }
    
    public void setSimbols(String folder, String file){
        ArrayList<String> datos = readDocument(folder, file);
        if(!(datos.isEmpty()) ){
            ListIterator<String> itList = datos.listIterator();
            while(itList.hasNext()){
                String check = itList.next();
                //System.out.println("Checking: " +check);
                //System.out.println("Tiene Separador de?" +check.contains("Separador de"));
                switch (check) {
                    case "Simbolo de moneda":
                        this.setMoneda(datos.get(itList.nextIndex() ));
                        //System.out.println("Moneda: " +moneda);
                        break;
                    case "Separador de miles":
                        this.setMiles(datos.get(itList.nextIndex() ));
                        //System.out.println("Miles: " +miles);
                        break;
                    case "Separador de decimal":
                        this.setDecimal(datos.get(itList.nextIndex() ));
                        //System.out.println("Decimal: " +decimal);
                        break;
                    default:
                        break;
                }
            }
        }
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Modelo de Ticket"> 
    public String settingsTicket(){
        String escrito = "";
        escrito += "====Configuracion del ticket====";
        escrito += "\nnombreTienda\n";
        escrito += nombreTienda;
        escrito += "\ndireccion\n";
        escrito += direccion;
        escrito += "\ntelefono\n";
        escrito += telefono;
        escrito += "\nrfc\n";
        escrito += rfc;
        escrito += "\nendLine\n";
        escrito += endLine;
        escrito += "\nurl\n";
        escrito += url;
        escrito += "\n=============-----------==============";
        return escrito; 
    }String[] nombre = new String[0];
    
    public String exampleTicket(){
        //Honestamente, ni yo se porque hice esto. Pero lo hice :p
        String ticket;
        //System.out.println(nombreTienda);
        ticket = nombreTienda+"\n"
                +direccion+"\n"
                +telefono+"\n"
                +rfc+"\n"
                +"\n"
                +"Cant.\tDescripción\t\tImporte\n=================================\n"
                + "1\t"
                + "Agua Ciel 60ml \t"
                + moneda
                + "7"
                + decimal
                + "00\n"
                + "1\t"
                + "Coca Cola Light \t"
                + moneda
                + "18"
                + decimal
                + "00"
                + "\n\n\t"
                + "No. de Articulos: 4"
                + "\n\t\t"
                + "Total: "
                + moneda
                + "33.00"
                + "\n"
                + endLine
                + "\n"
                + url;
        return ticket;
    }
    
    public String exampleTicket(String[] values){
        if(values == null){
            return null;
        }
        String ticket;
        int cantidad = Integer.parseInt(values[0]);
        String descripcion = values[1];
        double precio = Double.parseDouble(values[2]);
        String [] price = String.valueOf(precio).split("\\.");
        String [] total = String.valueOf(precio*cantidad).split("\\.");
        //Hice esto a ciegas. Si Corre bien soy tres bon
        ticket = nombreTienda+"\n"
                +direccion+"\n"
                +telefono+"\n"
                +rfc+"\n"
                +"\n"
                +"Cant.\tDescripción\t\tImporte\n=================================\n"
                + cantidad
                + "\t"
                + descripcion
                + "\t"
                + moneda
                + price[0]
                + decimal
                + price[1]
                + "\n\n\t"
                + "No. de Articulos: "
                + cantidad
                + "\n\t\t"
                + "Total: "
                + moneda
                + total[0]
                + decimal
                + total[1]
                + "\n"
                + endLine
                + "\n"
                + url;
        return ticket;
    }
    
    public void setTicket(String folder, String file){
        ArrayList<String> datos = readDocument(folder, file);
        if(!(datos.isEmpty()) ){
            //System.out.println("setTicket");
            ListIterator<String> itList = datos.listIterator();
            while(itList.hasNext()){
                String check = itList.next();
                //System.out.println("Checkando: " +check);
                switch (check) {
                    case "nombreTienda":
                        //System.out.println("nombreTienda");
                        this.setNombreTienda(datos.get(itList.nextIndex() ));
                        //System.out.println(nombreTienda);
                        break;
                    case "direccion":
                        //System.out.println("direccion");
                        this.setDireccion(datos.get(itList.nextIndex() ));
                        //System.out.println(direccion);
                        break;
                    case "telefono":
                        //System.out.println("telefono");
                        this.setTelefono(datos.get(itList.nextIndex() ));
                        break;
                    case "rfc":
                        //System.out.println("rfc");
                        this.setRfc(datos.get(itList.nextIndex() ));
                        break;
                    case "endLine":
                        //System.out.println("endLine");
                        this.setEndLine(datos.get(itList.nextIndex() ));
                        break;
                    case "url":
                        //System.out.println("url");
                        this.setUrl(datos.get(itList.nextIndex() ));
                        break;
                    default:
                        break;
                }
            }
        }
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Impuestos">
    public String settingsImpuestos(){
        //System.out.println("settingImpuestos");
        String escrito = "";
        escrito += "====Configuracion de los impuestos====";
        escrito += "\nusaImpuestos?\n";
        escrito += usaImpuestos;
        for(int i=0; i < impuestos.length; i++){
            escrito += "\nImpuesto#" +(i+1) +"\n";
            escrito += impuestos[i][0];
            escrito += "\n";
            escrito += impuestos[i][1]; 
        }
        escrito += "\n=============-----------==============";
        return escrito;
    }
    
    public void setImpuestos(String folder, String file){
        //System.out.println("setImpuestos con archivos");
        ArrayList<String> datos = readDocument(folder, file);
        //Esta fue la unica solucion que se me ocurrio.
        //Se crea otro ArrayList que guarde los valores importantes
        //Para poder meterlos al array Impuestos
        ArrayList<String> taxes = new ArrayList<String>();
        int test=0;
        //System.out.println("Esta esta grande. A ver si funciona");
        if(!(datos.isEmpty()) ){
            ListIterator<String> itList = datos.listIterator();
            while(itList.hasNext()){
                String check = itList.next();
                //System.out.println("Checking: " +check);
                if(check.contentEquals("usaImpuestos?")){
                    usaImpuestos = Boolean.valueOf(itList.next());
                }
                if(check.contains("Impuesto#")){
                    String [] dividido = check.split("Impuesto#");
                    //System.out.println("Este es el #" +Integer.parseInt(dividido[1]));
                    taxes.add(datos.get(itList.nextIndex()));
                    itList.next();//Sigguiente linea
                    //System.out.println(taxes.get(test));test++;
                    taxes.add(datos.get(itList.nextIndex()));
                    //System.out.println(taxes.get(test));test++;
                }
            }
            if(!taxes.isEmpty()){
                //Como taxes solo devuelve un array unidimensional
                //lo guarde en otro array. No lo hice con el de atributo
                //porque creo que lo estoy haciendo mal y no sale. pero al
                //final si funciono xd.
                Object[] data = taxes.toArray();
                String[][] impuesto = new String[data.length/2][2];
                for(int i=0, x=0; i < taxes.size(); i+=2, x++){
                    impuesto[x][0] = data[i].toString();
                    impuesto[x][1] = data[i+1].toString();
                }
                this.setImpuestos(impuesto);
                //No me acuerdo de este. Si no funciona probablemente sea por esto
                /*
                for (String[] tax : this.impuestos) {
                    System.out.println("Tipo impuesto: " + tax[0]);
                    System.out.println("Porcentaje: " + tax[1]);
                }*/
            }
        }
    }
    
    public DefaultTableModel defaultImpuestos(){
        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Tipo de Impuesto");
        modeloTabla.addColumn("Porcentaje");
        return modeloTabla;
    }
    
    public DefaultTableModel insertarImpuestos() throws NullPointerException{
        try{
            //System.out.println("insertarImpuestos");
            DefaultTableModel modeloTabla = defaultImpuestos();
            for (String[] impuesto : impuestos) {
                modeloTabla.addRow(impuesto);
                //System.out.println("??? " + impuesto[0]);
                //System.out.println("??? " + impuesto[1]);
            }
            return modeloTabla;
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Por favor agrege datos de impuesto");
            return defaultImpuestos();
        }
    }
    
    public DefaultTableModel agregarImpuestos(String[] dataRows){
        try{
            //System.out.println("agregarImpuestos");
            if(impuestos == null){
                DefaultTableModel modeloTabla = defaultImpuestos();
                modeloTabla.addRow(dataRows);
                return modeloTabla;
            }else{
                DefaultTableModel modeloTabla = insertarImpuestos();
                modeloTabla.addRow(dataRows);
                //System.out.println("Creo que se metio bien :p");
                return modeloTabla;
            }
        }catch(Exception e){
            throw e;
        }
    }
    
    public DefaultTableModel modificarImpuestos(int row, String[] dataRow){
        try{
            DefaultTableModel modeloTabla = insertarImpuestos();
            modeloTabla.insertRow(row, dataRow);
            modeloTabla.removeRow(row+1);
            return modeloTabla;
        }catch(NullPointerException e){
            DefaultTableModel modeloTabla = new DefaultTableModel();
            modeloTabla.addColumn("Tipo de Impuesto");
            modeloTabla.addColumn("Porcentaje");
            return modeloTabla;
        }
    }
    
    public DefaultTableModel eliminarImpuestos(int row){
        try{
            DefaultTableModel modeloTabla = insertarImpuestos();
            modeloTabla.removeRow(row);
            return modeloTabla;    
        }catch(NullPointerException e){
            DefaultTableModel modeloTabla = new DefaultTableModel();
            modeloTabla.addColumn("Tipo de Impuesto");
            modeloTabla.addColumn("Porcentaje");
            return modeloTabla;
        }
    }
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Usuarios">
    public String settingsUsuarios(){
        String escrito = "";
        escrito += "====Configuracion de los usuarios====";
        escrito += "\nSimbolo de moneda\n";
        escrito += moneda;
        escrito += "\nSeparador de miles\n";
        escrito += miles;
        escrito += "\nSeparador de decimal\n";
        escrito += decimal;
        escrito += "\n=============-----------==============";
        return escrito;
    }
    // </editor-fold>
}
