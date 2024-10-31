package com.financialtracker.financial.tracker.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import jakarta.persistence.GeneratedValue;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String username;

    private String password;
  



//    @OneToMany(mappedBy = "user" ,  cascade = CascadeType.ALL)
//    private List<FinanceRecord> financeRecords;

}
