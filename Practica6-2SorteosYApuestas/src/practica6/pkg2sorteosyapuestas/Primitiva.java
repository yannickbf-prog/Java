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
        Primitiva p1 = new Primitiva();
        pedirNombre(lector, p1);
        pedirApellidos(lector, p1);
        System.out.println("Dime cuantas apuestas quieres hacer");
        int numApuestas = lector.nextInt();
        for(int i=0; numApuestas>i; i++){
            System.out.println("Apuesta numero "+(i+1));    
            int arrayNumerosPrimitiva[] = new int[6];
            for(int j=0; j<6; j++){
                System.out.println("Dime el numero "+(j+1));
                int numeroPrimitiva = lector.nextInt();
                arrayNumerosPrimitiva[j] = numeroPrimitiva;
            } 
            p1.setListaNum(arrayNumerosPrimitiva);
            arrayApuestas.add(p1);
        }
        for(int i=0;arrayApuestas.size()>i;i++){
            arrayApuestas.get(i).mostrarApuesta();
        }
        
    }
}
