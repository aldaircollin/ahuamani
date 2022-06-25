package edu.ilp.ahuamani.service;

import edu.ilp.ahuamani.entity.Asignatura;

import java.util.List;

public interface IAsignaturaService {
    Asignatura guardarAsignatura(Asignatura asignatura);

    List<Asignatura> listarAsignatura();
}
