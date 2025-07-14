package com.instamart.shopping_delivery.repositories;

import com.instamart.shopping_delivery.models.WareHouse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface WareHouseRepository extends JpaRepository<WareHouse, UUID> {
    
}
