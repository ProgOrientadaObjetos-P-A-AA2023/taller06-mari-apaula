/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author Sistemas G Didactic
 */
public class Ciudad {
    private String nomCiudad;
    private String nomProvincia;
    
    public Ciudad(String c, String p) {
        nomCiudad = c;
        nomProvincia = p;
    }
    
    public void establecerCiudad(String c) {
        nomCiudad = c;
    }
    public void establecerProvincia(String p) {
        nomProvincia = p;
    }
    public String obtenerCiudad() {
        return nomCiudad;
    }
    public String obtenerProvincia() {
        return nomProvincia;
    }
}
