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
        Barco deportivo = new EmbacacionesDeportivasAMotor("ccaa",10,2,220);
        barcos.add(yate1);
        barcos.add(velero1);
        barcos.add(deportivo);

        for (Barco ele : barcos) {
            precio=(ele.getNumDias()* ele.modulo());
            System.out.println("***FACTURA***"+"\n"+"MATRICULA : "+ele.getMatricula() +"\n"+"ESLORA : "
                    +ele.getEslora() +"\n" +"PRECIO : "+precio+"\n");
        }
    }
}
