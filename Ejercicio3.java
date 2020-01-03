// 3. Leer 5 números por teclado y a continuación realizar la media de los números
// positivos, la media de los negativos y contar el número de ceros.


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Scanner;

import java.util.Vector;

/**
 *
 * @author Yann
 */
public class Ejercicio3 {
    public static void main(String[] args) { 
        Scanner lector=new Scanner(System.in);
        Vector<Object> numeros_positivos = new Vector<Object>();
        Vector<Object> numeros_negativos = new Vector<Object>();
        int ceros=0;
        double media_positivos = 0.0;
        double media_negativos = 0.0;
        double mivariable;
        
        
        for(int i=0; i<5; i++){
            System.out.println("Escribe un numero ");
            mivariable=lector.nextInt();
            if(mivariable > 0){
                numeros_positivos.add(mivariable);
            }
            else if(mivariable == 0){
                ceros++;
            }
            else if(mivariable < 0){
                numeros_negativos.add(mivariable);
            }
        }
        
        for(int i=0; i<numeros_positivos.size(); i++){
            media_positivos += (double)numeros_positivos.elementAt(i);
        }
        
        media_positivos /= numeros_positivos.size();
        
        for(int i=0; i<numeros_negativos.size(); i++){
            media_negativos += (double)numeros_negativos.elementAt(i);
        }
        
        media_negativos /= numeros_negativos.size();
        
        System.out.print("La media de los numeros positivos es " + media_positivos
        + " la media de los numeros negativos es " + media_negativos + " y hay " +
        ceros + " ceros.");
    }
}

