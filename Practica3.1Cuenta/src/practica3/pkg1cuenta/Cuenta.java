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
    private String numeroCuenta;
    private double tipoIneteres;
    private double saldo;
    
    public Cuenta(){
        
    }

    public Cuenta(String nombreCliente, String numeroCuenta, double tipoIneteres, double saldo) {
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.tipoIneteres = tipoIneteres;
        this.saldo = saldo;
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

    public void setNumeroCuenta(String numeroCuenta) {
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

    public String getNumeroCuenta() {
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
    
    public static int buscarCuenta(String numCuenta, ArrayList<Cuenta> arrayCuentas){
        boolean seguirComprobando = true;
        int i = 0;
        
        while(seguirComprobando==true){
                        
            if (arrayCuentas.get(i).getNumeroCuenta().equals(numCuenta)){
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


