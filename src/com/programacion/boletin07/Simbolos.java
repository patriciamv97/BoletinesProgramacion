package com.programacion.boletin07;

import javax.swing.*;

public class Simbolos {
    public void simbolos(int num){
        if  (num == 0)
            JOptionPane.showMessageDialog(null,"0");
        else
            if (num > 0)
             JOptionPane.showMessageDialog(null,"+");
            else
            JOptionPane.showMessageDialog(null,"-");





    }
}
