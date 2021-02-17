package com.programacion2.Boletin15.Ejercicio2;

import javax.swing.*;

public class Metodos {
    int num;
    Alumno[] alumnos = new Alumno[5];
    public void menu(){
        int opcion;
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog("Menu:\n0 para salir\n1 Crear lista alumnos\n2 Amosar lista alumnos\n3 Visualizar Nº Suspensos y Aprobados\n4 Mostrar a nota media da clase\n5 Mostrar a nota máis alta"));
            switch(opcion){
                case 0:System.exit(0);
                    break;
                case 1: crearArrayAlumno();
                    break;
                case 2: amosarArray(alumnos);
                    break;
                case 3:  numeroAprobadosSuspensos(alumnos);
                    break;
                case 4:  media(alumnos);
                    break;
                case 5: notaMaisAlta(alumnos);
                    break;

            }
        }while(opcion!=0);
    }
    public Alumno[] crearArrayAlumno() {
        String nombre = "";
        int nota = 0;
        String[] nombresAleatorios = new String[5];
        String[] nombres = { "Andrea", "David", "Javier", "Eugenia", "Raquel", "Lucas", "Pedro", "Adriana",
                "Alberto", "Manuel", "Lola", "Ángela", "Begoña", "Uxía", "Laura", "Aida", "Oscar",
                "Bernardo", "Lucia", "José"};
        for (int i=0; i<nombresAleatorios.length;i++){
            nombresAleatorios[i]=nombres[(int) Math.floor(Math.random()* ((nombres.length - 1) - 0 + 1))];
        }
        for (int i = 0; i < alumnos.length; i++) {
            nombre =nombresAleatorios[i];
            num = (int) (Math.random() * 10 + 1);
            nota = num;
            alumnos[i] = new Alumno(nota, nombre);
        }
        return alumnos;
    }

    public void amosarArray(Alumno[] alumnos) {
        for (Alumno elemento : alumnos) {
            System.out.println(elemento);
        }
    }
    public void numeroAprobadosSuspensos(Alumno[]alumnos){
        int aprobados=0, suspensos=0;
        for (int i=0; i<alumnos.length;i++){
            if (alumnos[i].getNota()>=5){
                aprobados++;
            }
            else
                suspensos++;
        }
        System.out.println("\nO número de aprobados é : "+aprobados+"\nO número de suspensos é : "+suspensos);
    }
    public void media(Alumno[]alumnos){
        float acumulado=0;
        for (int i=0;i<alumnos.length;i++){
            acumulado=acumulado+alumnos[i].getNota();
        }
        System.out.println("\nA media dos alumnos é : "+acumulado/ alumnos.length);
    }
    public void notaMaisAlta(Alumno[]alumnos){
        int aux=0;
        for (int i=0;i<alumnos.length;i++){
            if (alumnos[i].getNota()>aux){
                aux=alumnos[i].getNota();
            }
        }
        System.out.println("\nA nota máis alta é : " +aux);
    }

}
