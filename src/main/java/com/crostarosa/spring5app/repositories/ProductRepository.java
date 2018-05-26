package com.crostarosa.spring5app.repositories;

import com.crostarosa.spring5app.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, String > {
}
