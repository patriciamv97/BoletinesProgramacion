package com.programacion.boletin07;

import javax.swing.*;

public class Apartado1 {
    public static void main(String[] args) {
        NumeroPositivo obx = new NumeroPositivo();
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce o numero"));
        obx.numeroPositivo(num);



    }
}
