/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author Sistemas G Didactic
 */
public class Medico {
    private String nom;
    private String especialidad;
    private double sueldo;
    
    public Medico(String n, String e, double s) {
        nom = n;
        especialidad = e;
        sueldo = s;
    }

    public String obtenerNombre() {
        return nom;
    }

    public void establecerNombre(String nom) {
        this.nom = nom;
    }
    
    public void establecerEspecialidad(String e) {
        especialidad = e;
    }
    
    public void establecerSueldo(double s) {
        sueldo = s;
    }
    
    public String obtenerEspecialidad() {
        return especialidad;
    }
    public double obtenerSueldo() {
        return sueldo;
    }
}
