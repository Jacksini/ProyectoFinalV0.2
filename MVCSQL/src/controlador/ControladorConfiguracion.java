/*
Descripción: Clase controlador para configuracion
Fecha: 12-agosto-2022
Nombre: David Enrique Garcia Olvera
 */
package Controlador;

import Modelo.ConsultaArchivos;
import Vista.Configuracion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ControladorConfiguracion implements ActionListener, MouseListener{
    private Configuracion vista;
    private ConsultaArchivos modelo;

    @SuppressWarnings("LeakingThisInConstructor")
    public ControladorConfiguracion(Configuracion vista, ConsultaArchivos modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.btnOpciones.addActionListener(this);
        this.vista.btnCajeros.addActionListener(this);
        this.vista.btnImpuestos.addActionListener(this);
        this.vista.btnTicket.addActionListener(this);
        this.vista.btnMoneda.addActionListener(this);
        this.vista.btnConfHome.addActionListener(this);
        this.vista.menuClientes.addMouseListener(this);
        this.vista.menuConfiguracion.addMouseListener(this);
        this.vista.menuVentas.addMouseListener(this);
        this.vista.menuProveedores.addMouseListener(this);
        this.vista.menuInventario.addMouseListener(this);
    }
    
    public void iniciarVista() {
        //pone el titulo
        vista.setTitle("Configuracion");
        vista.pack(); //Abre la ventana al tamaño preferido de los componentes
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Que hacer al cerrar, supongo
        vista.setLocationRelativeTo(null);
        vista.setVisible(true); //Supongo que establece que sea visible
    }
    
    //Opciones de Configuracion que dirijen a otras ventanas
    @Override
    public void actionPerformed(ActionEvent e) {
        if(vista.btnCajeros == e.getSource()){
            //No se implementara en esta version
            JOptionPane.showMessageDialog(null, "Esta funcion no esta implementada en esta version.");
        }else if(vista.btnOpciones == e.getSource()){
            //No se implementara en esta version
            JOptionPane.showMessageDialog(null, "Esta funcion no esta implementada en esta version.");
        }else if(vista.btnImpuestos == e.getSource()){
            //Ventana Impuestos
            this.vista.dispose();
            iniciarImpuestos();
        }else if(vista.btnTicket == e.getSource()){
            //Ventana Ticket
            iniciarTicket();
            this.vista.dispose();
        }else if(vista.btnMoneda == e.getSource()){
            //Ventana Simbolos de Moneda
            iniciarSimbolos();
            this.vista.dispose();
        }else if(vista.btnConfHome == e.getSource()){
            JOptionPane.showMessageDialog(null, "Ya esta aqui");
        }
    }
    
    public void iniciarSimbolos() {
        Vista.SimbolosDeMoneda simbolos = new Vista.SimbolosDeMoneda();
        simbolos.setTitle("Simbolos");
        simbolos.pack(); 
        simbolos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        simbolos.setLocationRelativeTo(null);
        simbolos.setVisible(true); 
        simbolos.updateSettings();
    }
    
    public void iniciarTicket() {
        Vista.Ticket ticket = new Vista.Ticket();
        ticket.setTitle("Ticket");
        ticket.pack();
        ticket.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        ticket.setLocationRelativeTo(null);
        ticket.setVisible(true); 
        ticket.updateSettings();
    }
    
    public void iniciarImpuestos() {
        Vista.Impuestos impuestos = new Vista.Impuestos();
        impuestos.setTitle("Impuestos");
        impuestos.pack(); 
        impuestos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        impuestos.setLocationRelativeTo(null);
        impuestos.setVisible(true); 
        impuestos.updateSettings();
    }
    
    //Barra de menu
    @Override
    public void mouseClicked(MouseEvent e) {
        if(vista.menuClientes == e.getSource()){
            //Ventana de Clientes
        }else if(vista.menuInventario == e.getSource()){
            //Ventana de Inventario
        }else if(vista.menuProductos == e.getSource()){
            //Ventana de Productos
        }else if(vista.menuProveedores == e.getSource()){
            //Ventana de Proveedores
        }else if(vista.menuVentas == e.getSource()){
            //Ventana de Ventas
        }else if(vista.menuConfiguracion == e.getSource()){
            JOptionPane.showMessageDialog(null, "Ya esta aqui");
        }
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        //System.out.println("mousePressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //System.out.println("mouseReleased");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //System.out.println("mouseEntered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //System.out.println("mouseExited");
    }
    
}
