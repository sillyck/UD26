package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Equipos;

public interface IEquiposService {

	public List<Equipos> listarEquipos(); 
	
	public Equipos guardarEquipos(Equipos Equipos);	
	
	public Equipos EquiposXID(int id);
	
	public Equipos actualizarEquipos(Equipos Equipos); 
	
	public void eliminarEquipos(int id);
	
}
