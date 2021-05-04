package com.programacion.Boletin26.com.bri.clases;

import com.programacion.Boletin26.Seleccion;

public class Masajista extends Seleccion {

    private String titulacion;
    private int anosExpereciencia;

    public Masajista(String titulacion, int anosExpereciencia) {
        this.titulacion = titulacion;
        this.anosExpereciencia = anosExpereciencia;
    }

    public Masajista(String titulacion, int anosExpereciencia, int id, String nome, String apelidos, int edad) {
        super(id, nome, apelidos, edad);
        this.titulacion = titulacion;
        this.anosExpereciencia = anosExpereciencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAnosExpereciencia() {
        return anosExpereciencia;
    }

    @Override
    public String toString() {
        return "titulacion=" + titulacion + ", anosExpereciencia=" + anosExpereciencia;
    }

    public void darMasaje(){

    }
}
