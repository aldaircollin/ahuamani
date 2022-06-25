package edu.ilp.ahuamani.service.Impl;

import edu.ilp.ahuamani.dao.IEstudianteDao;
import edu.ilp.ahuamani.entity.Estudiante;
import edu.ilp.ahuamani.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceImpl implements IEstudianteService {
    @Autowired
    private IEstudianteDao estudianteDao;

    @Override
    public Estudiante obtenerEstudiantePorCodigo(String codigo) {
        return this.estudianteDao.obtenerEstudiantePorCodigo(codigo);
    }

    @Override
    public Estudiante guardarEstudiante(Estudiante estudiante) {
        return this.estudianteDao.save(estudiante);
    }

    @Override
    public void eliminarUnEstudiante(Long idestudiante) {
        this.estudianteDao.deleteById(idestudiante);
    }

    @Override
    public List<Estudiante> listarEstudiante() {
        return this.estudianteDao.findAll();
    }
}
