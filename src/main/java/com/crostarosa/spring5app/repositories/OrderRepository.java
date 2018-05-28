package com.crostarosa.spring5app.repositories;

import com.crostarosa.spring5app.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
