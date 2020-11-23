package com.programacion.Boletin9.Boletin9_1;

import javax.swing.*;

public class PedirNumeros {

    public void numerosIntroducidos(){
        int numero, cero=0, positivo=0, negativo=0;
        int i;

        for(i=0; i<10; i++){
            numero= Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));

            if (numero>=0)
                if (numero==0)
                    cero = cero +1;

                else
                    positivo= positivo +1;

            else
                negativo = negativo +1;

        }
        JOptionPane.showInputDialog("numero de negativos: " + negativo + "numero de positivos: " + positivo + "numero de ceros: " + cero);


    }
}
