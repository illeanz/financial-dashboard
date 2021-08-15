package com.citi.training.FinancialDashboard.repo;

import com.citi.training.FinancialDashboard.entities.InstrumentType;
import com.citi.training.FinancialDashboard.entities.Investment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface InvestmentRepository extends JpaRepository<Investment, Integer> {
    // across all accounts
    Collection<Investment> findByUserId(int userId);

    Collection<Investment> findByUserIdInstrumentType(int userId, InstrumentType instrumentType);

    Collection<Investment> findByUserIdSymbol(int userId, String symbol);

    Collection<Investment> findTopWinnersByUserId(int userId, int limit);

    Collection<Investment> findTopLosersByUserId(int userId, int limit);

    // across single account
    Collection<Investment> findByAccountId(int accountId);

    Collection<Investment> findByAccountIdInstrumentType(int accountId, InstrumentType instrumentType);

    Investment findByAccountIdSymbol(int accountId, String symbol);

    Collection<Investment> findTopWinnersByAccountId(int accountId, int limit);

    Collection<Investment> findTopLosersByAccountId(int accountId, int limit);
}
