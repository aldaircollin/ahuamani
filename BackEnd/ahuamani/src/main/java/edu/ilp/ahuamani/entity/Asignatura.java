package edu.ilp.ahuamani.entity;

import javax.persistence.*;

@Entity
@Table(name="asignatura")
public class Asignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idasignatura", length = 10,nullable = false)
    private Long idasignatura;

    @Column(name = "denominacion", length = 50, nullable = false)
    private String denominacion;

    @Column(name = "sigla", length = 20, nullable = false)
    private String sigla;

    @Column(name = "credito", length = 20, nullable = false)
    private String credito;

    public Asignatura() {
    }

    public Asignatura(Long idasignatura, String denominacion, String sigla, String credito) {
        this.idasignatura = idasignatura;
        this.denominacion = denominacion;
        this.sigla = sigla;
        this.credito = credito;
    }

    public Long getIdasignatura() {
        return idasignatura;
    }

    public void setIdasignatura(Long idasignatura) {
        this.idasignatura = idasignatura;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }
}
