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
public class Agente {
    private String nombreAgente;
    private String cedula;
    private int codigo;
    private String sucursal;
    private String vehiculo;

    public String getNombreAgente() {
        return nombreAgente;
    }

    public void setNombreAgente(String nombreAgente) {
        this.nombreAgente = nombreAgente;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }
   
    public Agente(String nombreAgente, String cedula, int codigo, String sucursal, String vehiculo) {
        this.nombreAgente = nombreAgente;
        this.cedula = cedula;
        this.codigo = codigo;
        this.sucursal = sucursal;
        this.vehiculo = vehiculo;
       
    }

    // Método para mostrar información del Agente
    public void mostrarInformacion() {
        JOptionPane.showMessageDialog(null, "Información del Agente:\n"
                + "Nombre del Agente: " + nombreAgente + "\n"
                + "Cédula del Agente: " + cedula + "\n"
                + "Código: " + codigo);
           
 


 
                     
    }
}



