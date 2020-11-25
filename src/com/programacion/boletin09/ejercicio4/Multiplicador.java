package com.programacion.boletin09.ejercicio4;

import javax.swing.*;

public class Multiplicador {
    public void tablaMultiplicar() {
        int i,  num , num1 , producto;
        num = Integer.parseInt(JOptionPane.showInputDialog("Para inicializar la tabla prema cualquier \nnúmero distinto de 0, para saír prema 0 :"));
        if (num != 0) {
            do {
                num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número "));
                for (i=0;i<=10;i++) {
                   producto = num1 * i;
                   System.out.println(producto);
               }
            } while( num1 != 0);
            JOptionPane.showMessageDialog(null,"Remate do programa");
        }
        else
            JOptionPane.showMessageDialog(null, "Remate do programa");

    }
}