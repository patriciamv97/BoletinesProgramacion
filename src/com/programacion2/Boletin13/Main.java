package com.programacion2.Boletin13;

public class Main {
    public static void main(String[] args) {
        Avestruz avestruz = new Avestruz();
        System.out.println("As avestruces son aves");
        avestruz.podeCamiñar();
        avestruz.terAs();
        Papagaio papagaio= new Papagaio();
        System.out.println("Os papagaios son aves");
        papagaio.podenVoar();
        papagaio.podeCamiñar();
        papagaio.terAs();
        Murcielago murcielago= new Murcielago();
        System.out.println("Os murcielagos son mamiferos ");
        murcielago.podeCamiñar();
        murcielago.podenVoar();
        Gato gato = new Gato();
        System.out.println("Os gatos son felinos, e os felinos son mamiferos");
        gato.podeCamiñar();
        gato.podenNadar();
        Felino felino= new Felino();
        System.out.println("Os tigres son felinos, e os felinos son mamiferos");
        felino.podeCamiñar();
        felino.podenNadar();


    }
}
