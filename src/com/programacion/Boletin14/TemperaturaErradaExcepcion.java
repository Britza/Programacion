package com.programacion.Boletin14;

public class TemperaturaErradaExcepcion extends Exception{

    public TemperaturaErradaExcepcion() {
        super();
    }

    public TemperaturaErradaExcepcion(String message) {
        super("Tes un erro" + message);
    }



}
