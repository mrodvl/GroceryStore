package com.example.grocerystore.service;


import com.example.grocerystore.entity.Product;
import com.example.grocerystore.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {
    private ProductRepository productRepository;



    public Product createProduct(Product product) {
        return productRepository.save(product);
    }


    public Product getProductById(Long id) {
        return productRepository.findById(id).orElseThrow(()-> new RuntimeException("Error: Product not found"));
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();

    }

    public Product updateProduct(Long id, Product product) {
        Product prodToUpd = productRepository.findById(id).orElseThrow(()-> new RuntimeException("Product not found"));
        prodToUpd.setName(product.getName());
        prodToUpd.setDescription(product.getDescription());
        prodToUpd.setPrice(product.getPrice());
        return productRepository.save(prodToUpd);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

}

