package edu.ilp.ahuamani.service.Impl;

import edu.ilp.ahuamani.dao.IPersonaDao;
import edu.ilp.ahuamani.entity.Persona;
import edu.ilp.ahuamani.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements IPersonaService {
    @Autowired
    private IPersonaDao personaDao;

    @Override
    public List<Persona> listarPersona() {
        return this.personaDao.findAll();
    }
}
