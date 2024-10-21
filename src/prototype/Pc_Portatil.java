/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototype;

/**
 *
 * @author santi
 */
public class Pc_Portatil extends Pc{
    private String garantia;
    public Pc_Portatil(int pulgadas, String procesador, double precio, int memoria, String garantia){
        super(pulgadas, procesador, precio, memoria);
        this.garantia = garantia;
    }
    
    public String getGarantia(){
        return garantia;
    }
}
