//4. Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el
//último, el segundo, el penúltimo, el tercero, etc.


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
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        
        int[] numeros = new int[10];
        
        for(int i=0; i<10; i++){
            System.out.println("Escribe un numero");
            int mivariable=lector.nextInt();
            numeros[i]= mivariable;
        }
        
        int j = 0;
        int y = 9;
        for(int i=0; i<5; i++){
           System.out.print(numeros[j] + " ");
           System.out.print(numeros[y] + " ");
           j++;
           y--;
        }
    }    
}
