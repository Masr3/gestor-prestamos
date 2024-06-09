package com.masr.gestorprestamos.controllers;

import com.masr.gestorprestamos.services.LoanNumberGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {
    @Autowired
    private LoanNumberGeneratorService loanNumberGeneratorService;

    @GetMapping("/generate-loan-number")
    public String generateLoanNumber() {
        return loanNumberGeneratorService.generateLoanNumber();
    }
}
