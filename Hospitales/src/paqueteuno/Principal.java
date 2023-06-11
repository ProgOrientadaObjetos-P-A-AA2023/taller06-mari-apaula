/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteuno;

import java.util.Locale;
import java.util.Scanner;
import paquetedos.*;

/**
 *
 * @author Sistemas G Didactic
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Se requiere administrar hospitales del país. Por cada entidad 
        hospitalaria se necesita algunos atributos tales como: 
        nombre del hospital, 
        ciudad del hospital, 
        número de especialidades, 
        conjunto de médicos, 
        conjunto de enfermeros o enfermeras, 
        total de sueldos a cancelar por mes del personal del hospital, 
        dirección del hospital.

Considerandos:

La ciudad del hospital deberá se una entidad que tenga como características: 
        nombre de la ciudad, provincia de la ciudad.
Un médico se lo considera con atributos como: 
        nombre del doctor, especialidad, sueldo mensual.
Un efermero o enfermera tiene las siguientes características: 
        nombre, tipo (nombramiento, contrato) y sueldo mensual.
El sueldo total a cancelar es igual a 
        la suma de los sueldos del conjunto de médicos y 
        enfermeros(as) que forman parte de su personal.

    En una clase llamada Principal, con el método main, se debe generar un 
    objeto del tipo entidad hospitalaria. Se debe agregar sus valores por 
        teclado.
Al finalizar le proceso de ingreso; se debe imprimir el objeto (usar el método toString. Por ejemplo
         */
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        Hospitalaria h1;
        Medico md[];
        Enfermero ef[];

        System.out.println("Ingrese el nombre del hospital");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese la dirección del hospital");
        String direccion = entrada.nextLine();
        System.out.println("Ingrese la ciudad del hospital");
        String ciudad = entrada.nextLine();
        System.out.println("Ingrese la provincia del hospital");
        String provincia = entrada.nextLine();
        System.out.println("Ingrese el número de especialidades del hospital");
        int esp = entrada.nextInt();
        System.out.println("Ingrese el número de medicos a ingresar");
        int num = entrada.nextInt();
        md = new Medico[num];
        entrada.nextLine();

        Ciudad cdd = new Ciudad(ciudad, provincia);
        for (int i = 0; i < md.length; i++) {
            System.out.println("Ingrese el nombre del medico");
            String nombreMedico = entrada.nextLine();
            System.out.println("Ingrese el sueldo del medico");
            double sMed = entrada.nextDouble();
            System.out.println("Ingrese la especialidad del medico");
            entrada.nextLine();
            String especialidad = entrada.nextLine();
            md[i] = new Medico(nombreMedico, especialidad, sMed);

        }
        
        num = 0;
        
        System.out.println("Ingrese el número de enfermeros/as a ingresar");
        num = entrada.nextInt();
        ef = new Enfermero[num];
        entrada.nextLine();

        for (int i = 0; i < ef.length; i++) {
            System.out.println("Ingrese el nombre del enfermero/a");
            String nEfermeros = entrada.nextLine();
            // h1.establecerNombre(entrada.nextLine());
            System.out.println("Ingrese el sueldo del enfermero/a");
            double sEf = entrada.nextDouble();
            System.out.println("Ingrese el tipo de contrato (nombramiento o contrato) del enfermero/a");
            entrada.nextLine();
            String tipoE = entrada.nextLine();
            ef[i] = new Enfermero(nEfermeros, tipoE, sEf);
        }
        h1 = new Hospitalaria(nombre, cdd, esp, direccion, md, ef);

        h1.calcularTotalSueldos(md, ef);
        System.out.printf("%s\n", h1);

    }

}
