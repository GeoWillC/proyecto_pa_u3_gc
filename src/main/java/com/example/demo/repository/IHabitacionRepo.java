package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Habitacion;

public interface IHabitacionRepo {
	public List<Habitacion> buscarHabitacionLeftJoin();
	public List<Habitacion> buscarHabitacionRightJoin();
	public List<Habitacion> buscarHabitacionFullJoin();
}
