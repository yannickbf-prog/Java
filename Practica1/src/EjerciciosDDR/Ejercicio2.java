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
public class Ejercicio2 {
    public static void main(String[] args) {
 
        boolean validarnumero = false;
        boolean seguircomprobando =  true;
        int mivariable1;
        
        System.out.println("Numeros que son primos hasta el 100 ");//
        
        for(int i=2;i<101;i++){
            int j = i;
            while(seguircomprobando == true){
                for(int y=2; y<i; y++){
                    if(j%y == 0){
                        System.out.print(i + " ");
                        seguircomprobando=false;
                    } 
                }
            
            
            }
            seguircomprobando = true;
        
        }
    }
}
