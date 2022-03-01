package main.service;

import java.util.List;

import main.dto.Cientificos;

public interface ICientificosService {
	public List<Cientificos> listarCientificos();
	
	public Cientificos guardarCientifico(Cientificos cientificos);
	
	public Cientificos cientificoXID(int id);
	
	public Cientificos actualizarCientifico(Cientificos cientificos);
	
	public void eliminarCientificos(int id);
}
