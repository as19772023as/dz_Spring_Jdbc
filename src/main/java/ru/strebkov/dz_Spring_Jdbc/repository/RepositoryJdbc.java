package ru.strebkov.dz_Spring_Jdbc.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class RepositoryJdbc implements RepositoryInterface {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Override
    public List<String> getProductName(String name) {
        String lowerName = name.toLowerCase();
        return entityManager.createQuery("select o.productName from Orders o\n " +
                        "join Customers c on o.id = c.customersId\n " +
                        "where LOWER(c.name) = ?1")
                .setParameter(1, lowerName)
                .getResultList();
    }

}