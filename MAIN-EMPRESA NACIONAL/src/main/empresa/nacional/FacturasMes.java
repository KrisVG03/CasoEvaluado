/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.empresa.nacional;

import javax.swing.JOptionPane;

/**
 *
 * @author krisv
 */
public class FacturasMes {
    private String nombreCliente;
    private String cedulaCliente;
    private int codigoFactura;
    private int montoFactura;
    private String mes;

    public int getMontoFactura() {
        return montoFactura;
    }

    public void setMontoFactura(int montoFactura) {
        this.montoFactura = montoFactura;
    }

    public Agente getAgente() {
        return agente;
    }

    public void setAgente(Agente agente) {
        this.agente = agente;
    }
    
    private Agente agente;

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public int getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(int codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

   
    // Constructor
    public FacturasMes(String nombreCliente, String cedulaCliente, int codigoFactura, Agente agente, int montoFactura) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.codigoFactura = codigoFactura;
        this.montoFactura = montoFactura;
        
        this.agente = agente;
    }

    
    public void mostrarInformacion() {
        JOptionPane.showMessageDialog(null, "Información de la factura:\n"
                + "nombreCliente: " + nombreCliente + "\n"
                + "cedulaCliente: " + cedulaCliente + "\n"
                + "codigoFactura: " + codigoFactura);
               
        
        agente.mostrarInformacion();
        }
        
    
    }
      

