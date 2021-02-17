package com.programacion2.Boletin15.Ejercicio3;

import javax.swing.*;

public class Metodos {
    int num;
    Alumno[] alumnos = new Alumno[5];
    public void menu() {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu:\n0 para salir\n1 Crear lista alumnos\n2 Amosar lista alumnos\n3 Visualizar Nº Suspensos y Aprobados"
                    + "\n4 Mostrar a nota media da clase\n5 Mostrar a nota máis alta\n6 Lista alumnos aprobados\n7 Lista notas ordenadas por orde crecente\n8 Pedir a nota de un alumno"));
            switch (opcion) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    crearArrayAlumno();
                    break;
                case 2:
                    amosarArray(alumnos);
                    break;
                case 3:
                    numeroAprobadosSuspensos(alumnos);
                    break;
                case 4:
                    media(alumnos);
                    break;
                case 5:
                    notaMaisAlta(alumnos);
                    break;
                case 6: listaAprobados(alumnos);
                    break;
                case 7: listaOrdenada(alumnos);
                        amosarArray(alumnos);
                    break;
                case 8: notaAlumnoDeterminado(alumnos);
                    break;

            }
        } while (opcion != 0);
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

    public void listaAprobados(Alumno[]alumnos){
        System.out.println("\n");
        System.out.println("Os alumnos aprobados son : \n");
        for (int i=0; i<alumnos.length;i++){
            if (alumnos[i].getNota()>=5){
                System.out.println(alumnos[i].getNombre()+"--"+alumnos[i].getNota());
            }
        }
    }
    public void listaOrdenada(Alumno[]alumnos){
        System.out.println("\n");
        System.out.println("A nota dos alumnos por orde crecente : \n");
        Alumno aux;
        for (int i=0;i< alumnos.length-1;i++){
            for (int j=i+1;j<alumnos.length;j++){
                if(alumnos[i].getNota()>alumnos[j].getNota()) {
                    aux = alumnos[i];
                    alumnos[i] = alumnos[j];
                    alumnos[j] = aux;
                }
            }
        }
    }
    public void notaAlumnoDeterminado(Alumno[]alumnos){
        boolean existe=false;
        String alumnox=JOptionPane.showInputDialog("Introduce o nome do alumno de que se quere saber a nota");
        for (int i=0; i<alumnos.length;i++){
            if (alumnos[i].getNombre().equalsIgnoreCase(alumnox)){
                System.out.println("\nA nota do alumno "+alumnox+" é "+alumnos[i].getNota());
            existe=true;
            }
        }
        if (existe==false)
            System.out.println("O nombre non se atopa na lista de alumnos.");

    }
}
