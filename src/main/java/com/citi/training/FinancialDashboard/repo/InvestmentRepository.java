package com.citi.training.FinancialDashboard.repo;

import com.citi.training.FinancialDashboard.entities.Investment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface InvestmentRepository extends JpaRepository<Investment, Integer> {
    // across all accounts
    @Query(value = "SELECT a.uid, a.aid, a.acc_name, i.symbol, i.instr_name, i.instr_type, i.position, i.avg_price, i.market_price" +
                "FROM invested_instruments i" +
                "INNER JOIN investment_accounts a ON i.aid = a.aid" +
                "WHERE a.uid = :uid",
            nativeQuery = true)
    Collection<Investment> findByUserId(@Param("uid") int userId);



//    Collection<Investment> findByUserIdInstrumentType(int userId, InstrumentType instrumentType);
//
//    Collection<Investment> findByUserIdSymbol(int userId, String symbol);
//
//    Collection<Investment> findTopWinnersByUserId(int userId, int limit);
//
//    Collection<Investment> findTopLosersByUserId(int userId, int limit);

    // across single account
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
