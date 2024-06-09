package com.masr.gestorprestamos.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "borrowers")
public class Borrower {
    @Id
    @GeneratedValue
    private Long id;

    private String firstName;
    private String lastName;
    private String alias;

    @ManyToOne
    @JoinColumn(name = "loan_id")
    private Loan loan;

    @OneToOne
    @JoinColumn(name = "contact_id")
    private Contact contact;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
