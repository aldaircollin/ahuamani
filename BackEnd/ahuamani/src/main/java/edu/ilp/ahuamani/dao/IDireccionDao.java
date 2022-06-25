package edu.ilp.ahuamani.dao;

import edu.ilp.ahuamani.entity.Direccion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

@Repository
public interface IDireccionDao extends CrudRepository<Direccion,Long> {
    @Async
    @Query("SELECT distinct e.direccion  FROM Estudiante e WHERE e.codigo = :codigo")
    Direccion obtenerDireccionPorCodigo(@Param("codigo") String codigo);
}
