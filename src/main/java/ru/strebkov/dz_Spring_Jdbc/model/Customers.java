package ru.strebkov.dz_Spring_Jdbc.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@Data
@Builder
@ToString
@Entity
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customers_id", nullable = false)
    private long customersId;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 100, nullable = false)
    private String surname;

    @Column(nullable = false)
    private int age;

    @Column(name = "phone_namber", length = 25)
    private String phoneNamber;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customers")
    private List<Orders> orders;

}
