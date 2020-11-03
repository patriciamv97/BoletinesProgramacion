package com.programacion.boletin06;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Coche obx = new Coche (120);
        System.out.println("A velocidade é : "+obx.getVelocidade());
        obx.acelerar(5);
        obx.frenar(5);
    }
}
