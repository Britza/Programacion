package com.programacion.ExemploBucles;

import javax.swing.JOptionPane;

public class ExemploBucles {

    public static void main(String[] args) {
           /*BucleWhile obxWhile = new BucleWhile();
        obxWhile.verNumeroWhile();*/

        /*BucleDoWhile obxDoWhile = new BucleDoWhile();
        obxDoWhile.verNumeroDoWhile();*/


        BucleFor obxFor = new BucleFor();
        //obxFor.verCastelao();
        int elementos = Integer.parseInt(JOptionPane.showInputDialog("cantas alumnos"));

        /*for(int i= 0; i<elementos; i++){
        float res= obxFor.notaMedia();
                System.out.println("nota media=" + res);*/

        for(int i= 0; i<elementos; i++){
            System.out.println("nota media=" + obxFor.notaMedia());

        }

    }
}
