package com.example.demo.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	@Id
	@Column(name = "clie_cedula")
	private String cedula;
	@Column(name = "clie_nombre")
	private String nombre;
	@Column(name = "clie_apellido")
	private String apellido;
	@Column(name = "clie_tarjeta_credito")
	private String tarjetaCredito;
	@Column(name = "clie_dias_renta")
	private BigDecimal diasRenta;
	// Relacion 1 - n
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	private List<Renta> rentas;

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
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

	public String getTarjetaCredito() {
		return tarjetaCredito;
	}

	public void setTarjetaCredito(String tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}

	public BigDecimal getDiasRenta() {
		return diasRenta;
	}

	public void setDiasRenta(BigDecimal diasRenta) {
		this.diasRenta = diasRenta;
	}

	public List<Renta> getRentas() {
		return rentas;
	}

	public void setRentas(List<Renta> rentas) {
		this.rentas = rentas;
	}

	@Override
	public String toString() {
		return "Cliente [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", tarjetaCredito="
				+ tarjetaCredito + ", diasRenta=" + diasRenta + ", rentas=" + rentas + "]";
	}

}
