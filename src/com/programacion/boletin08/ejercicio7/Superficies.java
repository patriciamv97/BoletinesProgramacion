package com.programacion.boletin08.ejercicio7;

import javax.swing.*;

public class Superficies {

    public void calularAreas(int num ) {
        switch (num) {
            case 1:
                float l = Float.parseFloat(JOptionPane.showInputDialog("Introduce  o lado do cadrado : "));
                JOptionPane.showMessageDialog(null,"O area do cadrado é : "+ Math.pow(l,2) +" unidades cadradas");
            break;
            case 2 :
                float a = Float.parseFloat(JOptionPane.showInputDialog("Introduce a altura do triangulo "));
                float b = Float.parseFloat(JOptionPane.showInputDialog("Introduce a base do triangulo "));
                JOptionPane.showMessageDialog(null,"O área do triangulo é : "+ b*a/2 +" unidades cadradas");
            break;
            case 3 :
                float r = Float.parseFloat(JOptionPane.showInputDialog("Introduce o radio do circulo : "));
                JOptionPane.showMessageDialog(null,"O área do circulo é : "+Math.pow(r,2)*Math.PI+" unidades cadradas");
                break;
            default: JOptionPane.showMessageDialog(null,"Opción incorrecta");


        }


    }

}