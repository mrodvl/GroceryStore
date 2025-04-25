package com.example.grocerystore.service;


import com.example.grocerystore.entity.Supermarket;
import com.example.grocerystore.repository.SupermarketRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SupermarketServiceImpl1{
    private SupermarketRepository supermarketRepository; ;

    public Supermarket getById(Long id) {
        Supermarket supermarket =  supermarketRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Error: Supermarket not found"));
        supermarket.setAddress("city: Samara, street: Shipovnikov, 19");
        return supermarket;

    }
}
