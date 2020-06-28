package me.ivillarroelr.tarea1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table( name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer idCategoria;

    @Size( min = 2, max = 150, message = "nombre debe tener al menos 2 caracteres")
    @Column( name = "nombre", nullable = false, length = 150)
    private String nombre;

    @Column( name = "descripcion", nullable = true)
    private String descripcion;

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Categoria [descripcion=" + descripcion + ", idCategoria=" + idCategoria + ", nombre=" + nombre + "]";
    }
    
    
}