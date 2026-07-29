package com.phsoftware.dscommerce.repositories;

import com.phsoftware.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
