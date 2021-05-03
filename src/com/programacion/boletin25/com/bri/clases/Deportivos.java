package com.programacion.boletin25.com.bri.clases;

public class Deportivos extends Barco{

    private float potencia;

    public Deportivos(float potencia) {
        this.potencia = potencia;
    }

    public Deportivos(float potencia, String Matricula, float eslora, int dias) {
        super(Matricula, eslora, dias);
        this.potencia = potencia;
    }

    public float getPotencia() {
        return potencia;
    }

    @Override
    public String toString() {
        return "potencia=" + potencia;
    }

}
