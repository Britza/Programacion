package com.programacion.Boletin20.com.bri.componentes;

import javax.swing.*;
import java.awt.*;

public class componentes {

    JFrame marco;
    JPanel panel1,panel2,panel3 ;
    JButton bLimpar,bEscribe,bBoton;
    JLabel etiNom, etiPass;
    JTextField lTextNome, lTextPass;
    JTextArea aTextCopiar, aTextList;

    public void iniciar(){

        //instanciamos os compoñentes

        marco = new JFrame(" Boletin 20 ");
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 =new JPanel();
        bLimpar = new JButton("LIMPAR");
        bBoton = new JButton("BOTON");
        bEscribe = new JButton("PREMER");
        lTextNome = new JTextField();
        lTextPass = new JTextField();
        aTextList = new JTextArea();
        etiNom = new JLabel(" NOME ");
        etiPass = new JLabel(" PASSWORD ");
        aTextCopiar = new JTextArea();

        //damoslle as caracteristicas a os componentes

        marco.setSize(800, 600);
        panel1.setBounds(50, 10, 800, 470);
        panel2.setBounds(50, 500, 800, 470);
        panel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel1.setLayout(null);//anulamos o layout do panel
        panel2.setLayout(null);


        aTextList.setText("ElementoLista1 \nElementoLista2 \nElementoLista3");
        bLimpar.setBounds(500, 400, 100, 50);
        bEscribe.setBounds(200, 400, 100, 50);
        bBoton.setBounds(350, 100, 100, 50);
        lTextNome.setBounds(200, 100, 400, 100);
        lTextPass.setBounds(200, 250, 400, 100);
        aTextList.setBounds(100, 50, 200, 300);


        aTextList.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        aTextCopiar.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        aTextCopiar.setBackground(Color.pink);
        aTextCopiar.setBounds(500, 50, 200, 300);
        etiNom.setBounds(50, 100, 50, 100);
        etiPass.setBounds(50, 250, 100, 100);

        //engadimos compoñentes

        panel1.add(etiNom);
        panel1.add(etiPass);
        panel1.add(lTextNome);
        panel1.add(lTextPass);
        panel1.add(bEscribe);
        panel1.add(bLimpar);
        panel2.add(aTextCopiar);
        panel2.add(bBoton);
        panel2.add(aTextList);


        marco.add(panel1);
        marco.add(panel2);
        marco.add(panel3);

        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);




    }
}
