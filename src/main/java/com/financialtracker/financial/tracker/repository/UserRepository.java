package com.financialtracker.financial.tracker.repository;

import com.financialtracker.financial.tracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

}
