package com.programacion.Boletin13;

public class Murcielago extends Mamifero implements IPodeVolar {

    @Override
    public void tipoDientes() {
        super.tipoDientes();

    }

    public void cor(){
        System.out.println("teñen cor negra");
    }

    @Override
    public void podenVoar() {
        System.out.println("Os murcielagos poden voar");
    }
}
