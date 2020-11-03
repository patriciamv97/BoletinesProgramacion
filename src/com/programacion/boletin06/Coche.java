package com.programacion.boletin06;

public class Coche {
    //Atributos

    private int velocidade;


    //Constructor
    public  Coche (int velocidade){
        this.velocidade=velocidade;

    }

//Metdos

    public int getVelocidade(){
        return velocidade;

    }
    public void acelerar(int valor){

        velocidade=velocidade+valor;
        System.out.println("O incremento de velocidade é : "+velocidade);
    }

    public void frenar(int menos){

        velocidade=velocidade-menos;
        System.out.println("O decremento de velocidade é : "+velocidade);

    }
}
