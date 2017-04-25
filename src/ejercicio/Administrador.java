/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author Estudiante
 */
public class Administrador extends Empleados{

    public Administrador(String nombre, double salario, int id) {
        super(nombre,salario,id);
        
    }
    
    
    
    
    public double Clacularsalario() {
        return 100;
    }

    public String listarInformacion() {
         return "Administrador " + this.id + " " + this.nombre;
    }
}
