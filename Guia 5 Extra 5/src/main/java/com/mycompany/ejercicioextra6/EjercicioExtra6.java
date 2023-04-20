/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicioextra6;

import com.mycompany.ejercicioextra6.entidades.Empleado;

/**
 *
 * @author Usuario
 */
public class EjercicioExtra6 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Empleado emp = new Empleado();
        emp.calcularAumento();
        
    }
}
//Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
//"salario". Luego, crea un método "calcular_aumento" que calcule el
//aumento salarial de un empleado en función de su edad y salario actual.
//El aumento salarial debe ser del 10% si el empleado tiene más de 30
//años o del 5% si tiene menos de 30 años.
