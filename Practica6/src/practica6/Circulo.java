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
public class Circulo implements FiguraGeometrica{
    //area
    private double radio;
    //volumen
    private double radioVolumen;

    public Circulo() {
    }

    public Circulo(double radio, double radioVolumen) {
        this.radio = radio;
        this.radioVolumen = radioVolumen;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadioVolumen() {
        return radioVolumen;
    }

    public void setRadioVolumen(double radioVolumen) {
        this.radioVolumen = radioVolumen;
    }
    
    @Override
    public void calcularArea(){
        double radio = this.getRadio();
        double resultadoArea = Math.PI * (radio*radio);
        System.out.println("El radio del circulo es "+radio);
        System.out.println("El resultado de su area es "+resultadoArea);
        System.out.println("--------");
    }
   
    @Override
    public void calcularVolumen() {
        double radioVolumen = this.getRadioVolumen();
        double resultadoVolumen = 4 * Math.PI * (radioVolumen*radioVolumen*radioVolumen)/3;
        System.out.println("El radio de la esfera es "+radioVolumen);
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
