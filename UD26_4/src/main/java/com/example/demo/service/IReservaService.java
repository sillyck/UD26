package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Reserva;

public interface IReservaService {

	public List<Reserva> listarReservas(); 
	
	public Reserva guardarReserva(Reserva Reserva);	
	
	public Reserva ReservaXID(int id);
	
	public Reserva actualizarReserva(Reserva Reserva); 
	
	public void eliminarReserva(int id);
	
}
