package com.crostarosa.spring5app.repositories;

import com.crostarosa.spring5app.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, String> {
}
