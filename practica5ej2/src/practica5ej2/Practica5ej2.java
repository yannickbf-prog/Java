/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5ej2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Yann
 */
public class Practica5ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Vehiculo> arrayVehiculos = new ArrayList<Vehiculo>();
        Taxi t2=new Taxi(false, 4, "123456", "toyota", 1500);
        arrayVehiculos.add(t2);
        
        menuPrincipal(arrayVehiculos);
    }    

    public static void menuPrincipal(ArrayList<Vehiculo> arrayVehiculos) {
        boolean seguirMostrandoMenu = true;
        while (seguirMostrandoMenu){
            System.out.println("1-Alta taxis");
            System.out.println("2-Alta VTC");
            System.out.println("3-Alta autobuses");
            System.out.println("4-Buscar vehiculo por id");
            System.out.println("5-Buscar vehiculo por matricula");
            System.out.println("6-Buscar primer taxi libre");
            System.out.println("7-Buscar taxi por id");
            System.out.println("8-Mostrar todos los vehiculos");
            System.out.println("Dime una opcion");
            Scanner lector = new Scanner(System.in);
            int opcion = lector.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Alta taxis");
                    System.out.println("--------");
                    Taxi t1 = new Taxi();
                    t1.pedirDatosVehiculo();
                    arrayVehiculos.add(t1);
                    System.out.println("Taxi dado de alta con exito");
                    break;
                case 2:
                    System.out.println("Alta VTC");
                    System.out.println("--------");
                    VTC v1 = new VTC();
                    v1.pedirDatosVehiculo();
                    arrayVehiculos.add(v1);
                    System.out.println("VTC dado de alta con exito");
                    break;
                case 3:
                    System.out.println("Alta autobuses");
                    System.out.println("--------");
                    Autobus a1 = new Autobus();
                    a1.pedirDatosVehiculo();
                    arrayVehiculos.add(a1);
                    System.out.println("Autobus dado de alta con exito");
                    break;
                case 4:
                    System.out.println("Dime el id del vehiculo");
                    int idVehiculo = lector.nextInt();
                    arrayVehiculos.get(idVehiculo-1).mostrarAtributos();      
                    break;
                case 5:
                    System.out.println("Dime la matricula del vehiculo");
                    String matricula=lector.next();
                    int i=0;
                    boolean seguirBuscandoMatricula = true;
                    while(seguirBuscandoMatricula){
                        if(arrayVehiculos.size()>i){
                            if(arrayVehiculos.get(i).getMatricula().equals(matricula)){
                                arrayVehiculos.get(i).mostrarAtributos();
                                seguirBuscandoMatricula=false;
                            }
                        }
                        else{
                            System.out.println("No se ha encontrado la matricula");
                            seguirBuscandoMatricula=false;
                        }
                        
                        i++;
                    }
                    break;
                case 6:
                    int j = 0;
                    boolean seguirBuscandoTaxi = true;
                    boolean taxiEncontrado = false;
                    while(seguirBuscandoTaxi){
                        if(arrayVehiculos.size()>j){
                            if(arrayVehiculos.get(j) instanceof Taxi){
                                if(((Taxi)arrayVehiculos.get(j)).isEstado()){
                                    System.out.println("El primer taxi libre tiene el id "+((Taxi)arrayVehiculos.get(j)).getId());
                                    ((Taxi)arrayVehiculos.get(j)).setEstado(false);
                                    taxiEncontrado = true;
                                    seguirBuscandoTaxi = false;                                    
                                }
                                    
                            }
                        }
                        else{
                            seguirBuscandoTaxi = false;
                        }
                        j++;
                    }
                    if(taxiEncontrado==false){
                        System.out.println("No se ha encontrado ningun taxi");
                    }
                    break;
                case 7:
                    System.out.println("Dime el id del taxi");
                    int idTaxi = lector.nextInt()-1;
                    if(((Taxi)arrayVehiculos.get(idTaxi)).isEstado()==false){
                        ((Taxi)arrayVehiculos.get(idTaxi)).setEstado(true);
                        System.out.println("El taxi con id "+arrayVehiculos.get(idTaxi).getId()+" se encuantra ahora libre");
                    }
                    else{
                        System.out.println("El taxi que has indicado ya se encuentra libre");
                    }
                    
                    break;
                case 8:
                    for(int y = 0;arrayVehiculos.size()>y;y++){
                        arrayVehiculos.get(y).mostrarAtributos();
                        System.out.println("--------");
                    }
                    break;
            }
        }
    }    
}
