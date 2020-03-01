/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

import java.util.Scanner;

/**
 *
 * @author Yann
 */
public class Empleado {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String nif;
    private int edad;
    private double salario; 

    public Empleado(String nombre, String apellido1, String apellido2, String nif, int edad, double salario) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nif = nif;
        this.edad = edad;
        this.salario = salario;
    }
    
    public Empleado(){
    
    }
    
    public Empleado(Empleado E1) {
        this.nombre = E1.nombre;
        this.apellido1 = E1.apellido1;
        this.apellido2 = E1.apellido2;
        this.nif = E1.nif;
        this.edad = E1.edad;
        this.salario = E1.salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getNif() {
        return nif;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        nombre = nombre.substring(0, 1).toUpperCase() + nombre.substring(1);
        this.nombre = nombre;
    }

    public void setApellido1(String apellido1) {
        apellido1 = apellido1.substring(0, 1).toUpperCase() + apellido1.substring(1);
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        apellido2 = apellido2.substring(0, 1).toUpperCase() + apellido2.substring(1);
        this.apellido2 = apellido2;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void mostrarAtributos(){
        System.out.println("El nombre del empleado es: "+ this.getNombre());
        System.out.println("El apellido1 del empleado es: "+this.getApellido1());
        System.out.println("El apellido2 del empleado es: "+this.getApellido2());
        System.out.println("El nif del empleado es: "+this.getNif());
        System.out.println("La edad del empleado es: "+this.getEdad());
        System.out.println("El salario del empleado es: "+this.getSalario());
    }
    
    public void pedirAlta(){
        Scanner lector=new Scanner(System.in);
        System.out.println("Dime el nombre del empleado");
        String nombreEmpleado = lector.next();
        this.setNombre(nombreEmpleado);
        System.out.println("Dime el primer apellido del empleado");
        String primerApellidoEmpleado = lector.next();
        this.setApellido1(primerApellidoEmpleado);
        System.out.println("Dime el segundo apellido del empleado");
        String segundoApellidoEmpleado = lector.next();
        this.setApellido2(segundoApellidoEmpleado);
        System.out.println("Dime el nif del empleado");
        String nifEmpleado = lector.next();
        this.setNif(nifEmpleado);
        boolean seguirPreguntandoEdad = true;
        while(seguirPreguntandoEdad){
            System.out.println("Dime la edad del empleado");
            int edadEmpleado = lector.nextInt();
            if(edadEmpleado>15){
                this.setEdad(edadEmpleado);
                seguirPreguntandoEdad=false;
            }
            else{
                System.out.println("No puedes darte de alta si tienes menos de 16 años");
            }
        }
        System.out.println("Dime el salario del empleado");
        double salarioEmpleado = lector.nextDouble();
        this.setSalario(salarioEmpleado);
    }
}
