/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author lucia
 */
public class Secretaria extends Persona {
            private  int id_secretaria;
            private String sector;

    public Secretaria(int id_secretaria, String sector, String nombre, String apellido, char sexo, String fechaNacimiento, int documento) {
        super(nombre, apellido, sexo, fechaNacimiento, documento);
        this.id_secretaria = id_secretaria;
        this.sector = sector;
    }

    public int getId_secretaria() {
        return id_secretaria;
    }

    public void setId_secretaria(int id_secretaria) {
        this.id_secretaria = id_secretaria;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
    
    

       

   

  
    
    
    
    
    
    
}
