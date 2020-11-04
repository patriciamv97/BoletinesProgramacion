package com.programacion.boletin06.ejercicio3;

public class Circulo {
    //Atributos

    private double radio;
    public final double PI=3.14;

    // Metdos Constructores
    // Metodo constructor sen paramaetros
    public Circulo (){

    }
    //Metdodo constructor con parametros
    public Circulo (double r){
        radio=r;

    }

    //Metodos Acceso

    public void setRadio(double r){
        radio=r;

    }
    public double getRadio (){

        return radio;
    }


    //Metodos calcular
    public double calcularArea(){
        double area;
        area=Math.pow(radio,2)*PI;
        return area;
    }
    public double calcularLonxitude (){
        double lonxitude;
        lonxitude = 2*radio*Math.PI;
        return lonxitude;

    }
}
