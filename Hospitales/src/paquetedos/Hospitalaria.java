/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author croks
 */
public class Hospitalaria {

    private String nomH;
    private Ciudad ciudad;
    private int numEspecialidades;
    private double totalSueldos;
    private String direccion;
    private Medico[] medicos;
    private Enfermero[] enfermeros;

    public Hospitalaria(String n, Ciudad c, int x, String d, Medico[] m, Enfermero[] e) {
        nomH = n;
        ciudad = c;
        numEspecialidades = x;
        direccion = d;
        medicos = m;
        enfermeros = e;
    }

    public void establecerCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public void establecerDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void establecerEnfermeros(Enfermero[] enfermeros) {
        this.enfermeros = enfermeros;
    }

    public void establecerMedicos(Medico[] medicos) {
        this.medicos = medicos;
    }

    public void establecerNomH(String nomH) {
        this.nomH = nomH;
    }

    public void establecerNumEspecialidades(int numEspecialidades) {
        this.numEspecialidades = numEspecialidades;
    }

    public void calcularTotalSueldos(Medico[] m, Enfermero[] e) {
        double suma = 0;
        for (int i = 0; i < m.length; i++) {
            suma = suma + m[i].obtenerSueldo();
        }
        for (int i = 0; i < e.length; i++) {
            suma = suma + e[i].obtenerSueldo();
        }
        totalSueldos = suma;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    public Enfermero[] obtenerEnfermeros() {
        return enfermeros;
    }

    public Medico[] obtenerMedicos() {
        return medicos;
    }

    public String obtenerNomH() {
        return nomH;
    }

    public int obtenerNumEspecialidades() {
        return numEspecialidades;
    }

    public double obtenerTotalSueldos() {
        return totalSueldos;
    }

    public String toString() {
        String mensaje = String.format("\nHOSPITAL %S\n"
                + "Dirección: %s\nCiudad: %s \n"
                + "Provincia: %s\n"
                + "Número de especialidades: %d\n", obtenerNomH(),
                obtenerDireccion(), ciudad.obtenerCiudad(), ciudad.obtenerProvincia(),
                obtenerNumEspecialidades());
        mensaje = String.format("%sListado de médicos\n", mensaje);
        for (int i = 0; i < obtenerMedicos().length; i++) {
            //- Richard Obrien - sueldo: 1000 - Pediatría
            mensaje = String.format("%s - %s - sueldo: %.2f - %s\n",
                    mensaje,
                    obtenerMedicos()[i].obtenerNombre(),
                    obtenerMedicos()[i].obtenerSueldo(),
                    obtenerMedicos()[i].obtenerEspecialidad());
        }

        mensaje = String.format("%sListado de enfermeros(as)\n", mensaje);

        for (int i = 0; i < obtenerEnfermeros().length; i++) {
            //- Richard Obrien - sueldo: 1000 - Pediatría
            mensaje = String.format("%s - %s - sueldo: %.2f - %s\n",
                    mensaje,
                    obtenerEnfermeros()[i].obtenerNombre(),
                    obtenerEnfermeros()[i].obtenerSueldo(),
                    obtenerEnfermeros()[i].obtenerEspecialidad());
        }

        mensaje = String.format("%s\nTotal de Sueldos a pagar: %.2f",
                mensaje, obtenerTotalSueldos());

        return mensaje;

    }
}
