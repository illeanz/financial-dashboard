package com.citi.training.FinancialDashboard.repo;

import com.citi.training.FinancialDashboard.entities.AccountHistory;
import com.citi.training.FinancialDashboard.entities.AccountHistoryPK;
import com.citi.training.FinancialDashboard.entities.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Date;
import java.util.Collection;

public interface AccountHistoryRepository extends JpaRepository<AccountHistory, AccountHistoryPK> {

    @Query(nativeQuery = true,
    value = "SELECT * " +
            "FROM account_history ah " +
            "WHERE ah.aid = :accountId AND ah.date >= :start AND ah.date <= :end")
    Collection<AccountHistory> findByAccountIdDateRange(int accountId, Date start, Date end);
}
