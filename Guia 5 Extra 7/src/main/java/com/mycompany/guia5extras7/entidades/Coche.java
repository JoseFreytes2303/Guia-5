/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia5extras7.entidades;

/**
 *
 * @author Usuario
 */
public class Coche {
    private String marca;
    private String modelo;
    private int precio;

    public Coche() {
    }

    public Coche(String marca, String modelo, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + '}';
    }
    
    
    
}
//1) Crea una clase "Coche" con las propiedades 
//"marca", "modelo" y "precio".
//Crea tres objetos de la clase "Coche" y muéstralos por pantalla.