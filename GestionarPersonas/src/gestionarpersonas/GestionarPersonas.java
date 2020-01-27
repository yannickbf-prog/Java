/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionarpersonas;

/**
 *
 * @author Yann
 */
public class GestionarPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona rafa=new Persona();
        Nif nifRafa=new Nif();
        rafa.solicitarDatos();
        rafa.mostrarAtributos();
        //nifRafa.solicitarDatosNif();
        //nifRafa.mostrarAtributosNif();
        
        /*
        Persona adrian=new Persona("adrian","apellido1","apellido2",18,"nif2222");
        Persona sofia=new Persona();
        sofia.setNombre("sOFIa");
        System.out.println("La edad de " + sofia.getNombre()+ " es de " + sofia.getEdad());
        
        Persona copia=new Persona(adrian);        
        System.out.println("El nombre " + adrian.getNombre());
        */
    }
    
}
