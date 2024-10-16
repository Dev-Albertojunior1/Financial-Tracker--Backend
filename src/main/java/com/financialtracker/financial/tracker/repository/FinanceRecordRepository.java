package com.financialtracker.financial.tracker.repository;

import com.financialtracker.financial.tracker.model.FinanceRecord;
import com.financialtracker.financial.tracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FinanceRecordRepository extends JpaRepository<FinanceRecord,Long> {
    List<FinanceRecord> findByUser(User user);
    FinanceRecord findByIdAndUser (Long id , User user);

}


