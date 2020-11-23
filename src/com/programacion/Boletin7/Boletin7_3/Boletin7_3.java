package com.programacion.Boletin7.Boletin7_3;

import javax.swing.*;

public class Boletin7_3 {

    public static void main(String[] args) {
        Simbolos obx = new Simbolos();
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce o numero: "));
        obx.simbolos(num);
    }
}
