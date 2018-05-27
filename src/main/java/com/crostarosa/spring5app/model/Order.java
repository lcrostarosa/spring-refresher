package com.crostarosa.spring5app.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "order")
@Data
public class Order {

    private Order(){}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

//    @OneToMany
//    @JoinTable(name = "order_item", joinColumns = @JoinColumn(name = "id"))
//    private Set<OrderItem> orderItems;
//
//    @ManyToOne()
//    @JoinTable(name = "customer", joinColumns = @JoinColumn(name = "id"))
//    private Customer shipTo;
//
//    @ManyToOne()
//    @JoinTable(name = "customer", joinColumns = @JoinColumn(name = "id"))
//    private Customer billTo;

    private Boolean isFulfilled;
    private Boolean isShipped;
    private Boolean isDelivered;
}
