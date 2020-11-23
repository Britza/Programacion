package com.programacion.Boletin7.Boletin7_5;

import javax.swing.*;

public class Boletin7_5 {
    public static void main(String[] args) {
        NumeroMaior obx = new NumeroMaior();
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce o primer numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce o segundo numero: "));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce o tercer numero: "));
        obx.numeroMaior(n1, n2, n3);

    }
}
