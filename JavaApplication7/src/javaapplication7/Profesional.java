/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

import java.util.TreeMap;

/**
 *
 * @author lucia
 */
public class Profesional extends Persona {
    private String telefono;

    public Profesional(String telefono, String direccion, String correoelectronico, String nombre, String apellido, char sexo, String fechaNacimiento, int documento) {
        super(nombre, apellido, sexo, fechaNacimiento, documento);
        this.telefono = telefono;
        this.direccion = direccion;
        this.correoelectronico = correoelectronico;
    }
    private String direccion;
    private String correoelectronico;

    
    
}
