package com.instamart.shopping_delivery.repositories;

import com.instamart.shopping_delivery.models.AppOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AppOrederRepository extends JpaRepository<AppOrder, UUID> {
}
