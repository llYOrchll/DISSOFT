/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author LEFT4
 */
public class maestros {
    String nombreMaestro;
    String apellidoPM;
    String apellidoMM;
    String clave;

    public maestros(String clave, String nombreMaestro, String apellidoPM, String apellidoMM) {
        this.clave = clave;
        this.nombreMaestro = nombreMaestro;
        this.apellidoPM = apellidoPM;
        this.apellidoMM = apellidoMM;
        
    }

    public String getNombreMaestro() {
        return nombreMaestro;
    }

    public void setNombreMaestro(String nombreMaestro) {
        this.nombreMaestro = nombreMaestro;
    }

    public String getApellidoPM() {
        return apellidoPM;
    }

    public void setApellidoPM(String apellidoPM) {
        this.apellidoPM = apellidoPM;
    }

    public String getApellidoMM() {
        return apellidoMM;
    }

    public void setApellidoMM(String apellidoMM) {
        this.apellidoMM = apellidoMM;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    
    
    
}
