/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umag.datos;

/**
 *
 * @author carla
 */
public class Persona {
    private String nombre;
    private int edad;
    private int cc;

    public Persona(String nombre, int edad, int cc) {
        this.nombre = nombre;
        this.edad = edad;
        this.cc = cc;
    }
    
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the cc
     */
    public int getCc() {
        return cc;
    }

    /**
     * @param cc the cc to set
     */
    public void setCc(int cc) {
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "Persona{nombre=" + nombre + ", edad=" + edad + ", cc=" + cc + "}\n";
    }
    
}
