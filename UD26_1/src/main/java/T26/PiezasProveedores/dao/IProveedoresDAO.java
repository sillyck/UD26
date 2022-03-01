package T26.PiezasProveedores.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import T26.PiezasProveedores.dto.Proveedores;

public interface IProveedoresDAO extends JpaRepository<Proveedores, String> {

}
