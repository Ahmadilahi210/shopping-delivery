package com.instamart.shopping_delivery.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;
@Data
@Entity
@Table(name = "warehouses")

public class WareHouse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    String name;
    @OneToOne
    AppUser manager;
    @OneToOne
    Location location;

}
