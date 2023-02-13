package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Hotel;

public interface IHotelRepo {
	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion);
	
	public int eliminarPorNombre(String nombre);
	
	public int actualizarPorNombre(String nombre, String direccion);
}
