package com.programacion.Boletin14;

import javax.swing.*;

public class Boletin14 {

    public static void main(String[] args) {

        ConversorTemperaturas obxCT = new ConversorTemperaturas();
        float centrigrados = Float.parseFloat(JOptionPane.showInputDialog("introduce o valor de la tempertatura"));

        try {

            System.out.println("A temperatura en grados fharenheit: " + obxCT.fharenheit(centrigrados) + "A temperatura en grados reamur: " + obxCT.reamur(centrigrados));

    }catch (TemperaturaErradaExcepcion e){
            System.out.println(e.toString());
        }

}


}
