package com.instamart.shopping_delivery.repositories;

import com.instamart.shopping_delivery.models.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AppUserRepository extends JpaRepository <AppUser , UUID>{


}
