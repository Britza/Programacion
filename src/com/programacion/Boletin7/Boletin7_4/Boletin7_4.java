package com.programacion.Boletin7.Boletin7_4;

import javax.swing.*;

public class Boletin7_4 {

    public static void main(String[] args) {

        Peso obx = new Peso();
        String n1 = JOptionPane.showInputDialog("Introduce o peso da primeira persoa: ");
        int p1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce o peso da primeira persoa: "));
        String n2 = JOptionPane.showInputDialog("Introduce o peso da primeira persoa: ");
        int p2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce o peso da primeira persoa: "));
        obx.datosPeso(p1, p2, n1, n2);

    }
}
