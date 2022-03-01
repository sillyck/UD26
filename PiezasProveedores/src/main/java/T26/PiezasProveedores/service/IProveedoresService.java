package T26.PiezasProveedores.service;

import java.util.List;

import T26.PiezasProveedores.dto.Proveedores;

public interface IProveedoresService {
	
	public List<Proveedores> listarProveedores();

	public Proveedores guardarProveedores(Proveedores proveedor);

	public Proveedores proveedoresXID(String id);

	public Proveedores actualizarProveedores(Proveedores proveedor);

	public void eliminarProveedores(String id);
}
