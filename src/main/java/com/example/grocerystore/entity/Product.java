package com.example.grocerystore.entity;


import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Product {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int price;
    private String description;

    @ManyToOne
    @JoinColumn(name = "supermarket_id")
    private Supermarket supermarket;
}
