package com.programacion.ExemploBucles;

import javax.swing.JOptionPane;


public class BucleDoWhile {
    public void verNumeroDoWhile(){

        int numero;
        do{
            numero=lerEnteiro("teclea numero");
            if(numero !=0)

                System.out.println(numero);

        } while(numero !=0);

        System.out.println("saimos do do while");
    }




    public int lerEnteiro(String mensaxe){
        return Integer.parseInt(JOptionPane.showInputDialog(mensaxe));


    }
}

