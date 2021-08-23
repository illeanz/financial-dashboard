package com.citi.training.FinancialDashboard.repo;

import com.citi.training.FinancialDashboard.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findAll();
}
