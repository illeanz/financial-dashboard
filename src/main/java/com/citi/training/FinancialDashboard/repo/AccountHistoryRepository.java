package com.citi.training.FinancialDashboard.repo;

import com.citi.training.FinancialDashboard.entities.AccountHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountHistoryRepository extends JpaRepository<AccountHistory, Integer> {

//    Collection<AccountHistory> findByAccountIdDateRange(int accountId, Date start, Date end);
//
//    Collection<AccountHistory> findByAccountTypeDateRange(AccountType accountType, Date start, Date end);
}
