package com.programacion.Boletin15.Boletin15_2;

public class Notas {

    int[] not=  new int[30];

    public int[] arrayNumeros(){

        for(int i=0; i<not.length;i++ ){
            int notas = (int) (Math.random()*10);
            not[i]=notas;
        }
        return not;
    }

    public void amosarArrayNumeros(int[]notas){
        for(Integer elemento:notas){
            System.out.println(elemento);
        }


    }

    public void notasModulo(){
        int aprobado=0;
        int suspenso=0;
        for(int i=0; i<not.length;i++ ){

            if(not[i]>= 5){
                aprobado++;

            }else{
                suspenso++;
            }
        }
        System.out.println("Aprobados: " + aprobado);
        System.out.println("Suspensos: " + suspenso);

    }
    public void notaMedia(){
        float media, aux = 0;
        for(int i=0; i<not.length; i++){
            aux = aux + not[i];
        }
        media = aux /30;
        System.out.println("media: " + media);
    }

    public void notaAlta(){
        int notaAlta=0;
        for(int i=0;i<not.length;i++){
            if(notaAlta > not[i]){
                //notaAlta++;
                not[i]=notaAlta;
            }
            System.out.println("la nota alta es: " + not[i]);
        }
    }
}


