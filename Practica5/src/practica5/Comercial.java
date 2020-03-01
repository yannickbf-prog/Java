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
public final class Comercial extends Empleado{
    private int ventasRealizadas;
    private double comision; 

    public Comercial(int ventasRealizadas, double comision, String nombre, String apellido1, String apellido2, String nif, int edad, double salario) {
        super(nombre, apellido1, apellido2, nif, edad, salario);
        this.ventasRealizadas = ventasRealizadas;
        this.comision = comision;
    }
    
    public Comercial(){
        
    }

    public Comercial(int ventasRealizadas, double comision, Empleado E1) {
        super(E1);
        this.ventasRealizadas = ventasRealizadas;
        this.comision = comision;
    }

    public int getVentasRealizadas() {
        return ventasRealizadas;
    }

    public double getComision() {
        return comision;
    }

    public void setVentasRealizadas(int ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
    
    @Override
    public void mostrarAtributos(){
        super.mostrarAtributos();
        System.out.println("Las ventas realizadas del comercial son: "+this.getVentasRealizadas());
        System.out.println("La comision del comercial es: "+this.getComision());
    }
    
    @Override
    public void pedirAlta(){
        Scanner lector=new Scanner(System.in);
        super.pedirAlta();
        System.out.println("Dime las ventas realizadas del comercial");
        int ventasRealizadasComercial = lector.nextInt();
        this.setVentasRealizadas(ventasRealizadasComercial);
        System.out.println("Dime la comision del comercial");
        double comisionComercial = lector.nextDouble();
        this.setComision(comisionComercial);
        
    }
}
