package com.programacion.boletin06.ejercicio3;

/**
 * Unha clase para calcular o area dun circulo e a lonxitude da circunferencia
 * @author Patricia Maceiras
 * @version 0.1.1
 */

public class Circulo {
    //Atributos

    private double radio;
    public final double PI=3.14;

    /**
     * Metodo constructor que xenera un circulo cos seus parametros a cero o null
     */

    public Circulo (){

    }

    /**
     * Crea un círculo a partir de su orixen su radio
     * @param r
     */

    public Circulo (double r){
        radio=r;

    }

    /**
     * Metodo que se utliza para dar un valor ao radio
     * @param r
     */

    public void setRadio(double r){
        radio=r;

    }

    /**
     * Metdodo que se utiliza para obter o radio
     * @return devolve o radio
     */
    public double getRadio (){

        return radio;
    }

    /**
     * calcula o area do circulo co radio
     * @return retorna o area do circulo
     */
    public double calcularArea(){
        double area;
        area=Math.pow(radio,2)*PI;
        return area;
    }
    /**
     * calcula a lonxitude da circunferencia
     * @return retorna a lonxitude da circunferencia
     */
    public double calcularLonxitude (){
        double lonxitude;
        lonxitude = 2*radio*Math.PI;
        return lonxitude;

    }
}
