package com.programacion.Boletin9.Boletin9_5;

import javax.swing.*;

public class Soldo {
    public void soldoTraballadores(){
        String nome;
        float soldo=0;
        int numeroTraballadores=0, intervalo=0, porcentaxe=0,;

        do{
            for(int i=1000; i<=1750; i++){
                numeroTraballadores = Integer.parseInt(JOptionPane.showInputDialog("Introduce o numero de traballadores"));
                nome = JOptionPane.showInputDialog("Introduce o nome");
                soldo = Float.parseFloat(JOptionPane.showInputDialog("Introduce o soldo"));
            }

        } while(soldo!=);


    }

}
