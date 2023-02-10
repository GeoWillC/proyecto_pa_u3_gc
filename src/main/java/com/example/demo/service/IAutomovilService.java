package com.example.demo.service;

import com.example.demo.modelo.Automovil;

public interface IAutomovilService {

	public void insertar(Automovil automovil);

	//Placa 
	//TypedQuery 
	public Automovil buscarPorPlacaTypedQuery(String placa);
	//NamedQuery 
	public Automovil buscarPorPlacaNamedQuery(String placa);
	//NativeQuery 
	public Automovil buscarPorPlacaNativeQuery(String placa);
	//NamedNativeQuery
	public Automovil buscarPorPlacaNamedNativeQuery(String placa);
	
	//Color
	public Automovil buscarPorColorTypedQuery(String color);
	//NamedQuery 
	public Automovil buscarPorColorNamedQuery(String color);
	//NativeQuery 
	public Automovil buscarPorColorNativeQuery(String color);
	//NamedNativeQuery
	public Automovil buscarPorColorNamedNativeQuery(String color);
	
	//Marca
	public Automovil buscarPorMarcaTypedQuery(String marca);
	//NamedQuery 
	public Automovil buscarPorMarcaNamedQuery(String marca);
	//NativeQuery 
	public Automovil buscarPorMarcaNativeQuery(String marca);
	//NamedNativeQuery
	public Automovil buscarPorMarcaNamedNativeQuery(String marca);
	
}
