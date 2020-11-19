package com.programacion.ExemploBucles;

import javax.swing.JOptionPane;

//Calcular la nota media de 3 notas de 4 alumnos.

public class BucleFor {

    public void verCastelao(){

        int elementos =Integer.parseInt(JOptionPane.showInputDialog("cantas iteracions"));


        for(int i=0, j=1; i<elementos; i++, j++){
            System.out.println("CASTELAO");
        }
    }

    public float notaMedia(){

        int not1=lerEnteiro("primeira nota");
        int not2=lerEnteiro("segunda nota");
        int not3=lerEnteiro("terceira nota");
        float media= (float)(not1 + not2 + not3)/3;
        return media;

    }
    public int lerEnteiro(String mensaxe){
        return Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
    }
}
