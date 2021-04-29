package com.programacion3.patri.boletin25.barcos;

public abstract class Barco {

    private String matricula;
    private float eslora;
    private float numDias;
    public Barco() {
    }

    public Barco(String matricula, float eslora, float numDias) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.numDias=numDias;
    }


    public float getNumDias() {
        return numDias;
    }

    public void setNumDias(float numDias) {
        this.numDias = numDias;
    }

    public String getMatricula() {
        return matricula;
    }

    public float getEslora() {
        return eslora;
    }

    @Override
    public String toString() {
        return "matricula= " + matricula  + " , eslora= " + eslora + " , numDias= " + numDias ;
    }

    public float modulo (){
        return  10 * eslora;
    }
}
