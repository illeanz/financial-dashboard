package com.citi.training.FinancialDashboard.repo;

import com.citi.training.FinancialDashboard.entities.Account;
//import com.citi.training.FinancialDashboard.entities.AccountType;
import com.citi.training.FinancialDashboard.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Integer> {

    Collection<Account> findByUserId(int userId);

    Collection<Account> findByAccountType(String accountType);
}
