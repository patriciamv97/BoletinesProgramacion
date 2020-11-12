package com.programacion.boletin08.ejercicio6;

import javax.swing.*;

public class VendasAnuais {
    public void clasificar (String nomeArtigo , float totalVendas){
        if (totalVendas<=100)
            JOptionPane.showMessageDialog(null," o consumo de "+nomeArtigo+" é baixo.");
        else
            if (totalVendas>100 & totalVendas<=500)
                JOptionPane.showMessageDialog(null,"O consumo de "+nomeArtigo+" é medio.");
            else
                if (totalVendas>500 & totalVendas<=1000)
                JOptionPane.showMessageDialog(null,"O consumo de "+nomeArtigo+" é alto.");
                else
                JOptionPane.showMessageDialog(null,nomeArtigo+" é de primeira necesidade.");

    }
}
