/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosDDR;

/**
 *
 * @author Yann
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        
        String frase="La lluvia en Sevilla es una maravilla";
        int contador = 0;
        
        for(int i=0; i<frase.length(); i++){
            if(frase.charAt(i)=='a'||frase.charAt(i)=='e'||frase.charAt(i)=='i'||frase.charAt(i)=='o'||frase.charAt(i)=='u'){
                contador++;
            }
            
        }
        
        System.out.println("La frase tiene " + contador + " vocales");
        
        
    }
}
