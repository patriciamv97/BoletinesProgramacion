package com.programacion.boletin05;

public class Consumo {
    // Atributos
    private float km;
    private float litros;
    private float vMed;
    private float pGas;

    //Constructores
    public Consumo (){

    }
    public Consumo (float km, float litros,float vMed, float pGas){
        this.km=km;
        this.litros=litros;
        this.vMed=litros;
        this.pGas=pGas;

    }
    // Metodos acceso
    public void setKms(float km){
        this.km=km;
    }


    public void setLitros (float litros){
        this.litros=litros;
    }



    public void setvMed(float vMed){
        this.vMed=vMed;
    }


    public void setpGas (float pGas){
        this.pGas=pGas;

    }

    // Metodos

    public float getTempo (float t){
        float tempo;
        tempo = km/vMed;
        return tempo;

    }
    public float consumoMedio(){
        float consumoMedio;
        consumoMedio= litros/km*100;
        return consumoMedio;
    }
    public void consumoEuros(){
        float consumoEuros;
        consumoEuros= litros*pGas/km*100;
        System.out.println("O consumo en euros é : "+ consumoEuros );
      /*float consum = consumoMedio()*pGas;
      System.out.println("O consumo medio é : "+consumo );**/

    }
}
