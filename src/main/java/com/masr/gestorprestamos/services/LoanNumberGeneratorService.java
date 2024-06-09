package com.masr.gestorprestamos.services;

import com.masr.gestorprestamos.models.trackers.LoanNumberTracker;
import com.masr.gestorprestamos.repositories.LoanNumberTrackerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class LoanNumberGeneratorService {

    @Autowired
    private LoanNumberTrackerRepository trackerRepository;

    @Transactional
    public synchronized String generateLoanNumber() {
        LoanNumberTracker tracker = trackerRepository.findById(1L).orElseGet(() -> {
            LoanNumberTracker newTracker = new LoanNumberTracker();
            newTracker.setLastLoanNumber(0L);
            return newTracker;
        });

        Long newLoanNumber = tracker.getLastLoanNumber() + 1;
        tracker.setLastLoanNumber(newLoanNumber);
        trackerRepository.save(tracker);

        String datePart = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        return datePart + String.format("%06d", newLoanNumber);
    }
}
