package com.programacion.boletin09.ejercicio2;


public class acumulador {
    public void suma() {
        int suma = 0;
        for (int i = 10; i < 90; i++) {
            suma = suma + i;

        }
        System.out.println("A suma dos números é :" + suma );
    }
    public  void producto(){
        double p =1 ;
        for (int i =10;i<90;i++){
            p=p*i;
        }
        System.out.println("O producto dos números é :"+ p);

    }
    //Se puede simplificar
    public void resultado (){
        int s = 0;
        double p =1;

        for (int i = 10; i < 90; i++) {
            s = s + i;
             p = p * i;
        }
        System.out.println( p );
        System.out.println( s );

    }

}