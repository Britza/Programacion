package com.programacion.ExemploValidacion;

public class ExemploValidacion {

    public static void main(String[] args) {

        Validacion obx = new Validacion();
        //float res=obx.ValidarDato();
        /*float res = 0;
        obx.validarDato();*/
        float res= obx.validaWhile();
        System.out.println("dato valido :" + res);

    }
}
