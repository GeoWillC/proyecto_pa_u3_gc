package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Habitacion;
import com.example.demo.modelo.Hotel;
import com.example.demo.repository.IHabitacionRepo;

@Service
public class HabitacionServiceImpl implements IHabitacionService{
	
	@Autowired
	private IHabitacionRepo iHabitacionRepo;

	@Override
	public List<Habitacion> buscarHabitacionLeftJoin() {
		// TODO Auto-generated method stub
		return this.iHabitacionRepo.buscarHabitacionLeftJoin();
	}

	@Override
	public List<Habitacion> buscarHabitacionRightJoin() {
		// TODO Auto-generated method stub
		return this.iHabitacionRepo.buscarHabitacionRightJoin();
	}

	@Override
	public List<Habitacion> buscarHabitacionFullJoin() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
