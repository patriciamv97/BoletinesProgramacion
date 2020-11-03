package com.programacion.programasprueba;

public class AreaRectangulo {
    public static void main(String[] args) {
        float base = 4.5f;// poño f para que o tome como float, si non o tomaria como double
        float altura = (float) 2.5;// fago un cast a float por que por defecto o tomo como double
        float area;
        area = base*altura;
        System.out.println("area ="+ area);
    }
}
