package com.programacion2.Boletin18;

import metodos.MisMetodos;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String opcion;
        Buzon buzon = new Buzon();
        do {
            opcion = JOptionPane.showInputDialog("\tMENU \n 1.Engadir correo \n 2. Mostrar o total de correos \n 3. Correos que quedan por ler\n 4.Amosar un correo determinado \n 5. Amosar todos os correos \n 6. Eliminar un correo determinado\n 7. Amosar primer correo non lido\n8. Sair");
            switch (opcion) {
                case "1":
                    buzon.engadir();
                    break;
                case "2":
                    if (buzon.numeroCorreos()==0) {
                        System.out.println("Non hai correos no buzón");
                    } else if (buzon.numeroCorreos()==1){
                        System.out.println("Hai un correo no buzón");
                    }else if (buzon.numeroCorreos()>1){
                        System.out.println("Hai "+buzon.numeroCorreos()+ " correos no buzón");
                    }
                    break;
                case "3":
                    buzon.porLer();
                    break;
                case "4":
                    int k=MisMetodos.pedirInt("Introduce o correo que desexe amosar");
                    buzon.amosar(k);
                    break;
                case "5":
                    buzon.mostrar();
                    break;
                case "6":
                    int n = MisMetodos.pedirInt("Introduce o correo que desexe eliminar");
                    buzon.eliminar(n);
                    break;
                case "7":
                    System.out.println( buzon.amosarPrimeiroNoLeido());
                    break;
                case "8":
                    System.exit(0);
            }
        } while (!opcion.equalsIgnoreCase("8"));

    }
}
