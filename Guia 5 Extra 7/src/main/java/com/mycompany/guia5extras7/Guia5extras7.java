/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia5extras7;

import com.mycompany.guia5extras7.entidades.Coche;

/**
 *
 * @author Usuario
 */
public class Guia5extras7 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Coche car1 = new Coche();
        Coche car2 = new Coche();
        Coche car3 = new Coche();
        car1.setMarca("Honda");
        car1.setModelo("Full");
        car1.setPrecio(1000);
        car2.setMarca("Mercedes");
        car2.setModelo("Fiiiiummm");
        car2.setPrecio(10000);
        car3.setMarca("Fiat");
        car3.setModelo("Fuaaa");
        car3.setPrecio(100);
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
    }
}
