package com.programacion.Boletin26.com.bri.clases;

import com.programacion.Boletin26.Seleccion;

public class Futbolista extends Seleccion {


    private int dorsal;
    private String demarcacion;

    public Futbolista(int dorsal) {
        this.dorsal = dorsal;
    }

    public Futbolista(int dorsal, int id, String nome, String apelidos, int edad) {
        super(id, nome, apelidos, edad);
        this.dorsal = dorsal;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    @Override
    public String toString() {
        return "dorsal=" + dorsal + ", demarcacion=" + demarcacion;
    }

    public void entrevista(){

    }

}
