package com.financialtracker.financial.tracker.service;

import com.financialtracker.financial.tracker.repository.FinanceRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinanceService {

    @Autowired
    private FinanceRecordRepository financeRecordRepository;
    
}