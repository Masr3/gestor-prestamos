package com.masr.gestorprestamos.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "contacts")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String email;

    @Column(name = "primary_number", nullable = false)
    private Long primaryNumber;

    @Column(name = "secondary_number", nullable = false)
    private Long secondaryNumber;

    @Column(nullable = false)
    private Long telephone;

    @Column(nullable = false)
    private String address;

}
