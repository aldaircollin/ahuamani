package edu.ilp.ahuamani.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "estudiante")
@PrimaryKeyJoinColumn(referencedColumnName = "idpersona")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Estudiante extends Persona{

    @Column(name = "codigo", length = 20, nullable = false)
    private String codigo;

    @Column(name = "serie", length = 30, nullable = false)
    private String serie;

    public Estudiante() {
    }

    public Estudiante(String codigo, String serie) {
        this.codigo = codigo;
        this.serie = serie;
    }


    public Estudiante(Long id_persona, String nombre, String apellido, String telefono, String email, Direccion direccion, String codigo, String serie) {
        super(id_persona, nombre, apellido, telefono, email, direccion);
        this.codigo = codigo;
        this.serie = serie;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}
