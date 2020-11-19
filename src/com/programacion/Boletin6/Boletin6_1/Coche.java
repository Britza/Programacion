package com.programacion.Boletin6.Boletin6_1;

public class Coche {

    private int velocidade;

    public Coche(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void acelerar(int A){
        velocidade=velocidade + A;
        System.out.println("O incremento da velocidade é: " + velocidade);
    }

    public void frenar(int F){
        velocidade=velocidade - F;
        System.out.println("O decremento da velocidade é: " + velocidade);
    }
}
