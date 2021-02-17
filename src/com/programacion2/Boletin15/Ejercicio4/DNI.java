package com.programacion2.Boletin15.Ejercicio4;

import javax.swing.*;

public class DNI {
    public int calcularResto(){
        String dni;
        int letra = 0;
        do {
            dni = JOptionPane.showInputDialog("Introduce tu DNI");
            if (dni.length() == 8) {
                letra = Integer.parseInt(dni) % 23;
            } else
                System.out.println("O tamaño do dni é incorrecto");
        } while (dni.length() != 8);
        return letra;
    }

    public void Letra(){
        int opcion2;
        opcion2 = calcularResto();
        switch (opcion2) {
            case 0:
                System.out.println("Su letra es: T");
                break;
            case 1:
                System.out.println("Su letra es: R");
                break;
            case 2:
                System.out.println("Su letra es: W");
                break;
            case 3:
                System.out.println("Su letra es: A");
                break;
            case 4:
                System.out.println("Su letra es: G");
                break;
            case 5:
                System.out.println("Su letra es: M");
                break;
            case 6:
                System.out.println("Su letra es: Y");
                break;
            case 7:
                System.out.println("Su letra es: F");
                break;
            case 8:
                System.out.println("Su letra es: P");
                break;
            case 9:
                System.out.println("Su letra es: D");
                break;
            case 10:
                System.out.println("Su letra es: X");
                break;
            case 11:
                System.out.println("Su letra es: B");
                break;
            case 12:
                System.out.println("Su letra es: N");
                break;
            case 13:
                System.out.println("Su letra es: J");
                break;
            case 14:
                System.out.println("Su letra es: Z");
                break;
            case 15:
                System.out.println("Su letra es: S");
                break;
            case 16:
                System.out.println("Su letra es: Q");
                break;
            case 17:
                System.out.println("Su letra es: V");
                break;
            case 18:
                System.out.println("Su letra es: H");
                break;
            case 19:
                System.out.println("Su letra es: L");
                break;
            case 20:
                System.out.println("Su letra es: C");
                break;
            case 21:
                System.out.println("Su letra es: K");
                break;
            case 22:
                System.out.println("Su letra es: E");
                break;
        }
    }

    }


