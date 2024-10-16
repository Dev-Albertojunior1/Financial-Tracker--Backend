package com.financialtracker.financial.tracker.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Data
@Entity
public class FinanceRecord {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String description;
  private Double Amount;
  private String type;  //depends

} 
  






//description;
 //amount;
 //type;
