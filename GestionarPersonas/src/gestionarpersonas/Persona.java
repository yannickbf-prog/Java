/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionarpersonas;

import java.util.*;

/**
 *
 * @author Yann
 */
public class Persona {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private Nif infoNif=new Nif();
    private static int numpers;

    public Persona(String nombre, String apellido1, String apellido2, int edad, Nif infoNifMetodo) {
        this.setNombre(nombre);
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.infoNif = infoNifMetodo;
        //this.setNif(new Nif("1111111", "direccion", "nombrepadre", "nombremadre"));
        Persona.numpers++;
        
    }

    
    //constructor copia
    public Persona(Persona p1) {
        this.nombre = p1.nombre;
        this.apellido1 = p1.apellido1;
        this.apellido2 = p1.apellido2;
        this.edad = p1.edad;
        //this.nif = p1.nif;
    }
    
    public Persona() {
        this.setNif(new Nif());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Nif getNif() {
        return this.infoNif;
    }

    public void setNif(Nif nif) {
        this.infoNif = nif;
    }
    
    public void solicitarDatos(){
        Scanner lector=new Scanner(System.in);
        System.out.println("Escribe el nombre");
        this.setNombre(lector.nextLine());
        System.out.println("Escribe el primer apellido");
        this.setApellido1(lector.nextLine());
        System.out.println("Escribe el segundo apellido");
        this.setApellido2(lector.nextLine());
        //System.out.println("Escribe el nif");
        //this.setNif(lector.nextLine());
        //System.out.println("Escribe la edad");
        //this.setEdad(Integer.parseInt(lector.nextLine()));
        //hay que poner el nextInt al final sino no funciona
        //la solucion seria asi
        //this.setEdad(Integer.parseInt(lector.nextLine()));
        this.infoNif.solicitarDatosNif();
        
        lector.close();
    }
    
    public void mostrarAtributos(){
        System.out.println("El nombre es"+this.getNombre());
        System.out.println("El apellido es"+this.getApellido1());
        System.out.println("El segundo apellido es"+this.getApellido2());
        //System.out.println("El nif es "+this.getNif());
        //System.out.println("La edad es "+this.getEdad());
        this.infoNif.mostrarAtributosNif();
    }
    
}
