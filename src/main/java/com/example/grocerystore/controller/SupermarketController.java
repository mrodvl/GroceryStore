package com.example.grocerystore.controller;


import com.example.grocerystore.entity.Supermarket;
import com.example.grocerystore.service.SupermarketService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/supermarket")
@AllArgsConstructor
public class SupermarketController {
    private SupermarketService supermarketService;


    @GetMapping
    public ResponseEntity<Supermarket> getSupermarket(@RequestParam Long id) {
        Supermarket getSupermarket = supermarketService.getById(id);
        return ResponseEntity.status(HttpStatus.CREATED).body(getSupermarket);
    }

    @PostMapping
    public ResponseEntity<Supermarket> createSupermarket(@RequestBody Supermarket supermarket) {
        Supermarket createdSupermarket = supermarketService.save(supermarket);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdSupermarket);
    }


}
