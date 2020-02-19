/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4java;

/**
 *
 * @author Yann
 */

import java.util.ArrayList;
//import java.util.Scanner;


public class Pelicula {
    private int Id;
    private static int IdSiguiente = 1;
    private String Titulo;
    private String Director;
    private int Duracion;
    private String Genero;
    private int Año;
    private boolean Disponibilidad;
    private int cantidadTotalCopiasPeliculas; //Cantidad de copias total del id de la película
    private int cantidadCopiasReservadas; //Cantidad de copias reservadas del id de la película
    //private Cliente clientePelicula=new Cliente();
    private ArrayList<Integer> arrayClientesReservanPelicula = new ArrayList<Integer>();
    
    public Pelicula(String titulo, String director, int duracion, String genero, int año, boolean disponibilidad, int cantidadTotalCopiasPeliculas, int cantidadCopiasReservadas){
        this.Id=IdSiguiente;
        this.Titulo=titulo;
        this.Director=director;
        this.Duracion=duracion;
        this.Genero=genero;
        this.Año=año;
        this.Disponibilidad=disponibilidad;
        this.cantidadTotalCopiasPeliculas=cantidadTotalCopiasPeliculas;
        this.cantidadCopiasReservadas=cantidadCopiasReservadas;
        IdSiguiente++;
    }
    
    /*public Pelicula() {
        this.setClientePelicula(new Cliente());
    }*/
    
    public int getId() {
        return Id;
    }

    public static int getIdSiguiente() {
        return IdSiguiente;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getDirector() {
        return Director;
    }

    public int getDuracion() {
        return Duracion;
    }

    public String getGenero() {
        return Genero;
    }

    public int getAño() {
        return Año;
    }

    public boolean isDisponibilidad() {
        return Disponibilidad;
    }

    public int getCantidadTotalCopiasPeliculas() {
        return cantidadTotalCopiasPeliculas;
    }

    public int getCantidadCopiasReservadas() {
        return cantidadCopiasReservadas;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public static void setIdSiguiente(int IdSiguiente) {
        Pelicula.IdSiguiente = IdSiguiente;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public void setDisponibilidad(boolean Disponibilidad) {
        this.Disponibilidad = Disponibilidad;
    }

    public void setCantidadTotalCopiasPeliculas(int cantidadTotalCopiasPeliculas) {
        this.cantidadTotalCopiasPeliculas = cantidadTotalCopiasPeliculas;
    }

    public void setCantidadCopiasReservadas(int cantidadCopiasReservadas) {
        this.cantidadCopiasReservadas = cantidadCopiasReservadas;
    }
    
    /*public Cliente getClientePelicula() {
        return this.clientePelicula;
    }*/

    /*public void setClientePelicula(Cliente clientePelicula) {
        this.clientePelicula = clientePelicula;
    }*/
    //Scanner lector=new Scanner(System.in);

    public ArrayList<Integer> getArrayClientesReservanPelicula() {
        return arrayClientesReservanPelicula;
    }

   

    public void setArrayClientesReservanPelicula(int idCliente) {//este id es 1- del verdadero para que se corresponda con la posicion en el array
        this.arrayClientesReservanPelicula.add(idCliente);   
    }
    
    
    
   
}
