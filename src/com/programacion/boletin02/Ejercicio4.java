package com.programacion.boletin02;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float num1, num2;
        System.out.println("Introduzca un número : ");
        num1=sc.nextFloat();
        System.out.println("Introduzca otro número : ");
        num2=sc.nextFloat();
        System.out.println("Suma = "+ (num1+num2) +"\nResta = "+( num1-num2) +"\nProducto = " + num1*num2 + "\nCociente = "+ num1/num2);

    }
}
