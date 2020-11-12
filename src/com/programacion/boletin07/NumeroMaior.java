package com.programacion.boletin07;

import javax.swing.*;

public class NumeroMaior {
    public void comparar (float n1, float n2, float n3){
        if (n1>n2 & n2>n3)
            JOptionPane.showMessageDialog(null,n1+" é maior");
        else
            if (n2>n3 & n3>n1)
            JOptionPane.showMessageDialog(null,n2+" é maior");

            else

            JOptionPane.showMessageDialog(null,n3+" é maior");
    }
}
