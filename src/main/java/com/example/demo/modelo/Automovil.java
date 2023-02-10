package com.example.demo.modelo;

import java.math.BigDecimal;

import org.hibernate.annotations.NamedNativeQuery;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "automovil")
//Placa
@NamedQuery(name = "Automovil.buscarPorPlaca", 
query = "select a from Automovil a where a.placa=:datoPlaca")
@NamedNativeQuery(name = "Automovil.buscarPorPlaca1", 
query = "select * from automovil where auto_placa=:datoPlaca",resultClass = Automovil.class)
//Color
@NamedQuery(name = "Automovil.buscarPorColor",
query = "select a from Automovil a where a.color=:datoColor")
@NamedNativeQuery(name = "Automovil.buscarPorColor1", 
query = "select * from automovil a where auto_color=:datoColor",resultClass = Automovil.class)
//Marca
@NamedQuery(name = "Automovil.buscarPorMarca", 
query = "select a from Automovil a where a.marca=:datoMarca")
@NamedNativeQuery(name = "Automovil.buscarPorMarca1", 
query = "select * from automovil where auto_marca=:datoMarca",resultClass = Automovil.class)

public class Automovil {
	@Id
	@Column(name = "auto_placa")
	private String placa;
	@Column(name = "auto_color")
	private String color;
	@Column(name = "auto_precio")
	private BigDecimal precio;
	// manual M , automatica A
	@Column(name = "auto_transmicion")
	private String transmicion;
	@Column(name = "auto_marca")
	private String marca;
	@Column(name = "auto_numero_serie")
	private String numeroSerie;
	// si S, no N
	@Column(name = "auto_disponibilidad")
	private Boolean disponibilidad;

	// SET Y GET
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public String getTransmicion() {
		return transmicion;
	}

	public void setTransmicion(String transmicion) {
		this.transmicion = transmicion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public Boolean getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(Boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	@Override
	public String toString() {
		return "Automovil [placa=" + placa + ", color=" + color + ", precio=" + precio + ", transmicion=" + transmicion
				+ ", marca=" + marca + ", numeroSerie=" + numeroSerie + ", disponibilidad=" + disponibilidad + "]";
	}

}
