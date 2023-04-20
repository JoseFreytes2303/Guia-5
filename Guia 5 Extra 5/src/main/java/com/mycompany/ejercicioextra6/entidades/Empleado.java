/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioextra6.entidades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Empleado {

    private String nombre;
    private int edad;
    private int salario;
    Scanner sc = new Scanner(System.in);

    public Empleado() {
    }

    public Empleado(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void calcularAumento() {
        System.out.println("Ingrese su salario actual");
        salario = sc.nextInt();
        System.out.println("Ingrese su edad");
        edad = sc.nextInt();
        if (edad > 30) {
            System.out.println("Su aumeto es de : " + (salario += (salario * 0.10)) );
        } else {
           System.out.println("Su aumeto es de : " + (salario += (salario * 0.05)) );
        }
    }

}
//Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
//"salario". Luego, crea un método "calcular_aumento" que calcule el
//aumento salarial de un empleado en función de su edad y salario actual.
//El aumento salarial debe ser del 10% si el empleado tiene más de 30
//años o del 5% si tiene menos de 30 años.
