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
public abstract class Empleados extends Trabajador {

    protected String nombre;
    protected double salario;

    public Empleados(String nombre, double salario, int id) throws ExcepcionNombre, ExcepcionSalario {
        super(id);
        if(nombre.length() < 10){
            throw new ExcepcionNombre();
        }
        this.nombre = nombre;
       if(salario < 737000){
            throw new ExcepcionSalario();
        }
        this.salario = salario;
    }
    
}
