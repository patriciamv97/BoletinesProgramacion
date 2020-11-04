package com.programacion.boletin02;

import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        float euros, cambio;
        System.out.println("Introduzca euros : ");
        euros=sc.nextFloat();
        System.out.println("Introduzca cambio : ");
        cambio=sc.nextFloat();
        System.out.println(euros+" euros son "+ euros*cambio + " dolares" );


    }
}
