/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicio2;

import ejercicio2.entidades.Circunferencia;

/**
 *
 * @author Usuario
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Circunferencia cir = new Circunferencia();
        cir.crearCircunferencia();
        System.out.println("El area es: " + cir.area());
        System.out.println("El perimetro es: " + cir.perimetro());
    }
}
