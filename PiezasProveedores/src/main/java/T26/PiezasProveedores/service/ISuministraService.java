package T26.PiezasProveedores.service;

import java.util.List;

import T26.PiezasProveedores.dto.*;
public interface ISuministraService {
	
	public List<Suministra> listarSuministra();

	public Suministra guardarSuministra(Suministra suministra);

	public Suministra suministraXID(int id);

	public List<Suministra> listarSuministraPiezas(Piezas pieza);

	public List<Suministra> listarSuministraProveedores(Proveedores proveedor);

	public Suministra actualizarSuministra(Suministra suministra);

	public void eliminarSuministra(int id);
}
