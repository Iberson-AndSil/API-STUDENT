package com.example.demo.repositories;
import com.example.demo.models.alumno;
// import java.util.ArrayList;
// import org.springframework.data.repository.Documento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface alumnoRepositorie extends CrudRepository<alumno, Long> {
    // public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);  

}   