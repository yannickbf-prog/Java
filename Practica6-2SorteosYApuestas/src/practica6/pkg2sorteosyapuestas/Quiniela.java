/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6.pkg2sorteosyapuestas;

/**
 *
 * @author Yann
 */
public class Quiniela extends Apuesta {
    private String[] quinielaPartidos = new String[15];
    private String[] resultadoPartidos = new String[15];
    private int aciertos = 0;
    public Quiniela() {
    }
    
    public Quiniela(String[] quinielaPartidos) {
    }

    public Quiniela(String nombre, String apellidos, String[] quinielaPartidos, String[] resultadoPartidos, int aciertos) {
        super(nombre, apellidos);
        this.quinielaPartidos = quinielaPartidos;
        this.resultadoPartidos = resultadoPartidos;
        this.aciertos = aciertos;
    }

    public String[] getResultadoPartidos() {
        return resultadoPartidos;
    }

    public void setResultadoPartidos(String[] resultadoPartidos) {
        this.resultadoPartidos = resultadoPartidos;
    }
    
    public String[] getQuinielaPartidos() {
        return quinielaPartidos;
    }

    public void setQuinielaPartidos(String[] quinielaPartidos) {
        this.quinielaPartidos = quinielaPartidos;
    }

    public int getAciertos() {
        return aciertos;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }
    
    @Override
    public void mostrarApuesta(){
        super.mostrarApuesta();
        System.out.println("Mostrar quiniela");
        for (int i = 0; i < this.quinielaPartidos.length; i++){
            // aqui se puede referir al objeto con arreglo[i];
            System.out.println("Partido "+(i+1)+" "+quinielaPartidos[i]);
        }
        System.out.println("Mostrar partidos");
        for (int i = 0; i < this.resultadoPartidos.length; i++){
            // aqui se puede referir al objeto con arreglo[i];
            System.out.println("Partido "+(i+1)+" "+resultadoPartidos[i]);
        }
        System.out.println("Resultados");
        int aciertos = 0;
        int fallos = 0;
        for (int i = 0; i < this.resultadoPartidos.length; i++){
            // aqui se puede referir al objeto con arreglo[i];
            System.out.print("Resultado del partido "+(i+1)+": "+resultadoPartidos[i]+". Tu apuesta es: "+quinielaPartidos[i]);
            if (resultadoPartidos[i].equals(quinielaPartidos[i])){
                System.out.print(" Has hacertado!");
                aciertos++;
            }
            else{
                System.out.print(" Has fallado");
                fallos++;
            }
            System.out.println("");
        }
        System.out.println("Aciertos "+aciertos);
        System.out.println("Fallos "+fallos);
    }
}
