package com.programacion2.Boletin14;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        ConversorTemperaturas ct = new ConversorTemperaturas();
        float centigrados=Float.parseFloat(JOptionPane.showInputDialog("Introduce o valor da temperatura en grados centigrados"));

        try{

            System.out.println("A temperatura en grados fharenheit é : "+ct.centigradosAFharenheit(centigrados));
            System.out.println("A temperatura en grados reamur é : "+ct.centigradosAReamur(centigrados));

        }catch (TemperaturaErradaExcepcion e){
            System.out.println(e.toString());

        }

    }
}
