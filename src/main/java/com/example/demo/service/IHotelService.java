package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Hotel;

public interface IHotelService {
	//Joins
	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion);
	
	public List<Hotel> buscarHotelLeftJoin(String tipoHabitacion);
	
	public List<Hotel> buscarHotelRightJoin(String tipoHabitacion);
	
	public List<Hotel> buscarHotelFullJoin(String tipoHabitacion);
	
	public List<Hotel> buscarHotelFetchJoin(String tipoHabitacion);
	

	
	public int eliminarPorNombre(String nombre);
	
	public int actualizarPorNombre(String nombre, String direccion);

}
