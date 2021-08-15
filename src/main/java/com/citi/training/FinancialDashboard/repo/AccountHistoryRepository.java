package com.citi.training.FinancialDashboard.repo;

import com.citi.training.FinancialDashboard.entities.AccountHistory;
import com.citi.training.FinancialDashboard.entities.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.Date;

public interface AccountHistoryRepository extends JpaRepository<AccountHistory, Integer> {

    Collection<AccountHistory> findByAccountIdDateRange(int accountId, Date start, Date end);

    Collection<AccountHistory> findByAccountTypeDateRange(AccountType accountType, Date start, Date end);
}
