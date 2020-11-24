package com.programacion.Boletin9.Boletin9_4;

import javax.swing.*;

public class TaboaMultiplicar {
    public int taboa(int n1){

        int producto;
        int dato;

        for(int i=0; i<=10; i++){
            producto=n1*i;
            System.out.println("A taboa é: " + producto);}
        do{

            dato = Integer.parseInt(JOptionPane.showInputDialog("Prema cero para rematar o programa"));
        } while (dato!=0);
        return dato;
    }
}
