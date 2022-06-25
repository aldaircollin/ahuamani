package edu.ilp.ahuamani.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "profesor")
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "idprofesor",length = 10,nullable = false)
    private Long id_profesor;

    @Column(name = "salario", length = 500, nullable = false)
    private Double salario;

    @OneToOne
    @JoinColumn(name = "idpersona",referencedColumnName = "idpersona")
    private Persona persona;

    @ManyToMany
    @JoinTable(name = "ProfesorAsignatura",joinColumns = @JoinColumn(name = "idprofesor"),
    inverseJoinColumns = @JoinColumn(name = "idasignatura"))
    private Set<Asignatura> asignaturas = new HashSet<>();

    public Profesor() {
    }

    public Profesor(Long id_profesor, Double salario, Persona persona, Set<Asignatura> asignaturas) {
        this.id_profesor = id_profesor;
        this.salario = salario;
        this.persona = persona;
        this.asignaturas = asignaturas;
    }

    public Long getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(Long id_profesor) {
        this.id_profesor = id_profesor;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Set<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Set<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
}
