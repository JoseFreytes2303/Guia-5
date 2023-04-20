/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicio1;

import ejercicio1.entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Creamos un objeto de tipo Libro utilizando el constructor vacio
        Libro libro1 = new Libro();
        // Utilizamos el medtodo cargarLibro() para pedir los datos al usuario
        libro1.cargarLibro(sc);
        // Mostramos los datos del libro utilizando el metodo toString()
        System.out.println(libro1.toString());
    }
    /**
     * libro1.mostrarLibro(); Mostrar el libro cargado
     */
}
