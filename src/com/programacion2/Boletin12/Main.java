package com.programacion2.Boletin12;


public class Main {

    public static void main(String[] args) {
	Coche coche = new Coche("4587LP");
	Garaxe numC = new Garaxe();
	numC.comprobarPlazas();
	Garaxe cliente1 = new Garaxe(coche);
	cliente1.calcularPrezo();
	cliente1.factura(coche);

	Coche coche1 = new Coche("4587LL");
	numC.comprobarPlazas();
	Garaxe cliente2 = new Garaxe(coche1);
	cliente2.calcularPrezo();
	cliente2.factura(coche1);



    }


}
