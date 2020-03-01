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
public abstract class Vehiculo {
    private int id;
    private static int IdSiguiente = 1;
    private String matricula;
    private String modelo;
    private int potencia;

    public Vehiculo(String matricula, String modelo, int potencia) {
        this.id = IdSiguiente;
        this.matricula = matricula.toUpperCase();
        this.modelo = modelo.substring(0, 1).toUpperCase() + modelo.substring(1);
        this.potencia = potencia;
        IdSiguiente++;
    }

    public Vehiculo() {
    }
    
    public Vehiculo(Vehiculo V1) {
        this.id = V1.id;
        this.matricula = V1.matricula;
        this.modelo = V1.modelo;
        this.potencia = V1.potencia;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = IdSiguiente;
        IdSiguiente++;
    }

    public static int getIdSiguiente() {
        return IdSiguiente;
    }

    public static void setIdSiguiente(int IdSiguiente) {
        Vehiculo.IdSiguiente = IdSiguiente;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula.toUpperCase();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo.substring(0, 1).toUpperCase() + modelo.substring(1);
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void mostrarAtributos(){
        System.out.println("El id del vehiculo es: "+ this.getId());
        System.out.println("La matricula del vehiculo es: "+this.getMatricula());
        System.out.println("El modelo del vehiculo es: "+this.getModelo());
        System.out.println("La potencia del modelo es: "+this.getPotencia());
    }
    
    public void pedirDatosVehiculo(){
        Scanner lector=new Scanner(System.in);
        this.setId();
        System.out.println("Dime la matricula del vehiculo");
        String matricula = lector.next();
        this.setMatricula(matricula);
        System.out.println("Dime el modelo del vehiculo");
        String modelo = lector.next();
        this.setModelo(modelo);
        boolean seguirPreguntandoPotencia = true;
        while(seguirPreguntandoPotencia){
            System.out.println("Dime la potencia del vehiculo");
            int potencia = lector.nextInt();
            if(potencia>0){
                this.setPotencia(potencia);
                seguirPreguntandoPotencia=false;
            }
            else{
                System.out.println("La potencia tiene que ser mayor que 0");
            }
            
        }
        
        
    }
   
}
