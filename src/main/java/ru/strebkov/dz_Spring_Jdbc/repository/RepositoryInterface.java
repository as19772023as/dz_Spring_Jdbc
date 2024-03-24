package ru.strebkov.dz_Spring_Jdbc.repository;

import ru.strebkov.dz_Spring_Jdbc.model.Customers;

import java.util.List;

public interface RepositoryInterface {
    List<String> getProductName(String name);

}
