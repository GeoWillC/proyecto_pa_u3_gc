package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Habitacion;

public interface IHabitacionService {
	public List<Habitacion> buscarHabitacionLeftJoin();
	public List<Habitacion> buscarHabitacionRightJoin();
	public List<Habitacion> buscarHabitacionFullJoin();

}
