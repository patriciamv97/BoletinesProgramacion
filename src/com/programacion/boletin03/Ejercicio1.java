package com.programacion.boletin03;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float prezot,prezop;
        System.out.println("Introduzca o prezo da tarifa : ");
        prezot=sc.nextFloat();
        System.out.println("Introduzca o prezo da compra : ");
        prezop=sc.nextFloat();
        System.out.println("A porcentaxe pagada é = " + (prezot-prezop)/prezot*100 + "%");
    }
}
