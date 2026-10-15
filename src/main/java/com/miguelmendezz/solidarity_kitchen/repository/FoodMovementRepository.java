package com.miguelmendezz.solidarity_kitchen.repository;

import com.miguelmendezz.solidarity_kitchen.entity.FoodMovement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FoodMovementRepository extends JpaRepository<FoodMovement, Long> {
}
