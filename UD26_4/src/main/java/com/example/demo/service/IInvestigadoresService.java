package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Investigadores;

public interface IInvestigadoresService {

	public List<Investigadores> listarInvestigadores(); 
	
	public Investigadores guardarInvestigadores(Investigadores Investigadores);	
	
	public Investigadores InvestigadoresXID(int id);
	
	public Investigadores actualizarInvestigadores(Investigadores Investigadores); 
	
	public void eliminarInvestigadores(int id);
	
}
