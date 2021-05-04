package com.programacion.Boletin26.com.bri.clases;

import com.programacion.Boletin26.Seleccion;

public class Entrenador extends Seleccion {

    private int idFederacion;

    public Entrenador(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    public Entrenador(int idFederacion, int id, String nome, String apelidos, int edad) {
        super(id, nome, apelidos, edad);
        this.idFederacion = idFederacion;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    @Override
    public String toString() {
        return "idFederacion=" + idFederacion;
    }

    public void planifarEntrenamiento(){

    }
}
