package com.programacion2.Boletin17.aplicacion;

import com.metodos.Metodos;
import com.programacion2.Boletin17.libros.ExcepcionArray;
import com.programacion2.Boletin17.libros.Libro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Aplicacion {

    public static Libro pedirLibro(String mensaxe) {
        String titulo = Metodos.pedirString("Introduce o titulo do libro");
        String autor = Metodos.pedirString("Introduce o autor do libro");
        String ISBN = Metodos.pedirString("Introduce o ISBN do libro");
        float prezo = Metodos.pedirFloat("Introduzca o prezo do libro");
        int nUnidades = Metodos.pedirInt("Introduzca o numero de unidades que hai do libro");
        Libro libro = new Libro(titulo, autor, ISBN, prezo, nUnidades);
        return libro;
    }

    public static void engadir(ArrayList<Libro> libros) {
        Libro libro = pedirLibro("Libro : ");
        libros.add(libro);

    }

    public static void vender(ArrayList<Libro> libros) throws ExcepcionArray {
        if (libros.isEmpty()) {
            throw new ExcepcionArray("O array está vacio");
        } else {

            int unidades;
            boolean atopado = false;
            Iterator it = libros.iterator();
            String libroVendido = Metodos.pedirString("Introduce o ISBN do libro vendido");
            while (it.hasNext()) {
                Libro libro = (Libro) it.next();
                if (libro.getISBN().equalsIgnoreCase(libroVendido)) {
                    atopado = true;
                    unidades = libro.getnUnidades();
                    if (unidades == 0) {
                        System.out.println("\nNon se dispoñe de undidades do libro " + libro.getTitulo());
                    } else {
                        if (unidades == 1) {
                            unidades = 0;
                            libro.setnUnidades(unidades);
                        }
                        if (unidades>1) {
                            unidades--;
                            libro.setnUnidades(unidades);
                            System.out.println("\nAs unidades do libro " + libro.getTitulo() + " que quedan son : " + unidades);

                        }
                    }

                }


            }
            if (!atopado) {
                System.out.println("\nO libro non se atopa na libreria");
            }
        }

    }

    public static void darDeBaixa(ArrayList<Libro> libros) throws ExcepcionArray {
        if (libros.isEmpty()) {
            throw new ExcepcionArray("O array está vacio");
        } else {
            Iterator it = libros.iterator();
            while (it.hasNext()) {
                Libro libro = (Libro) it.next();
                if (libro.getnUnidades() == 0) {
                    it.remove();
                }

            }
        }
    }

    public static void amosar(ArrayList<Libro> libros) throws ExcepcionArray {
        if (libros.isEmpty()) {
            throw new ExcepcionArray("O array está vacio");
        } else
            for (Libro lib : libros) {
                System.out.println("\n" + lib + "\n");
            }
    }


    public static void consultar(ArrayList<Libro> libros) throws ExcepcionArray {

        if (libros.isEmpty()) {
            throw new ExcepcionArray("O array está vacio");
        } else {
            String libroConsultar = Metodos.pedirString("Introduce o titulo do libro que queras consultar");
            for (Libro lib : libros) {
                if (lib.getTitulo().equalsIgnoreCase(libroConsultar)) {
                    System.out.println("Titulo : " + lib.getTitulo() + "\nAutor : " + lib.getAutor() + "\nISBN : " + lib.getISBN() +
                            "\nPrezo : " + lib.getPrezo() + "\nUnidades dispoñibles : " + lib.getnUnidades());
                }
            }
        }

    }

    public static void ordenar(ArrayList<Libro> libros) {
        Collections.sort(libros);
    }

}

