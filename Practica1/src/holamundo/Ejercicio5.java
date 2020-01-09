//5. Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de
//la forma: el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc.


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
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        
        int[] tabla1 = new int[10];
        int[] tabla2 = new int[10];
        int[] tabla3 = new int[20];
        
        for(int i=0; i<10; i++){
            System.out.println("Escribe el numero " + (i+1) + " de la tabla 1");
            int mivariable=lector.nextInt();
            tabla1[i]=mivariable;
        }
        for(int i=0; i<10; i++){
            System.out.println("Escribe el numero " + (i+1) + " de la tabla 2");
            int mivariable=lector.nextInt();
            tabla2[i]=mivariable;
        }
        int j=0;
        for(int i=0; i<20; i+=2){
            tabla3[i]=tabla1[j];
            j++;
        }
        j=0;
        for(int i=1; i<20; i+=2){
            tabla3[i]=tabla2[j];
            j++;
        }
        for(int i=0; i<20; i++){
            System.out.print(tabla3[i] + " ");
        }
    }
    
}
