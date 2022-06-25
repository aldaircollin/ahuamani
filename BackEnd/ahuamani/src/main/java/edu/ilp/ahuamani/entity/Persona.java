package edu.ilp.ahuamani.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name= "persona")
@Inheritance( strategy = InheritanceType.JOINED )
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpersona", length = 10)
    private Long id_persona;

    @Column(name = "nombre", length = 30, nullable = false)
    private String nombre;

    @Column(name = "apellido", length = 40, nullable = false)
    private String apellido;

    @Column(name = "telefono", length = 15, nullable = false)
    private String telefono;

    @Column(name = "email", length = 50, nullable = false)
    private String email;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Direccion direccion;

    public Persona() {
    }

    public Persona(Long id_persona) {
        this.id_persona = id_persona;
    }

    public Persona(Long id_persona, String nombre, String apellido, String telefono, String email, Direccion direccion) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
    }

    public Long getId_persona() {
        return id_persona;
    }

    public void setId_persona(Long id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
