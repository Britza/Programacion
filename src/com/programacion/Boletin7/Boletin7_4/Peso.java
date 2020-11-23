package com.programacion.Boletin7.Boletin7_4;

import javax.swing.*;

public class Peso {

    public void datosPeso( int p1, int p2, String n1, String n2){
        if(p1>0 || p2>0){

            JOptionPane.showInputDialog("Erroneo");
        }

        else{

            if(p1>p2){

                JOptionPane.showInputDialog(" Pesa máis o peso 1: " + p1 + " A diferenza é: " + (p1-p2));
            }

            else{

                JOptionPane.showInputDialog(" Pesa máis o peso 2: " + p2 + " A diferenza é: " + (p2-p1));
            }
        }
    }
}
