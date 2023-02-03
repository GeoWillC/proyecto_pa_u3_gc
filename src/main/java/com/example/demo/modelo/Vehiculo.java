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
@Table(name="vehiculo")
public class Vehiculo {
	@Id
	@Column(name="vehi_placa")
	private String placa;
	@Column(name="vehi_precio_dia")
	private BigDecimal precioDia;
	@Column(name="vehi_marca")
	private String marca;
	@Column(name="vehi_color")
	private String color;
	// Relacion 1 - n
	@OneToMany(mappedBy = "vehiculo",cascade = CascadeType.ALL)
	private List<Renta> rentas;

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public BigDecimal getPrecioDia() {
		return precioDia;
	}

	public void setPrecioDia(BigDecimal precioDia) {
		this.precioDia = precioDia;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public List<Renta> getRentas() {
		return rentas;
	}

	public void setRentas(List<Renta> rentas) {
		this.rentas = rentas;
	}

	@Override
	public String toString() {
		return "Vehiculo [placa=" + placa + ", precioDia=" + precioDia + ", marca=" + marca + ", color=" + color
				+ ", rentas=" + rentas + "]";
	}
	
}
