/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototype;

import java.util.HashMap;

/**
 *
 * @author santi
 */
public abstract class Pc implements Cloneable {
    private int pulgadas;
    private String procesador;
    private double precio;
    private int memoria;
    
    public Pc(int pulgadas, String procesador, double precio, int memoria){
        this.pulgadas = pulgadas;
        this.procesador = procesador;
        this.precio = precio;
        this.memoria = memoria;
    }
    
    @Override
    
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    public int getMemoria() {
        return memoria;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public String getProcesador() {
        return procesador;
    }
    
    public int getPulgadas() {
        return pulgadas;
    }
}
