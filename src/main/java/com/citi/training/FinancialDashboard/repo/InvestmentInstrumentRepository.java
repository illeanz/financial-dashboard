package com.citi.training.FinancialDashboard.repo;

import com.citi.training.FinancialDashboard.entities.Investment;
import com.citi.training.FinancialDashboard.entities.InvestmentInstrument;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface InvestmentInstrumentRepository extends JpaRepository<InvestmentInstrument, Integer> {

    Collection<Investment> findByAccountId(int accountId);
//
//    Collection<Investment> findByAccountIdInstrumentType(int accountId, InstrumentType instrumentType);
//
//    Investment findByAccountIdSymbol(int accountId, String symbol);
//
//    Collection<Investment> findTopWinnersByAccountId(int accountId, int limit);
//
//    Collection<Investment> findTopLosersByAccountId(int accountId, int limit);
}
