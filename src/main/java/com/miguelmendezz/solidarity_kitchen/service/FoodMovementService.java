package com.miguelmendezz.solidarity_kitchen.service;

import com.miguelmendezz.solidarity_kitchen.entity.*;
import com.miguelmendezz.solidarity_kitchen.repository.FoodItemRepository;
import com.miguelmendezz.solidarity_kitchen.repository.FoodMovementRepository;
import org.springframework.stereotype.Service;

@Service
public class FoodMovementService {

    private final FoodItemRepository foodItemRepository;
    private final FoodMovementRepository foodMovementRepository;

    public FoodMovementService(FoodItemRepository foodItemRepository, FoodMovementRepository foodMovementRepository) {
        this.foodItemRepository = foodItemRepository;
        this.foodMovementRepository = foodMovementRepository;
    }

    private void decreaseStock(FoodItem foodItem, int quantity) {
        if (foodItem.getStockQuantity() >= quantity) {
            foodItem.setStockQuantity(foodItem.getStockQuantity() - quantity);
        } else {
            throw new IllegalStateException("Insufficient stock quantity");
        }

        foodItemRepository.save(foodItem);
    }
}
