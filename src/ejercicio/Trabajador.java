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
public abstract class Trabajador {
    protected int id;

    public Trabajador(int id) {
        this.id = id;
    }
    public abstract double Clacularsalario();
    public abstract String listarInformacion();
        
    
    
}
