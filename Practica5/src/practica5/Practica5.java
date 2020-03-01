/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Yann
 */
public class Practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Empleado> arrayEmpleados = new ArrayList<Empleado>();
        Empleado e2=new Empleado("yannick", "baratte", "forner", "123456", 26, 100.00);
        arrayEmpleados.add(e2);
        Comercial c2=new Comercial( 100, 10.00, "yannick", "baratte", "forner", "123456", 26, 100.00);
        arrayEmpleados.add(c2);
        Comercial c3=new Comercial( );
        c3.setNombre("rafa");
        arrayEmpleados.add(c3);
        Repartidor r2=new Repartidor( 100, "palma", "yannick", "baratte", "forner", "123456", 26, 100.00);
        arrayEmpleados.add(r2);
        
        Scanner lector = new Scanner(System.in);
        boolean salirMenu = false;
        while (salirMenu == false) {
            System.out.println("Dime que tipo de empleado quieres der de alta");
            System.out.println("1) Empleado");
            System.out.println("2) Comercial");
            System.out.println("3) Repartidor");
            System.out.println("4) Mostrar atributos");
            System.out.println("5) Salir");
            System.out.println("Elige una opcion");
            int opcion = lector.nextInt();
            switch (opcion) {
                case 1:
                    Empleado e1 = new Empleado();
                    e1.pedirAlta();
                    arrayEmpleados.add(e1);
                    System.out.println("Dado de alta con exito");
                    break;
                case 2:
                    Comercial c1 = new Comercial();
                    c1.pedirAlta();
                    arrayEmpleados.add(c1);
                    System.out.println("Dado de alta con exito");
                    break;
                case 3:
                    Repartidor r1 = new Repartidor();
                    r1.pedirAlta();
                    arrayEmpleados.add(r1);
                    System.out.println("Dado de alta con exito");
                    break;
                case 4:
                    System.out.println("Dime de que tipo de de empleado quieres ver los atributos");
                    System.out.println("1) Empleados");
                    System.out.println("2) Comercial");
                    System.out.println("3) Repartidor");
                    int opcionAtributos = lector.nextInt();
                    mostrarEmpleados(opcionAtributos, arrayEmpleados);
                    break;
                case 5:
                    salirMenu = true;
                    break;

            }

        }
    }

    public static void mostrarEmpleados(int opcionAtributos, ArrayList<Empleado> arrayEmpleados) {
        /*for (int i = 0; i < arrayEmpleados.size(); i++) {
            if (arrayEmpleados.get(i) instanceof Empleado) {
                System.out.println("Nombre del empleado: " + arrayEmpleados.get(i).getNombre());
                        System.out.println("Primer apellido del empleado: " + arrayEmpleados.get(i).getApellido1());
                        System.out.println("Segundo apellido del empleado: " + arrayEmpleados.get(i).getApellido2());
                        System.out.println("El nif del empleado es: " + arrayEmpleados.get(i).getNif());
                        System.out.println("La edad del empleado es: " + arrayEmpleados.get(i).getEdad());
                        System.out.println("El salario del empleado es: " + arrayEmpleados.get(i).getSalario());
                    }
                    
                }*/
        switch (opcionAtributos) {
            case 1:
                for (int i = 0; i < arrayEmpleados.size(); i++) {
                    if (arrayEmpleados.get(i) instanceof Empleado) {
                        ((Empleado)arrayEmpleados.get(i)).mostrarAtributos();
                        System.out.println("--------");
                    }
                    
                }
                System.out.println("mostrados los empleados");
                break;
                
            case 2:
                for (int i = 0; i < arrayEmpleados.size(); i++) {
                    if (arrayEmpleados.get(i) instanceof Comercial) {
                        ((Comercial)arrayEmpleados.get(i)).mostrarAtributos();
                        System.out.println("--------");
                    }
                    
                }
                System.out.println("mostrados los comerciales");
                break;
            case 3:
                for (int i = 0; i < arrayEmpleados.size(); i++) {
                    if (arrayEmpleados.get(i) instanceof Repartidor) {
                        ((Repartidor)arrayEmpleados.get(i)).mostrarAtributos();
                        System.out.println("--------");
                    }
                    
                }
                System.out.println("mostrados los repartidores");
                break;
        }
                
        /*switch (opcionAtributos) {
            
        }
            case 1:
                for (int i = 0; i < arrayEmpleados.size(); i++) {
                    if (arrayEmpleados.get(i) instanceof Empleado) {
                        atributosTodosEmpleados(arrayEmpleados, i);
                        System.out.println("--------");
                    }
                    
                }
                
                break;
            case 2:
                for (int i = 0; i < arrayEmpleados.size(); i++) {
                    if (arrayEmpleados.get(i) instanceof Comercial) {
                        atributosTodosEmpleados(arrayEmpleados, i);
                        System.out.println("Las ventas realizadas del comercial son "+((Comercial)arrayEmpleados.get(i)).getVentasRealizadas());
                        ((Comercial)arrayEmpleados.get(i)).mostrarAtributos();
                        System.out.println("La comision del comercial es "+((Comercial)arrayEmpleados.get(i)).getComision());
                        System.out.println("--------");
                    }
                    
                }
                
                break;
            case 3:
                for (int i = 0; i < arrayEmpleados.size(); i++) {
                    if (arrayEmpleados.get(i) instanceof Repartidor) {
                        atributosTodosEmpleados(arrayEmpleados, i);
                        System.out.println("Las realizadas del repartidor son "+((Repartidor)arrayEmpleados.get(i)).getHorasTrabajadas());
                        System.out.println("La zona del repartidor es "+((Repartidor)arrayEmpleados.get(i)).getZona());
                        System.out.println("--------");
                    }
                    
                }
                break;
        }*/
    }

    /*public static void atributosTodosEmpleados(ArrayList<Empleado> arrayEmpleados, int i) {
        System.out.println("Nombre del empleado: " + arrayEmpleados.get(i).getNombre());
        System.out.println("Primer apellido del empleado: " + arrayEmpleados.get(i).getApellido1());
        System.out.println("Segundo apellido del empleado: " + arrayEmpleados.get(i).getApellido2());
        System.out.println("El nif del empleado es: " + arrayEmpleados.get(i).getNif());
        System.out.println("La edad del empleado es: " + arrayEmpleados.get(i).getEdad());
        System.out.println("El salario del empleado es: " + arrayEmpleados.get(i).getSalario());
    }*/

}
