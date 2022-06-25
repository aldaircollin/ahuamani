package edu.ilp.ahuamani.service.Impl;

import edu.ilp.ahuamani.dao.IAsignaturaDao;
import edu.ilp.ahuamani.entity.Asignatura;
import edu.ilp.ahuamani.service.IAsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AsignaturaServiceImpl implements IAsignaturaService {
    @Autowired
    IAsignaturaDao asignaturaDao;

    @Override
    public Asignatura guardarAsignatura(Asignatura asignatura) {
        return this.asignaturaDao.save(asignatura);
    }

    @Override
    public List<Asignatura> listarAsignatura() {
        return this.asignaturaDao.findAll();
    }
}
