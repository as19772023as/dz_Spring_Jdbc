package ru.strebkov.dz_Spring_Jdbc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.strebkov.dz_Spring_Jdbc.repository.RepositoryInterface;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/products")
public class ControllerJdbc {

    private RepositoryInterface repository;

    @GetMapping("/fetch-product")
    public List<String> getProductName(@RequestParam(value = "name", required = false) String name) {
        return repository.getProductName(name);
    }


}
