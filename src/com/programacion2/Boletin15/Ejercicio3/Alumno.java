package com.programacion2.Boletin15.Ejercicio3;

public class Alumno {
    private int nota;
    private String nombre;

    public Alumno() {
    }

    public Alumno(int nota, String nombre) {
        this.nota = nota;
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "nota=" + nota + ", nombre='" + nombre;
    }
}
