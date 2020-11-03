package com.programacion.boletin06.ejercicio2;

public class Satelite {
    //Atributos
    private double meridiano;
    private double paralelo;
    private double distanciaTierra;

    //Constructores
    public Satelite(){
    }

    public Satelite (double m ,double p, double d){
        meridiano=m;
        paralelo=p;
        distanciaTierra=d;
    }

    public void verPosicion(){
        System.out.println("O satelite atopase no paralelo " +( paralelo) + " o meridiano no " + (meridiano)+ " a unha distancia da Terra "+ (distanciaTierra)+" km");
    }



}
