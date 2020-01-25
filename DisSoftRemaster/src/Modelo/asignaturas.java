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
public class asignaturas{
    String claveA;
    String licenciatura;
    String nombreAsignatura;

    public asignaturas(String nombreAsignatura, String licenciatura, String claveA) {
        
        this.licenciatura = licenciatura;
        this.nombreAsignatura = nombreAsignatura;
        this.claveA = claveA;
    }

    public String getClaveA() {
        return claveA;
    }

    public void setClaveA(String claveA) {
        this.claveA = claveA;
    }

    public String getLicenciatura() {
        return licenciatura;
    }

    public void setLicenciatura(String licenciatura) {
        this.licenciatura = licenciatura;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
       this.nombreAsignatura = nombreAsignatura;
    }

    
    
    
}
