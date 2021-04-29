package com.programacion3.patri.boletin25.barcos;

public class Veleros extends Barco{
    private int numMastiles;

    public Veleros(String matricula, float eslora, float numDias, int numMastiles) {
        super(matricula, eslora, numDias);
        this.numMastiles = numMastiles;
    }

    @Override
    public String toString() {
        return "numMastiles=" + numMastiles;
    }

    @Override
    public float modulo() {
       return  8* numMastiles + super.modulo();
    }
}
