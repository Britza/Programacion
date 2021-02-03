package com.programacion.Boletin14;

public class ConversorTemperaturas {

    private static final int grados = 80;

    public float fharenheit(float centigrados) throws TemperaturaErradaExcepcion {
        float fharenheit;
        if(centigrados<grados){
            throw new TemperaturaErradaExcepcion();
        }
        else
            fharenheit = (float) (9.0/5.0 * centigrados + 32.4);
        return fharenheit;
    }

    public float reamur(float centigrados)throws TemperaturaErradaExcepcion{
        float reamur;
        if(centigrados<grados){
            throw new TemperaturaErradaExcepcion();
        }
        else
            reamur=(float)(4.0/5.0 * centigrados);
        return reamur;
    }
}
