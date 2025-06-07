package com.beesion.ms.test.service.impl;

import com.beesion.ms.model.Address;
import com.beesion.ms.test.repository.AddressRepo;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import com.beesion.ms.test.service.IAddressService;

import java.util.List;

@ApplicationScoped
public class AddressService implements IAddressService {

    @Inject
    AddressRepo addressRepo;

    @Override
    public void save(Address address) {
        addressRepo.save(address);
    }

    @Override
    public List<Address> getByPersonId(Long personId) {
        return addressRepo.findByPersonId(personId);
    }
}

