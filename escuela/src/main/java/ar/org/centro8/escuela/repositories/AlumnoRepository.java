package ar.org.centro8.escuela.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.org.centro8.escuela.entities.Alumno;

@Repository
public interface AlumnoRepository extends CrudRepository<Alumno, Integer> {
    
}
