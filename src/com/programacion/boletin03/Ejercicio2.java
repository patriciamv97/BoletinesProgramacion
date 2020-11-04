package com.programacion.boletin03;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float temperatura, kelvin, F;
        System.out.println("Introduce o valor da temperatura en grados centigrados :");
        temperatura=sc.nextFloat();
        kelvin=temperatura+273;
        F=(float) 9/5*temperatura+32;
        System.out.println("A temperatura en grados kelvin é " + kelvin +" k"+"\nA temperatura en grados fahrenheit é "+F+" f");


    }
}
