/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yann
 */
public class Practica6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangulo mitriangulo = new Triangulo(2, 4, 5, 4);
        mitriangulo.imprimirCaracteristicas();
        Cuadrado micuadrado = new Cuadrado(2, 4);
        micuadrado.imprimirCaracteristicas();
        Circulo micirculo = new Circulo(4, 6);
        micirculo.imprimirCaracteristicas();
        Rectangulo mirectangulo = new Rectangulo(5, 5, 5, 5, 5);
        mirectangulo.imprimirCaracteristicas();

        try {
            mostrarMenu();
        } catch (RuntimeException ex) {
            System.out.println("Se ha producido un error el la introduccion de datos, por favor introducelos de nuevo");
        } catch (MiExcepcion ex) {
            System.out.println(ex.getMensaje()+" "+micuadrado.getLado());
            Logger.getLogger(Practica6.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarMenu() throws RuntimeException, MiExcepcion {
        boolean seguirMostrandoMenu = true;
        while (seguirMostrandoMenu) {
            System.out.println("Dime una opcion");
            System.out.println("1-Calcular area y volumen de un triangulo");
            System.out.println("2-Calcular area y volumen de un cuadrado");
            System.out.println("3-Calcular area y volumen de un circulo");
            System.out.println("4-Calcular area y volumen de un rectangulo");
            System.out.println("5-Salir");
            Scanner lector = new Scanner(System.in);
            int opcion = lector.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Calcular area y volumen de un triangulo");
                    Triangulo triangulo = new Triangulo();
                    System.out.println("--------");
                    System.out.println("Area");
                    System.out.println("--------");
                    System.out.println("Dime la base del triangulo");
                    double base = lector.nextDouble();
                    triangulo.setBase(base);
                    System.out.println("Dime la altura del triangulo");
                    double altura = lector.nextDouble();
                    triangulo.setAltura(altura);
                    System.out.println("--------");
                    System.out.println("Volumen");
                    System.out.println("--------");
                    System.out.println("Dime la altura de la piramide");
                    double alturaPiramide = lector.nextDouble();
                    triangulo.setAlturaPiramide(alturaPiramide);
                    double ladoPiramide = lector.nextDouble();
                    triangulo.setLadoPiramide(ladoPiramide);
                    triangulo.imprimirCaracteristicas();
                    break;
                case 2:
                    try {
                        System.out.println("Calcular area y volumen de un cuadrado");
                        Cuadrado cuadrado = new Cuadrado();
                        System.out.println("--------");
                        System.out.println("Area");
                        System.out.println("--------");
                        System.out.println("Dime el lado del cuadrado");
                        double ladoCuadrado = lector.nextDouble();
                        cuadrado.setLado(ladoCuadrado);
                        System.out.println("--------");
                        System.out.println("Volumen");
                        System.out.println("--------");
                        System.out.println("Dime la arista del cubo");
                        double aristaCubo = lector.nextDouble();
                        cuadrado.setArista(aristaCubo);
                        cuadrado.imprimirCaracteristicas();
                    }
                    catch(ArithmeticException e){
                        System.out.println("No puedes dividir un numero por 0");
                    }
                    break;
                case 3:
                    try{
                        System.out.println("Calcular area y volumen de un circulo");
                        Circulo circulo = new Circulo();
                        System.out.println("--------");
                        System.out.println("Area");
                        System.out.println("--------");
                        System.out.println("Dime el radio del circulo");
                        double radioCirculo = lector.nextDouble();
                        circulo.setRadio(radioCirculo);
                        System.out.println("--------");
                        System.out.println("Volumen");
                        System.out.println("--------");
                        System.out.println("Dime el radio de la esfera");
                        double radioEsfera = lector.nextDouble();
                        circulo.setRadioVolumen(radioEsfera);
                        circulo.imprimirCaracteristicas();
                    }
                    catch(ArithmeticException e){
                        /*
                        if (tamaño == 0) {
                        throw new EmptyStackException ();
                         }

                        */
                        
                        throw new MiExcepcion("que no puedes dividir ningun numero por 0"/*,i*/);
                    }
                    break;
                case 4:
                    System.out.println("Calcular area y volumen de un rectangulo");
                    Rectangulo rectangulo = new Rectangulo();
                    System.out.println("--------");
                    System.out.println("Area");
                    System.out.println("--------");
                    System.out.println("Dime la base del triangulo");
                    double baseTriangulo = lector.nextDouble();
                    rectangulo.setBase(baseTriangulo);
                    System.out.println("Dime la altura del triangulo");
                    double alturaTriangulo = lector.nextDouble();
                    rectangulo.setAltura(alturaTriangulo);
                    System.out.println("--------");
                    System.out.println("Volumen");
                    System.out.println("--------");
                    System.out.println("Dime la altura del rectangulo");
                    double alturaRectangulo = lector.nextDouble();
                    rectangulo.setAlturaVolumen(alturaRectangulo);
                    System.out.println("Dime la longitud del rectangulo");
                    double longitudRectangulo = lector.nextDouble();
                    rectangulo.setLongitudVolumen(longitudRectangulo);
                    System.out.println("Dime la profundidad del rectangulo");
                    double profundidadRectangulo = lector.nextDouble();
                    rectangulo.setProfundidadVolumen(profundidadRectangulo);
                    rectangulo.imprimirCaracteristicas();
                    break;
                case 5:
                    seguirMostrandoMenu = false;
                    break;
                default:
                    System.out.println("Escribe 1, 2, 3, 4 o 5");
                    break;
            }
            seguirMostrandoMenu = false;
        }
    }

}
