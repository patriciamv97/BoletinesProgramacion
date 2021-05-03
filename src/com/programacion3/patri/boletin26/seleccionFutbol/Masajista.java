package com.programacion3.patri.boletin26.seleccionFutbol;

public class Masajista extends SeleccionFutbol {

    private String titulacion;

    private Integer aniosExperiencia;

    public Masajista(Integer id, String nome, String apelidos, Integer edad, String titulacion, Integer aniosExperiencia) {
        super(id, nome, apelidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public Integer getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void darMasaje() {
        System.out.println(getNome()+""+ getApelidos()+" da masaxes");
    }

    @Override
    public void concentrarse() {
        super.concentrarse();
    }

    @Override
    public void viajar() {
        System.out.println(getNome()+""+ getApelidos()+" viaxa co equipo");

    }

    @Override
    public String toString() {
        return  super.toString()+" titulacion= " + titulacion  + ", años de experiencia= " + aniosExperiencia;
    }
}
