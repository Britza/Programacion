package com.programacion.ExemploCondicional;

public class CondicionalDobre {

    public void comparar(int edade){

        if (edade>=18){
            System.out.println(" e maior de edade ");
        }
        else{
            System.out.println(" e menir de edade ");
        }
        System.out.println(" remata o programa");

    }
    public void operadorInterrogante(int edade){
        String mensaxe = (edade>=18)? " e maior de edade ": " e menor de edade ";
        System.out.println(mensaxe);
    }
}
