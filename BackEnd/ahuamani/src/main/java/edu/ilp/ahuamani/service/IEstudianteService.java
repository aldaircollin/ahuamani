package edu.ilp.ahuamani.service;

import edu.ilp.ahuamani.entity.Estudiante;

import java.util.List;

public interface IEstudianteService {
    Estudiante obtenerEstudiantePorCodigo(String codigo);

    Estudiante guardarEstudiante(Estudiante estudiante);

    void eliminarUnEstudiante(Long idestudiante);

    List<Estudiante> listarEstudiante();
}
