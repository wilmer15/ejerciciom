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

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public Administrador(String nombre, double salario, int id) throws ExcepcionNombre, ExcepcionSalario {
        super(nombre,salario,id);
    }
    
    
    
    
    @Override
    public double Clacularsalario() {
        return 100;
    }

    @Override
    public String listarInformacion() {
         return "Administrador " + this.id + " " + this.nombre;
    }
}
