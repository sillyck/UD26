package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IEquiposDAO;
import com.example.demo.dto.Equipos;

@Service
public class EquiposServiceIMPL implements IEquiposService {

	@Autowired
	IEquiposDAO iEquiposDAO;
	
	@Override
	public List<Equipos> listarEquipos() {
		// TODO Auto-generated method stub
		return iEquiposDAO.findAll();
	}

	@Override
	public Equipos guardarEquipos(Equipos Equipos) {
		// TODO Auto-generated method stub
		return iEquiposDAO.save(Equipos);
	}

	@Override
	public Equipos EquiposXID(int id) {
		// TODO Auto-generated method stub
		return iEquiposDAO.findById(id).get();
	}

	@Override
	public Equipos actualizarEquipos(Equipos Equipos) {
		// TODO Auto-generated method stub
		return iEquiposDAO.save(Equipos);
	}

	@Override
	public void eliminarEquipos(int id) {
		// TODO Auto-generated method stub
		iEquiposDAO.deleteById(id);
	}

}
