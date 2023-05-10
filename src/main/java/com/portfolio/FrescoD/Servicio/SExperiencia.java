/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.FrescoD.Servicio;

import com.portfolio.FrescoD.entidad.experiencia;
import com.portfolio.FrescoD.repositorio.RExperiencia;
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
public class SExperiencia {
     @Autowired
     RExperiencia rExperiencia;
     
      public List<experiencia> list(){
         return rExperiencia.findAll();
     }
     
     public Optional<experiencia> getOne(int id){
         return rExperiencia.findById(id);
     }
     
     public Optional<experiencia> getByNombreE(String nombreE){
         return rExperiencia.findByNombreE(nombreE);
     }
     
     public void save(experiencia expe){
         rExperiencia.save(expe);
     }
     
     public void delete(int id){
         rExperiencia.deleteById(id);
     }
     
     public boolean existsById(int id){
         return rExperiencia.existsById(id);
     }
     
     public boolean existsByNombreE(String nombreE){
         return rExperiencia.existsByNombreE(nombreE);
     }
}
