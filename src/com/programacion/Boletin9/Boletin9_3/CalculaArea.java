package com.programacion.Boletin9.Boletin9_3;

import javax.swing.*;

public class CalculaArea {
    public int validar(String mensaje){
        int dato;
        do{
            dato = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        } while (dato<=0);
        return dato;
    }

    public int calcularArea(){
        int base= validar("Introduce base: ");
        int altura = validar("Introduce altura: ");
        return Integer.parseInt(JOptionPane.showInputDialog("El area es: " + (base*altura)));
    }
}
