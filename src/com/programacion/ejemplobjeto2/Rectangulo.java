package com.programacion.ejemplobjeto2;

public class Rectangulo {
    //Atributos
    private float base;
    private float altura;


    //Constructor sin parametros
    public Rectangulo(){

    }
    //Constructor con parametros
    public Rectangulo (float b, float al){
        base=b;
        altura=al;

    }
    //Metodos de acceso getters e setters

    public void setBase(float b){
        base = b;

    }
    public float getBase (){
        return base;
    }

    public void setAltura(float al){
        altura = al;
    }
    public float getAltura(){
        return altura;
    }

    //Metodos

    public void amosar(){
        System.out.println("base = " + base + "\naltura = "+ altura); // Muestra por la pantalla la base y la altura

    }
    public float area(float base, float altura){
        float area;
        area=base*altura;
        System.out.println("area = "+area);

        return area;

    }



}

