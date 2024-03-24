package ru.strebkov.dz_Spring_Jdbc.model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@Data
@Builder
@ToString
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private long id;

    @Column(name = "order_date", nullable = false)
    private String orderDate;

    @Column(name = "product_nane", nullable = false)
    private String productName;

    @Column(nullable = false)
    private int amount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customersId")
    private  Customers customers;

}
