package me.ivillarroelr.tarea1.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="factura")
public class Factura {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idFactura;

    @Column(name="fecha", nullable=false, length = 255)
    private LocalDateTime fecha;

    @ManyToOne
    @JoinColumn(name="id_cliente", nullable=false, foreignKey=@ForeignKey(name="FK_factura_cliente"))
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name="id_modo_pago", nullable=false, foreignKey=@ForeignKey(name="FK_factura_modo_pago"))
    private ModoPago modoPago;


    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ModoPago getModoPago() {
		return this.modoPago;
	}

	public void setModoPago(ModoPago modoPago) {
		this.modoPago = modoPago;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((idFactura == null) ? 0 : idFactura.hashCode());
		result = prime * result + ((modoPago == null) ? 0 : modoPago.hashCode());
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
		Factura other = (Factura) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (idFactura == null) {
			if (other.idFactura != null)
				return false;
		} else if (!idFactura.equals(other.idFactura))
			return false;
		if (modoPago == null) {
			if (other.modoPago != null)
				return false;
		} else if (!modoPago.equals(other.modoPago))
			return false;
		return true;
	}

    

}