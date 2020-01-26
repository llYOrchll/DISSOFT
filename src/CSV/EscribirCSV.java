/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSV;

import Modelo.*;
import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author LEFT4
 */
public class EscribirCSV {
//    public static void ExpAlumnosCSV(List<alumnos> listaAlumnos){
//        String salidaArchivoAlum = "Alumnos.csv";
//        boolean existe = new File(salidaArchivoAlum).exists();
//        
//        if(existe){
//            File archivoAlumnos = new File(salidaArchivoAlum);
//            archivoAlumnos.delete();
//        }
//        
//        try{
//            CsvWriter salidaAlumCSV = new CsvWriter(new FileWriter(salidaArchivoAlum, true), ',');
//            salidaAlumCSV.write("Nombre");
//            salidaAlumCSV.write("Apellido paterno");
//            salidaAlumCSV.write("Apellido materno");
//            salidaAlumCSV.write("Matricula");
//            
//            salidaAlumCSV.endRecord();
//            
//            for(alumnos alum : listaAlumnos){
//                salidaAlumCSV.write(alum.getNombre());
//                salidaAlumCSV.write(alum.getApellidoP());
//                salidaAlumCSV.write(alum.getApellidoM());
//                salidaAlumCSV.write(alum.getMatricula());
//                salidaAlumCSV.endRecord();
//            }
//            
//            salidaAlumCSV.close();
//        }
//        catch(IOException e1){
//            e1.printStackTrace();
//        }
//    }
//    
//    public static void ExpAsigCSV(List<asignaturas> listaAsignaturas){
//        String salidaArchivoAsig = "Asignaturas.csv";
//        boolean existe1 = new File(salidaArchivoAsig).exists();
//        
//        if(existe1){
//            File archivoAsignaturas = new File(salidaArchivoAsig);
//            archivoAsignaturas.delete();
//        }
//        
//        try{
//            CsvWriter salidaAsigCSV = new CsvWriter(new FileWriter(salidaArchivoAsig, true), ',');
//            salidaAsigCSV.write("Clave");
//            salidaAsigCSV.write("Licenciatura");
//            salidaAsigCSV.write("Nombre de Asignatura");
//            
//            
//            salidaAsigCSV.endRecord();
//            
//            for(asignaturas asig : listaAsignaturas){
//                salidaAsigCSV.write(asig.getClaveA());
//                salidaAsigCSV.write(asig.getLicenciatura());
//                salidaAsigCSV.write(asig.getNombreAsignatura());
//                salidaAsigCSV.endRecord();
//            }
//            
//            salidaAsigCSV.close();
//        }
//        catch(IOException e2){
//            e2.printStackTrace();
//        }
//    }
//    
//    public static void ExpMaestrosCSV(List<maestros> listaMaestros){
//        String salidaArchivoMaestros = "Maestros.csv";
//        boolean existe2 = new File(salidaArchivoMaestros).exists();
//        
//        if(existe2){
//            File archivoMaestros = new File(salidaArchivoMaestros);
//            archivoMaestros.delete();
//        }
//        
//        try{
//            CsvWriter salidaMaestrosCSV = new CsvWriter(new FileWriter(salidaArchivoMaestros, true), ',');
//            salidaMaestrosCSV.write("Nombre");
//            salidaMaestrosCSV.write("Apellido paterno");
//            salidaMaestrosCSV.write("Apellido materno");
//            salidaMaestrosCSV.write("Clave");
//            
//            salidaMaestrosCSV.endRecord();
//            
//            for(maestros maes : listaMaestros){
//                salidaMaestrosCSV.write(maes.getNombreMaestro());
//                salidaMaestrosCSV.write(maes.getApellidoPM());
//                salidaMaestrosCSV.write(maes.getApellidoMM());
//                salidaMaestrosCSV.write(maes.getClave());
//                salidaMaestrosCSV.endRecord();
//            }
//            
//            salidaMaestrosCSV.close();
//        }
//        catch(IOException e3){
//            e3.printStackTrace();
//        }
//    }
     public static void ExpAsigProfCSV(List<AsigProf> listaAsigProf){
        String salidaArchivoAsigProf = "Materias.csv";
        boolean existe = new File(salidaArchivoAsigProf).exists();
        
        if(existe){
            File archivoAsigProf = new File(salidaArchivoAsigProf);
            archivoAsigProf.delete();
        }
        
        try{
            CsvWriter salidaAsigProfCSV = new CsvWriter(new FileWriter(salidaArchivoAsigProf, true), ',');
            salidaAsigProfCSV.write("Clave de maestro");
            salidaAsigProfCSV.write("Asignatura");
            
            salidaAsigProfCSV.endRecord();
            
            for(AsigProf asigprof : listaAsigProf){
                salidaAsigProfCSV.write(asigprof.getClaveM());
                salidaAsigProfCSV.write(asigprof.getNomAsig());
                salidaAsigProfCSV.endRecord();
            }
            
            
            salidaAsigProfCSV.close();
        }
        catch(IOException e1){
            e1.printStackTrace();
        }
    }
     public static void ExpAsigProfAlumCSV(List<AsigProfAlum> listaAsigProfAlum){
        String salidaArchivoAsigProfAlum = "Horario.csv";
        boolean existe = new File(salidaArchivoAsigProfAlum).exists();
        
        if(existe){
            File archivoAsigProfAlum = new File(salidaArchivoAsigProfAlum);
            archivoAsigProfAlum.delete();
        }
        
        try{
            CsvWriter salidaAsigProfAlumCSV = new CsvWriter(new FileWriter(salidaArchivoAsigProfAlum, true), ',');
            salidaAsigProfAlumCSV.write("Clave de maestro");
            salidaAsigProfAlumCSV.write("Asignatura");
            
            salidaAsigProfAlumCSV.endRecord();
            
            for(AsigProfAlum asigprofalum : listaAsigProfAlum){
                salidaAsigProfAlumCSV.write(asigprofalum.getNombreAlum());
                salidaAsigProfAlumCSV.write(asigprofalum.getNombreAsig());
                salidaAsigProfAlumCSV.write(asigprofalum.getNombreMstr());
                salidaAsigProfAlumCSV.endRecord();
            }
            
            
            salidaAsigProfAlumCSV.close();
        }
        catch(IOException e1){
            e1.printStackTrace();
        }
    }
}
