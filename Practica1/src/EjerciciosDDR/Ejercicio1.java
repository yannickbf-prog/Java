/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosDDR;

import java.util.Scanner;
/**
 *
 * @author Yann
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        boolean validarnumero = false;
        
        System.out.println("Dame un numero entero");
        int numero=lector.nextInt();
        
        if(numero<=1){
            System.out.print("El numero " + numero + " no es primo");
        }
        else{
        
            for(int i=2;i<numero;i++){
                if(numero%i == 0){
                    validarnumero = true;
                }
            }

            if(validarnumero == false){
                System.out.print("El numero " + numero + " es primo");
            }
            if(validarnumero == true){
                System.out.print("El numero " + numero + " no es primo");
            }
        }
    }
}
