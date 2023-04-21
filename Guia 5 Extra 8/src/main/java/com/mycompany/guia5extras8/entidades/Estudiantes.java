/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia5extras8.entidades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Estudiantes {

    Scanner sc = new Scanner(System.in);
    private double notaMedia;
    private String estudiantes[];
    private double promedio[];

    public Estudiantes() {

    }

    public Estudiantes(String[] estudiantes, double[] promedio) {
        this.estudiantes = estudiantes;
        this.promedio = promedio;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public String[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(String[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public double[] getPromedio() {
        return promedio;
    }

    public void setPromedio(double[] promedio) {
        this.promedio = promedio;
    }

    public void notaMedia() {
        System.out.println("Ingrese la cantidad de estudiantes");
        int cantEst = sc.nextInt();
        sc.nextLine();
        estudiantes = new String[cantEst];
        promedio = new double[cantEst];
        for (int i = 0; i < cantEst; i++) {
            System.out.println("Ingrese su nombre");
            estudiantes[i] = sc.nextLine();
            System.out.println("Ingrese nota promedio");
            promedio[i] = sc.nextDouble();
            sc.nextLine();
            setNotaMedia(getNotaMedia() + promedio[i]);
        }
        setNotaMedia(getNotaMedia() / cantEst);
    }

    public void mostrar() {
        System.out.println("La nota media de los estudiantes es: " + getNotaMedia());
        for (int i = 0; i < estudiantes.length; i++) {
            if (promedio[i] > getNotaMedia()) {
                System.out.println("El estudiante " + estudiantes[i] + " tiene una nota medio superior");
            } else {
                System.out.println("El estudiante " + estudiantes[i] + " tiene una nota medio inferior o igual");
            }
        }
    }

}
//2) Crea una clase "Estudiante" con las propiedades
//"nombre", "edad" y "nota media".
//Crea un método para calcular la nota media de un grupo 
//de estudiantes y otro para mostrar por pantalla los estudiantes
//que tienen una nota media superior.
