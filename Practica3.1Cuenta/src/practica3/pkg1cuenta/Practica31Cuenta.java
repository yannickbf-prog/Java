/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3.pkg1cuenta;

/**
 *
 * @author Yann
 */
public class Practica31Cuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta Yannick=new Cuenta("Yannick", "0101", 4.3, 1000.35);
        
        Cuenta Juanito=new Cuenta("Juanito", "1010", 4.5, 500.00);
        
        Yannick.ingreso(50);
        
        System.out.println(Yannick.getSaldo());
        
        Yannick.reintegro(10);
        
        System.out.println(Yannick.getSaldo());
        
        Yannick.transferencia(Juanito, double 70.00);
    }
    
}
