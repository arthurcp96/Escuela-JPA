package ar.org.centro8.escuela.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.org.centro8.escuela.entities.Curso;

@Repository
public interface CursoRepository extends CrudRepository<Curso, Integer> {
    
}
