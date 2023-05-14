/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.FrescoD.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author Dante
 */
@Entity
public class experiencia {
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String nombreE;
    public String descripcionE;
    public String fechaE;

    public experiencia() {
    }

    

    public experiencia(String nombreE, String descripcionE, String FechaE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.fechaE = FechaE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getFechaE() {
        return fechaE;
    }

    public void setFechaE(String FechaE) {
        this.fechaE = FechaE;
    }

    
    
    
}

