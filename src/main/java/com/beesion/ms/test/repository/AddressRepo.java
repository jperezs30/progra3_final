package com.beesion.ms.test.repository;

import com.beesion.ms.model.Address;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class AddressRepo {

    @PersistenceContext
    EntityManager em;

    @Transactional
    public void save(Address address) {
        em.persist(address);
    }

    public List<Address> findByPersonId(Long personId) {
        return em.createQuery("SELECT a FROM Address a WHERE a.person.id = :pid", Address.class)
                 .setParameter("pid", personId)
                 .getResultList();
    }
}
