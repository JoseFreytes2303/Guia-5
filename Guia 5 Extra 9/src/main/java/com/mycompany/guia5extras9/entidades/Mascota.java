/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia5extras9.entidades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Mascota {

    Scanner sc = new Scanner(System.in);
    private String tipo;
    private String nombre;
    private String raza;
    private int edad;

    public Mascota() {
    }

    public Mascota(String nombre, int edad, String raza, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tipo = tipo;
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

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void crearMascota() {
        System.out.println("Ingrese el tipo de mascota");
        tipo = sc.nextLine();
        System.out.println("Ingrese el nombre de la mascota");
        nombre = sc.nextLine();
        System.out.println("Ingrese la raza de la mascota");
        raza = sc.nextLine();
        System.out.println("Ingrese la edad de la mascota");
        edad = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Mascota{" + "tipo=" + tipo + ", nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + '}';
    }

    public void cumplirAnios() {
        this.edad++;
    }
}
//3) Crea una clase "Mascota" con las propiedades
//"nombre", "edad", "raza" y "tipo" (perro, gato, etc.).
//Crea un constructor para inicializar los valores de las propiedades
//y un método para mostrar por pantalla la información de la mascota.
//Crea un método "cumplirAnios" que aumente en uno la edad de la mascota.
