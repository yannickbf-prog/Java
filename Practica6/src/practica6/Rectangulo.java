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
public class Rectangulo implements FiguraGeometrica{
    //area
    private double base;
    private double altura;
    //volumen
    private double alturaVolumen;
    private double longitudVolumen;
    private double profundidadVolumen;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura, double alturaVolumen, double longitudVolumen, double profundidadVolumen) {
        this.base = base;
        this.altura = altura;
        this.alturaVolumen = alturaVolumen;
        this.longitudVolumen = longitudVolumen;
        this.profundidadVolumen = profundidadVolumen;
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

    public double getAlturaVolumen() {
        return alturaVolumen;
    }

    public void setAlturaVolumen(double alturaVolumen) {
        this.alturaVolumen = alturaVolumen;
    }

    public double getLongitudVolumen() {
        return longitudVolumen;
    }

    public void setLongitudVolumen(double longitudVolumen) {
        this.longitudVolumen = longitudVolumen;
    }

    public double getProfundidadVolumen() {
        return profundidadVolumen;
    }

    public void setProfundidadVolumen(double profundidadVolumen) {
        this.profundidadVolumen = profundidadVolumen;
    }
    
    @Override
    public void calcularArea(){
        double base = this.getBase();
        double altura = this.getAltura();
        double resultadoArea = base * altura;
        System.out.println("La base del rectangulo es "+base);
        System.out.println("La altura del rectangulo es "+altura);
        System.out.println("El resultado de su area es "+resultadoArea);
        System.out.println("--------");
    }
   
    @Override
    public void calcularVolumen() {
        double alturaVolumen = this.getAlturaVolumen();
        double longitudVolumen = this.getLongitudVolumen();
        double profundidadVolumen = this.getProfundidadVolumen();
        double resultadoVolumen = alturaVolumen*longitudVolumen*profundidadVolumen;
        System.out.println("La altura del ortoedro es  "+alturaVolumen);
        System.out.println("La longitud del ortoedro es  "+longitudVolumen);
        System.out.println("La profundidad del ortoedro es "+profundidadVolumen);
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
