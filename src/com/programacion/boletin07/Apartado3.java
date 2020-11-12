package com.programacion.boletin07;

import javax.swing.*;

public class Apartado3 {
    public static void main(String[] args) {
        Simbolos obx = new Simbolos();
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número enteiro"));
        obx.simbolos(num);

    }
}
