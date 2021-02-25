package com.programacion2.Boletin16.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        String cadena=" www. javadesde0. com";
        String parte1, parte2;
        parte1=cadena.substring(0,10);
        parte2=cadena.substring(10,cadena.length());
        System.out.println(parte1+"  "+parte2);
        System.out.println(parte1+parte2);

    }
}
