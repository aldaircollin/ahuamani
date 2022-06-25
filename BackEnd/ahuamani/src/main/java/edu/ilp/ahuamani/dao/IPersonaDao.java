package edu.ilp.ahuamani.dao;

import edu.ilp.ahuamani.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaDao extends JpaRepository<Persona,Long> {
}
