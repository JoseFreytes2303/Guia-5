/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioextra3.entidades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Juego {

    Scanner sc = new Scanner(System.in);

    private int num1;
    private int num2;
    private int victorias2;
    private int victorias1;

    public Juego() {
    }

    public Juego(int Jugador1, int Jugador2, int num1, int num2) {

        this.num1 = num1;
        this.num2 = num2;
    }

    public void iniciarJuego() {
        int intentos = 2;
        String resp = "No";
        do {
            System.out.println("Jugador N°1 ingrese un numero");
            num1 = sc.nextInt();
            System.out.println("Jugador N°2 Adivina el numero ");
            num2 = sc.nextInt();
            do {
                if (num1 == num2) {
                    System.out.println("El numero es correcto");
                    victorias2++;
                } else {
                    System.out.println("Jugador N°2, numero equivocado. Ingrese otro numero ");
                    System.out.println("le quedan " + intentos + " intentos");
                    if (num1 > num2) {
                        System.out.println("Pista: El numero es mayor");
                    } else {
                        System.out.println("El numero es menor");
                    }
                    intentos--;
                    num2 = sc.nextInt();
                    if (num1 == num2) {
                        System.out.println("El numero es correcto");
                        victorias2++;
                    }
                    if (intentos == 0 && num1 != num2) {
                        System.out.println("Se ha quedado sin intentos ");
                        victorias1++;
                    }
                }
            } while (intentos > 0 && num1 != num2);
            System.out.println("Desea seguir Jugando?");
            resp = sc.next();
            if (resp.equalsIgnoreCase("Si")) {
                intentos = 2;
            }
        } while (resp.equalsIgnoreCase("Si"));

    }

    public int victorias1() {
        return victorias1;
    }

    public int victorias2() {
        return victorias2;
    }
}
