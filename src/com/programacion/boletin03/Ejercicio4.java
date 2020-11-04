package com.programacion.boletin03;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dineiro,b100,b20,b5,m1;
        System.out.println("Introduza a cantidade total de diñeiro : ");
        dineiro=sc.nextInt();
        b100=dineiro/100;
        b20=dineiro%100/20;
        b5=dineiro%100%20/5;
        m1=dineiro%100%20%5;
        System.out.println("A cantidade de billetes de 100 euros é : "+ b100 +"\nA cantidade de billestes de 20 é : "+ b20 +"\nA cantidade de billetes de 5 euros é :"+ b5 +"\nA cantidade de moedas de 1 euros é : "+m1);


    }
}
