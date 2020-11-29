package com.programacion.Boletin9.Boletin9_5;

import javax.swing.*;

public class Soldo {

    public void soldoTraballadores(){
        private int numero_soldos_sup=0;
        private int numero_soldos_inf=0;
        private float porcentaje_soldos=0;
        int soldo=1;

            for(int i=0; soldo !=0; i++){
                soldo = Integer.parseInt(JOptionPane.showInputDialog("Introduce o soldo"));
            if(soldo>0){
                if(soldo>=1000 && soldo <=1750){
                    numero_soldos_sup++;
                }
                else if(soldo<1000){
                    numero_soldos_inf++;
                }

            }
            else if(soldo<0){
                System.out.println("Non se admiten soldos negativos");
            }
        }
        System.out.println("Numero de soldos superiores: " + numero_soldos_sup);
           i--;
            porcentaje_soldos=numero_soldos_inf/(float)i * 100;
        System.out.println("Porcentaje de soldos: " + porcentaje_soldos + "%");


    }

}
