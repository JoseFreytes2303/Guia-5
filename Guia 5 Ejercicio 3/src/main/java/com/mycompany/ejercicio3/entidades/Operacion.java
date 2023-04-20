/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3.entidades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Operacion {
    Scanner sc = new Scanner(System.in);
    private int numero1;
    private int numero2;
    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public Operacion() {
    }
    
    public int getNumero1() {
        return numero1;
    }
    
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }
    
    public int getNumero2() {
        return numero2;
    }
    
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
        
        System.out.println("Ingrese los numeros");
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();
    }
    
    public int sumar(){
        return numero1 + numero2; 
    }
    
    public int restar(){
        return numero1 - numero2;
    }
    
    public int multiplicar(){
        if (numero2 != 0 && numero1 != 0){
            return numero1 * numero2;
        } else {
            System.out.println("Error");
            return 0;
        }
        
    }
    
    public int dividir(){
       if (numero2 != 0 && numero1 != 0){
        return numero1 / numero2;
    } else {
           System.out.println("Error");
           return 0;
       }
    }
    
    public void opcion(){
        int opcion;
        boolean exit = false;
        do{
            System.out.println("Ingrese la operacion que desea realizar");
            System.out.println("1 - SUMA");
            System.out.println("2 - RESTA");
            System.out.println("3 - MULTIPLICAR");
            System.out.println("4 - DIVIDIR");
            System.out.println("5 - SALIR");
            opcion = sc.nextInt();
            switch (opcion){
               case 1:
                   System.out.println("La suma de los numeros es: " + sumar());
                   break;
               case 2:
                   System.out.println("La Resta de los numeros es: " + restar());
                   break;
               case 3:
                   System.out.println("La multiplicacion de los numeros es: " + multiplicar()); 
                   break;
               case 4:
                   System.out.println("La division de los numeros es: " + dividir()); 
                   break;
               case 5:
                   exit = true;
            }
        } while (exit == false);
    }
}
