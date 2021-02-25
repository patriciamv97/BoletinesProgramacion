package com.programacion2.Boletin17.libros;

import com.programacion2.Boletin17.aplicacion.Aplicacion;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Libro> libros = new ArrayList();
        String opcion;
        do {
            opcion = JOptionPane.showInputDialog("***Menu***\n1-->Engadir\n2-->Amosar sin ordenar\n3-->Amosar ordenado\n4-->Consultar\n5-->Vender\n6-->Dar de baixa\n7-->Sair");
            switch (opcion) {
                case "1":
                    Aplicacion.engadir(libros);
                    break;
                case "2":
                    try {
                        Aplicacion.amosar(libros);
                    } catch (ExcepcionArray e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case "3":
                    try {
                        Aplicacion.ordenar(libros);
                        Aplicacion.amosar(libros);
                    } catch (ExcepcionArray e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "4":
                    try {
                        Aplicacion.consultar(libros);
                    } catch (ExcepcionArray e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "5":
                    try {
                        Aplicacion.vender(libros);
                    } catch (ExcepcionArray e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case "6":
                    try {
                        Aplicacion.darDeBaixa(libros);
                    } catch (ExcepcionArray e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "7":
                    System.exit(0);

            }
        } while (!opcion.equalsIgnoreCase("7"));
    }

}
