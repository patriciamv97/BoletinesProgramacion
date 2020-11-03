package com.programacion.boletin06.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circulo obxC = new Circulo();
        obxC.calcularArea();
        obxC.calcularLonxitude();

        Circulo obxC2 =new Circulo(3,3.14);
        obxC2.calcularArea();
        obxC2.calcularLonxitude();
    }
}
