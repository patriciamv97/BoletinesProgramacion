package com.programacion.boletin07.ejercicio2;

import javax.swing.*;

public class Apartado2 {
    public static void main(String[] args) {
        NumerosShort obx = new NumerosShort();
        short n1 = Short.parseShort(JOptionPane.showInputDialog("Introduce o primeiro número"));
        short n2 =  Short.parseShort(JOptionPane.showInputDialog("Introduce o segundo número"));
        obx.comparaNumeros(n1,n2);


    }
}
