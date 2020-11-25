package com.programacion.Boletin09.ejercicio2;

import javax.swing.*;

public class acumulador {
    public void suma() {
        int suma = 0;
        for (int i = 10; i < 90; i++) {
            suma = suma + i;
            System.out.println("A suma dos números é :" + suma );
        }
    }
    public  void producto(){
        double p =1 ;
        for (int i =10;i<90;i++){
            p=p*i;
            System.out.println("O producto dos números é :"+ p);
        }
    }
}