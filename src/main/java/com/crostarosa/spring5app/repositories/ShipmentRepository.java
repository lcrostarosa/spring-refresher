package com.crostarosa.spring5app.repositories;

import com.crostarosa.spring5app.model.Shipment;
import org.springframework.data.repository.CrudRepository;

public interface ShipmentRepository  extends CrudRepository<Shipment, String > {
}
