/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.entidades;

import java.util.Scanner;



/**
 *
 * @author Usuario
 */
public class Libro {

    public int ISBN;
    public String titulo;
    public String autor;
    public int numeroDePagina;

    public Libro() {
        //Constructor vacio   
    }
    //Constructores pasados por parametros

    public Libro(int ISBN, String titulo, String autor, int numeroDePagina) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePagina = numeroDePagina;
    }
    //Cargamos los datos del libro ingreso por el usario
    public void cargarLibro(Scanner sc) {
        
        System.out.println("Ingrese el ISBN del libro");
        this.ISBN = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el titulo del libro");
        this.titulo = sc.nextLine();
        System.out.println("Ingrese el autor del libro");
        this.autor = sc.nextLine();
        System.out.println("Ingrese la cantidad de paginas");
        this.numeroDePagina = sc.nextInt();
    }
    /**public void mostrarLibro() {
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de páginas: " + this.numPaginas);
    }*/
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numeroDePagina=" + numeroDePagina + '}';
    }
    
    //Mostramos los datos del libro
    
}

