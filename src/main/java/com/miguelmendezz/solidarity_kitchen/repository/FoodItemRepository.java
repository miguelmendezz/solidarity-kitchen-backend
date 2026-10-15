package com.miguelmendezz.solidarity_kitchen.repository;

import com.miguelmendezz.solidarity_kitchen.entity.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {
}
