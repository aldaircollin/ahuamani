package edu.ilp.ahuamani.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "direccion")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddireccion", length = 10)
    private Long id_direccion;

    @Column(name = "direccion", length = 40, nullable = false)
    private String direccion;

    @Column(name = "ciudad", length = 30, nullable = false)
    private String ciudad;

    @Column(name = "estado", length = 30, nullable = false)
    private String estado;

    @Column(name = "codigopostal", length = 20, nullable = false)
    private String codigopostal;

    @Column(name = "pais", length = 30, nullable = false)
    private String pais;

    public Direccion() {
    }

    public Direccion(Long id_direccion, String direccion, String ciudad, String estado, String codigopostal, String pais) {
        this.id_direccion = id_direccion;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codigopostal = codigopostal;
        this.pais = pais;
    }

    public Long getId_direccion() {
        return id_direccion;
    }

    public void setId_direccion(Long id_direccion) {
        this.id_direccion = id_direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
