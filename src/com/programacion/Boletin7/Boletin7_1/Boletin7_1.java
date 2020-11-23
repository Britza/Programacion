package com.programacion.Boletin7.Boletin7_1;

import javax.swing.*;

public class Boletin7_1 {

    public static void main(String[] args) {
        NumeroPositivo obx = new NumeroPositivo();
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        obx.NumeroPositivo(num);

    }
}
