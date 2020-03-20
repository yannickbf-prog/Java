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
public class Triangulo implements FiguraGeometrica {
    
    //area
    private double base;
    private double altura;
    //volumen
    private double alturaPiramide;
    private double ladoPiramide;

    public Triangulo() {
    }

    public Triangulo(double base, double altura, double alturaPiramide, double ladoPiramide) {
        this.base = base;
        this.altura = altura;
        this.alturaPiramide = alturaPiramide;
        this.ladoPiramide = ladoPiramide;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAlturaPiramide() {
        return alturaPiramide;
    }

    public void setAlturaPiramide(double alturaPiramide) {
        this.alturaPiramide = alturaPiramide;
    }

    public double getLadoPiramide() {
        return ladoPiramide;
    }

    public void setLadoPiramide(double ladoPiramide) {
        this.ladoPiramide = ladoPiramide;
    }
    
    
   
    @Override
    public void calcularArea(){
        double base = this.getBase();
        double altura = this.getAltura();
        double resultadoArea = base * altura / 2;
        System.out.println("La base del triangulo es "+this.getBase());
        System.out.println("La altura del triangulo es "+this.getAltura());
        System.out.println("El resultado de su area es "+resultadoArea);
        System.out.println("--------");
    }
   
    @Override
    public void calcularVolumen() {
        double alturaPiramide = this.getLadoPiramide();
        double ladoPiramide = this.getLadoPiramide();
        double resultadoVolumen = (alturaPiramide * (ladoPiramide*ladoPiramide))/3;
        System.out.println("La altura de la piramide es "+this.getAlturaPiramide());
        System.out.println("El lado de la piramide es "+this.getLadoPiramide());
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
