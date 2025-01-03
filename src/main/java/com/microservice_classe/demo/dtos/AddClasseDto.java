package com.microservice_classe.demo.dtos;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class AddClasseDto {
    public String name;
    public String code;
}
