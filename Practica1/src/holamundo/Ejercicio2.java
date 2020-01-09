// 2. Leer 5 números y mostrarlos en orden inverso al introducido.

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author Yann
 */
public class Ejercicio2 {
    public static void main(String[] args) { 
        Scanner lector=new Scanner(System.in);
        int[] numeros=new int[5];
        int mivariable;
        
        for(int i=0; i<5; i++){
            System.out.println("Escribe un numero ");
            mivariable=lector.nextInt();
            numeros[i]= mivariable;
        }
        System.out.print("Los numeros introducidos son ");
        for(int i=4; i>-1; i--){
            System.out.print(numeros[i] + " ");
        }
    }
}
