package com.programacion2.Boletin15.Ejercicio1;

public class NumerosAleatorios {

    int[] num1= new int[6];

   public int[] crearArray() {
       for (int i = 0; i < num1.length; i++) {
           int num = (int) (Math.random()*50 + 1);
           num1[i] = num; }
       return num1;
   }
   public void amosarArray(int[]num1){
        for (Integer elemento:num1){
             System.out.println(elemento); }

   }
   public void ordenarOReves(int[]num1){
       float aux = 0.0f;
       for (int i = 0; i < num1.length-1; i++) {
           for (int j = i + 1; j < num1.length; j++) {
               aux = num1[j];
               num1[j] = num1[i];
               num1[i] = (int) aux;
           }

       }

   }
}
