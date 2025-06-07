/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beesion.ms.mapper;

import com.beesion.ms.model.Person;
import com.beesion.ms.test.dto.PersonDto;



/**
 *
 * @author Fernando
 * Se separó la lógica de mapeo DTO ↔ entidad a PersonMapper (SRP).
 */
public class PersonMapper {

    // Separamos responsabilidad de conversión
    public static Person toEntity(PersonDto dto) {
        Person p = new Person();
        p.setName(dto.getName());
        return p;
    }
}

