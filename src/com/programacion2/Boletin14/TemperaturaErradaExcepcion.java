package com.programacion2.Boletin14;

public class TemperaturaErradaExcepcion extends Exception{

    public TemperaturaErradaExcepcion() {
        super("A temperatura debe ser maior que 80º centigrados");
    }
}
