/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3.pkg1cuenta;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Yann
 */
public class Practica31Cuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//como es public se puede acceder desde fuera de la clase
        // TODO code application logic here
        ArrayList<Cuenta> arrayCuentas = new ArrayList<Cuenta>();
    
        Cuenta Yannick=new Cuenta("Yannick", 4.3, 1000.35);
        
        Cuenta Juanito=new Cuenta("Juanito", 4.5, 500.00);
        
        arrayCuentas.add(Yannick);
        arrayCuentas.add(Juanito);
        
        //Yannick.ingreso(50);
        
        //System.out.println(Yannick.getSaldo());
        
        //Yannick.reintegro(10);
        
        //System.out.println(Yannick.getSaldo());
        
        //Yannick.transferencia(Juanito, 70.00);
        
        
        boolean seguir=true;
        while(seguir==true){
            System.out.println("Bienvenido a la practica 1 de Java orientado a objetos");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Hacer transferencia");
            System.out.println("4. Crear cuenta");
            System.out.println("5. Salir");
            System.out.println("Elije una opcion");
            
            Scanner lector=new Scanner(System.in);
            
            int cuenta;
            double cantidad;
            boolean seguirComprobando = true;
            int i=0;
            
            int opcion = lector.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("1. Ingresar dinero");
                    System.out.println("Dime tu cuenta");
                    cuenta = lector.nextInt();
                    System.out.println("Dime que cantidad quieres ingresar");
                    cantidad = lector.nextDouble();
                    //cuenta.ingreso(cantidad);
                    seguirComprobando = true;
                    i=0;
                    while(seguirComprobando==true){
                        
                        if (arrayCuentas.get(i).getNumeroCuenta()==cuenta){
                            arrayCuentas.get(i).ingreso(cantidad);
                            System.out.println("La cantidad " + cantidad + " se ha añadido a tu cuenta. La cantidad que tienes ahora en la cuenta es " + arrayCuentas.get(i).getSaldo());
                            seguirComprobando=false;
                        }//.ingreso(cantidad);
                        
                        if(i==arrayCuentas.size()){
                            seguirComprobando=false;
                        }
                        i++;
                            
                    }
                    /*for(int i=0;i<arrayCuentas.size();i++){
                        
                    }*/
                    
                break;
                case 2:
                    System.out.println("2. Retirar dinero");
                    System.out.println("Dime tu cuenta");
                    cuenta = lector.nextInt();
                    System.out.println("Dime la cantidad que deseas retirar");
                    cantidad=lector.nextDouble();
                    
                    i=0;
                    while(seguirComprobando==true){
                        
                        if (arrayCuentas.get(i).getNumeroCuenta()==cuenta){
                            if(arrayCuentas.get(i).reintegro(cantidad)){
                                System.out.println("La cantidad " + cantidad + " se ha retirado de tu cuenta. La cantidad que tienes ahora en la cuenta es " + arrayCuentas.get(i).getSaldo());
                                seguirComprobando=false;
                            }                            
                        }//.ingreso(cantidad);
                        
                        if(i==arrayCuentas.size()){
                            seguirComprobando=false;
                        }
                        i++;
                            
                    }
                break;    
                    
                case 3:
                    System.out.println("3. Hacer transferencia");
                    System.out.println("Dime tu cuenta");
                    int cuentaOrigen = lector.nextInt();
                    System.out.println("Dime la cuenta de destion");
                    int cuentaDestino = lector.nextInt();
                    System.out.println("Dime la cantidad que deseas ingresar");
                    cantidad=lector.nextDouble();
                    
                    //i=0;
                    
                    Cuenta origenTransferencia = new Cuenta();
                    
                    if(Cuenta.buscarCuenta(cuentaOrigen, arrayCuentas)>-1){//le pasamos la clase por que el metodo es static
                        origenTransferencia = arrayCuentas.get(Cuenta.buscarCuenta(cuentaOrigen, arrayCuentas));
                    }
                    else{
                        System.out.println("No has puesto bien la cuenta de origen");
                    }
                    /*if(buscarCuenta(cuentaDestino, arrayCuentas)>-1){
                        //origenTransferencia.arrayCuentas.get(buscarCuenta(cuentaOrigen, arrayCuentas));
                    }
                    else{
                        System.out.println("No has puesto bien la cuenta de destino");
                    }
                    */
                    /*while(seguirComprobando==true){
                        
                        if (arrayCuentas.get(i).getNumeroCuenta().equals(cuentaDestino)){
                            guardarCuenta.transferencia(arrayCuentas.get(i), cantidad);
                            seguirComprobando=false;
                        }//.ingreso(cantidad);
                        if(i==arrayCuentas.size()){
                            seguirComprobando=false;
                        }
                        i++;                            
                    }*/
                    Cuenta destinoTransferencia = new Cuenta();
                    if(Cuenta.buscarCuenta(cuentaDestino, arrayCuentas)>-1){
                        
                        destinoTransferencia = arrayCuentas.get(Cuenta.buscarCuenta(cuentaDestino, arrayCuentas));
                        origenTransferencia.transferencia(destinoTransferencia, cantidad);
                    }
                    else{
                        System.out.println("No has puesto bien la cuenta de destino");
                    }
                    
                    System.out.println("La transaccion de " + origenTransferencia.getNombreCliente() + " a " + destinoTransferencia.getNombreCliente() + " por un valor de " + cantidad + ". Se ha efectuado.");
                    System.out.println("El saldo de la cuenta origen es: " + origenTransferencia.getSaldo() + ". El de la cuenta destino es: " + destinoTransferencia.getSaldo());
                break;
                
                case 4:
                    System.out.println("Dime tu nombre");
                    String nombre = lector.next();
                    //System.out.println("Dime tu numero de cuenta");
                    //String numCuenta = lector.next();
                    System.out.println("Dime tipo de interes");
                    double tipoInteres = lector.nextDouble();
                    System.out.println("Dime cuanto dinero tendras");
                    double saldoInicial = lector.nextDouble();
                    System.out.println("La cuenta se ha creado con exito");
                    
                    Cuenta nuevaCuenta = new Cuenta(nombre, tipoInteres, saldoInicial);
                    arrayCuentas.add(nuevaCuenta);
                break;   
                
                case 5:
                    seguir = false;
                break;
                    
            }
        }
            
    }

    
}
