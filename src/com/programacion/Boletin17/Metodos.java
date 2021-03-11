package com.programacion.Boletin17;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Metodos {

    public static void engadir(ArrayList<Libreria> listLib){
        Libreria ele = pedirLibros("Engadir libros: ");
        listLib.add(ele);
    }

    public static Libreria pedirLibros(String mensaxe){
        String titulo= JOptionPane.showInputDialog("titulo: ");
        String autor= JOptionPane.showInputDialog("autor: ");
        String ISBN= JOptionPane.showInputDialog("ISBN: ");
        float prezo= Float.parseFloat(JOptionPane.showInputDialog("prezo: "));
        int numUni= Integer.parseInt(JOptionPane.showInputDialog("numero de unidades: "));

        Libreria li= new Libreria(titulo, autor, ISBN, prezo, numUni);
        return li;
    }

    public static void amosar(ArrayList<Libreria> listLib){
        for(int i=0; i<listLib.size();i++){
            System.out.println(listLib.get(i));
        }

    }


    public static void vender(ArrayList<Libreria> listLib){
        boolean atopado= false;
        String ISBN = JOptionPane.showInputDialog("ISBN: ");
        Iterator it = listLib.iterator();
        while(it.hasNext()){
            Libreria li=(Libreria)it.next();
            int unidades=0;
            if(li.getISBN().equalsIgnoreCase(ISBN)){
                unidades --;
                System.out.println("Unidades que quedan: " + unidades);
                atopado=true;
            }

        }if(atopado==false)
            System.out.println("Xa esta vendido");
    }

    public static void darBaixa(ArrayList<Libreria> listLib){
        int numUni=Integer.parseInt(JOptionPane.showInputDialog("numero de unidades: "));
        Iterator it=listLib.iterator();
        while(it.hasNext()){
            Libreria li=(Libreria)it.next();
            if(li.getNumUni()==0){
                it.remove();
            }
        }

    }

    public static void Consultar(ArrayList<Libreria> listLib){
        boolean atopado=false;
        String ISBN=JOptionPane.showInputDialog("ISBN: ");
        for(int i=0; i<listLib.size();i++){
            if(ISBN.equalsIgnoreCase(listLib.get(i).getISBN())){
                JOptionPane.showMessageDialog(null, "titulo: " + listLib.get(i).getTitulo() + " autor: " + listLib.get(i).getAutor() + " ISBN: " + listLib.get(i).getISBN() + "prezo: " + listLib.get(i).getPrezo() + " numero de unidades: " + listLib.get(i).getNumUni());
                atopado=true;
            }
        }
        if(!atopado)
            System.out.println("No se atopa o libro");
    }

}
