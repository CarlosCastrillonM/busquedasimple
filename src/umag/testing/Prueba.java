/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umag.testing;
import umag.datos.Persona;
import java.util.ArrayList;
/**
 *
 * @author carla
 */
public class Prueba {
    
    public static void main(String[] args) {
        
    ArrayList<Persona> lp = new ArrayList<Persona>();
    Persona pe1 = new Persona("Carlos", 20, 1020);
    Persona pe2 = new Persona("Alfredo", 18, 1540);
    Persona pe3 = new Persona("Andres", 23, 8590);
    Persona pe4 = new Persona("Eduardo", 34, 4330);
    Persona pe5 = new Persona("Mariana", 12, 8590);
    Persona pe6 = new Persona("Jessica", 27, 8470);
    
    
    lp.add(pe1);
    lp.add(pe2);
    lp.add(pe3);
    lp.add(pe4);
    lp.add(pe5);
    lp.add(pe6);
    
    
    System.out.println(lp.toString());
    
    
    }
}
