package com.programacion.Boletin26;

import java.util.ArrayList;

public interface Metodos {

    public void concentrarse();

    public void viajar();

    public void entrenar();

    public void jugarPartido();

    public static void visualizar(ArrayList<Seleccion> lista){
        for(Seleccion ele:lista)
            ele.toString();
    }
}
