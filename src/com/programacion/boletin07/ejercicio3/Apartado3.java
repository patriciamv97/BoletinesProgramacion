package com.programacion.boletin07.ejercicio3;

import javax.swing.*;

public class Apartado3 {
    public static void main(String[] args) {
        Simbolos obx = new Simbolos();
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número enteiro"));
        obx.simbolos(num);

    }

    public static class Simbolos {
        public void simbolos(int num){
            if  (num == 0)
                JOptionPane.showMessageDialog(null,"0");
            else
                if (num > 0)
                 JOptionPane.showMessageDialog(null,"+");
                else
                JOptionPane.showMessageDialog(null,"-");





        }
    }
}
