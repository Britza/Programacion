package com.programacion.Boletin15.Boletin15_2;

public class Boletin15_2 {

    public static void main(String[] args) {

        Notas obx = new Notas();
        int [] notas = new int [30];
        notas = obx.arrayNumeros();
        obx.amosarArrayNumeros(notas);
        obx.notasModulo();
        obx.notaMedia();
        obx.notaAlta();
    }
}
