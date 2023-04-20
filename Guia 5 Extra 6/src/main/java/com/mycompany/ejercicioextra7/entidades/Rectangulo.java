/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioextra7.entidades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Rectangulo {

    private int lado1;
    private int lado2;
    Scanner sc = new Scanner(System.in);

    public Rectangulo() {
    }

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    
    public void crearRecta(){
      System.out.println("Ingrese la medidad del lado 1 ");
        lado1 = sc.nextInt();
        System.out.println("Ingrese la medida del lado 2 ");
        lado2 = sc.nextInt();  
    }
    
    public double calcularArea() {
        return lado1 * lado2;
        
    }

}
//Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un
//método "calcular_area" que calcule y devuelva el área del rectángulo.
//Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados
//de 4 y 6 y imprime el área del rectángulo
