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
    private String url;

    public dtoProyectos() {
    }

    public dtoProyectos(String nombreP, String descripcionP, String url) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.url = url;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
