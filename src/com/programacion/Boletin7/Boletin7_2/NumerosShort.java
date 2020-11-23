package com.programacion.Boletin7.Boletin7_2;

import javax.swing.*;

public class NumerosShort {

    public void comparaNumeros( short num1, short num2){
        if(num1>=num2){
            JOptionPane.showInputDialog("A resta é: " + (num1-num2));
        }

        else{
            JOptionPane.showInputDialog("A suma é: " + (num1+num2));

        }
    }

}
