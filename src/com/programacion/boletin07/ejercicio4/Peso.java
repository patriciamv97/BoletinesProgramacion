package com.programacion.boletin07.ejercicio4;

import javax.swing.*;

public class Peso {
    public void seguimentoPeso (int p1,int p2,String n1,String n2){
        if (p1<= 0 || p2<=0)
            JOptionPane.showMessageDialog(null,"peso erroneo");
        else
           if (p1>p2)
            JOptionPane.showMessageDialog(null,n1 + " pesa máis e o seu peso é "+p1 + ";\na diferenza de pesos é " +(p1-p2) );
          else
            JOptionPane.showMessageDialog(null,n2 + " pesa máis e o seu peso é "+p2 + ";\na diferenza de pesos é " +(p2-p1) );
    }
}
