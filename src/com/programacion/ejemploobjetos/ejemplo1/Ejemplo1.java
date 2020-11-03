package com.programacion.ejemploobjetos.ejemplo1;

import com.programacion.ejemploobjetos.ejemplo1.Rectangulo;

public class Ejemplo1 {
    public static void main(String[] args) {
        //instancio
        Rectangulo obxRec1 = new Rectangulo();
        float altura = obxRec1.altura;
        System.out.println("altura --- "+altura); //miramos altura por ser public
        obxRec1.amosar();
        System.out.println("altura -> " +obxRec1.altura);


    }
}
