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
public class Autobus extends Vehiculo{
    private int numeroPlazas;
    private int numeroParadas;

    public Autobus(int numeroPlazas, int numeroParadas, String matricula, String modelo, int potencia) {
        super(matricula, modelo, potencia);
        this.numeroPlazas = numeroPlazas;
        this.numeroParadas = numeroParadas;
    }

    public Autobus() {
    }
    
    public Autobus(Autobus a1) {     
        super((Vehiculo)a1);
        this.numeroPlazas = a1.numeroPlazas;
        this.numeroParadas = a1.numeroParadas;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public int getNumeroParadas() {
        return numeroParadas;
    }

    public void setNumeroParadas(int numeroParadas) {
        this.numeroParadas = numeroParadas;
    }
    
    @Override
    public void mostrarAtributos(){
        super.mostrarAtributos();
        System.out.println("El numero de plazas del autobus es: "+this.getNumeroPlazas());
        System.out.println("El numero de paradas del autobus es: "+ this.getNumeroParadas());
    }
    
    @Override
    public void pedirDatosVehiculo(){
        super.pedirDatosVehiculo();
        Scanner lector=new Scanner(System.in);
        System.out.println("Dime el numero de plazas del autobus");
        int plazasAutobus = lector.nextInt();
        this.setNumeroPlazas(plazasAutobus);
        boolean seguirPidiendoNumeroParadasAutobus = true;
        while(seguirPidiendoNumeroParadasAutobus){
            System.out.println("Dime el numero de paradas del autobus");
            int paradasAutobus = lector.nextInt();
            if(paradasAutobus>2&&paradasAutobus<21){
                this.setNumeroParadas(paradasAutobus);
                seguirPidiendoNumeroParadasAutobus = false;
            }
            else{
                System.out.println("El numero minimo de plazas es 3 y el maximo 20");
            }
            
        }
    }
    
}
