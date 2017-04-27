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
public class LiderProyecto extends Programador{
    private ArrayList<Programador> programadores;

    public LiderProyecto(String nombre, double salario, int id, String Lenguaje) throws ExcepcionNombre, ExcepcionSalario, ExcepcionLenguaje {
        super(nombre, salario, id, Lenguaje);
    }
    
    public void agregarProgramador(Programador p){
        this.programadores.add(p);
    }
    
    @Override
  public double Clacularsalario() {
         double salarioTotal=0;
         salarioTotal+=super.Clacularsalario()*(super.Clacularsalario()*this.programadores.size()*0.1);
         return salarioTotal;
    }

    public ArrayList<Programador> getProgramadores() {
        return programadores;
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


    public String listarInformacion() {
        String informacion= super.listarInformacion();
        informacion+="Programadores a cargo\n";
        for(Programador pro: this.programadores){
            informacion+=pro.listarInformacion();
        }
        return informacion;
    }
}
