package edu.ilp.ahuamani.service.Impl;

import edu.ilp.ahuamani.dao.IProfesorDao;
import edu.ilp.ahuamani.entity.Asignatura;
import edu.ilp.ahuamani.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProfesorServiceImpl implements IProfesorService {

    @Autowired
    IProfesorDao profesordao;

    @Override
    public List<Asignatura> obtenerCursoPorProfesor(Long id_profesor) {
        return this.profesordao.obtenerCursoPorProfesor (id_profesor);
    }
}
