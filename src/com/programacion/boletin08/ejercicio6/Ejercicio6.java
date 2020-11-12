package com.programacion.boletin08.ejercicio6;

import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        String nomeArtigo = JOptionPane.showInputDialog("Introduce o nome do artigo :");
        float totalVendas = Float.parseFloat(JOptionPane.showInputDialog("Introduce o total de vendas anuais :"));
        VendasAnuais obx = new VendasAnuais();
        obx.clasificar(nomeArtigo,totalVendas);

    }
}
