package com.miguelmendezz.solidarity_kitchen.entity.enums;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Entity
public class DistributionEvent {
    @Id
    @GeneratedValue
    private Long id;
    @NotBlank
    private String eventName;
    private LocalDateTime date;

    public DistributionEvent() {
    }

    public DistributionEvent(String eventName, LocalDateTime date) {
        this.eventName = eventName;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String name) {
        this.eventName = eventName;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
