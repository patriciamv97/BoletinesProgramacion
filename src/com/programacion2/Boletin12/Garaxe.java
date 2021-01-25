package com.programacion2.Boletin12;

import javax.swing.*;

public class Garaxe {

    //Atributos

    private int numeroCoches;
    private float tempo;
    private Coche coche;

    //Variables

    public float prezo;
    public float cartosRecibidos;

    //Constante
    public static final int NumeroMaximoCoches = 5;

    //Constructores

    public Garaxe() {
    }

    public Garaxe(Coche coche) {
    }
    //getter
    public float getTempo() {
        return tempo;
    }


    public  void comprobarPlazas() {

        if (numeroCoches < NumeroMaximoCoches) {
            System.out.println("Plazas dispoñibles " + (NumeroMaximoCoches-numeroCoches));
            numeroCoches++;
        }
        else
            System.out.println("Completo");


    }

    public float calcularPrezo() {

        tempo=Float.parseFloat(JOptionPane.showInputDialog("tempo estacionamento"));
        if (tempo <= 3) {
            prezo = (float) (1.5 * tempo);
        } else
            prezo = (float) ((tempo-3)*0.20+4.5);

        return prezo;

    }

    public float cartosRecibidos(){
        cartosRecibidos =Float.parseFloat(JOptionPane.showInputDialog("Introduzca os cartos"));
        return cartosRecibidos;
    }

    public void factura(Coche coche){
        System.out.println("MATRICULA "+ coche.toString()+
                "\nTEMPO "+getTempo()+
                "\nPREZO "+ prezo+
                "\nCARTOS RECIBIDOS "+ cartosRecibidos() +
                "\nCARTOS DEVOLTOS " + (cartosRecibidos - prezo)+
                "\nGRACIAS POR USAR O NOSO APARCADOIRO");
    }
}
