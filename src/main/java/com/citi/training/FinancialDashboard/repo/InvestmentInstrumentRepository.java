package com.citi.training.FinancialDashboard.repo;

import com.citi.training.FinancialDashboard.entities.InstrumentType;
import com.citi.training.FinancialDashboard.entities.InvestmentInstrument;
import com.citi.training.FinancialDashboard.entities.InvestmentInstrumentId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

public interface InvestmentInstrumentRepository extends JpaRepository<InvestmentInstrument, InvestmentInstrumentId> {

    Collection<InvestmentInstrument> findByUserId(int userId);

    Collection<InvestmentInstrument> findByAccountId(int accountId);

    Collection<InvestmentInstrument> findBySymbol(String symbol);

    @Query(nativeQuery = true,
    value = "SELECT * " +
            "FROM investment_instruments ii " +
            "WHERE ii.aid = :accountId AND ii.instr_type = :instrumentType")
    Collection<InvestmentInstrument> findByAccountIdInstrumentType(int accountId, InstrumentType instrumentType);

    @Query(nativeQuery = true,
            value = "SELECT * " +
                    "FROM investment_instruments ii " +
                    "WHERE ii.aid = :accountId AND ii.symbol = :symbol")
    InvestmentInstrument findByAccountIdSymbol(int accountId, String symbol);


    @Query(nativeQuery = true,
            value = "SELECT * " +
                    "FROM investment_instruments ii " +
                    "WHERE ii.uid = :userId " +
                    "ORDER BY ii.avg_price - ii.market_price " +
                    "LIMIT :limit")
    Collection<InvestmentInstrument> findTopWinnersByUserId(int userId, int limit);

    @Query(nativeQuery = true,
            value = "SELECT * " +
                    "FROM investment_instruments ii " +
                    "WHERE ii.uid = :userId " +
                    "ORDER BY ii.avg_price - ii.market_price DESC" +
                    "LIMIT :limit")
    Collection<InvestmentInstrument> findTopLosersByUserId(int userId, int limit);

    @Query(nativeQuery = true,
    value = "SELECT * " +
            "FROM investment_instruments ii " +
            "WHERE ii.aid = :accountId " +
            "ORDER BY ii.avg_price - ii.market_price " +
            "LIMIT :limit")
    Collection<InvestmentInstrument> findTopWinnersByAccountId(int accountId, int limit);

    @Query(nativeQuery = true,
            value = "SELECT * " +
                    "FROM investment_instruments ii " +
                    "WHERE ii.aid = :accountId " +
                    "ORDER BY ii.avg_price - ii.market_price DESC" +
                    "LIMIT :limit")
    Collection<InvestmentInstrument> findTopLosersByAccountId(int accountId, int limit);
}
