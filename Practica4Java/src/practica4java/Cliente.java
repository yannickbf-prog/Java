/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4java;

import java.util.ArrayList;

/**
 *
 * @author Yann
 */
public class Cliente {
    private int IdCliente;
    private static int IdClienteSiguiente=1;
    private String nombre;
    private String apellidos;
    private ArrayList<Pelicula> arrayPeliculasReservadasClientes = new ArrayList<Pelicula>();

    public Cliente(String nombre, String apellidos) {
        this.IdCliente = IdClienteSiguiente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        IdClienteSiguiente++;
    }

    public Cliente() {
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public static int getIdClienteSiguiente() {
        return IdClienteSiguiente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public static void setIdClienteSiguiente(int IdClienteSiguiente) {
        Cliente.IdClienteSiguiente = IdClienteSiguiente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public ArrayList<Pelicula> getArrayPeliculasReservadasClientes() {
        return arrayPeliculasReservadasClientes;
    }

    public void setArrayPeliculasReservadasClientes(ArrayList<Pelicula> arrayPeliculas, int posicion) {
        this.arrayPeliculasReservadasClientes.add(arrayPeliculas.get(posicion));
    }
    
    
    
    
}
