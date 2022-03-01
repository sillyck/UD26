package main.service;

import java.util.List;

import main.dto.Proyecto;

public interface IProyectoService {
	
	public List<Proyecto> listarProyecto();
	
	public Proyecto guardarProyecto(Proyecto proyecto);
	
	public Proyecto proyectoXID(int id);
	
	public Proyecto actualizarProyecto(Proyecto proyecto);
	
	public void eliminarProyecto(int id);
}
