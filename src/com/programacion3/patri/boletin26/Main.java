package com.programacion3.patri.boletin26;

import com.programacion3.patri.boletin26.seleccionFutbol.Entrenador;
import com.programacion3.patri.boletin26.seleccionFutbol.Futbolista;
import com.programacion3.patri.boletin26.seleccionFutbol.Masajista;
import com.programacion3.patri.boletin26.seleccionFutbol.SeleccionFutbol;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<SeleccionFutbol> seleccion = new ArrayList<>();
        SeleccionFutbol entrenador = new Entrenador(3, "Pepe", "Villuela", 44, 32);
        SeleccionFutbol xogador = new Futbolista(23, "Manolo", "Garcia", 32, 24, "delantero");
        SeleccionFutbol masaxista = new Masajista(12, "Laura", "Garcia", 28, "Fisio", 5);

        seleccion.add(entrenador);
        seleccion.add(xogador);
        seleccion.add(masaxista);

        for (SeleccionFutbol ele : seleccion){
            System.out.println(ele);
        }

        //Polimorfismo

        xogador.viajar();
        entrenador.viajar();


    }
}
