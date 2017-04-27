/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Empresa {
    private ArrayList<Trabajador> trabajadores;

    public ArrayList<Trabajador> getTrabajadores() {
        return trabajadores;
    }
    public Empresa(){
        this.trabajadores = new ArrayList<>();
    }
    public void agregarTrabajador(Trabajador t){
        this.trabajadores.add(t);
    }
    public double CalcularSalarioTotal(){
        double salarioTotal=0;
        for(Trabajador tra: this.trabajadores){
            salarioTotal+= tra.Clacularsalario();
        }
        return salarioTotal;
    }
    
    public String ListarInformacion(){
        String informacion=" ";
        for(Trabajador trabajador: this.trabajadores){
            informacion+= " " + trabajador.listarInformacion();
        }
        return informacion;
    }
  
}
