package T26.PiezasProveedores.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import T26.PiezasProveedores.dto.*;

public interface ISuministraDAO extends JpaRepository<Suministra, Integer> {
	
	public List<Suministra> findByPieza(Piezas pieza);
	public List<Suministra> findByProveedor(Proveedores proveedor);

}
