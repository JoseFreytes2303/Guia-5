/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia5extras9;

import com.mycompany.guia5extras9.entidades.Mascota;

/**
 *
 * @author Usuario
 */
public class Guia5extras9 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Mascota m1 = new Mascota();
        m1.crearMascota();
        System.out.println(m1.toString());
        m1.cumplirAnios();
        System.out.println(m1.toString());
    }
}
