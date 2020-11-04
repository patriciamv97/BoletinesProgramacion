package com.programacion.boletin02;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float millasmarinas;
        final int VALOR = 1852;
        System.out.println("Introduzca as millas marinas : ");
        millasmarinas=sc.nextFloat();
        System.out.println(millasmarinas+" millas marinas en metros son "+ millasmarinas*VALOR + " metros.");


    }
}
