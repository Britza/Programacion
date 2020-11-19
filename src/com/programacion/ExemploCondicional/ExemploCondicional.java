package com.programacion.ExemploCondicional;

public class ExemploCondicional {

    public static void main(String[] args) {

        /*CondicionalSimple obx = new CondicionalSimple();
        obx.maiorEdade(40);*/

        /*CondicionalDobre obxDobre= new CondicionalDobre();
        obxDobre.comparar(25);*/

        //obxDobre.comparar(12);

        //obxDobre.operadorInterrogante(23);

        Metodos obxMetodos= new Metodos();
        int edade= obxMetodos.pedirInt();
        //obxDobre.comparar(edade);
        float peso= obxMetodos.pedirFLoat();
        String nom= obxMetodos.pedirString();
        CondicionalAnidado obxAni = new CondicionalAnidado();
        obxAni.amosarDatos(nom, edade, peso);




    }
}
