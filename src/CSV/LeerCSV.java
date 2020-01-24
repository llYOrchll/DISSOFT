/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSV;

import Modelo.*;
import com.csvreader.CsvReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LEFT4
 */
public class LeerCSV {
    
    public static List<asignaturas> ImpAsigCSV(){
        List<asignaturas> listaAsignaturas = new ArrayList<asignaturas>();
        
        try{
            CsvReader leerAsig = new CsvReader("Asignaturas.csv");
            leerAsig.readHeaders();
        
            while(leerAsig.readHeaders()){
            
                String claveA = leerAsig.get(0);
                String licenciatura = leerAsig.get(1);
                String nombreAsignatura = leerAsig.get(2);
                
                listaAsignaturas.add(new asignaturas(claveA, licenciatura, nombreAsignatura));  
        }
            leerAsig.close(); 
        

        } catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException ex1){
            ex1.printStackTrace();
        }
            return listaAsignaturas;

    }
    
    public static List<alumnos> ImpAlumnosCSV(){
        List<alumnos> listaAlumnos = new ArrayList<alumnos>();
        
        try{
            CsvReader leerAlumnos = new CsvReader("Alumnos.csv");
            leerAlumnos.readHeaders();
        
            while(leerAlumnos.readHeaders()){
            
                String nombre = leerAlumnos.get(0);
                String apellidoP = leerAlumnos.get(1);
                String apellidoM = leerAlumnos.get(2);
                String matricula = leerAlumnos.get(4);
                listaAlumnos.add(new alumnos(nombre, apellidoP, apellidoM, matricula));
   
        }
            leerAlumnos.close();
        

        } catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException ex1){
            ex1.printStackTrace();
        }
            return listaAlumnos;

    }
    
    public static List<maestros> ImpMaestrosCSV(){
        List<maestros> listaMaestros = new ArrayList<maestros>();
        
        try{
            CsvReader leermaestros = new CsvReader("Maestros.csv");
            leermaestros.readHeaders();
        
            while(leermaestros.readHeaders()){
            
                String nombreMaestro = leermaestros.get(0);
                String apellidoPM = leermaestros.get(1);
                String apellidoMM = leermaestros.get(2);
                String clave = leermaestros.get(3);
                listaMaestros.add(new maestros(nombreMaestro, apellidoPM, apellidoMM, clave));
                   
        }
            leermaestros.close();
        

        } catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException ex1){
            ex1.printStackTrace();
        }
        //System.out.println(listaMaestros.get(0).getClave());
            return listaMaestros;

    }
    
        public static List<AsigProf> ImpAsigProfCSV(){
        List<AsigProf> listaAsigProf = new ArrayList<AsigProf>();
        
        try{
            CsvReader leerAsigProf = new CsvReader("Materias.csv");
            leerAsigProf.readHeaders();
        
            while(leerAsigProf.readHeaders()){
            
                String clave = leerAsigProf.get(0);
                String nombreAsignatura = leerAsigProf.get(1);
                listaAsigProf.add(new AsigProf(clave, nombreAsignatura));
               
                  
        }
            leerAsigProf.close(); 
        

        } catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException ex1){
            ex1.printStackTrace();
        }
            return listaAsigProf;

    }
}
