package Ej3.UD26_Ej3.service;

import java.util.List;

import Ej3.UD26_Ej3.dto.Venta;

public interface IVentaService {

	public List<Venta> listarVentas();

	public Venta guardarVentas(Venta venta);

	public Venta VentasXID(int ID);

	public Venta actualizarVentas(Venta venta);

	public void eliminarVentas(int ID);
}