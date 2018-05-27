package com.crostarosa.spring5app.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "customer")
@Data
public class Customer {

    private Customer(){}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String firstName;
    private String lastName;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String zip;

}
