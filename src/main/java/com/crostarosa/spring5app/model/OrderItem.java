package com.crostarosa.spring5app.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "order_item")
@Data
public class OrderItem {

    private OrderItem () {}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
//
//    @OneToMany()
//    @JoinTable(name = "product", joinColumns = @JoinColumn(name = "id"))
//    private Product product;

    private Integer quantity;
    private Integer pricingAdjustment;
    private Integer lineItemCost;
}
