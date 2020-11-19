package com.programacion.ExemploBucles;

import javax.swing.JOptionPane;

/*Ler e visualizar sucesivamente numeros dende o telcado.
O proceso remata cando se lea un cero
 */

public class BucleWhile1 {

    public void verNumeroWhile(){
        int numero;
        numero=lerEnteiro("teclea numero !=0");
        while(numero !=0){
            System.out.println(numero);
            numero= lerEnteiro("teclea numero !=0");
        }
        System.out.println("saimos do bucle");
    }

    public int lerEnteiro(String mensaxe){
        return Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
    }
}
