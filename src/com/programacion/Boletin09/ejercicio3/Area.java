package com.programacion.Boletin09.ejercicio3;

import javax.swing.*;

public class Area {
    public float validacion(String menxase) {
        float dato;
        do {
            dato = Float.parseFloat(JOptionPane.showInputDialog(menxase));
        } while (dato <= 0);
        return dato;
    }

    public float calcularArea() {
        float base = validacion("Introduzca a base do cadrado : ");
        float altura = validacion("Introduzca a altura do cadrado :");
        return Float.parseFloat(JOptionPane.showInputDialog("O area é : "+base*altura));
        //return Float.parseFloat(System.out.println("O area é " + base*altura));
        //return Float.parseFloat(JOptionPane.showMessageDialog(null,"O area do cadrado é :"+area));
    }
}