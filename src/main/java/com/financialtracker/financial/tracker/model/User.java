package com.financialtracker.financial.tracker.model;


import jakarta.persistence.GeneratedValue;
import org.springframework.data.annotation.Id;

public class User {

    @Id
    @GeneratedValue
    private Long id;
}
