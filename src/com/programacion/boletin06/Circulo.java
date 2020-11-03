package com.programacion.boletin06;

public class Circulo {
    //Atributos

    private double radio;
    private double pi=3.14;

    // Metdos Constructores
    // Metodo constructor sen paramaetros
    public Circulo (){

    }
    //Metdodo constructor con parametros
    public Circulo (double r, double p){
        radio=r;
        pi=p;
    }

    //Metodos Acceso

    public void setRadio(double r){
        radio=r;

    }
    public double getRadio (){
        return radio;
    }

    public void setPi (double p){
        pi=p;
    }

    public double getPi (){
        return pi;
    }
    //Metodos calcular
    public double calcularArea(){
        double area;
        area=Math.pow(radio,2)*pi;
        System.out.println("O area é : " +area );
        return area;
    }
    public double calcularLonxitude (){
        double lonxitude;
        lonxitude = 2*radio*pi;
        System.out.println("A lonxitude da circunferencia é :"+lonxitude);
        return lonxitude;

    }
}
