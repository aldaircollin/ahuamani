package edu.ilp.ahuamani.dao;

import edu.ilp.ahuamani.entity.Asignatura;
import edu.ilp.ahuamani.entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IProfesorDao extends JpaRepository<Profesor,Long> {
    @Query("SELECT p.asignaturas FROM Profesor p WHERE p.id_profesor = :id_profesor")
    List<Asignatura> obtenerCursoPorProfesor(@Param("id_profesor") Long id_profesor);
}
