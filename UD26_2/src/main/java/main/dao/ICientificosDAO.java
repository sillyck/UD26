package main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import main.dto.Cientificos;

public interface ICientificosDAO extends JpaRepository<Cientificos, Integer>{

}
