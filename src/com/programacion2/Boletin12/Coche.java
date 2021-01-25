package com.programacion2.Boletin12;

public class Coche {

    //Atributos

    private String matriculaCoche;

    /**
     * Constructor parametrizado
     * @param matriculaCoche recibe a matricula do coche
     */

    public Coche(String matriculaCoche) {

        this.matriculaCoche = matriculaCoche;
    }


    /**
     * Metodo que accede al atributo de la clase Coche
     * @return devuelve la matricula del coche
     */

    @Override
    public String toString() {
        return  matriculaCoche;
    }
}
