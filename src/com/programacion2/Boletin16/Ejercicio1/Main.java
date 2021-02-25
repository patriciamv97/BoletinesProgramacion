package com.programacion2.Boletin16.Ejercicio1;

import com.metodos.MisMetodos;


public class Main {
    public static void main(String[] args) {
        String opcion;
        int[] lista = new int[10];
        do {
            opcion = MisMetodos.pedirString("***Menu***\n1-->Crear lista\n2-->Amosar\n3-->Calcular pares e negativos\n4-->Sair");
            switch (opcion) {
                case "1":
                    Metodos.crearArrayNumeros(lista);
                    break;
                case "2":
                    Metodos.amosarLista(lista);
                    break;
                case "3":
                    Metodos.calcularParesENegativos(lista);
                    break;
                case "4":
                    System.exit(0);
            }
        } while (!opcion.equalsIgnoreCase("4"));


    }
}
