/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author croks
 */
public class Enfermero {
     private String nom;
    private String tipo;
    private double sueldoM;
    
    public Enfermero(String n, String e, double s) {
        nom = n;
        tipo = e;
        sueldoM = s;
    }
    
    private void establecerNombre(String n) {
        nom = n;
    }
    public void establecerEspecialidad(String t) {
        tipo = t;
    }
    public void establecerSueldo(double s) {
        sueldoM = s;
    }
    private String obtenerNombre() {
        return nom;
    }
    public String obtenerEspecialidad() {
        return tipo;
    }
    public double obtenerSueldo() {
        return sueldoM;
    }
}
