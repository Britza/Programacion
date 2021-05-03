package com.programacion.boletin25.com.bri.clases;

public abstract class Barco {

    private String matricula;
    private float eslora;
    private int dias;

    public Barco() {
    }

    public Barco(String matricula, float eslora, int dias) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.dias = dias;
    }

    public String getMatricula() {
        return matricula;
    }

    public float getEslora() {
        return eslora;
    }

    public int getDias(){
        return dias;
    }

    @Override
    public String toString() {
        return "Matricula=" + matricula + ", eslora=" + eslora + "dias" + dias;
    }

    public float modulo(){
        return 10 * eslora;
    }


}
