package com.programacion.boletin07.ejercicio5;

import javax.swing.*;

public class Apartado5 {
    public static void main(String[] args) {
        float n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce o primeiro número"));
        float n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce o segundo número"));
        float n3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce o terceiro número"));
        NumeroMaior obx = new NumeroMaior();
        obx.comparar(n1,n2,n3);




    }
}
