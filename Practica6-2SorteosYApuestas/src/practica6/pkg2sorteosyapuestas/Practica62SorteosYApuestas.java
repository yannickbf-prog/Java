/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6.pkg2sorteosyapuestas;

import java.util.Scanner;
import static practica6.pkg2sorteosyapuestas.SimulacionLoteria.mostrarMenu;

/**
 *
 * @author Yann
 */
public class Practica62SorteosYApuestas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Primitiva p1 = new Primitiva();
        int[] arr = {1,2,3,4,5,6,};
        Primitiva p2 = new Primitiva(arr, 0, "Yannick", "Baratte Forner");
        p2.mostrarApuesta();
        String[] arrayApuesta = {"1","1","x","1","2","x","1","2","x","1","2","x","1","2","x"};
        String[] arraypartidos = {"1","2","x","1","2","x","1","2","x","1","2","x","1","2","x"};
        Quiniela q1 = new Quiniela("Yannick", "Baratte Forner", arrayApuesta, arraypartidos, 2);
        q1.mostrarApuesta();
        Scanner lector = new Scanner(System.in);
        //pedirNombre(lector, p1);
        //pedirApellidos(lector, p1);
        mostrarMenu();
    }

    public static void pedirNombre(Scanner lector, Apuesta p1) {
        String nombre;
        System.out.println("Dime tu nombre");
        nombre = lector.next();
        try{
            p1.setNombre(nombre);
        }
        catch(ExcepcionMayusculas ex){
            System.out.println(ex.getMensaje());
            pedirNombre(lector, p1);
        }
    }
    
    public static void pedirApellidos(Scanner lector, Apuesta p1) {
        String apellidos;
        System.out.println("Dime tus apellidos");
        apellidos = lector.next();
        try{
            p1.setApellidos(apellidos);
        }
        catch(ExcepcionMayusculas ex){
            System.out.println(ex.getMensaje());
            pedirApellidos(lector, p1);
        }
    }
    
    
    
}
