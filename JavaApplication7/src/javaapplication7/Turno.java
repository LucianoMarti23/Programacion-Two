/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

import java.util.Date;

/**
 *
 * @author lucia
 */
public class Turno { // Creo la clase turno

      // Metodos get y setters de los atributos privados

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Paciente getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(Paciente nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public int getNroTurno() {
        return nroTurno;
    }

    public void setNroTurno(int nroTurno) {
        this.nroTurno = nroTurno;
    }

    public Secretaria getSecre() {
        return secre;
    }

    public void setSecre(Secretaria secre) {
        this.secre = secre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

   
    private Profesional profesional;
    private String hora;
    private Paciente nombrePaciente;
    private int nroTurno;
    private Secretaria secre;
    private String fecha;

    public Turno(Profesional profesional, String hora, Paciente nombrePaciente, int nroTurno, Secretaria secre, String fecha) {
        this.profesional = profesional;
        this.hora = hora;
        this.nombrePaciente = nombrePaciente;
        this.nroTurno = nroTurno;
        this.secre = secre;
        this.fecha = fecha;
    } // Constructor de la clase Turno
  
    
    
    
    
    
}
