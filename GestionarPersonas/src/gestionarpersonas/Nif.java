/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionarpersonas;

import java.util.Scanner;

/**
 *
 * @author Yann
 */
public class Nif {
    private String nif;
    private String direccion;
    private String nombrePadre;
    private String nombreMadre;

    public Nif(String nif, String direccion, String nombrePadre, String nombreMadre) {
        this.nif = nif;
        this.direccion = direccion;
        this.nombrePadre = nombrePadre;
        this.nombreMadre = nombreMadre;
    }
    
    public Nif(){
    }

    public String getNif() {
        return nif;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombrePadre() {
        return nombrePadre;
    }

    public String getNombreMadre() {
        return nombreMadre;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombrePadre(String nombrePadre) {
        this.nombrePadre = nombrePadre;
    }

    public void setNombreMadre(String nombreMadre) {
        this.nombreMadre = nombreMadre;
    }
    
    public void solicitarDatosNif(){
        Scanner lector=new Scanner(System.in);
        System.out.println("Escribe el NIF");
        this.setNif(lector.nextLine());
        System.out.println("Escribe la direccion");
        this.setDireccion(lector.nextLine());
        System.out.println("Escribe el nombre del padre");
        this.setNombrePadre(lector.nextLine());
        System.out.println("Escribe el nombre de la madre");
        this.setNombreMadre(lector.nextLine());
        //hay que poner el nextInt al final sino no funciona
        //la solucion seria asi
        //this.setEdad(Integer.parseInt(lector.nextLine()));
        lector.close();
    }
    
    public void mostrarAtributosNif(){
        System.out.println("El nif es"+this.getNif());
        System.out.println("La direccion es"+this.getDireccion());
        System.out.println("El nombre del padre es"+this.getNombrePadre());
        System.out.println("El nombre de la madre es "+this.getNombreMadre());
    }
}

