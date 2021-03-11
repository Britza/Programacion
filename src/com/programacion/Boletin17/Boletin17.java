package com.programacion.Boletin17;

import javax.swing.*;
import java.util.ArrayList;

public class Boletin17 {

    public static void main(String[] args) {

        ArrayList <Libreria> lista= new ArrayList<Libreria>();
        String opcion;
        do{
            opcion= JOptionPane.showInputDialog(" *** MENU *** \n1--> ENGADIR \n2--> AMOSAR \n3-->VENDER \n4-->BAIXA \n5-->CONSULTAR \n6-->SAIR ");
            switch(opcion){
                case "1":Metodos.engadir(lista);
                    break;
                case "2":Metodos.amosar(lista);
                    break;
                case "3":Metodos.vender(lista);
                    break;
                case "4":Metodos.darBaixa(lista);
                    break;
                case "5":Metodos.Consultar(lista);
                    break;
                case "6": System.exit(0);
                    break;
            }
        }while(!opcion.equalsIgnoreCase("0"));
    }

}
