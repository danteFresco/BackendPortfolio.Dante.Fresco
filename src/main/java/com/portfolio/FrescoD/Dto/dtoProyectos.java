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
public class dtoProyectos {

    @NotBlank
    private String nombreP;
    @NotBlank
    private String descripcionP;
    public dtoProyectos() {
    }

    public dtoProyectos(String nombreP, String descripcionP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
    }

    public String getnombreP() {
        return nombreP;
    }

    public void setnombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getdescripcionP() {
        return descripcionP;
    }

    public void setdescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }
}
