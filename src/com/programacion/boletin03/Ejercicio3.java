package com.programacion.boletin03;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int b100,b20,b5,m1;
        System.out.println("Introduce os billetes de 100 : ");
        b100 =sc.nextInt();
        System.out.println("Introduce os billetes de 20 : ");
        b20 =sc.nextInt();
        System.out.println("Introduce os billetes de 5 : ");
        b5 =sc.nextInt();
        System.out.println("Introduce as moedas de 1 euro : ");
        m1=sc.nextInt();
        System.out.println("A cantidade total de diñeiro é "+(b100*100+b20*20+b5*5+m1)+" euros");


    }
}
