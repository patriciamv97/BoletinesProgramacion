package com.programacion3.patri.boletin25.barcos;

public class Yates extends  Barco{
    private float potencia;
    private int numCamarotes;

    public Yates(String matricula, float eslora, float numDias, float potencia, int numCamarotes) {
        super(matricula, eslora, numDias);
        this.potencia = potencia;
        this.numCamarotes = numCamarotes;
    }

    @Override
    public String toString() {
        return  "potencia=" + potencia + ", numCamarotes= " + numCamarotes;
    }

    @Override
    public float modulo() {
        return 2* potencia+ 25*numCamarotes+super.modulo();
    }
}
