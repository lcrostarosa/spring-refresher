package com.crostarosa.spring5app.repositories;

import com.crostarosa.spring5app.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
