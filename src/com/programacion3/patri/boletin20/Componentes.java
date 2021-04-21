package com.programacion3.patri.boletin20;

import javax.swing.*;
import java.awt.*;

public class Componentes {

    JFrame marco;
    JPanel panel;
    JPanel panel1;
    JPanel panel2;
    JButton bLimpar, bEscribe, boton;
    JLabel etiqueta, etiqueta2;
    JTextField LtextoNome,LtextoContrasenha;
    JTextArea aTexCopia,elementos;

    public void iniciar() {

        //Instanciamos as compoñentes
        marco = new JFrame("MARCO CON COMPOÑENTES");
        panel = new JPanel();
        panel1=new JPanel();
        panel2=new JPanel();
        bLimpar = new JButton("LIMPAR");
        bEscribe = new JButton();
        boton=new JButton("BOTON");
        LtextoNome = new JTextField();
        LtextoContrasenha = new JTextField();
        elementos=new JTextArea();
        aTexCopia = new JTextArea(" Area de Texto.");
        etiqueta = new JLabel("Nome :");
        etiqueta2 = new JLabel("Contraseña :");

        //Distribucion paneles
        marco.setSize(800, 800);
        panel.setBounds(40,35,700,400);
        panel2.setBounds(40,20,700,400);
       // panel1.setSize(800,200);
        panel.setLayout(null); //Anulamos la distrubucion de los componentes por defecto del panel
        panel1.setLayout(null);
        panel2.setLayout(null);
        panel.setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.black));
        panel2.setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.red));




        //Damoslle as caracteristicas das compoñentes


        bLimpar.setBackground(Color.cyan);
        bLimpar.setBounds(450, 300, 150, 50);
        bEscribe.setBounds(200, 300, 150, 50);
        bEscribe.setText("PREMER");
        bEscribe.setToolTipText("copia o que temos na liña de texto na area do texto ");
        boton.setBounds(350,550,100,50);
        LtextoNome.setBounds(300, 100, 300, 50);
        LtextoContrasenha.setBounds(300, 200, 300, 50);
        aTexCopia.setBounds(500, 500, 200, 200);
       //elementos.setBounds();
        etiqueta.setBounds(100, 45, 100, 150);
        etiqueta2.setBounds(100, 145, 100, 150);



        //engadimos compoñentes

        panel.add(etiqueta);
        panel.add(etiqueta2);
        panel.add(LtextoNome);
        panel.add(LtextoContrasenha);
        panel.add(bEscribe);
        panel.add(bLimpar);
        panel1.add(aTexCopia);
        panel1.add(boton);
        marco.add(panel);
        marco.add(panel1);
        marco.add(panel2);
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);


    }
}
