/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejercicioextra3;

import com.mycompany.ejercicioextra3.entidades.Juego;

/**
 *
 * @author Usuario
 */
public class EjercicioExtra3 {

    public static void main(String[] args) {
        Juego jugar = new Juego();
        jugar.iniciarJuego();
        System.out.println("Victorias de jugador 1: " + jugar.victorias1());
        System.out.println("Victorias de jugador 2: " + jugar.victorias2());

    }
}
