package com.programacion.boletin11;

import javax.swing.*;

public class Xogo {
    int n1;

    public int validar(String mensaxe) {
        do {
            n1 = Integer.parseInt(JOptionPane.showInputDialog(mensaxe));

        } while (n1 < 1 || n1 > 50);
        return n1;
    }

    public void adivinarNumero() {

        int cantidad, intentos = 1, n, n2,n3;

        n = validar("Introduce un número entre 1 e 50");

        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Xogador 1,introduce o número de intentos que ten o segundo xogador"));
        n3= Integer.parseInt(JOptionPane.showInputDialog("Xogador 2,¿Que número introduxo o xogador 1?"));

        if (n3==n){
            JOptionPane.showMessageDialog(null,"10/10");}
        else {

            if ( n3 < n)
                JOptionPane.showMessageDialog(null, "O número é maior que o que puxeches ");
            else
                JOptionPane.showMessageDialog(null, "O número é menor que o que puxeches ");

            do {
                n2 = Integer.parseInt(JOptionPane.showInputDialog("Xogador 2,¿Que número introduxo o xogador 1?"));
                intentos=intentos+1;
                    if ( n2 < n)
                        JOptionPane.showMessageDialog(null, "O número é maior que o que puxeches ");
                    else
                        if (n2>n)
                            JOptionPane.showMessageDialog(null, "O número é menor que o que puxeches ");

                }while (intentos < cantidad && n !=n2 );

            if (n2==n )
                JOptionPane.showMessageDialog(null,"Noraboa");
            else
                JOptionPane.showMessageDialog(null,"Ben xogado, otra vez será");

        }


    }
}

