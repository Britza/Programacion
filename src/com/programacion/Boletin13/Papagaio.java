package com.programacion.Boletin13;

public class Papagaio extends Aves implements IPodeVolar {

    @Override
    public void podenVoar() {
        System.out.println("Os papagaios poden voar");
    }
}
