package com.microservice_classe.demo;


import com.microservice_classe.demo.dtos.AddClasseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/classe")
@RequiredArgsConstructor
public class ClasseController {


    private ClasseService classeService;

    public ClasseController(ClasseService classeService) {
        this.classeService = classeService;
    }

    @QueryMapping
    public List<Classe> getAllClasse() {
        return classeService.getAll();
    }

    @MutationMapping(name="createClasse")
    public Classe createClasse(@Argument(value = "classeInput") AddClasseDto addClasseDto) {
        //System.out.println(addClasseDto.name);
        return classeService.addClasse(addClasseDto);
    }


}
