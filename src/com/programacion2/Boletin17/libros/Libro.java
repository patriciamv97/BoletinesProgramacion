package com.programacion2.Boletin17.libros;


public class Libro implements Comparable<Libro> {

    //Atributos

    private String titulo;
    private String autor;
    private String ISBN;
    private float prezo;
    private int nUnidades;

    public Libro() {
    }

    public Libro(String titulo, String autor, String ISBN, float prezo, int nUnidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.prezo = prezo;
        this.nUnidades = nUnidades;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public int getnUnidades() {
        return nUnidades;
    }

    public void setnUnidades(int nUnidades) {
        this.nUnidades = nUnidades;
    }

    @Override
    public String toString() {
        return "Titulo= " + titulo + "\nAutor= " + autor + "\nISBN= " + ISBN + "\nPrezo= " + prezo + "\nNumero de unidades= " + nUnidades;
    }


    @Override
    public int compareTo(Libro libro) {
        return titulo.compareTo(libro.getTitulo());
    }
}
