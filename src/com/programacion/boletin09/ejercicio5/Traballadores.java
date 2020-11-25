package com.programacion.boletin09.ejercicio5;

import com.programacion.metodos.Metodos;

import javax.swing.*;

public class Traballadores {
    public void soldoTraballadores() {
        float soldo ,porcentaxe ;
        int traballdoresMileuristas=0,traballadoresPobres=0;
        do {
            soldo = Metodos.validacionPositivos("Introduce o soldo :");
            if (soldo<1000 && soldo>0)
                traballadoresPobres++;
            else
            if  (soldo >= 1000  && soldo<=1750)
                    traballdoresMileuristas++;
        }while (soldo != 0) ;
        porcentaxe= (float) traballadoresPobres/(traballadoresPobres+traballdoresMileuristas)*100;
        JOptionPane.showMessageDialog(null,"Hai " +traballdoresMileuristas+" traballadres que cobran entre 1000 e 1750 euros");
        JOptionPane.showMessageDialog(null,"Hai " + traballadoresPobres +" traballadores que cobran menos de 1000" );
        JOptionPane.showMessageDialog(null,"O "+porcentaxe+"% dos traballadores cobran menos de mil euros.");





    }
}

