package com.miguelmendezz.solidarity_kitchen.repository;

import com.miguelmendezz.solidarity_kitchen.entity.Volunteer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VolunteerRepository extends JpaRepository<Volunteer, Long> {
}
