package me.ivillarroelr.tarea1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="detalle")
@IdClass(DetallePK.class)
public class Detalle {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer numDetalle;

    @Id
    private Factura factura;

    @Id
    private Producto producto;

    @Column(name="precio")
    private Long precio;

    @Column(name="stock")
    private Integer stock;

    public Integer getNumDetalle() {
        return numDetalle;
    }

    public void setNumDetalle(Integer numDetalle) {
        this.numDetalle = numDetalle;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    


}