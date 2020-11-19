package com.programacion.ExemploBucles;

import javax.swing.JOptionPane;


public class BucleFor1 {

    public void verCastelao(){

        int elementos =Integer.parseInt(JOptionPane.showInputDialog("cantas iteracions"));


        for(int i=0, j=1; i<elementos; i++, j++){
            System.out.println("CASTELAO");
        }
    }

    public float notaMedia(){

        return ((float)(lerEnteiro("primeira nota") + lerEnteiro("segunda nota") + lerEnteiro("terceira nota"))/3);


    }
    public int lerEnteiro(String mensaxe){
        return Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
    }
}