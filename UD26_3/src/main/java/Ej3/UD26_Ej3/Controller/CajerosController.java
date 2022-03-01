package Ej3.UD26_Ej3.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Ej3.UD26_Ej3.dto.Cajeros;
import Ej3.UD26_Ej3.service.CajerosServiceIMPL;

@RestController
@RequestMapping("/api")
public class CajerosController {
	
		@Autowired
		CajerosServiceIMPL cajerosServiceImpl;

		@GetMapping("/Cajeros")
		public List<Cajeros> listarCajeross() {
			return cajerosServiceImpl.listarCajeros();
		}

		@PostMapping("/Cajeros")
		public Cajeros salvarCajeros(@RequestBody Cajeros Cajeros) {

			return cajerosServiceImpl.guardarCajeros(Cajeros);
		}

		@GetMapping("/Cajeros/{id}")
		public Cajeros CajerosXID(@PathVariable(name = "Codigo") int Codigo) {

			Cajeros Cajeros_xid = new Cajeros();

			Cajeros_xid = cajerosServiceImpl.CajerosXID(Codigo);

			System.out.println("Cajeros XID: " + Cajeros_xid);

			return Cajeros_xid;
		}

		@PutMapping("/Cajeros/{id}")
		public Cajeros actualizarCajeros(@PathVariable(name = "id") int Codigo, @RequestBody Cajeros Cajeros) {

			Cajeros Cajeros_seleccionado = new Cajeros();
			Cajeros Cajeros_actualizado = new Cajeros();

			Cajeros_seleccionado = cajerosServiceImpl.CajerosXID(Codigo);

			Cajeros_seleccionado.setid(Cajeros.getid());
			Cajeros_seleccionado.setNomApels(Cajeros.getNomApels());

			Cajeros_actualizado = cajerosServiceImpl.actualizarCajeros(Cajeros_seleccionado);

			System.out.println("El Cajeros actualizado es: " + Cajeros_actualizado);

			return Cajeros_actualizado;
		}

		@DeleteMapping("/Cajeros/{id}")
		public void eliminarCajeros(@PathVariable(name = "id") int Codigo) {
			cajerosServiceImpl.eliminarCajeros(Codigo);
		}
	}
