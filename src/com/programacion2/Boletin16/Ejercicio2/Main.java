package com.programacion2.Boletin16.Ejercicio2;

import com.metodos.MisMetodos;
public class Main {
    public static void main(String[] args) {

        String opcion;
        int N = MisMetodos.validacionInt("Introduzca a cantidad de persoas");
        float[]altura = new float[N];
        do {
            opcion = MisMetodos.pedirString("***Menu***\n1-->Crear lista\n2-->Amosar\n3-->Calcular media\n4-->Calcula o numero" +
                    " de perosas con altura superior e iferior a media\n5-->Sair");
            switch (opcion) {
                case "1":
                    MisMetodos.crearArrayFloat(altura,"Introduzca a altura das persoas :");
                    break;
                case "2":
                    MisMetodos.amosarFloat(altura);
                    break;
                case "3":
                    MisMetodos.mostrarPorConsola("A media é : "+Persoa.calcularMedia(altura));
                    break;
                case "4":
                    Persoa.alturasInferiorSuperior(altura);
                    break;
                case "5":
                    System.exit(0);
            }
        } while (!opcion.equalsIgnoreCase("5"));

    }
}