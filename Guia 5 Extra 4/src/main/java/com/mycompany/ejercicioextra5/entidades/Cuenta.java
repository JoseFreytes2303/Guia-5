/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioextra5.entidades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Cuenta {

    private double saldo;
    private String titular;
    Scanner sc = new Scanner(System.in);

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void retirarSaldo() {
        saldo = 10000;
        System.out.println("Su saldo es de : " + saldo);
        int retirar = 0;
        do {
            System.out.println("Ingrese la cantidad que desea retirar");
             retirar = sc.nextInt();
            if (saldo > retirar) {
                saldo -= retirar;
                System.out.println("Su saldo es de : " + saldo);
            } else {
                System.out.println("Saldo insuficiente!");
            }

        } while (saldo < retirar);

    }
}
