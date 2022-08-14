package mvcsql;

import Vista.Configuracion;
import controlador.ControladorAgregarProducto;
import controlador.ControladorClientes;
import controlador.ControladorDepartamentos;
import controlador.ControladorEliminar;
import controlador.ControladorEliminarProducto;
import controlador.ControladorInventario;
import controlador.ControladorModificarProducto;
import controlador.ControladorModificarProveedor;
import controlador.ControladorNuevoProducto;
import controlador.ControladorNuevoProveedor;
import controlador.ControladorProductos;
import controlador.ControladorProveedor;
import controlador.ControladorVentas;
import modelo.Modelo;
import vista.Agregarproducto;
import vista.Clientes;
import vista.Departamentos;
import vista.EliminarProducto;
import vista.Inventario;
import vista.ModificarProducto;
import vista.NuevoProducto;
import vista.Productos;
import vista.VentaBuscador;
import vista.VentaVerificador;
import vista.VentanaCobro;
import vista.VentanaEntradas;
import vista.VentanaSalida;
import vista.VentanaVentas;
import vista.eliminar;
import vista.modificarprovedor;
import vista.nuevoproveedor;
import vista.proveedores;
import vista.sesion;

public class MVCSQL{

    public static void main(String[] args) {
        //Modelo
        Modelo mod = new Modelo();
        
        //Inicio de sesion
        sesion inicioSesion = new sesion();
        
        //Ventanas de ventas
        VentanaVentas Ventas = new VentanaVentas();
        Clientes cliente = new Clientes();
        Productos Prod = new Productos();
        proveedores Prov = new proveedores();
        Inventario Inv = new Inventario();
        Configuracion Config = new Configuracion();
        
        //Ventanas emergentes Ventas
        VentanaEntradas Entra = new VentanaEntradas();
        VentanaSalida Sali = new VentanaSalida();
        VentaBuscador Busc = new VentaBuscador();
        VentaVerificador Veri = new VentaVerificador();
        VentanaCobro Cob = new VentanaCobro();
        
        //Ventanas emergentes Proveedores
        nuevoproveedor nuevoProv = new nuevoproveedor();
        modificarprovedor modProv = new modificarprovedor();
        eliminar elimin = new eliminar();
        
        //Ventanas emergentes Productos
        Agregarproducto addProdu = new Agregarproducto();
        Departamentos  Dep = new Departamentos();
        EliminarProducto ElimProd = new EliminarProducto();
        ModificarProducto ModProd = new ModificarProducto();
        NuevoProducto NewProd = new NuevoProducto();
        
        //Controladores de ventanas principales
        ControladorVentas CtrlVen = new ControladorVentas(mod, inicioSesion, Ventas, cliente, Prod, Prov, Inv, Config, Entra, Sali, Busc, Veri, Cob);
        ControladorClientes CtrlCli = new ControladorClientes(mod, inicioSesion, Ventas, cliente, Prod, Prov, Inv, Config);
        ControladorInventario CtrlInv = new ControladorInventario(mod, inicioSesion, Ventas, cliente, Prod, Prov, Inv, Config,addProdu ,Dep ,ElimProd ,ModProd ,NewProd);
        ControladorProveedor CtrlProv = new ControladorProveedor(mod, inicioSesion, Ventas, cliente, Prod, Prov, Inv, Config, nuevoProv ,modProv, elimin);
        ControladorNuevoProveedor CtrlNProv = new ControladorNuevoProveedor(mod, inicioSesion, Ventas, cliente, Prod, Prov, Inv, Config, nuevoProv ,modProv, elimin);
        ControladorModificarProveedor CtrlMProv = new ControladorModificarProveedor(mod, inicioSesion, Ventas, cliente, Prod, Prov, Inv, Config, nuevoProv ,modProv, elimin);
        ControladorEliminar CtrlEProv = new ControladorEliminar(mod, inicioSesion, Ventas, cliente, Prod, Prov, Inv, Config, nuevoProv ,modProv, elimin);
        ControladorProductos CtrlProd = new ControladorProductos(mod, inicioSesion, Ventas, cliente, Prod, Prov, Inv, Config,addProdu ,Dep ,ElimProd ,ModProd ,NewProd);
        ControladorAgregarProducto CtrlAddProd = new ControladorAgregarProducto(mod, inicioSesion, Ventas, cliente, Prod, Prov, Inv, Config,addProdu ,Dep ,ElimProd ,ModProd ,NewProd);
        ControladorNuevoProducto CtrlNewProd = new ControladorNuevoProducto(mod, inicioSesion, Ventas, cliente, Prod, Prov, Inv, Config,addProdu ,Dep ,ElimProd ,ModProd ,NewProd);
        ControladorDepartamentos CtrlDep = new ControladorDepartamentos(mod, inicioSesion, Ventas, cliente, Prod, Prov, Inv, Config,addProdu ,Dep ,ElimProd ,ModProd ,NewProd);
        ControladorEliminarProducto CtrlElimProd = new ControladorEliminarProducto(mod, inicioSesion, Ventas, cliente, Prod, Prov, Inv, Config,addProdu ,Dep ,ElimProd ,ModProd ,NewProd);
        ControladorModificarProducto CtrlModProd = new ControladorModificarProducto(mod, inicioSesion, Ventas, cliente, Prod, Prov, Inv, Config,addProdu ,Dep ,ElimProd ,ModProd ,NewProd);
        CtrlVen.inicioDeSesion();
        inicioSesion.setVisible(true);
        
    }
    
}