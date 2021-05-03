package com.programacion3.patri.boletin26.seleccionFutbol;

import com.programacion3.patri.boletin26.IntegranteSeleccionFutlbol;

public abstract class SeleccionFutbol implements IntegranteSeleccionFutlbol {

    private Integer id;
    private String nome;
    private String apelidos;
    private Integer edad;

    public SeleccionFutbol() {
    }

    public SeleccionFutbol(Integer id, String nome, String apelidos, Integer edad) {
        this.id = id;
        this.nome = nome;
        this.apelidos = apelidos;
        this.edad = edad;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public Integer getEdad() {
        return edad;
    }

    //Metodos interfaz

    @Override
    public void concentrarse() {
        System.out.println("Concentrase o xogador");

    }

    @Override
    public void viajar() {
        System.out.println("A seleccion viaxa");
    }

    @Override
    public void entrenar() {
        System.out.println("A seleccion entrena");

    }

    @Override
    public void jugarPartido() {
        System.out.println("A seleccion xoga");

    }

    @Override
    public String toString() {
        return "id= " + id + ", nome= " + nome  + ", apelidos= " + apelidos  + ", edad= " + edad;
    }
}
