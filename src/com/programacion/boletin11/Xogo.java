package com.programacion.boletin11;

import javax.swing.*;

public class Xogo {
    int n,n1;
    public void validar(){
        n = Integer.parseInt(JOptionPane.showInputDialog("Primeiro xogador ,introduce un número entre 1 e 50"));
        do {
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Debes introducir un número entre 1 e 50"));

        } while (n1 < 1 || n1 > 50);


    }
    public void adivinarNumero() {
        int  cantidad,intentos = 0,n2;

            cantidad = Integer.parseInt(JOptionPane.showInputDialog("Xogador 1,introduce o número de intentos que ten o segundo xogador"));
        do {
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Xogador 2,¿Que número introduxo o xogador 1?"));
            for (int i =0;i<=cantidad;i++) {
                intentos++;
                if (n2 < n)
                    JOptionPane.showMessageDialog(null, "O número é maior que o que puxeches ");
                if (n2 > n)
                    JOptionPane.showMessageDialog(null, "O número é menor que o que puxeches ");
            }
        }while(intentos<cantidad || n1==n );
    }
}

