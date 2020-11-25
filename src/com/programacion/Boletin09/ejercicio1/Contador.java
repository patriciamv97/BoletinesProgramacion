package com.programacion.Boletin09.ejercicio1;

import com.programacion.BoletinDiaExamen.Docentes;

import javax.swing.*;

public class Contador {
    public void Contador() {
        int numero, cero = 0, negativo = 0, positivo = 0;
        for (int i = 0; i < 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
            if (numero >= 0)
                if (numero == 0)
                    cero = cero + 1;
                else
                    positivo = positivo + 1;
            else
                negativo = negativo + 1;

        }
        JOptionPane.showMessageDialog(null,"O número de positivos é : "+positivo+"\nO número de ceros é : "+cero+" \nO número de negativos é :"+negativo);
    }
}
