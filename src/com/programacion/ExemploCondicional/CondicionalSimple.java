package com.programacion.ExemploCondicional;

public class CondicionalSimple {

    private int edade;

    public CondicionalSimple() {
    }

    public CondicionalSimple(int edade) {
        this.edade = edade;
    }

    public void maiorEdade(int edade){

        if(edade>=18){
            System.out.println("e maior de edade ");
        }
        System.out.println(" remata o condicional");
    }
}
