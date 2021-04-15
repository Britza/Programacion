package com.programacion.Boletin19.com.bri.componentes;

import java.awt.Color;
import javax.swing.*;

public class Componentes {

    JFrame marco;
    JPanel panel;
    JButton bLimpar,bEscribe;
    JLabel etiNom, etiPass;
    JTextField lTextNome, lTextPass;
    JTextArea aTextCopiar;

    public void iniciar(){

        //instanciamos os compoñentes

        marco = new JFrame(" Boletin 19 ");
        panel = new JPanel();
        bLimpar = new JButton("LIMPAR");
        bEscribe = new JButton();
        lTextNome = new JTextField();
        lTextPass = new JTextField();
        etiNom = new JLabel(" NOME ");
        etiPass = new JLabel(" PASSWORD ");
        aTextCopiar = new JTextArea();

        //damoslle as caracteristicas a os componentes

        marco.setSize(800, 600);
        panel.setSize(750, 750);
        panel.setLayout(null);//anulamos o layout do panel

        // bLimpar.setBackground(Color.red);
        bLimpar.setBounds(500, 600, 100, 50);
        bEscribe.setBounds(200,600,100,50);
        bEscribe.setText("PREMER");
        bEscribe.setToolTipText("texto");
        lTextNome.setBounds(200, 100, 400, 100);
        lTextPass.setBounds(200, 250, 400, 100);



        aTextCopiar.setBounds(100,400,500,150);
        aTextCopiar.setBackground(Color.pink);
        etiNom.setBounds(50,100,50,100);
        etiPass.setBounds(50, 250, 100, 100);

        //engdimos compoñentes

        panel.add(etiNom);
        panel.add(etiPass);
        panel.add(lTextNome);
        panel.add(lTextPass);
        panel.add(aTextCopiar);
        panel.add(bEscribe);
        panel.add(bLimpar);


        marco.add(panel);

        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);




    }
}
