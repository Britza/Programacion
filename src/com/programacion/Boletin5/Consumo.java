package com.programacion.Boletin5;

public class Consumo {

    private float km;
    private float litros;
    private float vMed;
    private float pGas;

    public Consumo() {
    }

    public Consumo(float km, float litros, float vMed, float pGas) {
        this.km = km;
        this.litros = litros;
        this.vMed = vMed;
        this.pGas = pGas;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public void setLitros(float litros) {
        this.litros = litros;
    }

    public void setvMed(float vMed) {
        this.vMed = vMed;
    }

    public void setpGas(float pGas) {
        this.pGas = pGas;
    }

    public float getTempo(float t){
        float tempo;
        tempo=km/vMed;
        return tempo;
    }

    public float consumoMedio(){
        float consumoMedio;
        consumoMedio= litros/km*100;
        return consumoMedio;
    }

    public float consumoEuros(){
        float consumoEuros;
        consumoEuros= litros*pGas/km*100;
        System.out.println("O consumo medio é : " + consumoEuros);
       /*
        float consum=consumoMedio()*pGas;
        System.out.println("o consumo medio é: " + consumo)
        */
        return 0;

    }
}
