package Ej3.UD26_Ej3.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Ej3.UD26_Ej3.dto.Maquinas_Registradoras;
import Ej3.UD26_Ej3.service.Maquinas_RegistradorasServiceIMPL;

@RestController
@RequestMapping("/api")
public class Maquinas_RegistradorasController {

	@Autowired
	Maquinas_RegistradorasServiceIMPL maquinas_RegistradorasServiceImpl;

	@GetMapping("/Maquinas_Registradoras")
	public List<Maquinas_Registradoras> listarMaquinas_Registradorass() {
		return maquinas_RegistradorasServiceImpl.listarMaquinas_Registradoras();
	}

	@PostMapping("/Maquinas_Registradoras")
	public Maquinas_Registradoras salvarMaquinas_Registradoras(@RequestBody Maquinas_Registradoras Maquinas_Registradoras) {

		return maquinas_RegistradorasServiceImpl.guardarMaquinas_Registradoras(Maquinas_Registradoras);
	}

	@GetMapping("/Maquinas_Registradoras/{id}")
	public Maquinas_Registradoras Maquinas_RegistradorasXID(@PathVariable(name = "Codigo") int Codigo) {

		Maquinas_Registradoras Maquinas_Registradoras_xid = new Maquinas_Registradoras();

		Maquinas_Registradoras_xid = maquinas_RegistradorasServiceImpl.Maquinas_RegistradorasXID(Codigo);

		System.out.println("Maquinas_Registradoras XID: " + Maquinas_Registradoras_xid);

		return Maquinas_Registradoras_xid;
	}

	@PutMapping("/Maquinas_Registradoras/{id}")
	public Maquinas_Registradoras actualizarMaquinas_Registradoras(@PathVariable(name = "id") int Codigo, @RequestBody Maquinas_Registradoras Maquinas_Registradoras) {

		Maquinas_Registradoras Maquinas_Registradoras_seleccionado = new Maquinas_Registradoras();
		Maquinas_Registradoras Maquinas_Registradoras_actualizado = new Maquinas_Registradoras();

		Maquinas_Registradoras_seleccionado = maquinas_RegistradorasServiceImpl.Maquinas_RegistradorasXID(Codigo);

		Maquinas_Registradoras_seleccionado.setid(Maquinas_Registradoras.getid());
		Maquinas_Registradoras_seleccionado.setPiso(Maquinas_Registradoras.getPiso());

		Maquinas_Registradoras_actualizado = maquinas_RegistradorasServiceImpl.actualizarMaquinas_Registradoras(Maquinas_Registradoras_seleccionado);

		System.out.println("El Maquinas_Registradoras actualizado es: " + Maquinas_Registradoras_actualizado);

		return Maquinas_Registradoras_actualizado;
	}

	@DeleteMapping("/Maquinas_Registradoras/{id}")
	public void eliminarMaquinas_Registradoras(@PathVariable(name = "id") int Codigo) {
		maquinas_RegistradorasServiceImpl.eliminarMaquinas_Registradoras(Codigo);
	}
	
}
