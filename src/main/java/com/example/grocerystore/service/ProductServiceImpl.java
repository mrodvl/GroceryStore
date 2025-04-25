package com.example.grocerystore.service;


import com.example.grocerystore.entity.Product;
import com.example.grocerystore.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElseThrow(()->
                new RuntimeException("Error: Product not found"));
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        Product prodToUpd = productRepository.findById(id).orElseThrow(()-> new RuntimeException("Product not found"));
        prodToUpd.setName(product.getName());
        prodToUpd.setDescription(product.getDescription());
        prodToUpd.setPrice(product.getPrice());
        return productRepository.save(prodToUpd);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
