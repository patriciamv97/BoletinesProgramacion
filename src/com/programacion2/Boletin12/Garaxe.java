package com.programacion2.Boletin12;

import javax.swing.*;

public class Garaxe {

    //Atributos

    private int numeroCoches;
    private float tempo;
    private Coche coche;

    //Constante
    public static final int NumeroMaximoCoches = 5;

    //Constructor
    public float getTempo() {
        return tempo;
    }
    public void setTempo(float tempo) {
        this.tempo = tempo;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public Garaxe(Coche coche) {
    }



    public void comprobarPlazas(Coche coche) {

        if (numeroCoches < NumeroMaximoCoches) {
            System.out.println("Plazas dispoñibles " + (NumeroMaximoCoches-numeroCoches));
            numeroCoches++;
        }
        else
            System.out.println("Completo");


    }

    public float calcularPrezo() {
        float prezo;
        tempo=Float.parseFloat(JOptionPane.showInputDialog("tempo estacionamento"));
        if (tempo <= 3) {
            prezo = (float) (1.5 * tempo);
        } else
            prezo = (float) ((tempo-3)*0.20+4.5);

        return prezo;

    }

    public float cartosRecibidos(){
        float cartosRecibidos =Float.parseFloat(JOptionPane.showInputDialog("Introduzca os cartos"));
        return cartosRecibidos;
    }

    public void factura(){
        System.out.println("MATRICULA "+ coche.toString()+
                "\nTEMPO "+getTempo()+
                "\nPREZO"+ calcularPrezo()+
                "\nCARTOS RECIBIDOS"+ cartosRecibidos()+
                "\nCARTOS DEVOLTOS" + (cartosRecibidos()-calcularPrezo())+
                "\nGRACIAS POR USAR O NOSO APARCADOIRO");
    }
}
