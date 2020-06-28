package me.ivillarroelr.tarea1.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Entity
@Table( name = "cliente")
public class Cliente {
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer idCliente;

    @Size( min = 2, max = 150, message = "Debe tener minimo 2 caracteres")
    @Column( name = "nombre", nullable = false, length = 150)
    private String nombre;

    @Size( min = 2, max = 150, message = "Debe tener minimo 2 caracteres")
    @Column( name = "apellido", nullable = false, length = 150)
    private String apellido; 

    @Size(max = 255, message = "No puede tener mas de 255 caracteres")
    @Column( name = "direccion", nullable = true, length = 255)
    private String direccion;

    @Column( name = "fecha_nacimiento", nullable = false, length = 255)
    private LocalDateTime fechaNacimiento;
    
    @Size( min = 9, max = 9, message = "Telefono debe tener 9 digitos")
    @Column( name = "telefono", nullable = false, length = 9)
    private Integer telefono;
    
    @Email
    @Column( name = "email", nullable = true, length = 255)
    private String email;

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente [apellido=" + apellido + ", direccion=" + direccion + ", email=" + email + ", fechaNacimiento="
                + fechaNacimiento + ", idCliente=" + idCliente + ", nombre=" + nombre + ", telefono=" + telefono + "]";
    }

    
}