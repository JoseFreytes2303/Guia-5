/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.entidades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Circunferencia {
    private double radio;

    public Circunferencia() {
    }
    
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void crearCircunferencia(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        radio = sc.nextDouble();
    }
    public double area(){
        return Math.PI * Math.pow( radio,2); 
    }
    public double perimetro(){
        return 2 * Math.PI * radio;
    }
}
