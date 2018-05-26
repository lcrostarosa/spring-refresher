package com.crostarosa.spring5app.repositories;

import com.crostarosa.spring5app.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, String > {



}
