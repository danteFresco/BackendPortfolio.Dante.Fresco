/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.FrescoD.Servicio;

import com.portfolio.FrescoD.entidad.Skills;
import com.portfolio.FrescoD.repositorio.Rskills;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Dante
 */
@Service
@Transactional
public class SSkills {
      @Autowired
    Rskills rskills;
    
    public List<Skills> list(){
        return rskills.findAll();
    }
    
    public Optional<Skills> getOne(int id){
        return rskills.findById(id);
    }
    
    public Optional<Skills> getByNombre(String nombre){
        return rskills.findByNombre(nombre);
    }
    
    public void save(Skills skill){
        rskills.save(skill);
    }
    
    public void delete(int id){
        rskills.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rskills.existsById(id);
    }
    
    public boolean existsByNombre(String nombre){
        return rskills.existsByNombre(nombre);
    }
}