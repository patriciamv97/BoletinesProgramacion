package com.programacion.boletin4;

public class Libro {
    private String titulo;
    private String autor;
    private int ano;
    private short numPaginas;
    private float valoracion;

    //constructores
    public Libro(){
    }
    public Libro(String t, String au, int an, short nP, float v){
        titulo=t;
        autor=au;
        ano=an;
        numPaginas=nP;
        valoracion=v;
    }

    //metodos de acceso
    public void setTitulo(String t){
        titulo=t;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setAutor(String au){
        autor=au;
    }
    public String getAutor(){
        return autor;
    }
    public void setAno(int an){
        ano=an;
    }
    public int getAno(){
        return ano;
    }
    public void setnumPaginas(short nP){
        numPaginas= nP;
    }
    public short getnumPaginas(){
        return numPaginas;
    }
    public void setValoracion(float v){
        valoracion=v;
    }
    public float getValoracion(){
        return valoracion;
    }
    //metodos
    public void amosar(){
        System.out.println("O titulo é " +titulo+ ", o  autor é "+autor+", o ano é "+ano+", o numero de páginas é "+numPaginas+", a valoración é "+valoracion);
    }


}
