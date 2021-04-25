package com.programacion3.boletin20.patri;

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
        elementos=new JTextArea("Elemento 1 \nElemento 2\nElemento 3");
        aTexCopia = new JTextArea(" Area de Texto.");
        etiqueta = new JLabel("Nome :");
        etiqueta2 = new JLabel("Contraseña :");

        //Distribucion paneles
        marco.setSize(800, 800);
        panel.setBounds(40,25,700,400);
        panel1.setBounds(40,450,700,400);
        panel.setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.black));
        panel1.setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.black));
        panel.setLayout(null); //Anulamos la distrubucion de los componentes por defecto del panel
        panel1.setLayout(null);



        //Damoslle as caracteristicas das compoñentes


        bLimpar.setBackground(Color.cyan);
        bLimpar.setBounds(450, 300, 150, 50);
        bEscribe.setBounds(200, 300, 150, 50);
        bEscribe.setText("PREMER");
        bEscribe.setToolTipText("copia o que temos na liña de texto na area do texto ");
        boton.setBounds(290,150,100,50);
        LtextoNome.setBounds(300, 100, 300, 50);
        LtextoContrasenha.setBounds(300, 200, 300, 50);
        aTexCopia.setBounds(450, 50, 200, 200);
        aTexCopia.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        elementos.setBounds(40,50,200,200);
        elementos.setBorder(BorderFactory.createLineBorder(Color.BLACK));
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
        panel1.add(elementos);
        marco.add(panel);
        marco.add(panel1);
        marco.add(panel2);
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);


    }
}
