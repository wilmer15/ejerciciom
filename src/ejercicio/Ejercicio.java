/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import DB.ArchivoDB;
import java.io.*;

/**
 *
 * @author Estudiante
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Empresa emp = new Empresa();
        Consultor c = new Consultor("Ing", 1);
        Administrador a= null;
        try{
           a= new Administrador("A",500, 2);
           emp.agregarTrabajador(a);
        }catch(ExcepcionNombre e){
            e.printStackTrace();
        }catch( ExcepcionSalario b){
           b.printStackTrace();
        }
        
        Programador p= null;
        try{
        p= new Programador("Camilo",789000, 34, "java");
        emp.agregarTrabajador(p);
        }catch(ExcepcionNombre e){
            e.printStackTrace();
        }catch( ExcepcionSalario b){
           b.printStackTrace();
        }catch(ExcepcionLenguaje g){
           g.printStackTrace();
        }
        
        LiderProyecto lp= null;     
        try{
          lp=new LiderProyecto("Andres", 856, 3, "java");
          lp.agregarProgramador(p);
          emp.agregarTrabajador(lp);
        }catch(ExcepcionNombre e){
            e.printStackTrace();
        }catch( ExcepcionSalario b){
           b.printStackTrace();
        }catch(ExcepcionLenguaje g){
           g.printStackTrace();
        }
                
        
        ArchivoDB arc = new ArchivoDB();
        
        try{
             arc.guardarInformacion(emp);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
       
        
                
    }
    
}
