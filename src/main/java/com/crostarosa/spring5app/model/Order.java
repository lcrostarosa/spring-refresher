package com.crostarosa.spring5app.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @OneToMany
    private Set<OrderItem> orderItems;
    private Customer shipTo;
    private Customer billTo;

    private Boolean isFulfilled;
    private Boolean isShipped;
    private Boolean isDelivered;
}
