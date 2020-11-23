package com.programacion.Boletin7.Boletin7_2;

import javax.swing.*;

public class Boletin7_2 {

    public static void main(String[] args) {
        NumerosShort obx = new NumerosShort();
        Short num1 = Short.parseShort(JOptionPane.showInputDialog("Introduce o primeiro numero: "));
        Short num2 = Short.parseShort(JOptionPane.showInputDialog("Introduce o segundo numero: "));
        obx.comparaNumeros(num1, num2);

    }
}
