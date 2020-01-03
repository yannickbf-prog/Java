/*6. Leer los datos correspondientes a dos tablas de 12 elementos numéricos, y
mezclarlos en una tercera de la forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3
de la B, etc.*/


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
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        
        int[] tabla1 = new int[12];
        int[] tabla2 = new int[12];
        int[] tabla3 = new int[24];
        
        for(int i=0; i<12; i++){
            System.out.println("Escribe el numero " + (i+1) + " de la tabla 1");
            int mivariable=lector.nextInt();
            tabla1[i]=mivariable;
        }
        
        for(int i=0; i<12; i++){
            System.out.println("Escribe el numero " + (i+1) + " de la tabla 2");
            int mivariable=lector.nextInt();
            tabla2[i]=mivariable;
        }
        
        int y=0;
        int h=0;
        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
            tabla3[y]=tabla1[h];
            y++;
            h++;
            }
            y+=3;
        }
        
        y=3;
        h=0;
        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
            tabla3[y]=tabla1[h];
            y++;
            h++;
            }
            y+=3;
        }
        
        for(int i=0; i<24; i++){
            System.out.print(tabla3[i] + " ");
        }
    }
}
