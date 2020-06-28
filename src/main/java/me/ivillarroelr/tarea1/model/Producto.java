package me.ivillarroelr.tarea1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table( name = "producto")
public class Producto {
    

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer idProducto;

    @Size( min = 2, max = 150, message = "nombre debe tener al menos 2 caracteres")
    @Column( name = "nombre", nullable = false, length = 150)
    private String nombre;

    @Column( name = "precio", nullable = false)
    private Integer precio;

    @Column( name = "stock", nullable = false)
    private Integer stock;

    @ManyToOne
    @JoinColumn( name = "id_categoria", nullable = false, foreignKey = @ForeignKey( name = "FK_producto_categoria"))
   private Categoria idCategoria;

   public Integer getIdProducto() {
       return idProducto;
   }

   public void setIdProducto(Integer idProducto) {
       this.idProducto = idProducto;
   }

   public String getNombre() {
       return nombre;
   }

   public void setNombre(String nombre) {
       this.nombre = nombre;
   }

   public Integer getPrecio() {
       return precio;
   }

   public void setPrecio(Integer precio) {
       this.precio = precio;
   }

   public Integer getStock() {
       return stock;
   }

   public void setStock(Integer stock) {
       this.stock = stock;
   }

   public Categoria getIdCategoria() {
       return idCategoria;
   }

   public void setIdCategoria(Categoria idCategoria) {
       this.idCategoria = idCategoria;
   }

   @Override
   public String toString() {
       return "Producto [idCategoria=" + idCategoria + ", idProducto=" + idProducto + ", nombre=" + nombre + ", precio="
               + precio + ", stock=" + stock + "]";
   }

   @Override
   public int hashCode() {
       final int prime = 31;
       int result = 1;
       result = prime * result + ((idCategoria == null) ? 0 : idCategoria.hashCode());
       result = prime * result + ((idProducto == null) ? 0 : idProducto.hashCode());
       result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
       result = prime * result + ((precio == null) ? 0 : precio.hashCode());
       result = prime * result + ((stock == null) ? 0 : stock.hashCode());
       return result;
   }

   @Override
   public boolean equals(Object obj) {
       if (this == obj)
           return true;
       if (obj == null)
           return false;
       if (getClass() != obj.getClass())
           return false;
       Producto other = (Producto) obj;
       if (idCategoria == null) {
           if (other.idCategoria != null)
               return false;
       } else if (!idCategoria.equals(other.idCategoria))
           return false;
       if (idProducto == null) {
           if (other.idProducto != null)
               return false;
       } else if (!idProducto.equals(other.idProducto))
           return false;
       if (nombre == null) {
           if (other.nombre != null)
               return false;
       } else if (!nombre.equals(other.nombre))
           return false;
       if (precio == null) {
           if (other.precio != null)
               return false;
       } else if (!precio.equals(other.precio))
           return false;
       if (stock == null) {
           if (other.stock != null)
               return false;
       } else if (!stock.equals(other.stock))
           return false;
       return true;
   }

   
   
}