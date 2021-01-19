package com.programacion.Boletin12;

import javax.swing.*;

public class Garaxe {

    private int numeroCoches;
    private float tempo;
    private Coche coche;

    public static final int NumeroMaximoCoches=5;


    public float getTempo() {
        return tempo;
    }

    public void setTempo(float tempo) {
        this.tempo = tempo;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public Garaxe(Coche coche){

    }

    public void comprobarPlazas(Coche coche){
        if(numeroCoches < NumeroMaximoCoches){
            System.out.println("Plaza disponibles " + (NumeroMaximoCoches-numeroCoches));
            numeroCoches++;
        }
        else{
            System.out.println("Completo");
        }

        public float calcularPrezo(){
            float prezo;
            tempo=Float.parseFloat(JOptionPane.showInputDialog("tempo de estacionamento"));
            if(tempo<=3){
                prezo=(float)(1.5*tempo);
            }
            else
                prezo=(float)((tempo-3)*0.20+4.5);

            return prezo;

        }

        public float cartosRecibidos(){
            float cartosRecibidos= Float.parseFloat(JOptionPane.showInputDialog("Introduzca os cartos"));
            return cartosRecibidos;
        }

        public void factura(){
            System.out.println("Matricula " + coche.toString() + "\nTempo " + getTempo() + "\nPrezo " + calcularPrezo() + "\nCartos recibidos " + cartosRecibidos() + "\Cartos devoltos " + (cartosRecibidos()-cacularPrezo()) + "\nGacias por usar o noso aparcadoiro ");
        }


    }
