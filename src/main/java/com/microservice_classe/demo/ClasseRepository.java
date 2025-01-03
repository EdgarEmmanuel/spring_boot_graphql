package com.microservice_classe.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClasseRepository extends JpaRepository<Classe,Integer> {

    public List<Classe> findAll();
}
