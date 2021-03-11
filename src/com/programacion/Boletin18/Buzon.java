package com.programacion.Boletin18;

import javax.swing.*;
import java.util.ArrayList;

public class Buzon {

    ArrayList<Correos> buzon = new ArrayList<>();


    public int numeroCorreos() {
        int ncorreos = 0;
        for (int i = 0; i < buzon.size(); i++) {
            ncorreos++;
        }
        return ncorreos;
    }

    public Correos recibirCorreo() {
        String asunto = JOptionPane.showInputDialog("Asunto :");
        String contido = JOptionPane.showInputDialog("");
        boolean id = false;
        return new Correos(asunto, contido, false);

    }

    public void engadir() {
        Correos c = recibirCorreo();
        buzon.add(c);
    }

    public boolean porLer() {
        int correosPorLer = 0;
        for (Correos ele : buzon) {
            if (!ele.getId()) {
                correosPorLer++;
            }
        }
        if (correosPorLer > 1) {
            System.out.println("Hai " + correosPorLer + " correos por ler");
            return false;
        } else if (correosPorLer == 1) {
            System.out.println("Hai un correo por ler no buzón");
            return false;
        } else
            System.out.println("Non hai correos por ler");
        return true;
    }


    public String amosarPrimeiroNoLeido() {
        String correo=null;
        for (Correos ele : buzon) {
            if (!ele.getId()) {
                correo= ele.getAsunto()+"\n"+ele.getContido();
                ele.setId(true);
                break;
            }
            else {
                correo = "Non hai correos por ler";
            }
        }
        return correo;
    }



    public void amosar(int k) {
        boolean atopado = false;
        for (int i = 0; i < buzon.size(); i++) {
            if (i == k) {
                atopado = true;
                System.out.println("Asunto : " + buzon.get(k).getAsunto() + "\n" + buzon.get(k).getContido());
                buzon.get(k).setId(true);
            }
            if (atopado = false) {
                System.out.println("O correo non existe");
            }
        }
    }


    public void mostrar() {
        if (buzon.isEmpty()) {
            System.out.println("No hai correos no buzón");
        }
        else
            for (Correos ele : buzon) {
                System.out.println("Asunto : " + ele.getAsunto() + "\n" + ele.getContido());
            }

    }

    public void eliminar(int k) {
        try {
            buzon.remove(k);
            System.out.println("O correo ha sido eliminado");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No existe o correo");
        }
    }




}
