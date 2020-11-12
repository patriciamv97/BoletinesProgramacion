package com.programacion.boletin07.ejercicio2;

import javax.swing.*;

public class NumerosShort {
    public void comparaNumeros (short n1 , short n2){
        if (n1>n2)
            JOptionPane.showMessageDialog(null,"A resta é "+ (n1- n2) + "\nA suma é "+(n1+n2));
        else
            JOptionPane.showMessageDialog(null,"A suma é "+(n1+n2));
    }
}
