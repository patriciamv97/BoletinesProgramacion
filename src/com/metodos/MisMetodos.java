package com.metodos;

import javax.swing.*;

public class MisMetodos {
    public static void mostrarPorConsola(String mensaxe){
        System.out.println(mensaxe);
    }
    public static String pedirString(String mensaxe){
        return JOptionPane.showInputDialog(mensaxe);
    }
    public static float pedirFloat(String mensaxe){
        return Float.parseFloat(JOptionPane.showInputDialog(mensaxe));
    }
    public static int pedirInt(String mensaxe){
        return Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
    }

    public static String lerString(String mensaxe) {
        return JOptionPane.showInputDialog(mensaxe);
    }

    public static int lerEnteiro(String mensaxe) {

        return Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
    }

    public static float lerFloat(String mensaxe) {

        return Float.parseFloat(JOptionPane.showInputDialog(mensaxe));
    }

    public static int escollerOpcion(String mensaxe) {

        return  Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
    }

    public static float obterAreaCuadrado() {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce o lado do cadrado"));
        return (float) Math.pow(num, 2);

    }

    public static float validacionFloat(String menxase) {
        float dato;
        do {
            dato = Float.parseFloat(JOptionPane.showInputDialog(menxase));
        } while (dato <= 0);
        return dato;
    }

    public static int validacionInt(String menxase) {
        int dato;
        do {
            dato = Integer.parseInt(JOptionPane.showInputDialog(menxase));
        } while (dato <= 0);
        return dato;
    }

    public static float validacionPositivos(String menxase) {
        float dato;
        do {
            dato = Float.parseFloat(JOptionPane.showInputDialog(menxase));
        } while (dato < 0);
        return dato;
    }

    public static float[] crearArrayFloat(float[]array,String mensaxe){
        for (int i=0;i<array.length;i++){
            array[i]=pedirFloat(mensaxe);
        }
        return array;
    }
    public static void amosarFloat(float[]array){
        for (Float ele: array){
            System.out.println(ele);
        }
    }
    public static int[] crearArrayInt(int[]array,String mensaxe){
        for (int i=0;i<array.length;i++){
            array[i]=pedirInt(mensaxe);
        }
        return array;
    }
    public static void amosarInt(int[]array){
        for (Integer ele: array){
            System.out.println(ele);
        }
    }

}