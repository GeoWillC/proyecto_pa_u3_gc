package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Hotel;

public interface IHotelService {
	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion);
	
	public int eliminarPorNombre(String nombre);
	
	public int actualizarPorNombre(String nombre, String direccion);

}
