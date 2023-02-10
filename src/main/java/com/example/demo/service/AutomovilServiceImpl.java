package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Automovil;
import com.example.demo.repository.IAutomovilRepo;

@Service
public class AutomovilServiceImpl implements IAutomovilService{

	@Autowired
	private IAutomovilRepo iAutomovilRepo;
	
	
	@Override
	public void insertar(Automovil automovil) {
		// TODO Auto-generated method stub
		this.iAutomovilRepo.insertar(automovil);
	}

	@Override
	public Automovil buscarPorPlacaTypedQuery(String placa) {
		// TODO Auto-generated method stub
		return this.iAutomovilRepo.buscarPorPlacaTypedQuery(placa);
	}

	@Override
	public Automovil buscarPorPlacaNamedQuery(String placa) {
		// TODO Auto-generated method stub
		return this.iAutomovilRepo.buscarPorPlacaNamedQuery(placa);
	}

	@Override
	public Automovil buscarPorPlacaNativeQuery(String placa) {
		// TODO Auto-generated method stub
		return this.iAutomovilRepo.buscarPorPlacaNativeQuery(placa);
	}

	@Override
	public Automovil buscarPorPlacaNamedNativeQuery(String placa) {
		// TODO Auto-generated method stub
		return this.iAutomovilRepo.buscarPorPlacaNamedNativeQuery(placa);
	}

	@Override
	public Automovil buscarPorColorTypedQuery(String color) {
		// TODO Auto-generated method stub
		return this.iAutomovilRepo.buscarPorColorTypedQuery(color);
	}

	@Override
	public Automovil buscarPorColorNamedQuery(String color) {
		// TODO Auto-generated method stub
		return this.iAutomovilRepo.buscarPorColorNamedQuery(color);
	}

	@Override
	public Automovil buscarPorColorNativeQuery(String color) {
		// TODO Auto-generated method stub
		return this.iAutomovilRepo.buscarPorColorNativeQuery(color);
	}

	@Override
	public Automovil buscarPorColorNamedNativeQuery(String color) {
		// TODO Auto-generated method stub
		return this.iAutomovilRepo.buscarPorColorNamedNativeQuery(color);
	}

	@Override
	public Automovil buscarPorMarcaTypedQuery(String marca) {
		// TODO Auto-generated method stub
		return this.iAutomovilRepo.buscarPorMarcaTypedQuery(marca);
	}

	@Override
	public Automovil buscarPorMarcaNamedQuery(String marca) {
		// TODO Auto-generated method stub
		return this.iAutomovilRepo.buscarPorMarcaNamedQuery(marca);
	}

	@Override
	public Automovil buscarPorMarcaNativeQuery(String marca) {
		// TODO Auto-generated method stub
		return this.iAutomovilRepo.buscarPorMarcaNativeQuery(marca);
	}

	@Override
	public Automovil buscarPorMarcaNamedNativeQuery(String marca) {
		// TODO Auto-generated method stub
		return this.iAutomovilRepo.buscarPorMarcaNamedNativeQuery(marca);
	}

}
