package com.programacion3.boletin19.patri;

import javax.swing.*;
import java.awt.*;

public class Componentes {

    JFrame marco;
    JPanel panel;
    JButton bLimpar, bEscribe;
    JLabel etiqueta;
    JLabel etiqueta2;
    JTextField LtextoNome;
    JTextField LtextoContrasenha;
    JTextArea aTexCopia;

    public void iniciar() {

        //Instanciamos as compoñentes
        marco = new JFrame("MARCO CON COMPOÑENTES");
        panel = new JPanel();
        bLimpar = new JButton("LIMPAR");
        bEscribe = new JButton();
        LtextoNome = new JTextField();
        LtextoContrasenha = new JTextField();
        aTexCopia = new JTextArea(" Area de Texto.");
        etiqueta = new JLabel("Nome :");
        etiqueta2 = new JLabel("Contraseña :");

        //Damoslle as caracteristicas das compoñentes

        marco.setSize(800, 800);
        panel.setSize(750, 750);
        panel.setLayout(null); //Anulamos la distrubucion de los componentes por defecto del panel
        bLimpar.setBackground(Color.cyan);
        bLimpar.setBounds(500, 600, 100, 50);
        bEscribe.setBounds(200, 600, 100, 50);
        bEscribe.setText("PREMER");
        bEscribe.setToolTipText("copia o que temos na liña de texto na area do texto ");
        LtextoNome.setBounds(300, 100, 300, 50);
        LtextoContrasenha.setBounds(300, 200, 300, 50);
        aTexCopia.setBounds(100, 300, 500, 200);
        etiqueta.setBounds(100, 45, 100, 150);
        etiqueta2.setBounds(100, 145, 100, 150);


        //engadimos compoñentes

        panel.add(etiqueta);
        panel.add(etiqueta2);
        panel.add(LtextoNome);
        panel.add(LtextoContrasenha);
        panel.add(aTexCopia);
        panel.add(bEscribe);
        panel.add(bLimpar);
        marco.add(panel);
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);


    }
}
