/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6.pkg2sorteosyapuestas;

import java.util.ArrayList;
import java.util.Scanner;
import static practica6.pkg2sorteosyapuestas.Practica62SorteosYApuestas.pedirApellidos;
import static practica6.pkg2sorteosyapuestas.Practica62SorteosYApuestas.pedirNombre;

/**
 *
 * @author Yann
 */
public class Primitiva extends Apuesta{
    private int[] listaNum = new int[6];
    private int aciertos = 0;
    private static String nombre;
    private static String apellidos;

    public Primitiva() {
    }
    
    public Primitiva(int[] listaNum, int aciertos, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.listaNum = listaNum;
        this.aciertos = aciertos;
    }
    
    public Primitiva(Primitiva p1){
        this.listaNum = p1.getListaNum();
        this.aciertos = p1.getAciertos();        
    }

    public int[] getListaNum() {
        return listaNum;
    }

    public void setListaNum(int[] listaNum) {
        this.listaNum = listaNum;
    }

    public int getAciertos() {
        return aciertos;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }
    
    @Override
    public void mostrarApuesta(){
        super.mostrarApuesta();
        System.out.println("Mostrar primitiva");
        System.out.print("Lista numeros: ");
        for (int i = 0; i < this.listaNum.length; i++){
            // aqui se puede referir al objeto con arreglo[i];
            if(i<5){
                System.out.print(listaNum[i]+", ");
            }
            else{
                System.out.print(listaNum[i]);
            }
        }
        System.out.println("");
        System.out.println("Numero de aciertos "+this.getAciertos());
    }
   
    public static void crearApuestaPrimitiva(){
        ArrayList<Apuesta> arrayApuestas = new ArrayList<Apuesta>();
        Scanner lector = new Scanner(System.in);
        rellenarNombrePrimitiva(lector);
        rellenarApellidosPrimitiva(lector);
        //System.out.println(nombre);
        System.out.println("Dime cuantas apuestas quieres hacer");
        int numApuestas = Integer.parseInt(lector.nextLine());
        for(int i=0; numApuestas>i; i++){
            Primitiva p1 = new Primitiva();
            System.out.println("Apuesta numero "+(i+1));    
            int arrayNumerosPrimitiva[] = new int[6];
            for(int j=0; j<6; j++){
                System.out.println("Dime el numero "+(j+1));
                int numeroPrimitiva = lector.nextInt();
                arrayNumerosPrimitiva[j] = numeroPrimitiva;
            } 
            try{
                p1.setNombre(nombre);
            }
            catch(ExcepcionMayusculas ex){
                System.out.println(ex.getMensaje());
            }
            try{
                p1.setApellidos(apellidos);
            }
            catch(ExcepcionMayusculas ex){
                System.out.println(ex.getMensaje());
            }
            p1.setListaNum(arrayNumerosPrimitiva);
            arrayApuestas.add(p1);
        }
        for(int i=0;arrayApuestas.size()>i;i++){
            arrayApuestas.get(i).mostrarApuesta();
        }
        
    }

    public static void rellenarNombrePrimitiva(Scanner lector){
        
        try{
            System.out.println("Dime tu nombre");
            Primitiva.nombre= lector.next();
            if(!Primitiva.nombre.equals(Primitiva.nombre.toUpperCase())){
                throw new ExcepcionMayusculas("El nombre ");
            }
        }
        catch(ExcepcionMayusculas ex){
            System.out.println(ex.getMensaje());
            rellenarNombrePrimitiva(lector);
        }        
    }
   
    public static void rellenarApellidosPrimitiva(Scanner lector){
        
        try{
            System.out.println("Dime tus apellidos");
            Primitiva.apellidos= lector.nextLine();
            if(!Primitiva.apellidos.equals(Primitiva.apellidos.toUpperCase())){
                throw new ExcepcionMayusculas("Los apellidos ");
            }
        }
        catch(ExcepcionMayusculas ex){
            System.out.println(ex.getMensaje());
            rellenarApellidosPrimitiva(lector);
        }        
    }
}
