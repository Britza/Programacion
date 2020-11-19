package com.programacion.Boletin6.Boletin6_1;

public class Boletin6_1 {

    public static void main(String[] args) {
        Coche obx = new Coche(100);
        System.out.println("A velocidade é: " + obx.getVelocidade());
        obx.acelerar(5);
        obx.frenar(5);

    }
}
