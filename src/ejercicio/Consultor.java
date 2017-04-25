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
public class Consultor extends Trabajador{
    protected String Labor;

    public Consultor(int id, String labor) {
        super(id);
        this.Labor=labor;
    }

    @Override
    public double Clacularsalario() {
        return 220;
    }

    @Override
    public String listarInformacion() {
         return "Consultor "  + this.id + " " + this.Labor;
    }
    
}
