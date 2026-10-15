package com.miguelmendezz.solidarity_kitchen.entity;

import com.miguelmendezz.solidarity_kitchen.entity.enums.PersonType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Volunteer {
    @Id
    @GeneratedValue
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String contact;
    @Enumerated(EnumType.STRING)
    private PersonType personType;

    public Volunteer(){
    }

    public Volunteer(String name, String contact, PersonType personType) {
        this.name = name;
        this.contact = contact;
        this.personType = personType;
    }

    public Long getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public PersonType getPersonType() {
        return personType;
    }

    public void setPersonType(PersonType personType) {
        this.personType = personType;
    }
}
