package com.miguelmendezz.solidarity_kitchen.entity;

import com.miguelmendezz.solidarity_kitchen.entity.enums.MovementReason;
import com.miguelmendezz.solidarity_kitchen.entity.enums.MovementType;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class FoodMovement {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private FoodItem foodItem;
    @ManyToOne
    private DistributionEvent distributionEvent;
    @ManyToOne
    private Volunteer volunteer;
    @ManyToOne
    private Donor donor;
    @Enumerated(EnumType.STRING)
    private MovementType movementType;
    @Enumerated(EnumType.STRING)
    private MovementReason movementReason;
    private LocalDateTime timestamp;

    public FoodMovement() {
    }

    public FoodMovement(FoodItem foodItem, DistributionEvent distributionEvent, Volunteer volunteer,
                        Donor donor, MovementType movementType, MovementReason movementReason, LocalDateTime timestamp) {
        this.foodItem = foodItem;
        this.distributionEvent = distributionEvent;
        this.volunteer = volunteer;
        this.donor = donor;
        this.movementType = movementType;
        this.movementReason = movementReason;
        this.timestamp = timestamp;
    }

    public Long getId() {
        return id;
    }

    public FoodItem getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(FoodItem foodItem) {
        this.foodItem = foodItem;
    }

    public DistributionEvent getDistributionEvent() {
        return distributionEvent;
    }

    public void setDistributionEvent(DistributionEvent distributionEvent) {
        this.distributionEvent = distributionEvent;
    }

    public Volunteer getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(Volunteer volunteer) {
        this.volunteer = volunteer;
    }

    public Donor getDonor() {
        return donor;
    }

    public void setDonor(Donor donor) {
        this.donor = donor;
    }

    public MovementType getMovementType() {
        return movementType;
    }

    public void setMovementType(MovementType movementType) {
        this.movementType = movementType;
    }

    public MovementReason movementReason() {
        return movementReason;
    }

    public void setMovementReason(MovementReason movementReason) {
        this.movementReason = movementReason;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
