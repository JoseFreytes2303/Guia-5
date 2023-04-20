/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioextra3.entidades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Usuario {

    Scanner sc = new Scanner(System.in);
    private String nombre;
    private String apellido;
    private int edad;
    private String pais;
    public Usuario() {
        System.out.println("Ingrese su nombre");
        nombre = sc.nextLine();
        System.out.println("Ingrese su apellido");
        apellido = sc.nextLine();
        System.out.println("Ingrese su pais");
        pais = sc.nextLine();
        System.out.println("Ingrese su edad");
        edad = sc.nextInt();
    }
    public Usuario(String nombre, String apellido, int edad, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.pais = pais;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", pais=" + pais + '}';
    }

   

  

}
