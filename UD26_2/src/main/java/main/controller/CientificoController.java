package main.controller;

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

import main.dto.Cientificos;
import main.service.CientificosServiceIMPL;

@RestController
@RequestMapping("/api")
public class CientificoController {
	
	@Autowired
	CientificosServiceIMPL cientificosServiceIMPL;
	
	@GetMapping("/cientificos")
	public List<Cientificos> listarCientificos(){
		return cientificosServiceIMPL.listarCientificos();
	}
	
	@PostMapping("/cientificos")
	public Cientificos guardCientificos(@RequestBody Cientificos cientificos) {
		return cientificosServiceIMPL.guardarCientifico(cientificos);
	}
	
	@GetMapping("/cientificos/{id}")
	public Cientificos cientificoXID(@PathVariable(name="id") int id) {
		Cientificos xid = new Cientificos();
		
		xid=cientificosServiceIMPL.cientificoXID(id);
		
		System.out.println("Cientificos: " + xid);
		
		return xid;
	}
	
	@PutMapping("/cientificos/{id}")
	public Cientificos actualizarCientifico(@PathVariable(name="id")int id,@RequestBody Cientificos cientifico) {
		Cientificos sel = new Cientificos();
		Cientificos act = new Cientificos();
		
		sel = cientificosServiceIMPL.cientificoXID(id);
		sel.setDni(cientifico.getDni());
		sel.setNomApels(cientifico.getNomApels());
		
		act = cientificosServiceIMPL.actualizarCientifico(sel);
		
		System.out.println("Cientifico actualizado: " + act);
		return act;
	}
	
	@DeleteMapping("/cientificos/{id}")
	public void eliminarCientificos(@PathVariable(name="id")int id) {
		cientificosServiceIMPL.eliminarCientificos(id);
	}
}
