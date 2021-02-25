package com.programacion2.Boletin16.Ejercicio1;

import javax.swing.*;


public class Metodos {

    public static int[] crearArrayNumeros(int[] lista) {
        for (int i = 0; i < 10; i++) {
            lista[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce un númmero"));
        }
        return lista;
    }

    public static void amosarLista(int[] lista) {
        for (Integer ele : lista) {
            System.out.println(ele);
        }
    }

    public static void calcularParesENegativos(int[] lista) {
        int pares = 0, negativos = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 2 == 0) {
                pares++;
            }
            if (lista[i] < 0) {
                negativos++;
            }
        }
        System.out.println("Cantidad de números pares : " + pares + "\nCantidad de números negativos : " + negativos);

    }
}
