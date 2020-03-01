/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5ej2;

import java.util.Scanner;

/**
 *
 * @author Yann
 */
public class Taxi extends Vehiculo{
    private int numeroDeLicencia;
    private boolean estado; //libre o ocupado
    private int numeroTaxistasConEstaLicencia;
    private static int numeroDeLicenciaSiguiente = 100;

    public Taxi(boolean estado, int numeroTaxistasConEstaLicencia, String matricula, String modelo, int potencia) {
        super(matricula, modelo, potencia);
        this.numeroDeLicencia = numeroDeLicenciaSiguiente;
        this.estado = estado;
        this.numeroTaxistasConEstaLicencia = numeroTaxistasConEstaLicencia;
        numeroDeLicenciaSiguiente++;
    }

    public Taxi() {
    }

    public Taxi(Taxi t1) {
        super((Vehiculo)t1);
        this.numeroDeLicencia = t1.numeroDeLicencia;
        this.estado = t1.estado;
        this.numeroTaxistasConEstaLicencia = t1.numeroTaxistasConEstaLicencia;
    }

    public int getNumeroDeLicencia() {
        return numeroDeLicencia;
    }

    public void setNumeroDeLicencia() {
        this.numeroDeLicencia = numeroDeLicenciaSiguiente;
        numeroDeLicenciaSiguiente++;
        
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getNumeroTaxistasConEstaLicencia() {
        return numeroTaxistasConEstaLicencia;
    }

    public void setNumeroTaxistasConEstaLicencia(int numeroTaxistasConEstaLicencia) {
        this.numeroTaxistasConEstaLicencia = numeroTaxistasConEstaLicencia;
    }
    
    @Override
    public void mostrarAtributos(){
        super.mostrarAtributos();
        System.out.println("El numero de licencia del taxi es: "+ this.getNumeroDeLicencia());
        String estadoTaxi;
        if(this.isEstado()==true){
            estadoTaxi = "libre";
        }
        else{
            estadoTaxi = "ocupado";
        }
        System.out.println("El estado del taxi libre/ocupado es: "+estadoTaxi);
        
        System.out.println("El numero de taxistas con esta licencia es: "+this.getNumeroTaxistasConEstaLicencia());
    }
    
    @Override
    public void pedirDatosVehiculo(){
        super.pedirDatosVehiculo();
        Scanner lector=new Scanner(System.in);
        this.setNumeroDeLicencia();
        System.out.println("Dime el estado del taxi, esta libre o ocupado");
        String estadoTaxi = lector.next();
        if(estadoTaxi.equals("S")){
            this.setEstado(true);
        }
        else if(estadoTaxi.equals("N")){
            this.setEstado(false);
        }
        else{
            System.out.println("No has escrito S o N");
        }
        System.out.println("Dime el numero de taxistas con esta licencia");
        int numeroLicencias = lector.nextInt();
        this.getNumeroTaxistasConEstaLicencia();
               
        
        
        
    }
}
