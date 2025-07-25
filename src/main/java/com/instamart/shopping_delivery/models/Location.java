package com.instamart.shopping_delivery.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    String address;
    String country;
    String states;
    String city;
    int pincode;
    @OneToMany
    List<Location> locations;


}
