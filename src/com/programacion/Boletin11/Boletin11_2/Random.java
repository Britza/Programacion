package com.programacion.Boletin11.Boletin11_2;

import javax.swing.*;

public class Random {


    private int num;


    public Random() {

    }


    public void numeroAleatorio() {
        num = (int) (Math.random() * 50 + 1);
        //System.out.println(num); Para comprobaciones


    }

    public void xogo() {
        int intentos = 1, n2;
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Numero de intentos"));
        int n = Integer.parseInt(JOptionPane.showInputDialog("¿cal é o numero ?"));
        int dis = Math.abs(num-n);
        if (n == num)
            JOptionPane.showMessageDialog(null, "Ben xogado");
        else {
            if (dis > 20)
                JOptionPane.showMessageDialog(null, "moi lonxe ");
            else if (dis>= 10 && dis <= 20)
                JOptionPane.showMessageDialog(null, "lonxe ");
            else if (dis > 5 && dis< 10)
                JOptionPane.showMessageDialog(null, "preto ");
            else if (dis<= 5 && dis != 0)
                JOptionPane.showMessageDialog(null, "moi preto ");
            do {
                n2 = Integer.parseInt(JOptionPane.showInputDialog("¿Cal é o número?"));
                int dis1= Math.abs(num-n2);
                intentos++;
                if (dis1 > 20)
                    JOptionPane.showMessageDialog(null, "moi lonxe ");
                else if (dis1 >= 10 && dis1<= 20)
                    JOptionPane.showMessageDialog(null, "lonxe ");
                else if (dis1 > 5 && dis1 < 10)
                    JOptionPane.showMessageDialog(null, "preto ");
                else if (dis1<= 5 && dis1!= 0)
                    JOptionPane.showMessageDialog(null, "moi preto ");

            } while (num != n2 && intentos < cantidad);

            if (num == n2)
                JOptionPane.showMessageDialog(null, "Noraboa");
            else
                JOptionPane.showMessageDialog(null, "Ben xogado, otra vez será");
        }

    }
}
