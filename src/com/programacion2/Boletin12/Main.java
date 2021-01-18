package com.programacion2.Boletin12;


public class Main {

    public static void main(String[] args) {
	Coche coche = new Coche("4587LP");
	Garaxe cliente1 = new Garaxe(coche);
	cliente1.comprobarPlazas(coche);
	cliente1.calcularPrezo();
	cliente1.factura();



    }
}
