package com.programacion.Boletin7.Boletin7_5;

import javax.swing.*;

public class NumeroMaior {
    public void numeroMaior(int n1, int n2, int n3){

        if(n1>n2 && n2>n3){

            JOptionPane.showInputDialog( n1 + " É maior");

        }

        else{

            if(n2>n3 && n3>n1){
                JOptionPane.showInputDialog(n2 + " É maior");
            }
            else{
                JOptionPane.showInputDialog(n3 + " É maior");
            }
        }

    }
}
