/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.Scanner;

/**
 *
 * @author Yann
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    static Scanner lector=new Scanner(System.in);
    public static void crearTabla(){
        int [][] tabla=new int[5][5];
        for(int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                tabla[i][j]=i+j;
            }
        }
        for(int z=0;z<5;z++){
            System.out.println();
            for(int h=0;h<5;h++){
                System.out.print(tabla[z][h] + " ");
            }
        }
        
    }
    
    public static boolean comprobarSimetrico(){
        int [][] tabla=new int[4][4];
        
        for(int i=0;i<tabla.length;i++){
            for (int j=0;j<tabla[i].length;j++){
                tabla[i][j]=i+j;
            }
        }
        tabla[3][1] = 6;
        for(int z=0;z<tabla.length;z++){
            System.out.println();
            for(int h=0;h<tabla[z].length;h++){
                System.out.print(tabla[z][h] + " ");
            }
        }
        
        System.out.println();
        System.out.println("Comprobacion simetria");
        
        for ( int fila=0; fila < tabla.length; fila++ )
        {
            for ( int columna=0; columna < fila; columna++ )
            {
                if ( tabla[fila][columna] != tabla[columna][fila] )
                {
                    return false;
                }
            }
        }
        return true;        
    }
    
    public static void sumarMatrices(){
        int [][] tabla1=new int[3][3];
        int [][] tabla2=new int[3][3];
        int [][] sumarTablas=new int[3][3];
        
        for(int i=0;i<tabla1.length;i++){
            for (int j=0;j<tabla1[i].length;j++){
                tabla1[i][j]=i+j;
            }
        }
        
        for(int i=0;i<tabla2.length;i++){
            for (int j=0;j<tabla2[i].length;j++){
                tabla2[i][j]=i+j;
            }
        }
        
        for(int z=0;z<tabla1.length;z++){
            System.out.println();
            for(int h=0;h<tabla1[z].length;h++){
                System.out.print(tabla1[z][h] + " ");
            }
        }
        
        System.out.println();
        
        for(int z=0;z<tabla2.length;z++){
            System.out.println();
            for(int h=0;h<tabla2[z].length;h++){
                System.out.print(tabla2[z][h] + " ");
            }
        }
        
        for(int i=0;i<sumarTablas.length;i++){
            for (int j=0;j<sumarTablas[i].length;j++){
                sumarTablas[i][j]=tabla1[i][j]+tabla2[i][j];
            }
        }
        
        System.out.println();
        System.out.println();
        
        for(int z=0;z<sumarTablas.length;z++){
            System.out.println();
            for(int h=0;h<sumarTablas[z].length;h++){
                System.out.print(sumarTablas[z][h] + " ");
            }
        }
        
    }
    
    public static void crearTablaDiagonal(){
       int [][] tablaDiagonal = new int [7][7];
       
       for(int i=0;i<tablaDiagonal.length;i++){
            for (int j=0;j<tablaDiagonal[i].length;j++){
                tablaDiagonal[i][j]=0;
            }
        }
       
       for(int i=0;i<tablaDiagonal[0].length;i++){
           tablaDiagonal[i][i]=1;
       }
        
       for(int i=0;i<tablaDiagonal.length;i++){
            System.out.println();
            for (int j=0;j<tablaDiagonal[i].length;j++){
                System.out.print(tablaDiagonal[i][j] + " ");
            }
        }
    }
    
    public static void crearTablaBordes(){
       int [][] tablaBordes = new int [8][6];
       
       for(int i=0;i<tablaBordes.length;i++){
            for (int j=0;j<tablaBordes[i].length;j++){
                tablaBordes[i][j]=0;
            }
       }
       
       int numeroFilas = tablaBordes.length - 1;
       for(int i=0;i<tablaBordes[0].length;i++){
           tablaBordes[0][i]=1;
           tablaBordes[numeroFilas][i]=1;
       }
       for(int i=1;i<tablaBordes.length - 1;i++){
           tablaBordes[i][0]=1;
           tablaBordes[i][tablaBordes.length-3]=1;
       }
       
       for(int i=0;i<tablaBordes.length;i++){
            System.out.println();
            for (int j=0;j<tablaBordes[i].length;j++){
                System.out.print(tablaBordes[i][j] + " ");
            }
        }
    }
    
    public static void crearTablaBordesAlGusto(){
        System.out.println("Dime cuantas filas quieres ");
        int filas=lector.nextInt();
        System.out.println("Dime cuantas columnas quieres");
        int columnas=lector.nextInt();
        
        int [][] tablaBordes = new int [filas][columnas];
        
        for(int i=0;i<tablaBordes.length;i++){
            for (int j=0;j<tablaBordes[i].length;j++){
                tablaBordes[i][j]=0;
            }
        }
       
       int numeroFilas = tablaBordes.length - 1;
       for(int i=0;i<tablaBordes[0].length;i++){
           tablaBordes[0][i]=1;
           tablaBordes[numeroFilas][i]=1;
       }
       for(int i=1;i<tablaBordes.length - 1;i++){
           tablaBordes[i][0]=1;
           tablaBordes[i][tablaBordes[0].length-1]=1;
           //tablaBordes[i][columnas-1]=1;
       }
       
       for(int i=0;i<tablaBordes.length;i++){
            System.out.println();
            for (int j=0;j<tablaBordes[i].length;j++){
                System.out.print(tablaBordes[i][j] + " ");
            }
        }       
    }
    
    public static void main(String[] args) {     
        
        
        
        boolean salir = false;
        while(salir==false){
            System.out.println();
            System.out.println();
            System.out.println("Bienvenido a la Practica 2 de Java");
            System.out.println();
            System.out.println("Elije una opcion");
            System.out.println();
            System.out.println("1. Crear una tabla bidimensional de tamaño 5x5 y rellenarla de la siguiente forma: la posición T[n,m] debe contener n+m. Después se debe mostrar su contenido.");
            System.out.println("2. Crear y cargar una tabla de tamaño 4x4 y decir si es simétrica o no, es decir, si se obtiene la misma tabla al cambiar filas por columnas.");
            System.out.println("3. Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma.");
            System.out.println("4. Crear una tabla de tamaño 7x7 y rellenarla de forma que los elementos de la diagonal principal sean 1 y el resto 0.");
            System.out.println("5. Crear una matriz “marco” de tamaño 8x6: todos sus elementos deben ser 0 salvo los de los bordes que deben ser 1. Mostrar la matriz.");
            System.out.println("6. Crear una matriz “marco” cuyo tamaño se pedirá al usuario por teclado. Todos sus elementos deben ser 0 salvo los de los bordes que deben ser 1. Mostrar la matriz. ");
            System.out.println("7. Salir");
            System.out.println();
            System.out.print("Dime una opcion ");
            int opcion=lector.nextInt();
            
            switch(opcion) {
                case 1:
                    crearTabla();
                    break;
                case 2:
                    if (comprobarSimetrico() == true){
                        System.out.print("La matriz es simetrica");
                    }
                    else{
                        System.out.print("La matriz no es simetrica");
                    }
                    break;
                case 3:
                    sumarMatrices();
                    break;
                case 4:
                    crearTablaDiagonal();
                    break;
                case 5:
                    crearTablaBordes();
                    break;
                case 6:
                    crearTablaBordesAlGusto();
                    break;
                case 7:
                    salir=true;
            }   

        }
    
    }
}