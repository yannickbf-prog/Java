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
public final class Repartidor extends Empleado{
    private int horasTrabajadas;
    private String zona;

    public Repartidor(int horasTrabajadas, String zona, String nombre, String apellido1, String apellido2, String nif, int edad, double salario) {
        super(nombre, apellido1, apellido2, nif, edad, salario);
        this.horasTrabajadas = horasTrabajadas;
        this.zona = zona;
    }
    
    public Repartidor(){
    
    }
    
    public Repartidor(Repartidor R1) {
        super(R1);
        this.horasTrabajadas = R1.horasTrabajadas;
        this.zona = R1.zona;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public String getZona() {
        return zona;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    
    @Override
    public void mostrarAtributos(){
        super.mostrarAtributos();
        System.out.println("Las horas trabajadas del repartidor son: "+this.getHorasTrabajadas());
        System.out.println("La zona de trabajo del repartidor es: "+this.getZona());
    }
    
    @Override
    public void pedirAlta(){
        Scanner lector=new Scanner(System.in);
        super.pedirAlta();
        System.out.println("Dime las horas trabajadas del repartidor");
        int horasTrabajadasRepartidor = lector.nextInt();
        this.setHorasTrabajadas(horasTrabajadasRepartidor);
        System.out.println("Dime la zona de trabajo del repartidor");
        String zonaTrabajoRepartidor = lector.next();
        this.setZona(zonaTrabajoRepartidor);
    }
}
