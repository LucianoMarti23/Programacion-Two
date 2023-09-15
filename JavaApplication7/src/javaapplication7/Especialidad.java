/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

import java.util.ArrayList;

/**
 *
 * @author lucia
 */
public class Especialidad {

    private String nombre;
    private int nro_especialidad;
    private ArrayList<Turno> turnos = new ArrayList<>();

    public Profesional getProfesional() {
        return profesional;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    
    private Profesional profesional;

    public Especialidad(String nombre, int nro_especialidad, Profesional profesional) {
        this.nombre = nombre;
        this.nro_especialidad = nro_especialidad;
        this.profesional = profesional;
    }

    

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(ArrayList<Turno> turnos) {
        this.turnos = turnos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNro_especialidad() {
        return nro_especialidad;
    }

    public void setNro_especialidad(int nro_especialidad) {
        this.nro_especialidad = nro_especialidad;
    }

    public void cargarTurnos(Turno n) {
        turnos.add(n);
    }

     
  
    }

  

