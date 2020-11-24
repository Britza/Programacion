package com.programacion.Boletin9.Boletin9_2;

public class CalculaSEP {
    public void operacionSuma(){
        int suma=0;
        for(int i=10; i<90; i++){
            suma=suma+i;
            System.out.println( "A suma dos numeros é: " + suma);

        }
    }
    public void operacionProducto(){
        double producto=1;
        for(int i=10; i<90; i++){
            producto= producto*i;
            System.out.println( "O producto dos numeros é: " + producto);
        }
    }
}
