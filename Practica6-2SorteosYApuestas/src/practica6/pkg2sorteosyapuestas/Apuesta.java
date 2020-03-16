/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6.pkg2sorteosyapuestas;

/**
 *
 * @author Yann
 */
public abstract class Apuesta {
    private String nombre;
    private String apellidos;
    private int numeroApuesta;
    private static int numeroApuestaSiguiente = 1;

    public Apuesta() {
        this.numeroApuesta = numeroApuestaSiguiente;
        numeroApuestaSiguiente++;
    }

    public Apuesta(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroApuesta = numeroApuestaSiguiente;
        numeroApuestaSiguiente++;
    }
    
    public Apuesta(Apuesta a1) {
        this.nombre = a1.getNombre();
        this.apellidos = a1.getApellidos();
        this.numeroApuesta = a1.getNumeroApuesta();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws ExcepcionMayusculas{
        if(nombre == nombre.toUpperCase()){
            this.nombre = nombre;
        }
        else{
            throw new ExcepcionMayusculas("El nombre ");
        }          
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) throws ExcepcionMayusculas{
        if(apellidos == apellidos.toUpperCase()){
            this.apellidos = apellidos;
        }
        else{
            throw new ExcepcionMayusculas("Los apellidos ");
        }          
    }

    public int getNumeroApuesta() {
        return numeroApuesta;
    }

    public void setNumeroApuesta() {
        this.numeroApuesta = numeroApuestaSiguiente;
        numeroApuestaSiguiente++;
    }

    public static int getNumeroApuestaSiguiente() {
        return numeroApuestaSiguiente;
    }

    public static void setNumeroApuestaSiguiente(int numeroApuestaSiguiente) {
        Apuesta.numeroApuestaSiguiente = numeroApuestaSiguiente;
    }
    
    public void mostrarApuesta(){
        System.out.println("Mostrar apuesta");
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Apellidos "+this.getApellidos());
        System.out.println("Numero de apuesta "+this.getNumeroApuesta());
    }
    
}
