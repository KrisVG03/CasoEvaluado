/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main.empresa.nacional;

import javax.swing.JOptionPane;

/**
 *
 * @author krisv
 */
public class MAINEMPRESANACIONAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // Método principal (main)
            JOptionPane.showMessageDialog(null, "Ingrese la información del Agente:");
        String nombreAgente = JOptionPane.showInputDialog("Nombre completo:");
        if (nombreAgente == null) nombreAgente = " ";
        
        String cedula = JOptionPane.showInputDialog("Cédula:");
        if (cedula == null) cedula = " ";
        
        String codigo = JOptionPane.showInputDialog("Código:");
        if (codigo == null) codigo = " ";
        
        String sucursal = JOptionPane.showInputDialog("Sucursal:");
        if (sucursal == null) sucursal = " ";
        
        String vehiculo = JOptionPane.showInputDialog("Vehículo:");
        if (vehiculo == null) vehiculo = " ";

       JOptionPane.showMessageDialog(null, "Ingrese la información cliente:");
        String nombreCliente = JOptionPane.showInputDialog("Nombre del Cliente:");
        if (nombreCliente == null) nombreCliente = " ";
        
        String cedulaCliente = JOptionPane.showInputDialog("Cédula del Cliente:");
        if (cedulaCliente == null) cedulaCliente = " ";
        
        String codigoFacturaStr = JOptionPane.showInputDialog("Código factura:");
        int codigoFacturas;
        if (codigoFacturaStr == null) {
            codigoFacturas = 1967;
        } else {
            codigoFacturas = Integer.parseInt(codigoFacturaStr);
        }
        vehiculo = JOptionPane.showInputDialog("Vehículo:");
        if (vehiculo == null) vehiculo = " ";
        
        String montoFactura = JOptionPane.showInputDialog("Monto de la factura:");
        if (montoFactura == null) montoFactura = " ";
        
        Agente agente = new Agente(nombreAgente, cedula, codigoFacturas, sucursal,vehiculo);
        
        agente.mostrarInformacion();
        
      
  
       
    }
    
}
