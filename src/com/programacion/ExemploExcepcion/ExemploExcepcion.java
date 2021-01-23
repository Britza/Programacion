package com.programacion.ExemploExcepcion;

public class ExemploExcepcion {

    public static void main(String[] args) {

        Division obxDiv = new Division();
            /*try{
            obxDiv.dividirPropagandoExcepcion(8, 0);
            }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            }*/
        try {
            obxDiv.dividirNosaExcepcion(6, 0);
        } catch (NosaExcepcion ex) {
            System.out.println(ex.getMessage());
        }


    }
}
