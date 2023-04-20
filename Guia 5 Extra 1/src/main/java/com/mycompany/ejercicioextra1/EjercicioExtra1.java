/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicioextra1;

import com.mycompany.ejercicioextra1.entidades.Cancion;

/**
 *
 * @author Usuario
 */
public class EjercicioExtra1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Cancion can = new Cancion();
        can.setAutor("Jose Freytes");
        can.setTitulo("Muchachoooooooooos!");
        System.out.println(can.toString());
        
    }
}
