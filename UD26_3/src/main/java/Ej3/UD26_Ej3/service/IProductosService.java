package Ej3.UD26_Ej3.service;

import java.util.List;

import Ej3.UD26_Ej3.dto.Productos;

public interface IProductosService {

	public List<Productos> listarProductos();

	public Productos guardarProductos(Productos Productos);

	public Productos ProductosXID(int ID);

	public Productos actualizarProductos(Productos Productos);

	public void eliminarProductos(int ID);
}
