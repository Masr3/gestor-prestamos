package com.masr.gestorprestamos.repositories;

import com.masr.gestorprestamos.models.trackers.LoanNumberTracker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanNumberTrackerRepository extends JpaRepository<LoanNumberTracker, Long>{
}
