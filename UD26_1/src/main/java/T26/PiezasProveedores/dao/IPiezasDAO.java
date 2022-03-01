package T26.PiezasProveedores.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import T26.PiezasProveedores.dto.Piezas;


public interface IPiezasDAO extends JpaRepository<Piezas, Long> {

}
