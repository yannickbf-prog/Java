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
public class Ejercicio7 {
    //Scanner lector=new Scanner(System.in);
    
    
    static Scanner lector=new Scanner(System.in);
    public static void ejercicio1(){
        int[] numeros=new int[5];
        int mivariable;
        //lector=milector.nextInt();
        //Scanner lector=new Scanner(System.in);
        for(int i=0; i<5; i++){
            System.out.println("Escribe un numero ");
            mivariable=lector.nextInt();
            numeros[i]= mivariable;
        }
        System.out.print("Los numeros introducidos son ");
        for(int i=0; i<5; i++){
            System.out.print(numeros[i] + " ");
        }
    }
    
    public static void ejercicio2(){
        //Scanner lector=new Scanner(System.in);
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
    
    public static void ejercicio3(){
        //Scanner lector=new Scanner(System.in);
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
    
    public static void ejercicio4(){
        //Scanner lector=new Scanner(System.in);
        
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

    public static void ejercicio5(){
        
        //Scanner lector=new Scanner(System.in);
        
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
    
    public static void ejercicio6(){
        //Scanner lector=new Scanner(System.in);
        
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
    
    public static void main(String[] args) {
        //Scanner lector=new Scanner(System.in);
        Boolean salir = false;
        while(salir==false){
            System.out.println();
            System.out.println();
            System.out.println("Bienvenido a la Practica 1 de Java");
            System.out.println();
            System.out.println("1. Leer 5 números (con bucle por favor, no pongáis 5 scanner consecutivos) y mostrarlos en el mismo orden introducido.");
            System.out.println("2. Leer 5 números y mostrarlos en orden inverso al introducido.");
            System.out.println("3. Leer 5 números por teclado y a continuación realizar la media de los números positivos, la media de los negativos y contar el número de ceros.");
            System.out.println("4. Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el último, el segundo, el penúltimo, el tercero, etc.");
            System.out.println("5. Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de la forma: el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc.");
            System.out.println("6. Leer los datos correspondientes a dos tablas de 12 elementos numéricos, y mezclarlos en una tercera de la forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de la B, etc.");
            System.out.println("7. Salir");
            System.out.println();
            System.out.println("Que opcion deseas?");
            int opcion = lector.nextInt();
            //asientos_cuero.equalsIgnoreCase("si")
            if(opcion == 1){
                System.out.println();
                System.out.println("1. Leer 5 números (con bucle por favor, no pongáis 5 scanner consecutivos) y mostrarlos en el mismo orden introducido.");
                System.out.println();
                ejercicio1(); 
            }
            else if(opcion == 2){
                System.out.println();
                System.out.println("2. Leer 5 números y mostrarlos en orden inverso al introducido.");
                System.out.println();
                ejercicio2(); 
            }
            else if(opcion == 3){
                System.out.println();
                System.out.println("3. Leer 5 números por teclado y a continuación realizar la media de los números positivos, la media de los negativos y contar el número de ceros.");
                System.out.println();
                ejercicio3();
            }
            else if(opcion == 4){
                System.out.println();
                System.out.println("4. Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el último, el segundo, el penúltimo, el tercero, etc.");
                System.out.println();
                ejercicio4();
            }
            else if(opcion == 5){
                System.out.println();
                System.out.println("5. Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de la forma: el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc.");
                System.out.println();
                ejercicio5();
            }
            else if(opcion == 6){
                System.out.println();
                System.out.println("6. Leer los datos correspondientes a dos tablas de 12 elementos numéricos, y mezclarlos en una tercera de la forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de la B, etc.");
                System.out.println();
                ejercicio6();
            }
            else if(opcion == 7){
                System.out.println("Hasta luego");
                salir=true;
            }
            else{
                System.out.println("La opcion no es correcta");
            }
                   
        }
    }
}
