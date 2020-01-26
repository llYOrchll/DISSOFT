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
public class AsigProfAlum {
    String nombreAlum;
    String nombreAsig;
    String nombreMstr;

    public AsigProfAlum(String nombreAlum, String nombreAsig, String nombreMstr) {
        this.nombreAlum = nombreAlum;
        this.nombreAsig = nombreAsig;
        this.nombreMstr = nombreMstr;
    }

    public String getNombreAlum() {
        return nombreAlum;
    }

    public void setNombreAlum(String nombreAlum) {
        this.nombreAlum = nombreAlum;
    }

    public String getNombreAsig() {
        return nombreAsig;
    }

    public void setNombreAsig(String nombreAsig) {
        this.nombreAsig = nombreAsig;
    }

    public String getNombreMstr() {
        return nombreMstr;
    }

    public void setNombreMstr(String nombreMstr) {
        this.nombreMstr = nombreMstr;
    }
    
    
}
