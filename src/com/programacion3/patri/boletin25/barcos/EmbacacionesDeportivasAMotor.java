package com.programacion3.patri.boletin25.barcos;

public class EmbacacionesDeportivasAMotor extends Barco {
    private float potencia;

    public EmbacacionesDeportivasAMotor(String matricula, float eslora, float numDias, float potencia) {
        super(matricula, eslora, numDias);
        this.potencia = potencia;
    }

    public float getPotencia() {
        return potencia;
    }

    @Override
    public String toString() {
        return "potencia=" + potencia;
    }

    @Override
    public float modulo() {
        return 2*potencia+ super.modulo();
    }
}
