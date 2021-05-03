package com.programacion.boletin25.com.bri.clases;

public class Yates extends Barco {
    private float potencia;
    private int camarotes;

    public Yates(float potencia, int camarotes) {
        this.potencia = potencia;
        this.camarotes = camarotes;
    }

    public Yates(float potencia, int camarotes, String Matricula, float eslora, int dias) {
        super(Matricula, eslora, dias);
        this.potencia = potencia;
        this.camarotes = camarotes;
    }

    public float getPotencia() {
        return potencia;
    }

    public int getCamarotes() {
        return camarotes;
    }

    @Override
    public String toString() {
        return "potencia=" + potencia + ", camarotes=" + camarotes;
    }

}
