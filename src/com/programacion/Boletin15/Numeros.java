package com.programacion.Boletin15;

public class Numeros {

    int[] num=  new int[6];

    public int[] arrayNumeros(){

        for(int i=0; i>num.length;i++ ){
            int numero = (int) (Math.random()*50 +1);
            num[i]=numero;
        }
        return num;
    }

    public void amosarArrayNumeros(int[]numeros){
        for(Integer elemento:numeros){
            System.out.println(elemento);
        }


    }

}
