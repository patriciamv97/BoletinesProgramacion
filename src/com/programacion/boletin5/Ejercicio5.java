package com.programacion.boletin5;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Consumo obxCon = new Consumo();
        obxCon.setpGas(1.57f);
        obxCon.setLitros(50);
        /* System.out.println("O consumo medio é :" + obxCon.consumoMedio());
        obxCon.consumoEuros();*/
        Consumo obx1 = new Consumo (2000f,50f,36f,1.57f);
        //float consumoMedio=obx1.consumoMedio(); Otra forma
        System.out.println("O consumo medio é : " +obx1.consumoMedio());
        obx1.consumoEuros();

    }
}
