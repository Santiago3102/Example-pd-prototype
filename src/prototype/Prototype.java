/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prototype;

/**
 *
 * @author santi
 */
public class Prototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Pc_Prototype Pcp= new Pc_Prototype();
            Pc pc = (Pc) Pcp.prototipo("Portatil");
            System.out.println("Portatil\n" +
                    "Procesador: " + pc.getProcesador() + "\nMemoria: " + pc.getMemoria() +
                    "\nPulgadas: " + pc.getPulgadas() + "\nPrecio: " + pc.getPrecio());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
    }
    
}
