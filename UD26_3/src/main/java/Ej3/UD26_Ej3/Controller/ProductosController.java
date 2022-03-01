package Ej3.UD26_Ej3.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Ej3.UD26_Ej3.dto.Productos;
import Ej3.UD26_Ej3.service.ProductosServiceIMPL;

@RestController
@RequestMapping("/api")
public class ProductosController {

	@Autowired
	ProductosServiceIMPL productosServiceImpl;

	@GetMapping("/Productos")
	public List<Productos> listarProductoss() {
		return productosServiceImpl.listarProductos();
	}

	@PostMapping("/Productos")
	public Productos salvarProductos(@RequestBody Productos Productos) {

		return productosServiceImpl.guardarProductos(Productos);
	}

	@GetMapping("/Productos/{id}")
	public Productos ProductosXID(@PathVariable(name = "Codigo") int Codigo) {

		Productos Productos_xid = new Productos();

		Productos_xid = productosServiceImpl.ProductosXID(Codigo);

		System.out.println("Productos XID: " + Productos_xid);

		return Productos_xid;
	}

	@PutMapping("/Productos/{id}")
	public Productos actualizarProductos(@PathVariable(name = "id") int Codigo, @RequestBody Productos Productos) {

		Productos Productos_seleccionado = new Productos();
		Productos Productos_actualizado = new Productos();

		Productos_seleccionado = productosServiceImpl.ProductosXID(Codigo);

		Productos_seleccionado.setID(Productos.getID());
		Productos_seleccionado.setNombre(Productos.getNombre());
		Productos_seleccionado.setPrecio(Productos.getPrecio());

		Productos_actualizado = productosServiceImpl.actualizarProductos(Productos_seleccionado);

		System.out.println("El Productos actualizado es: " + Productos_actualizado);

		return Productos_actualizado;
	}

	@DeleteMapping("/Productos/{id}")
	public void eliminarProductos(@PathVariable(name = "id") int Codigo) {
		productosServiceImpl.eliminarProductos(Codigo);
	}
}
