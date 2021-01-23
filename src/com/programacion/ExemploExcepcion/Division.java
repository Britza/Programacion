package com.programacion.ExemploExcepcion;

import javax.swing.*;

public class Division {

    private int numerador;
    private int denominador;

    public Division() {
    }

    public Division(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void dividirSenCapturarExcepcions(int nume, int deno){
        System.out.println("resultado sen tratar excepcions " + nume/deno);
    }

    public void dividirCapturandoExcepcion(int nume, int deno){

        try{

            System.out.println("antes da division");

            System.out.println("tratando a excepcions " + nume/deno);

            System.out.println("despois da division");

        }catch(ArithmeticException e){
            System.out.println("erro1 " + e.toString());
        }
    }

    public void dividirCapturandoExcepcions(int deno){

        try{

            System.out.println("antes da division");
            int num = Integer.parseInt(JOptionPane.showInputDialog("numerador"));
            System.out.println("tratando a excepcions " + num/deno);

            System.out.println("despois da division");

        }catch(ArithmeticException e){
            System.out.println("erro1 " + e.toString());
        }catch(Exception e){
            System.out.println("erro2 " + e.getMessage());
        }

    }

    public void dividirUsandoFinally (int nume, int deno){

        try{

            System.out.println("antes da division");

            System.out.println("tratando a excepcions " + nume/deno);

            System.out.println("despois da division");

        }catch(ArithmeticException e){
            System.out.println("erro1 " + e.toString());
        }
        finally{
            System.out.println("dentro do finally");
        }
    }

    public void dividirPropagandoExcepcion(int nume, int deno)throws ArithmeticException{
        System.out.println(" antes de propagar");
        if(deno==0)
            throw new ArithmeticException("no dividir entre cero");
        else
            System.out.println("resultado = " + nume/deno);
    }

    public void dividirNosaExcepcion(int nume, int deno)throws NosaExcepcion{

        System.out.println("antes de propagar a nosa excepcion");
        if(deno==0)
            throw new NosaExcepcion(" non dividir un enteiro entre 0");
        else
            System.out.println("resultado = " + nume/deno);

    }

}
