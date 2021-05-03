package com.programacion3.patri.boletin26.seleccionFutbol;

public class Futbolista extends SeleccionFutbol {

    private Integer dorsal;

    private String demarcacion;



    public Futbolista(Integer id, String nome, String apelidos, Integer edad, Integer dorsal, String demarcacion) {
        super(id, nome, apelidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public Integer getDorsal() {
        return dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    @Override
    public void concentrarse() {
        super.concentrarse();
    }

    @Override
    public void viajar() {
        System.out.println("O xogador "+ getNome() +" "+ getApelidos()+" viaxa");
    }

    @Override
    public void entrenar() {
        System.out.println("O xogador "+ getNome() +" "+ getApelidos()+" entrena");
    }

    @Override
    public void jugarPartido() {
        System.out.println("O xogador "+ getNome() +" "+ getApelidos()+" xoga un partido");

    }

    //Metodo futbolista
    public void entrevista() {
        System.out.println("O xogador "+ getNome() +" "+ getApelidos()+" da una entrevista");
    }

    @Override
    public String toString() {
        return super.toString()+ " dorsal=" + dorsal + ", demarcacion= " + demarcacion;
    }
}
