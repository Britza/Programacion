package com.programacion.Boletin9.Boletin9_4;

import javax.swing.*;

public class Boletin9_4 {
    public static void main(String[] args) {
        TaboaMultiplicar obx = new TaboaMultiplicar();
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
        obx.taboa(n1);

    }
}
