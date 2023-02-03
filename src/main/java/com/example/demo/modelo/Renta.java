package com.example.demo.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "renta")
public class Renta {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rent_sec")
	@SequenceGenerator(name = "rent_sec", sequenceName = "rent_sec", allocationSize = 1)
	@Column(name = "rent_id")
	private Integer id;
	@Column(name = "rent_valor_total")
	private BigDecimal valorTotal;
	@Column(name = "rent_tarjeta_cobrar")
	private String tarjetaCobrar;

	// FK vehiculo
	@ManyToOne
	@JoinColumn(name = "rent_id_vehi")
	private Vehiculo vehiculo;
	// FK cliente
	@ManyToOne
	@JoinColumn(name = "rent_id_clie")
	private Cliente cliente;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getTarjetaCobrar() {
		return tarjetaCobrar;
	}
	public void setTarjetaCobrar(String tarjetaCobrar) {
		this.tarjetaCobrar = tarjetaCobrar;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	@Override
	public String toString() {
		return "Renta [id=" + id + ", valorTotal=" + valorTotal + ", tarjetaCobrar=" + tarjetaCobrar + "]";
	}

}
