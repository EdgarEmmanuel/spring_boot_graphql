package com.microservice_classe.demo;

import com.microservice_classe.demo.dtos.AddClasseDto;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClasseService {

    private ClasseRepository classeRepository;

    public ClasseService(ClasseRepository classeRepository) {
        this.classeRepository = classeRepository;
    }

    public List<Classe> getAll() {
        return this.classeRepository.findAll();
    }


    public Classe addClasse(AddClasseDto classe) {
        return this.classeRepository.save(new Classe(classe.name, classe.code));
    }
}
