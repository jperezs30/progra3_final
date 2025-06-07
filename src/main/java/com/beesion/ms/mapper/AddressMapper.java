package com.beesion.ms.mapper;
import com.beesion.ms.model.Address;
import com.beesion.ms.model.Person;
import com.beesion.ms.test.dto.AddressDto;

public class AddressMapper {

    public static Address toEntity(AddressDto dto, Person person) {
        Address a = new Address();
        a.setStreet(dto.getStreet());
        a.setCity(dto.getCity());
        a.setPerson(person);
        return a;
    }
}
