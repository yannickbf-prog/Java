/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4java;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Yann
 */
public class Practica4Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Pelicula> arrayPeliculas = new ArrayList<Pelicula>();
        ArrayList<Cliente> arrayClientes = new ArrayList<Cliente>();
        //ArrayList<Pelicula> arrayPeliculasReservadasClientes = new ArrayList<Pelicula>();
        
        Pelicula ElPadrino = new Pelicula("El Padrino", "Ford Coppola", 180, "Drama", 1990, true, 2995, 20);
        Pelicula ElPadrino2 = new Pelicula("El Padrino2", "Ford Coppola", 180, "Drama", 1995, false, 17, 16);
        
        arrayPeliculas.add(ElPadrino);
        arrayPeliculas.add(ElPadrino2);
        //añadirPelicula(arrayPeliculas);
        //arrayPeliculasReservadasClientes.add(ElPadrino);
        //reservarPeliculas(arrayPeliculas);
        Cliente Yannick = new Cliente("Yannick", "Baratte Forner");
        Cliente Juanito = new Cliente("Juanito", "Blabla");
        //buscarPeliculas(arrayPeliculas);
        arrayClientes.add(Yannick);
        arrayClientes.add(Juanito);
    }
    
    public static void añadirPelicula(ArrayList<Pelicula> arrayPeliculas){//este metodo añade objetos pelicula al arrayPeliculas 
                
        int totalPeliculas = contarPeliculas(arrayPeliculas);//llamamos al metodo mas abajo que nos calcula el numero de las peliculas que tenemos 
        int cantidadFinalPeliculas = 0;//cantidad final que quedara despues de las siguientes comprobaciones
        if(totalPeliculas < 3000){//comprueba que el maximo de peliculas, si esta lleno no nos dejara añadir
            Scanner lector=new Scanner(System.in);
            boolean comprobarEspacioPeliculas = true;
            while(comprobarEspacioPeliculas){//mientras el numero de peliculas supere el maximo este while se repetira
                int espacioPeliculas = 3000 - totalPeliculas;// calculamos cuantas peliculas nos caben
                System.out.println("Dime el numero de copias que vas a poner en el videoclub");
                int cantidadPeliculas = lector.nextInt();//recoje la cantidad de peliculas que queremos añadir
                if(espacioPeliculas>=cantidadPeliculas){//si la cantidad de peliculas que queremos poner caben en nuestro 
                    cantidadFinalPeliculas = cantidadPeliculas; //videoclub se ejecutara el if y despues de guardar la cantidad 
                    comprobarEspacioPeliculas = false;          //en la cantidad final se rompe el bucle y sigue con los siguientes datos
                }
                else{// si no caben las peliculas se ejecutara esto y justo despues se repetira el while
                    System.out.println("La cantidad " +cantidadPeliculas+ " de peliculas supera el maximo de 3000. Actualmente hay " +totalPeliculas+ " en el programa por lo que solo puedes añadir "+espacioPeliculas);
                }
            }
            System.out.println("Dime el titulo de la pelicula");
            String nombrePelicula = lector.next();
            System.out.println("Dime el director de la pelicula");
            String directorPelicula = lector.next();
            System.out.println("Dime la duracion de la pelicula");
            int duracionPelicula = lector.nextInt();
            System.out.println("Dime el genero de la pelicula");
            String generoPelicula = lector.next();
            System.out.println("Dime el año de la pelicula");
            int añoPelicula = lector.nextInt();
            boolean disponibilidadPelicula = true;// a partir de aqui comprobamos si la pelicula esta disponible
            boolean seguirPidiendoDisponibilidad = true;
            while(seguirPidiendoDisponibilidad){// hacemos un while para que si ponemos S/N mal nos vuelva a preguntar
                System.out.println("Dime si esta disponible S/N");
                String estaDisponiblePelicula = lector.next();
                switch(estaDisponiblePelicula){//con el switch cambiamos la disponibilidad a false si no hay disponibilidad 
                    case "S":                   //y si hay disponibilidad los dejamos en true como esta por defecto
                        //disponibilidadPelicula = true;      y tambien interrumpimos de bucle si se ha introducido bien S/N,
                        seguirPidiendoDisponibilidad = false;
                    break;
                    case "N":
                        disponibilidadPelicula = false;
                        seguirPidiendoDisponibilidad = false;
                    break;
                }
            boolean seguirComprobandoNumeroCopiasReservadas = true;
            int numeroCopiasReservadasPeliculaFinal=0;
            while(seguirComprobandoNumeroCopiasReservadas){
                System.out.println("Dime la cantidad de copias reservadas");  
                int numeroCopiasReservadasPelicula = lector.nextInt();
                if(numeroCopiasReservadasPelicula<=cantidadFinalPeliculas){
                    numeroCopiasReservadasPeliculaFinal=numeroCopiasReservadasPelicula;
                    seguirComprobandoNumeroCopiasReservadas=false;
                }
                else{
                    System.out.println("El numero "+numeroCopiasReservadasPelicula+" de copias reservadas supera la cantidad de peliculas existentes ("+cantidadFinalPeliculas+")");
                }
            }
            
            Pelicula nuevaPelicula = new Pelicula(nombrePelicula, directorPelicula, duracionPelicula, generoPelicula, añoPelicula, disponibilidadPelicula, numeroCopiasReservadasPeliculaFinal, cantidadFinalPeliculas);
            //String titulo, String director, int duracion, String genero, int año, boolean disponibilidad, int cantidadTotalCopiasPeliculas, int cantidadCopiasReservadas){
            arrayPeliculas.add(nuevaPelicula);
            
            System.out.println("Has completado el proceso de añadir pelicula con exito!");
                        
                        
            }
            
            
            /*
            private int Id;
            private static int IdSiguiente = 1;
            private String Titulo;
            private String Director;
            private int Duracion;
            private String Genero;
            private int Año;
            private boolean Disponibilidad;
            private int cantidadTotalCopiasPeliculas; //Cantidad de copias total del id de la película
            private int cantidadCopiasReservadas; //Cantidad de copias reservadas del id de la película
            */
        }
        else{
            System.out.println("No puedes añadir mas peliculas por que se ha alcanzado el maximo de copias en el videoclub");
        }
                
        /*for(int i=0; i<arrayPeliculas.size(); i++){   // este for sirve para sacar los id que hay asi 
            System.out.println(arrayPeliculas.get(i).getId());  // que sirve para ver si se han añadido
            System.out.println("");
        }*/
    }

    private static int contarPeliculas(ArrayList<Pelicula> arrayPeliculas) { // este metodo se usa para contar peliculas
        int contarTotalPeliculas = 0;
        for(int i=0; i<arrayPeliculas.size(); i++){
            contarTotalPeliculas += arrayPeliculas.get(i).getCantidadTotalCopiasPeliculas();
        }
        return contarTotalPeliculas;
    }
    
    private static void reservarPeliculas(ArrayList<Pelicula> arrayPeliculas){//con este metodo reservamos peliculas
        Scanner lector=new Scanner(System.in);
        listarPeliculas(arrayPeliculas);//listamos todas las peliculas con el metodo listarPeliculas();
        boolean volverPreguntarPelicula = true;
        while(volverPreguntarPelicula){
            System.out.println("Dime tu numero de socio");
            int idSocio = lector.nextInt()-1;
            System.out.println("Que pelicula quieres reservar? dime el id");
            arrayClientes.get(idSocio).getCantidadCopiasReservadas();//arrayClientes.get(idSocio).setArrayPeliculasReservadasClientes(1);
            int idPeliculaReservar = lector.nextInt()-1;//pedimos el id y le restamos 1 para que nos de la posicion en el array
            if(idPeliculaReservar+1<=arrayPeliculas.size()){
                if(arrayPeliculas.get(idPeliculaReservar).isDisponibilidad()==false){//si no esta disponible le decimos que la pelicula no esta disponible
                System.out.println("La pelicula "+arrayPeliculas.get(idPeliculaReservar).getTitulo()+" no esta disponible");
                }
                else{//si la pelicula esta disponoble mostramos un mensaje diciendole que ha sido reservada y sumaremos 1 numero al total de copias reservadas, si este numero es igual al numero de copias disponibles le pasaremos la disponibilidad a false
                    System.out.println("La pelicula "+arrayPeliculas.get(idPeliculaReservar).getTitulo()+" ha sido reservada");
                    arrayPeliculas.get(idPeliculaReservar).setCantidadCopiasReservadas(arrayPeliculas.get(idPeliculaReservar).getCantidadCopiasReservadas()+1);
                    if(arrayPeliculas.get(idPeliculaReservar).getCantidadCopiasReservadas()==arrayPeliculas.get(idPeliculaReservar).getCantidadTotalCopiasPeliculas()){
                        arrayPeliculas.get(idPeliculaReservar).setDisponibilidad(false);
                    }
                    System.out.println("La cantidad de peliculas reservadas "+arrayPeliculas.get(idPeliculaReservar).getCantidadCopiasReservadas()+" . La situacion de disponibilidad de la pelicula es "+arrayPeliculas.get(idPeliculaReservar).isDisponibilidad());
                    /*arrayPeliculas.set(idPeliculaReservar).setCantidadCopiasReservadas();
                    arrayPeliculas.get(idPeliculaReservar).getCantidadCopiasReservadas()-1;*/
                    //System.out.println("Quieres reservar otra pelicula");
                    volverPreguntarPelicula = false;
                }
            }
            else{
                System.out.println("El id de pelicula introducido no existe");
            }
            
        }
        
    }
    private static void listarPeliculas(ArrayList<Pelicula> arrayPeliculas){// metodo para sacar cierta indormacion del array de los objetos pelicula
        System.out.println("Listado de peliculas");
        System.out.println("--------------------");
        for(int i=0; i<arrayPeliculas.size(); i++){   // este for sirve para sacar la informacion de la pelicula del array
            System.out.println("Id pelicula: "+arrayPeliculas.get(i).getId());
            System.out.println("Titulo pelicula: "+arrayPeliculas.get(i).getTitulo());
            System.out.println("Director pelicula: "+arrayPeliculas.get(i).getDirector());
            System.out.println("Genero: "+arrayPeliculas.get(i).getGenero());
            System.out.println("Duracion: "+arrayPeliculas.get(i).getDuracion());
            System.out.print("Estado disponibilidad: ");
            if(arrayPeliculas.get(i).isDisponibilidad()){
                System.out.println("esta disponible");
            }
            else{
                System.out.println("no esta disponible");
            }
        System.out.println("--------------------");
        }
       
    }
    private static void buscarPeliculas(ArrayList<Pelicula> arrayPeliculas){
        Scanner lector=new Scanner(System.in);
        System.out.println("Dime que tipo de busqueda quieres");
        System.out.println("1. Por id");
        System.out.println("2. Por titulo");
        System.out.println("3. Por director");
        System.out.println("4. Por genero");
        int seleccionTipoBusqueda = lector.nextInt();
        boolean resultadosEncontrados=false;
        switch(seleccionTipoBusqueda){
            case 1:
                System.out.println("Dime el id de la pelicula");
                int idPeliculaBuscar = lector.nextInt()-1;
                if(idPeliculaBuscar<arrayPeliculas.size()){
                    System.out.println("lenght array" + arrayPeliculas.size());
                    System.out.println("Resultado de la busqueda");
                    System.out.println("--------------------");
                    System.out.println("Id pelicula: "+arrayPeliculas.get(idPeliculaBuscar).getId());
                    System.out.println("Titulo pelicula: "+arrayPeliculas.get(idPeliculaBuscar).getTitulo());
                    System.out.println("Director pelicula: "+arrayPeliculas.get(idPeliculaBuscar).getDirector());
                    System.out.println("Genero: "+arrayPeliculas.get(idPeliculaBuscar).getGenero());
                    System.out.println("Duracion: "+arrayPeliculas.get(idPeliculaBuscar).getDuracion());
                    System.out.print("Estado disponibilidad: ");
                    if(arrayPeliculas.get(idPeliculaBuscar).isDisponibilidad()){
                        System.out.println("esta disponible");
                    }
                    else{
                        System.out.println("no esta disponible");
                    }
                    System.out.println("--------------------");
                }
                else{
                    System.out.println("No se han encontrado resultados");
                }
                
            break;  
            case 2:
                System.out.println("Dime el titulo de la pelicula");
                String tituloBusquedaPelicula = lector.next().toLowerCase();
                resultadosEncontrados=false;
                for(int i=0;i<arrayPeliculas.size();i++){
                    int comparacionBusquedaPelicula = arrayPeliculas.get(i).getTitulo().toLowerCase().indexOf(tituloBusquedaPelicula);
                    listarPeliculasMedianteBusqueda(resultadosEncontrados, arrayPeliculas, i, comparacionBusquedaPelicula);
                }
                if(resultadosEncontrados==false){
                    System.out.println("No se han encontrado resultados");
                }
            break;
            case 3:
                System.out.println("Dime el director de la pelicula");
                String tituloBusquedaDirector = lector.next().toLowerCase();
                resultadosEncontrados=false;
                for(int i=0;i<arrayPeliculas.size();i++){
                    int comparacionBusquedaPelicula = arrayPeliculas.get(i).getDirector().toLowerCase().indexOf(tituloBusquedaDirector);
                    listarPeliculasMedianteBusqueda(resultadosEncontrados, arrayPeliculas, i, comparacionBusquedaPelicula);
                }
                if(resultadosEncontrados==false){
                    System.out.println("No se han encontrado resultados");
                }
            break;
            case 4:
                System.out.println("Dime el genero de la pelicula");
                String tituloBusquedaGenero = lector.next().toLowerCase();
                resultadosEncontrados=false;
                for(int i=0;i<arrayPeliculas.size();i++){
                    int comparacionBusquedaPelicula = arrayPeliculas.get(i).getGenero().toLowerCase().indexOf(tituloBusquedaGenero);                    
                    listarPeliculasMedianteBusqueda(resultadosEncontrados, arrayPeliculas, i, comparacionBusquedaPelicula);              
                }
                if(resultadosEncontrados==false){
                    System.out.println("No se han encontrado resultados");
                }
            break;
        }
        
    }
    public static void listarPeliculasMedianteBusqueda(boolean resultadosEncontrados, ArrayList<Pelicula> arrayPeliculas, int i, int comparacionBusquedaPelicula){
        if(comparacionBusquedaPelicula != -1){
            resultadosEncontrados = true;
            System.out.println("Resultado de la busqueda");
            System.out.println("--------------------");
            System.out.println("Id pelicula: "+arrayPeliculas.get(i).getId());
            System.out.println("Titulo pelicula: "+arrayPeliculas.get(i).getTitulo());
            System.out.println("Director pelicula: "+arrayPeliculas.get(i).getDirector());
            System.out.println("Genero: "+arrayPeliculas.get(i).getGenero());
            System.out.println("Duracion: "+arrayPeliculas.get(i).getDuracion());
            System.out.print("Estado disponibilidad: ");
            if(arrayPeliculas.get(i).isDisponibilidad()){
                System.out.println("esta disponible");
            }
            else{
                System.out.println("no esta disponible");
            }
            System.out.println("--------------------");
        }
    }
}
