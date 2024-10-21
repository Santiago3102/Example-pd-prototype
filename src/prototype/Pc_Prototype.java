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
public class Pc_Prototype {
    private final HashMap<String, Pc> prototipos = new HashMap<>();
    
    public Pc_Prototype() {
        Pc_Mesa mesa = new Pc_Mesa(18, "COre i-5", 1300000, 1000000);
        Pc_Portatil portatil = new Pc_Portatil(14, "Core i-3", 1200000, 500000, "1 año");
        prototipos.put("Mesa", mesa);
        prototipos.put("Portatil", portatil);
    }
    
    public Object prototipo(String tipo) throws CloneNotSupportedException {
        return prototipos.get(tipo).clone();
    }
}
