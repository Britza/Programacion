package com.programacion.Boletin4;

import java.util.Scanner;

public class Boletin4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Pedir datos por pantalla
        System.out.println("Introduce los siguientes datos");
        System.out.println("O autor é : ");
        String autor =sc.nextLine();
        System.out.println("O titulo é : ");
        String titulo =sc.nextLine();
        System.out.println("O ano é : ");
        int ano = sc.nextInt();
        System.out.println("O numero de Paxinas é : ");
        short numPaginas = sc.nextShort();
        System.out.println("A valoración é : ");
        float valoracion= sc.nextFloat ();
        System.out.println("O titulo é " +titulo+ "\no  autor é "+autor+"\nO ano é "+ano+"\nO numero de páginas é "+numPaginas+"\nA valoración é "+valoracion);
        //Dar Datos
        Libro obxLibro = new Libro();
        obxLibro.setAutor("pepe");
        obxLibro.setAno(1994);
        obxLibro.setTitulo("Pepe Jose");
        obxLibro.setValoracion((float) 3.2);
        obxLibro.setNumPaginas(numPaginas);
        obxLibro.amosar();
        //constructor por defecto
        Libro obxLibro1 = new Libro();
        obxLibro1.amosar(); // A saida va dar null e 0 por que nun constructor por defecto as variables estan inicilizadas a 0 e null
        //constructor con datos
        /*Libro obxLibro = new Libro("Manolito Gafotas","pepe jose",1994,(short)230, (float) 5.2);
        obxLibro.amosar();*/

    }
}
