/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicioextra2;

import com.mycompany.ejercicioextra2.entidades.Puntos;

/**
 *
 * @author Usuario
 */
public class EjercicioExtra2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Puntos ps = new Puntos();
        ps.crearPunts();
        System.out.println("La distancia es: " + ps.distancia());
        
    }
}
