package com.phsoftware.dscommerce.controllers;


import com.phsoftware.dscommerce.dto.ProductDTO;
import com.phsoftware.dscommerce.entities.Product;
import com.phsoftware.dscommerce.repositories.ProductRepository;
import com.phsoftware.dscommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;
    //private ProductRepository repository;

    @GetMapping(value = "/{id}")
    public ProductDTO findById(@PathVariable Long id){
        return service.findById(id);


    }

}
