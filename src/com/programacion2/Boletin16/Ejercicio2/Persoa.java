package com.programacion2.Boletin16.Ejercicio2;


public class Persoa {

    public static float calcularMedia(float[] altura) {
        float suma=0,media;
        for (int i = 0; i < altura.length; i++) {
                suma+=altura[i];
        }
        return suma/altura.length;

    }
    public static void alturasInferiorSuperior(float[]altura){
        float media=calcularMedia(altura);
        int altas=0, baixas=0;
        for (int i=0;i<altura.length;i++){
            if (altura[i]>media){
                altas++;
            }
            else
                baixas++;
        }
        System.out.println("O número de persoas con altura superio a media é : "+altas+
                "\nO número de persoas con alturas inferiores a media é : "+baixas);
    }
}
