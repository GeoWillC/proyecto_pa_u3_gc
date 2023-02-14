package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Hotel;
import com.example.demo.repository.IHotelRepo;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HotelServiceImpl implements IHotelService{

	@Autowired
	private IHotelRepo iHotelRepo;
	
	@Override
	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.iHotelRepo.buscarHotelInnerJoin(tipoHabitacion);
	}

	@Override
	public int eliminarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.iHotelRepo.eliminarPorNombre(nombre);
	}

	@Override
	public int actualizarPorNombre(String nombre, String direccion) {
		// TODO Auto-generated method stub
		return this.iHotelRepo.actualizarPorNombre(nombre, direccion);
	}

	@Override
	public List<Hotel> buscarHotelLeftJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.iHotelRepo.buscarHotelLeftJoin(tipoHabitacion);
	}

	@Override
	public List<Hotel> buscarHotelRightJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.iHotelRepo.buscarHotelRightJoin(tipoHabitacion);
	}

	@Override
	public List<Hotel> buscarHotelFullJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.iHotelRepo.buscarHotelFullJoin(tipoHabitacion);
	}

	@Override
	public List<Hotel> buscarHotelFetchJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.iHotelRepo.buscarHotelFetchJoin(tipoHabitacion);
	}

}
