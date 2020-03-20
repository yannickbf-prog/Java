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
public class Cuadrado implements FiguraGeometrica{
    
    //area
    private double lado;
    //volumen
    private double arista;

    public Cuadrado() {
    }

    public Cuadrado(double lado, double arista) {
        this.lado = lado;
        this.arista = arista;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArista() {
        return arista;
    }

    public void setArista(double arista) {
        this.arista = arista;
    }
    
    @Override
    public void calcularArea(){
        double lado = this.getLado();
        double resultadoArea = lado*lado;
        System.out.println("El lado del cuadrado es "+this.getLado());
        System.out.println("El resultado de su area es "+resultadoArea);
        System.out.println("--------");
    }
   
    @Override
    public void calcularVolumen() {
        double aristaCubo = this.getArista();
        double resultadoVolumen = aristaCubo*aristaCubo*aristaCubo;
        System.out.println("La arista del cubo es "+aristaCubo);
        System.out.println("El resultado de su volumen es "+resultadoVolumen);
        System.out.println("--------");
    }

    @Override
    public void imprimirCaracteristicas() {
        System.out.println("Calculadora de Yannick Baratte Forner");
        System.out.println("--------");
        calcularArea();
        calcularVolumen();
    }
    
}
