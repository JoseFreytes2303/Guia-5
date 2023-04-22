/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia5extras10.entidades;

/**
 *
 * @author Usuario
 */
public class Ascensor {

    private int pisoActual;

    public Ascensor() {
        pisoActual = 0;
    }

    public void subir() {
        if (pisoActual < 10) {
            pisoActual++;
            System.out.println("El ascensor ha subido al piso " + pisoActual);
        } else {
            System.out.println("El ascensor ya se encuentra en el último piso.");
        }
    }

    public void bajar() {
        if (pisoActual > 0) {
            pisoActual--;
            System.out.println("El ascensor ha bajado al piso " + pisoActual);
        } else {
            System.out.println("El ascensor ya se encuentra en el piso 0.");
        }
    }

    public int getPisoActual() {
        return pisoActual;

    }
}