/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioextra2.entidades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Puntos {
   Scanner sc = new Scanner(System.in);
   private double x1;
   private double x2;
   private double y1;
   private double y2;
   
   public void crearPunts(){
       System.out.println("Ingrese el punto para x1");
       x1 = sc.nextDouble();
       System.out.println("Ingrese el punto para x2");
       x2 = sc.nextDouble();
       System.out.println("Ingrese el punto para y1");
       y1 = sc.nextDouble();
       System.out.println("Ingrese el punto para y2");
       y2 = sc.nextDouble();
   }
   
   public double distancia(){
      double distancia =  Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
      return distancia;
   }

    
}
