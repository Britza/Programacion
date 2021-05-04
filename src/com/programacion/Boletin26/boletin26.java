package com.programacion.Boletin26;

import com.programacion.Boletin26.com.bri.clases.Entrenador;
import com.programacion.Boletin26.com.bri.clases.Futbolista;
import com.programacion.Boletin26.com.bri.clases.Masajista;

import java.util.ArrayList;

public class boletin26 {

    public static void main(String[] args) {

        ArrayList<Seleccion> listaxogador = new ArrayList<>();

        Seleccion obxFut = new Futbolista(10,2343,"Pepe","Lovov",27);
        Seleccion obxEnt = new Entrenador(21543,54231,"Manuel","Castillo",43);
        Seleccion obxMas = new Masajista("profesional",5,3456,"Sen","Shoyo",30);

        listaxogador.add(obxFut);
        listaxogador.add(obxEnt);
        listaxogador.add(obxMas);

        Metodos.visualizar(listaxogador);

    }
}
