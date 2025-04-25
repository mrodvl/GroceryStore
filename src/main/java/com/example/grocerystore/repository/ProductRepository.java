package com.example.grocerystore.repository;

import com.example.grocerystore.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
