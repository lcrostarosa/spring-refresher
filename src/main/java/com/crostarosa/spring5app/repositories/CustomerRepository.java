package com.crostarosa.spring5app.repositories;

import com.crostarosa.spring5app.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
