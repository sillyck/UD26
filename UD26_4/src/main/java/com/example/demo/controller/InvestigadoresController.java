package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Investigadores;
import com.example.demo.service.InvestigadoresServiceIMPL;

@RestController
@RequestMapping("/api")
public class InvestigadoresController {

	@Autowired
	InvestigadoresServiceIMPL InvestigadoresServiceImpl;
	
	@GetMapping("/Investigadores")
	public List<Investigadores> listarCInvestigadores(){
		return InvestigadoresServiceImpl.listarInvestigadores();
	}
	
	
	@PostMapping("/Investigadores")
	public Investigadores salvarInvestigadores(@RequestBody Investigadores Investigadores) {
		
		return InvestigadoresServiceImpl.guardarInvestigadores(Investigadores);
	}
	
	
	@GetMapping("/Investigadores/{id}")
	public Investigadores InvestigadoresXID(@PathVariable(name="id") int id) {
		
		Investigadores Investigadores_xid= new Investigadores();
		
		Investigadores_xid=InvestigadoresServiceImpl.InvestigadoresXID(id);
		
		System.out.println("Investigadores XID: "+Investigadores_xid);
		
		return Investigadores_xid;
	}
	
	@PutMapping("/Investigadores/{id}")
	public Investigadores actualizarInvestigadores(@PathVariable(name="id")int id,@RequestBody Investigadores Investigadores) {
		
		Investigadores Investigadores_seleccionado= new Investigadores();
		Investigadores Investigadores_actualizado= new Investigadores();
		
		Investigadores_seleccionado= InvestigadoresServiceImpl.InvestigadoresXID(id);
		
		Investigadores_seleccionado.setFacultad(Investigadores.getFacultad());
		Investigadores_seleccionado.setNomapels(Investigadores.getNomapels());
		
		Investigadores_actualizado = InvestigadoresServiceImpl.actualizarInvestigadores(Investigadores_seleccionado);
		
		System.out.println("El Investigadores actualizado es: "+ Investigadores_actualizado);
		
		return Investigadores_actualizado;
	}
	
	@DeleteMapping("/Investigadores/{id}")
	public void eleiminarInvestigadores(@PathVariable(name="id")int id) {
		InvestigadoresServiceImpl.eliminarInvestigadores(id);
	}
	
}
