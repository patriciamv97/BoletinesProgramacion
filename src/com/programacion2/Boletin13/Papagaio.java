package com.programacion2.Boletin13;

public class Papagaio extends Aves implements IPodeVoar {
    @Override
    public void podenVoar() {
        System.out.println("Os papagaios poden voar");
    }
   public  void amosar(){
       System.out.println("Os papagaios son aves");

   }
}
