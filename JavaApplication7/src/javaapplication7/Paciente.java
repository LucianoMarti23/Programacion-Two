/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author lucia
 */
public class Paciente extends Persona {   // Creo la clase paciente que es hereda de la clase Persona
    private int id_paciente;   // Creo los atributos privados de la clase
    private int telefono;
    private String obraSocial;
    private String direccion;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {  
        this.edad = edad;
    }
    private int edad;

    public Paciente(int id_paciente, int telefono, String obraSocial, String direccion, int edad, String nombre, String apellido, char sexo, String fechaNacimiento, int documento) {
        super(nombre, apellido, sexo, fechaNacimiento, documento); // Constructor de la clase
        this.id_paciente = id_paciente;
        this.telefono = telefono;
        this.obraSocial = obraSocial;
        this.direccion = direccion;
        this.edad = edad; 
    }  

     
    public int getId_paciente() {     // Metodos Get y Setters para los atributos de la clase
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    
}
