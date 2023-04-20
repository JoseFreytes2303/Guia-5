/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio4.entidades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Rectangulo {
      Scanner sc = new Scanner(System.in);
      private int base;
      private int altura;
      
    public Rectangulo() {
    }
    
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public Scanner getSc() {
        return sc;
    }
    
    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    
    public int getBase() {
        return base;
    }
    
    public void setBase(int base) {
        this.base = base;
    }
    
    public int getAltura() {
        return altura;
    }
    
    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(){
        System.out.println("Ingrese la altura del rectangulo");
        altura = sc.nextInt();
        System.out.println("Ingrese la base del rectangulo");
        base = sc.nextInt();
    
    }
    
    public int superficie(){
        return base * altura;
    }
    
    public int perimetro(){
        return (base + altura) * 2;
    }  
    
    public void mostar(){
         for (int i = 0; i < altura; i++) { 
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }   
            }
            System.out.println();
        }
    }
}
           
    
            
       
         
    
    
