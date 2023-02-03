package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.repository.IRentaRepo;
import com.example.demo.modelo.Renta;

@Service
public class RentaServiceImpl implements IRentaService{

	@Autowired
	private  IVehiculoService  iVehiculoService;
	@Autowired
	private IClienteService iClienteService;
	@Autowired
	private IRentaRepo iRentaRepo;
	
	@Override
	public void rentar(String cedula, String placa) {
		// TODO Auto-generated method stub
			Renta renta=new Renta();
			Cliente cliente=this.iClienteService.encontrar(cedula);
			Vehiculo vehiculo=this.iVehiculoService.encontrar(placa); 
			renta.setCliente(cliente);
			renta.setTarjetaCobrar(cliente.getTarjetaCredito());
			renta.setVehiculo(vehiculo);
			BigDecimal valorTotal=vehiculo.getPrecioDia().multiply(cliente.getDiasRenta());
			renta.setValorTotal(valorTotal);
			renta.setVehiculo(vehiculo);
			this.iRentaRepo.insertar(renta);
	}

}
