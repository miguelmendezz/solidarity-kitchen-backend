package com.miguelmendezz.solidarity_kitchen.repository;

import com.miguelmendezz.solidarity_kitchen.entity.Donor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonorRepository extends JpaRepository<Donor, Long> {
}
