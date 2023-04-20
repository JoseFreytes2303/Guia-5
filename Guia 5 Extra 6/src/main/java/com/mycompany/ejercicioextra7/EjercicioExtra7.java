/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicioextra7;

import com.mycompany.ejercicioextra7.entidades.Rectangulo;

/**
 *
 * @author Usuario
 */
public class EjercicioExtra7 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Rectangulo recta = new Rectangulo();
        recta.crearRecta();
        recta.calcularArea();
        System.out.println("El area del primer rectangulo es : " + recta.calcularArea());
        Rectangulo recta2 = new Rectangulo(4,6);
        recta2.calcularArea();
        System.out.println("El area del segundo rectangulo es : " + recta2.calcularArea());
    }
}
//Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un
//método "calcular_area" que calcule y devuelva el área del rectángulo.
//Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados
//de 4 y 6 e imprime el área del rectángulo