/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.FrescoD.Dto;

import jakarta.validation.constraints.NotBlank;
import java.util.Date;

/**
 *
 * @author Dante
 */
public class dtoEducacion {
      @NotBlank
    private String nombreE;
    @NotBlank
    private String titulo;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private Date fechaE;

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreE, String titulo, String descripcionE, Date fechaE) {
        this.nombreE = nombreE;
        this.titulo = titulo;
        this.descripcionE = descripcionE;
        this.fechaE = fechaE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public Date getFechaE() {
        return fechaE;
    }

    public void setFechaE(Date fechaE) {
        this.fechaE = fechaE;
    }

    
}