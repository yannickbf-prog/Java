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
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        
        System.out.print("Dime el numero 1: ");
        float num1=lector.nextInt();
        System.out.print("Dime el numero 2: ");
        float num2=lector.nextInt();
        System.out.print("Dime el signo: ");
        String operador=lector.next();
        float resultado=0;
        
        switch (operador){
            case "+":
                resultado=num1+num2;
                break;
            case "-":
                resultado=num1-num2;
                break;
            case "*":
                resultado=num1*num2;
                break;
            case "/":
                resultado=num1/num2;
                break;
        }
        
        System.out.print("El resultado de " + num1 + " " + operador + " " + num2 + " es " + resultado);
    }
}
