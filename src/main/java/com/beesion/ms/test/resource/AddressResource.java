package com.beesion.ms.test.resource;

import com.beesion.ms.mapper.AddressMapper;
import com.beesion.ms.model.Address;
import com.beesion.ms.model.Person;
import com.beesion.ms.test.dto.AddressDto;
import com.beesion.ms.test.service.IAddressService;
import com.beesion.ms.test.repository.PersonRepo;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/Person/{id}/addresses")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AddressResource {

    @Inject
    IAddressService addressService;

    @Inject
    PersonRepo personRepo;

    @POST
    public Response create(@PathParam("id") Long personId, AddressDto dto) {
        Person person = personRepo.findById(personId);
        System.out.println("Creating address for person with ID: " + personId);
        if (person == null) return Response.status(Response.Status.NOT_FOUND).build();

        Address address = AddressMapper.toEntity(dto, person);
        addressService.save(address);
        return Response.status(Response.Status.CREATED).build();
    }

    @GET
    public Response list(@PathParam("id") Long personId) {
        List<Address> addresses = addressService.getByPersonId(personId);
        return Response.ok(addresses).build();
    }
}

