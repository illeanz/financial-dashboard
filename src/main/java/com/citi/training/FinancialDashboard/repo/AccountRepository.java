package com.citi.training.FinancialDashboard.repo;

import com.citi.training.FinancialDashboard.entities.Account;
import com.citi.training.FinancialDashboard.entities.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface AccountRepository extends JpaRepository<Account, Integer> {
    Collection<Account> findByUserId(int userId);

    Account findByAccountId(int accountId);

    Collection<Account> findByAccountType(AccountType accountType);
}
