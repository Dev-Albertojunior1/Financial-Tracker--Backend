package com.financialtracker.financial.tracker.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

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

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;
}   

//description;
 //amount;
 //type;
