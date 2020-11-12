package com.programacion.boletin07.ejercicio4;

import javax.swing.*;

public class Apartado4 {
    public static void main(String[] args) {
        String n1 = JOptionPane.showInputDialog("Introduce o nome da primeira persoa ");
        int p1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce o peso da primeria persoa"));
        String n2 = JOptionPane.showInputDialog("Introduce o nome da segunda persoa");
        int p2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce o peso da segunda persoa"));
        Peso obx = new Peso();
        obx.seguimentoPeso(p1,p2,n1,n2);


    }
}
