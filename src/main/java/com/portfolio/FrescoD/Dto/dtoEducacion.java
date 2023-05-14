/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.FrescoD.Dto;

import jakarta.validation.constraints.NotBlank;

/**
 *
 * @author Dante
 */
public class dtoEducacion {
      @NotBlank
    private String nombreE;
    @NotBlank
    private String tituloE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String fechaE;
    
    public dtoEducacion() {
    }

    public dtoEducacion(String nombreE, String tituloE, String descripcionE, String fechaE) {
        this.nombreE = nombreE;
        this.tituloE = tituloE;
        this.descripcionE = descripcionE;
        this.fechaE = fechaE;
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

    public String getTituloE() {
        return tituloE;
    }

    public void setTituloE(String tituloE) {
        this.tituloE = tituloE;
    }

    public String getFechaE() {
        return fechaE;
    }

    public void setFechaE(String fechaE) {
        this.fechaE = fechaE;
    }
    
    
}
