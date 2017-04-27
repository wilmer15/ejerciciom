/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import com.sun.istack.internal.logging.Logger;
import ejercicio.*;

import java.io.*;
import java.util.*;


/**
 *
 * @author Estudiante
 */
public class ArchivoDB {
    public void guardarInformacion(Empresa e) throws FileNotFoundException{
        File archivo = new File("empresa.txt");
            PrintStream salida = new PrintStream(archivo);
            salida.close();
            for(Trabajador t:e.getTrabajadores()){
                if(t instanceof Consultor){
                    Consultor c= (Consultor)t;
                    salida.print("C" + "," + c.getId() + "," + c.getLabor() +","+ c.Clacularsalario());
                }else if(t instanceof Administrador){
               Administrador a = (Administrador)t;
               salida.print("A" + "," + a.getNombre() + "," + a.getSalario() + ",");
           } else if(t instanceof LiderProyecto){
               LiderProyecto l = (LiderProyecto)t;
               salida.println("L" + "," + l.getId() + "," + l.getNombre() + "," + l.getSalario());
               salida.println(l.getProgramadores().size() + ",");
               for(Programador p: l.getProgramadores()){
                   salida.print(p.getId() + ",");
               }
               
           }else if(t instanceof Programador){
               Programador p= (Programador)t;
               salida.print("P," + p.getId() + "," + p.getNombre() + "," + p.getSalario() + "," + p.getLenguaje());
           }
            
           }
            salida.close();
    }
    public Empresa cargarInformacion(){
        File archivo = new File("empresa.txt");
        String tipo="";
        try{
            Scanner lectura = new Scanner(archivo);
            lectura.useDelimiter(",");
            while(lectura.hasNext()){
                tipo=lectura.next();
                if(tipo.equals("C")){
                    System.out.println("ID " +lectura.nextInt());
                    System.out.println("Labor " +lectura.next());
                    
                }else if(tipo.equals("A")){
                    System.out.println("ID " +lectura.nextInt());
                    System.out.println("Nombre " + lectura.next());
                    System.out.println("Salario " + lectura.nextDouble());
                }
                
                
                
                System.out.println(lectura.next());
            }
            lectura.close();
        }catch(FileNotFoundException ex){
      
        }
        return null;
      
    }
}
