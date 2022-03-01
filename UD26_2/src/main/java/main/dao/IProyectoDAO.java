package main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import main.dto.Proyecto;

public interface IProyectoDAO extends JpaRepository<Proyecto, Integer>{

}
