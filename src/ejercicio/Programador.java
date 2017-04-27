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
public class Programador extends Empleados {
    protected String lenguaje;

    public Programador(String nombre, double salario, int id, String Lenguaje) 
            throws ExcepcionNombre, ExcepcionSalario, ExcepcionLenguaje {
        super(nombre, salario, id);
        if(Lenguaje.equals("go")){
            throw new ExcepcionLenguaje();
        }
        this.lenguaje = Lenguaje;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public double Clacularsalario() {
        double salarioT = this.salario;
        if(this.lenguaje.equals("java")){
             salarioT += salarioT*0.20;
             
        }
         return salarioT;
    }


    @Override
    public String listarInformacion() {
        return "Programador " +  this.id + " " + this.nombre ;
    }
    
    
}
