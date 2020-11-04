package com.programacion.boletin03;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sf,ventas,k,dietas,sb,sn;
        System.out.println("Introduce soldo fixo :");
        sf= sc.nextFloat();
        System.out.println("Introduce as ventas :");
        ventas= sc.nextFloat();
        System.out.println("Introduce quilometraxe :");
        k= sc.nextFloat();
        System.out.println("Introduce dietas :");
        dietas=sc.nextFloat();
        sb=(float) (sf+2*k+30*dietas+0.05*ventas);
        sn=(float) (sb-0.18*sb-36);
        System.out.println("O soldo bruto é "+sb+ " euros"+ "\nO soldo neto é "+sn+" euros");


    }

}

