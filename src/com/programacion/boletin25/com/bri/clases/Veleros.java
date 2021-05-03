package com.programacion.boletin25.com.bri.clases;

public class Veleros extends Barco{

    private int mastiles;

    public Veleros(int mastiles) {
        this.mastiles = mastiles;
    }

    public Veleros(int mastiles, String Matricula, float eslora, int dias) {
        super(Matricula, eslora, dias);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    @Override
    public String toString() {
        return "mastiles=" + mastiles;
    }
}
