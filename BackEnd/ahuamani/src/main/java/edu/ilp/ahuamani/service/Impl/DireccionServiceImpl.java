package edu.ilp.ahuamani.service.Impl;

import edu.ilp.ahuamani.dao.IDireccionDao;
import edu.ilp.ahuamani.entity.Direccion;
import edu.ilp.ahuamani.service.IDireccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DireccionServiceImpl implements IDireccionService {

    @Autowired
    IDireccionDao direccionDao;

    @Override
    public Direccion obtenerDireccionPorCodigo(String codigo) {
        return this.direccionDao.obtenerDireccionPorCodigo(codigo);
    }
}
