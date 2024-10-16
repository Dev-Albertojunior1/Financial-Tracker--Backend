package com.financialtracker.financial.tracker.service;

import com.financialtracker.financial.tracker.model.FinanceRecord;
import com.financialtracker.financial.tracker.model.User;
import com.financialtracker.financial.tracker.repository.FinanceRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinanceService {

    @Autowired
    private FinanceRecordRepository financeRecordRepository;

    private User getCurrentUser(){
        return (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

    public List<FinanceRecord> getAllRecords(){
        return financeRecordRepository.findByUser(getCurrentUser());
    }

    public FinanceRecord addFinanceRecord(FinanceRecord record){
        record.setUser(getCurrentUser());
        return financeRecordRepository.save(record);
    }  
    public void deleteFinanceRecord(Long id){
        FinanceRecord record = financeRecordRepository.findByIdAndUser(id,getCurrentUser());
        if (record != null){
            financeRecordRepository.delete(record);
        }
    }

    public FinanceRecord updateFinanceRecord(Long id, FinanceRecord updateRecord){
        FinanceRecord existingRecord = financeRecordRepository.findByIdAndUser(id, getCurrentUser());
        if (existingRecord != null){
            existingRecord.setAmount(updateRecord.getAmount());
            existingRecord.setDescription(updateRecord.getDescription());
            existingRecord.setType(updateRecord.getType());
            return financeRecordRepository.save(existingRecord);
        }
        return null;
    }
}