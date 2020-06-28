package me.ivillarroelr.tarea1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "modo_pago")
public class ModoPago {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer numPago;

    @Column( name = "nombre", nullable = false, length = 255)
    private String nombre;

    @Column( name = "otros_detalles", nullable = false, length = 255)
    private String otrosDetalles;

    public Integer getNumPago() {
        return numPago;
    }

    public void setNumPago(Integer numPago) {
        this.numPago = numPago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOtrosDetalles() {
        return otrosDetalles;
    }

    public void setOtrosDetalles(String otrosDetalles) {
        this.otrosDetalles = otrosDetalles;
    }

    @Override
    public String toString() {
        return "ModoPago [nombre=" + nombre + ", numPago=" + numPago + ", otrosDetalles=" + otrosDetalles + "]";
    }

    
    
}