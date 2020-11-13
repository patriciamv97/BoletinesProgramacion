package com.programacion.boletin08.ejercicio7;
import javax.swing.*;
public class Menu {
    public static void main(String[] args) {
        Superficies obx = new Superficies();
        int num = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción \ncuadrado          triangulo          circulo\n debe introducir 1, 2 o 3"));
        if (num ==1 || num==2 || num==3)
            obx.calularAreas(num);
        else
            JOptionPane.showMessageDialog(null,"Opción incorrecta");

    }
}