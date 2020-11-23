package com.programacion.Boletin7.Boletin7_3;

import javax.swing.*;

public class Simbolos {

    public void simbolos(int num){

        if(num==0){
            JOptionPane.showInputDialog(" 0 ");
        }

        if(num>0){
            JOptionPane.showInputDialog(" + ");
        }
        else{
            JOptionPane.showInputDialog(" - ");
        }
    }
}
