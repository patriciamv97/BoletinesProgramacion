package com.programacion2.Boletin17.libros;

import com.programacion2.Boletin17.aplicacion.Aplicacion;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Libro> libros = new ArrayList();
        String opcion;
        do {
            opcion = JOptionPane.showInputDialog("***Menu***\n1-->Engadir\n2-->Amosar\n3-->Ordenar\n4-->Consultar\n5-->Vender\n6-->Dar de baixa\n7-->Sair");
            switch (opcion) {
                case "1":
                    Aplicacion.engadir(libros);
                    break;
                case "2":
                    Aplicacion.amosar(libros);
                    break;
                case "3":
                    Aplicacion.ordenar(libros);
                    Aplicacion.amosar(libros);
                    break;
                case "4":
                    Aplicacion.consultar(libros);
                    break;
                case "5":
                    Aplicacion.vender(libros);
                    break;
                case "6":
                    Aplicacion.darDeBaixa(libros);
                    break;
                case "7":
                    System.exit(0);

            }
        } while (!opcion.equalsIgnoreCase("7"));
    }

}
