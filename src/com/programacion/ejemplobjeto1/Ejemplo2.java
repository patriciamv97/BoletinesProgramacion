package com.programacion.ejemplobjeto1;
import java.util.Scanner;
public class Ejemplo2 {
    public static void main(String[] args) {
        //instancio un obxecto tipo Rectangulo
        Scanner sc= new Scanner(System.in);
        Rectangulo obxRec1 = new Rectangulo();
        obxRec1.amosar();
        /*La salida de la base y la altura son 0.0 por que en el constructor sin parametros
         las variables están inicializadas a 0.0 y null */
        Rectangulo obxRec2= new Rectangulo (3f,5f);
        obxRec2.amosar();
        float r=obxRec2.getAltura(); //Metodo para obtener la altura, se obtendra el 5 que le asignamos antes
        System.out.println("altura = "+ r);
        System.out.println("Datos predefinidos");
        obxRec1.setBase(10f);
        obxRec1.setAltura(11f);
        obxRec1.amosar(); // Metodo para mostrar por pantalla el area y la altura
        System.out.println("Entrada de datos por pantalla");
        System.out.println("base =");
        float ba= sc.nextFloat();
        System.out.println("altura =");
        float alt = sc.nextFloat();
        Rectangulo obxR= new Rectangulo();
        float res=obxR.area(ba, alt); //Metododo para calcular area y mostrarla por pantalla

    }




}


