/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6.pkg2sorteosyapuestas;

import static practica6.pkg2sorteosyapuestas.Primitiva.crearApuestaPrimitiva;

/**
 *
 * @author Yann
 */
public class SimulacionLoteria extends Apuesta{
    public static void mostrarMenu(){
        System.out.println("1-Crear apuesta Primitiva");
        System.out.println("2-Crear apuesta Quiniela");
        System.out.println("3-Realizar simulacion");
        System.out.println("4-Salir");
        
        
        crearApuestaPrimitiva();
    }
}
