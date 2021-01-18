package com.programacion2.Boletin13;

public class Mamifero implements IPodeCamiñar{
    public void tipoDientes(){
        System.out.println("Os mamiferos teñen dentes");
    }

    @Override
    public void podeCamiñar() {
        System.out.println("Os mamiferos poden camiñar");
    }
}
