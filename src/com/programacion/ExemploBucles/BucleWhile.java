package com.programacion.ExemploBucles;

import javax.swing.JOptionPane;

/*Ler e visualizar sucesivamente numeros dende o telcado.
O proceso remata cando se lea un cero
 */

public class BucleWhile {
    public void verNumeroWhile(){
        int numero;
        numero=lerEnteiro();
        while(numero !=0){
            System.out.println(numero);
            numero= lerEnteiro();
        }
        System.out.println("saimos do bucle");
    }

    public int lerEnteiro(){
        return Integer.parseInt(JOptionPane.showInputDialog("teclea numero"));
    }
}
