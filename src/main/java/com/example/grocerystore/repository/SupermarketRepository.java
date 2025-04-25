package com.example.grocerystore.repository;


import com.example.grocerystore.entity.Supermarket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//
@Repository
public interface SupermarketRepository extends JpaRepository<Supermarket, Long> {
}
