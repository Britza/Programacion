package com.programacion.ExemploValidacion;

import javax.swing.*;

public class Validacion {

    public float validarDato(){
        float dato;
        do{
            dato = Float.parseFloat(JOptionPane.showInputDialog("Teclea valor positivo >=0"));
        } while (dato<=0);
        return dato;
    }

    public float validaWhile(){
        float dato2;
        dato2 = Float.parseFloat(JOptionPane.showInputDialog("Teclea valor positivo >=0"));
        while(dato2<=0){
            dato2 = Float.parseFloat(JOptionPane.showInputDialog("Teclea valor positivo >=0"));
        }
        return dato2;

    }
}
