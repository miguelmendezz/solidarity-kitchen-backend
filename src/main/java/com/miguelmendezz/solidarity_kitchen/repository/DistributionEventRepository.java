package com.miguelmendezz.solidarity_kitchen.repository;

import com.miguelmendezz.solidarity_kitchen.entity.DistributionEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DistributionEventRepository extends JpaRepository<DistributionEvent, Long> {
}
