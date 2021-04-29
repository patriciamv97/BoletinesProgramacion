package com.programacion3.patri.boletin25;

import com.programacion3.patri.boletin25.barcos.Barco;
import com.programacion3.patri.boletin25.barcos.*;

import java.util.ArrayList;

public class Factura {
    public static void main(String[] args) {
        float precio;
        ArrayList<Barco> barcos = new ArrayList<Barco>();
        Barco yate1 = new Yates("aabb", 10, 3, 220, 3);
        Barco velero1 = new Veleros("bbaa", 20, 3, 5);
        barcos.add(yate1);
        barcos.add(velero1);
        for (Barco ele : barcos) {
            precio=(ele.getNumDias()* ele.modulo());
            System.out.println("MATRICULA : "+ele.getMatricula());
            System.out.println("ESLORA : "+ele.getEslora());
            System.out.println("PRECIO : "+precio);

        }
    }
}
