package com.programacion2.Boletin15.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        NumerosAleatorios numero = new NumerosAleatorios();
        int[] numeros= new int[6];
        numeros = numero.crearArray();
        numero.amosarArray(numeros);
        numero.ordenarOReves(numeros);
        numero.amosarArray(numeros);
    }
}
