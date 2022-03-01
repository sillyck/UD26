package Ej3.UD26_Ej3.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Ej3.UD26_Ej3.dto.Venta;
import Ej3.UD26_Ej3.service.VentaServiceIMPL;


@RestController
@RequestMapping("/api")
public class VentaController {

	@Autowired
	VentaServiceIMPL ventaServiceImpl;

	@GetMapping("/Venta")
	public List<Venta> listarVentas() {
		return ventaServiceImpl.listarVentas();
	}

	@PostMapping("/Ventas")
	public Venta salvarVentas(@RequestBody Venta venta) {

		return ventaServiceImpl.guardarVentas(venta);
	}

	@GetMapping("/Ventas/{id}")
	public Venta ventasXID(@PathVariable(name = "Codigo") int Codigo) {

		Venta Ventas_xid = new Venta();

		Ventas_xid = ventaServiceImpl.VentasXID(Codigo);

		System.out.println("Ventas XID: " + Ventas_xid);

		return Ventas_xid;
	}

	@PutMapping("/Ventas/{id}")
	public Venta actualizarVentas(@PathVariable(name = "id") int Codigo, @RequestBody Venta Ventas) {

		Venta Ventas_seleccionado = new Venta();
		Venta Ventas_actualizado = new Venta();

		Ventas_seleccionado = ventaServiceImpl.VentasXID(Codigo);

		Ventas_seleccionado.setCajeros(Ventas.getCajeros());
		Ventas_seleccionado.setMaquinas_Registradoras(Ventas.getMaquinas_Registradoras());
		Ventas_seleccionado.setProductos(Ventas.getProductos());

		Ventas_actualizado = ventaServiceImpl.actualizarVentas(Ventas_seleccionado);

		System.out.println("El Ventas actualizado es: " + Ventas_actualizado);

		return Ventas_actualizado;
	}

	@DeleteMapping("/Ventas/{id}")
	public void eliminarVentas(@PathVariable(name = "id") int Codigo) {
		ventaServiceImpl.eliminarVentas(Codigo);
	}
	
}
