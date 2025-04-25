package com.example.grocerystore.service;


import com.example.grocerystore.entity.Supermarket;
import com.example.grocerystore.repository.SupermarketRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
//
@Service
@AllArgsConstructor
public class SupermarketService {
    private SupermarketRepository supermarketRepository;


    public Supermarket save(Supermarket supermarket) {
        return supermarketRepository.save(supermarket);
    }

    public Supermarket getById(Long id) {
        return supermarketRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Error: Supermarket not found"));
    }
}
