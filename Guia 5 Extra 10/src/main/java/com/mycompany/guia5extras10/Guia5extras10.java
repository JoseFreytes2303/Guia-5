/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.guia5extras10;

import com.mycompany.guia5extras10.entidades.Ascensor;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia5extras10 {

    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Piso actual: " + ascensor.getPisoActual());
            System.out.println("¿A qué piso desea ir? (0-10)");
            int piso = scanner.nextInt();

            if (piso < 0 || piso > 10) {
                System.out.println("El piso seleccionado no es válido.");
                continue;
            }

            if (piso > ascensor.getPisoActual()) {
                while (ascensor.getPisoActual() != piso) {
                    ascensor.subir();
                }
            } else if (piso < ascensor.getPisoActual()) {
                while (ascensor.getPisoActual() != piso) {
                    ascensor.bajar();
                }
            }

            System.out.println("Ha llegado al piso " + piso);
        }
    }
}
