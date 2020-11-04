package com.programacion.boletin06.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circulo obxC = new Circulo();
        obxC.calcularArea();
        obxC.calcularLonxitude();

        Circulo obxC2 =new Circulo(3);
        System.out.println("O area é : " +obxC2.calcularArea());
        System.out.println("A lonxitude da circunferencia é :" + obxC2.calcularLonxitude());
    }
}
