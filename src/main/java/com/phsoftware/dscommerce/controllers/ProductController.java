package com.phsoftware.dscommerce.controllers;

import com.phsoftware.dscommerce.dto.ProductDTO;
import com.phsoftware.dscommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;

    // GET - Buscar por ID
    @GetMapping(value = "/{id}")
    public ProductDTO findById(@PathVariable Long id) {
        return service.findById(id);
    }

    // GET - Buscar todos
    @GetMapping
    public List<ProductDTO> findAll() {
        return service.findAll();
    }

    // POST - Inserir novo produto
    @PostMapping
    public ProductDTO insert(@RequestBody ProductDTO dto) {
        return service.insert(dto);
    }

    // PUT - Atualizar produto existente
    @PutMapping(value = "/{id}")
    public ProductDTO update(@PathVariable Long id, @RequestBody ProductDTO dto) {
        return service.update(id, dto);
    }

    // DELETE - Remover produto
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
