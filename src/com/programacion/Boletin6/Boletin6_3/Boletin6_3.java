package com.programacion.Boletin6.Boletin6_3;

public class Boletin6_3 {
    //Scanner sc = new Scanner(System.in);
    Circulo obxC= new Circulo();
       obxC.calcularArea();
       obxC.calcularLonxitude();

    Circulo obxC2 = new Circulo(3);
       System.out.println("O area é: " + obxC2.calcularArea());
       System.out.println("A lonxitude da circunferencia é: " + obxC2.calcularLonxitude());
}
}
