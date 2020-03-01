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
public class VTC extends Vehiculo{
    int numeroHorasMaximasTrabajadas;
    int radioAccion;
    String ciudad;

    public VTC(int numeroHorasMaximasTrabajadas, int radioAccion, String ciudad, String matricula, String modelo, int potencia) {
        super(matricula, modelo, potencia);
        this.numeroHorasMaximasTrabajadas = numeroHorasMaximasTrabajadas;
        this.radioAccion = radioAccion;
        this.ciudad = ciudad;
    }

    public VTC() {
    }

    public VTC(VTC V1) {
        super((Vehiculo)V1);
        this.numeroHorasMaximasTrabajadas = V1.numeroHorasMaximasTrabajadas;
        this.radioAccion = V1.radioAccion;
        this.ciudad = V1.ciudad;
    }

    public int getNumeroHorasMaximasTrabajadas() {
        return numeroHorasMaximasTrabajadas;
    }

    public void setNumeroHorasMaximasTrabajadas(int numeroHorasMaximasTrabajadas) {
        this.numeroHorasMaximasTrabajadas = numeroHorasMaximasTrabajadas;
    }

    public int getRadioAccion() {
        return radioAccion;
    }

    public void setRadioAccion(int radioAccion) {
        this.radioAccion = radioAccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    @Override
    public void mostrarAtributos(){
        super.mostrarAtributos();
        System.out.println("El numero de horas maximas travajadas del VTC es: "+this.getNumeroHorasMaximasTrabajadas());
        System.out.println("El radio de accion del VTC es: "+ this.getRadioAccion());
        System.out.println("La ciudad del VTC es: "+ this.getCiudad());
    }
    
    @Override
    public void pedirDatosVehiculo(){
        super.pedirDatosVehiculo();
        Scanner lector=new Scanner(System.in);
        boolean seguirPreguntandoHorasTrabajadas = true;
        while(seguirPreguntandoHorasTrabajadas){
            System.out.println("Dime el numero de horas maximas travajadas del VTC");
            int numeroDeHorasTrabajadas = lector.nextInt();
            if(numeroDeHorasTrabajadas<25){
                this.setNumeroHorasMaximasTrabajadas(numeroDeHorasTrabajadas);
                seguirPreguntandoHorasTrabajadas = false;
            }
            else{
                System.out.println("Las horas maximas travajadas son 24");
            }
        }
        boolean seguirComprobandoRadio = true;
        while(seguirComprobandoRadio){
            System.out.println("Dime el radio de accion del VTC");
            int radioAccion = lector.nextInt();
            if(radioAccion<51){
                this.setRadioAccion(radioAccion);
                seguirComprobandoRadio = false;
            }
            else{
                System.out.println("El radio de accion no puede ser mayor que 50");
            }
        }
        
        System.out.println("Dime la ciudad del VTC");
        String ciudad = lector.next();
        this.setCiudad(ciudad);
    }
}
