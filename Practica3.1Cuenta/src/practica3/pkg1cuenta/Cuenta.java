/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3.pkg1cuenta;

import java.util.ArrayList;

/**
 *
 * @author Yann
 */
public class Cuenta {
    private String nombreCliente;
    private int numeroCuenta;
    private static int numeroCuentaSiguiente=1; //al poner static aqui lo que hace es que no pertenece a ningun objeto, solo a la clase
    private double tipoIneteres;
    private double saldo;
    
    public Cuenta(){
        
    }

    public Cuenta(String nombreCliente, double tipoIneteres, double saldo) {
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuentaSiguiente;
        this.tipoIneteres = tipoIneteres;
        this.saldo = saldo;
        numeroCuentaSiguiente++;
    }
    
    public Cuenta(Cuenta C1) {
        this.nombreCliente = C1.nombreCliente;
        this.numeroCuenta = C1.numeroCuenta;
        this.tipoIneteres = C1.tipoIneteres;
        this.saldo = C1.saldo;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setTipoIneteres(double tipoIneteres) {
        this.tipoIneteres = tipoIneteres;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getTipoIneteres() {
        return tipoIneteres;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public boolean ingreso(double cantidad){
        double saldoActual=this.getSaldo();
        this.setSaldo(saldoActual+cantidad);
        return getSaldo()==saldoActual+cantidad;
             
    }
    
    public boolean reintegro(double cantidad){
        boolean reintegroOk=false;
        double saldoActual=this.getSaldo();
        if(saldoActual>cantidad && cantidad>0){
            this.setSaldo(saldoActual-cantidad);
            reintegroOk=true;
        }
        else{
            System.out.println("No puedes retirar " + cantidad + " euros por que supera la cantidad que tienes en tu cuenta o no has puesto una cifra valida");
        }
        return reintegroOk;
    }
    
    public void transferencia(Cuenta C1, double importe){
        this.setSaldo(this.getSaldo()-importe);
        C1.setSaldo(C1.getSaldo()+importe);
    }
    
    public static int buscarCuenta(int numCuenta, ArrayList<Cuenta> arrayCuentas){// como es static se le tiene que pasar la clase cuando llamas al metodo
        boolean seguirComprobando = true;
        int i = 0;
        
        while(seguirComprobando==true){
                        
            if (arrayCuentas.get(i).getNumeroCuenta()==numCuenta){
                return i;
                //return guardarCuenta;
                //seguirComprobando=false;
            }//.ingreso(cantidad);
            if(i==arrayCuentas.size()){
                seguirComprobando=false;
            }
            i++;                            
         }
        return -1;
    }

}


