package com.programacion3.patri.boletin26.seleccionFutbol;

public class Entrenador extends SeleccionFutbol {

    private Integer idFederacion;

    public Entrenador(Integer id, String nome, String apelidos, Integer edad, Integer idFederacion) {
        super(id, nome, apelidos, edad);
        this.idFederacion = idFederacion;
    }

    public Integer getIdFederacion() {
        return idFederacion;
    }

    @Override
    public void concentrarse() {
        super.concentrarse();
    }

    @Override
    public void viajar() {
        System.out.println("O Entrenador "+ getNome() +" "+ getApelidos()+" viaxa");
    }

    @Override
    public void entrenar() {
        System.out.println("O Entrenador "+ getNome() +" "+ getApelidos()+" entrena aos xogadores");
    }


    public void planIndicarEntrenamiento(){
        System.out.println("O Entrenador "+ getNome() +" "+ getApelidos()+ " planifica o entrenamiento");

    }

    @Override
    public String toString() {
        return super.toString()+ " idFederacion= " + idFederacion;
    }

}
