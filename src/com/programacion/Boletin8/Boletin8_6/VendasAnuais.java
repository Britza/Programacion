package com.programacion.Boletin8.Boletin8_6;

import javax.swing.*;

public class VendasAnuais {

    public void clasificar (String nomeArtigo , float totalVendas){
        if (totalVendas<=100)
            JOptionPane.showInputDialog(" o consumo de "+nomeArtigo+" é baixo.");
        else
        if (totalVendas>100 & totalVendas<=500)
            JOptionPane.showInputDialog("O consumo de "+nomeArtigo+" é medio.");
        else
        if (totalVendas>500 & totalVendas<=1000)
            JOptionPane.showInputDialog("O consumo de "+nomeArtigo+" é alto.");
        else
            JOptionPane.showInputDialog(nomeArtigo+" é de primeira necesidade.");

    }
}
