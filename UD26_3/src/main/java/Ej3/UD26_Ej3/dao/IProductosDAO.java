package Ej3.UD26_Ej3.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import Ej3.UD26_Ej3.dto.Productos;

public interface IProductosDAO extends JpaRepository<Productos, Integer>{

}
