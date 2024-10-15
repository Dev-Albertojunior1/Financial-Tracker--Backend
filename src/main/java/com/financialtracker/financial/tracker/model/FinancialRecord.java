package com.financialtracker.financial.tracker.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;



@Entity
@Data
public class FinancialRecord {

  @Id
  
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String description;
  private Double amount;
  private String type; //depends 
  
}





//description;
 //amount;
 //type;
