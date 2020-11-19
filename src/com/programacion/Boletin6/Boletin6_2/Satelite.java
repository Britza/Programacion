package com.programacion.Boletin6.Boletin6_2;

public class Satelite {
    private double meridiano;
    private double paralelo;
    private double distanciaTerra;

    public Satelite(){

    }

    public Satelite(double meridiano, double paralelo, double distanciaTerra) {
        this.meridiano = meridiano;
        this.paralelo = paralelo;
        this.distanciaTerra = distanciaTerra;
    }

    public void verPosicion(){
        System.out.println("O satelite atopase no paralelo" + paralelo + " meridiano" + meridiano + "A unha distancia da terra" + distanciaTerra);
    }
}
