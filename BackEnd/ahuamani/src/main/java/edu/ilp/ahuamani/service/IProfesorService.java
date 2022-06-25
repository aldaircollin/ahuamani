package edu.ilp.ahuamani.service;

import edu.ilp.ahuamani.entity.Asignatura;

import java.util.List;

public interface IProfesorService {
    List<Asignatura> obtenerCursoPorProfesor(Long id_profesor);
}
