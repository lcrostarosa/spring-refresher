package com.crostarosa.spring5app.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "product")
@Data
public class Product {

    private Product(){}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String name;
    private String cost;

}
