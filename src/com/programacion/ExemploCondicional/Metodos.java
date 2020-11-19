package com.programacion.ExemploCondicional;

import javax.swing.JOptionPane;


public class Metodos {

    public int pedirInt(){

        String resposta = JOptionPane.showInputDialog(" teclea edade");
        int valor= Integer.parseInt(resposta);
        return valor;
    }

    public int pedirInt2(){
        int valor = Integer.parseInt(JOptionPane.showInputDialog(" edade: "));
        return valor;
        /*tamen
        return Integer.paserInt(JOptionPane.showInputDialog(" edade: " ));
        */
    }

    public float pedirFLoat(){

        return Float.parseFloat(JOptionPane.showInputDialog(" teclea peso: "));
    }

    public String pedirString(){
        return JOptionPane.showInputDialog(" teclea nome: ");
    }

}
