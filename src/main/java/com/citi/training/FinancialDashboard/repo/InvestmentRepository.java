package com.citi.training.FinancialDashboard.repo;

import com.citi.training.FinancialDashboard.entities.Investment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface InvestmentRepository extends JpaRepository<Investment, Integer> {

    Iterable<Investment> findByAccountId(int id);


    //int getTotalInvestmentValueByUserId(int userId);
//
//    Collection<Investment> findByAccountIdInstrumentType(int accountId, InstrumentType instrumentType);
//
//    Investment findByAccountIdSymbol(int accountId, String symbol);
//
//    Collection<Investment> findTopWinnersByAccountId(int accountId, int limit);
//
//    Collection<Investment> findTopLosersByAccountId(int accountId, int limit);
}
