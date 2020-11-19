package com.programacion.Boletin6.Boletin6_3;

public class Circulo {

    //Atributos

    private double radio;
    private final double PI=3.14;

    //Metodos constructores
    //Metodo constructor sen parametros

    public Circulo() {
    }

    //Metodo constructor con parametros

    public Circulo(double r) {
        radio = r;
    }

    //Metodos Acceso

    public void setRadio(double r){
        radio=r;
    }
    public double getRadio(){
        return radio;
    }

    //Metodos calcular
    public double calcularArea(){
        double area;
        area=Math.pow(radio, 2)*Math.PI;
        return area;
    }

    public double calcularLonxitude(){
        double lonxitude;
        lonxitude=2*radio*Math.PI;
        return lonxitude;
    }

}
