/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6;

/**
 *
 * @author Yann
 */
public class MiExcepcion extends Exception{
    private String mensaje;
    private static int posicion;
    public MiExcepcion(String error){
        this.mensaje = "Hola hay un error con " + error;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
}
