package com.programacion2.Boletin17.libros;

public class ExcepcionArray extends Exception {
    public ExcepcionArray() {
    }

    public ExcepcionArray(String mensaxe) {
        super("Error :\n"+mensaxe);
    }
}
