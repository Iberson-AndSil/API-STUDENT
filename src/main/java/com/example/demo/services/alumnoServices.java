package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.alumno;
import com.example.demo.repositories.alumnoRepositorie;
// import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// import org.springframework.web.bind.annotation.GetMapping;

@Service
public class alumnoServices {
    @Autowired
    alumnoRepositorie AlumnoRepository;
    
    // @GetMapping("/")
    // public List<documento> obtenerTodosLosDocumentos() {
    //     return (List<documento>) documentRepository.findAll();    
    // }

    public ArrayList<alumno> obtenerAlumnos(){
        return (ArrayList<alumno>) AlumnoRepository.findAll();
    }

    public alumno guardarAlumno(alumno alumno){
        return AlumnoRepository.save(alumno); 
    }

    public Optional<alumno> obtenerPorId(Long id){
        return AlumnoRepository.findById(id);
    }


    // public ArrayList<documento>  obtenerPorPrioridad(Integer prioridad) {
    //     return documentRepository.findByPrioridad(prioridad);
    // }

    public boolean eliminarAlumno(Long id) {
        try{
            AlumnoRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }


    
}