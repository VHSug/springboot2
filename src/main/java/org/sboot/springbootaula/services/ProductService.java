package org.sboot.springbootaula.services;

import org.sboot.springbootaula.entities.Category;
import org.sboot.springbootaula.entities.Product;
import org.sboot.springbootaula.repositories.CategoryRepository;
import org.sboot.springbootaula.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }

}
