package main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.ICientificosDAO;
import main.dto.Cientificos;
@Service
public class CientificosServiceIMPL implements ICientificosService {
	@Autowired
	ICientificosDAO iCientificosDAO;
	@Override
	public List<Cientificos> listarCientificos() {
		return iCientificosDAO.findAll();
	}

	@Override
	public Cientificos guardarCientifico(Cientificos cientificos) {
		return iCientificosDAO.save(cientificos);
	}

	@Override
	public Cientificos cientificoXID(int id) {
		return iCientificosDAO.findById(id).get();
	}

	@Override
	public Cientificos actualizarCientifico(Cientificos cientificos) {
		return iCientificosDAO.save(cientificos);
	}

	@Override
	public void eliminarCientificos(int id) {
		iCientificosDAO.deleteById(id);
	}

}
