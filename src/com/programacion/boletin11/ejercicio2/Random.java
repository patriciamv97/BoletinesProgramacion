package com.programacion.boletin11.ejercicio2;

import javax.swing.*;

public class Random {
    //Atributos
    private int num;

    //Constructor
    public Random() {

    }
    //Metodos

    public void numeroAleatorio() {
        num = (int) (Math.random() * 50 + 1);
      //  System.out.println(num); Para comprobaciones


    }

    public void xogo() {
        int intentos = 1, n2;
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Numero de intentos"));
        int n = Integer.parseInt(JOptionPane.showInputDialog("¿cal é o numero ?"));
        if (n == num)
            JOptionPane.showMessageDialog(null, "Ben xogado");
        else {
            if (num > n) {
                if (num - n > 20)
                    JOptionPane.showMessageDialog(null, "moi lonxe ");
                else if (num - n >= 10 && num - n <= 20)
                    JOptionPane.showMessageDialog(null, "lonxe ");
                else if (num - n > 5 && num - n < 10)
                    JOptionPane.showMessageDialog(null, "preto ");
                else if (num - n <= 5 && num - n != 0)
                    JOptionPane.showMessageDialog(null, "moi preto ");
            } else if (n - num > 20)
                JOptionPane.showMessageDialog(null, "moi lonxe ");
            else if (n - num >= 10 && n - num <= 20)
                JOptionPane.showMessageDialog(null, "lonxe ");
            else if (n - num > 5 && n - num < 10)
                JOptionPane.showMessageDialog(null, "preto ");
            else if (n - num <= 5 && n - num != 0)
                JOptionPane.showMessageDialog(null, "moi preto ");

            do {
                n2 = Integer.parseInt(JOptionPane.showInputDialog("¿Cal é o número?"));
                intentos++;
                if (num > n2) {
                    if (num - n2 > 20)
                        JOptionPane.showMessageDialog(null, "moi lonxe ");
                    else if (num - n2 >= 10 && num - n2 <= 20)
                        JOptionPane.showMessageDialog(null, "lonxe ");
                    else if (num - n2 > 5 && num - n2 < 10)
                        JOptionPane.showMessageDialog(null, "preto ");
                    else if (num - n2 <= 5 && num - n2 != 0)
                        JOptionPane.showMessageDialog(null, "moi preto ");
                } else if (n2 - num > 20)
                    JOptionPane.showMessageDialog(null, "moi lonxe ");
                else if (n2 - num >= 10 && n2 - num <= 20)
                    JOptionPane.showMessageDialog(null, "lonxe ");
                else if (n2 - num > 5 && n2 - num < 10)
                    JOptionPane.showMessageDialog(null, "preto ");
                else if (n2 - num <= 5 && n2 - num != 0)
                    JOptionPane.showMessageDialog(null, "moi preto ");


            } while (num != n2 && intentos < cantidad);

            if (num == n2)
                JOptionPane.showMessageDialog(null, "Noraboa");
            else
                JOptionPane.showMessageDialog(null, "Ben xogado, otra vez será");
        }

        }
}


