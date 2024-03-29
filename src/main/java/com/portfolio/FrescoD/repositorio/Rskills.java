/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.FrescoD.repositorio;

import com.portfolio.FrescoD.entidad.Skills;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Dante
 */
@Repository
public interface Rskills extends JpaRepository<Skills, Integer>{
    Optional<Skills> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
