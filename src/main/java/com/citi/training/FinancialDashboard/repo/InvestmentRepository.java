package com.citi.training.FinancialDashboard.repo;

import com.citi.training.FinancialDashboard.entities.Investment;
import com.citi.training.FinancialDashboard.entities.InvestmentId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

public interface InvestmentRepository extends JpaRepository<Investment, InvestmentId> {

//    These are not to be done for now!!!!

//    int getTotalInvestmentValueByUserId(int userId);
//
//    Collection<Investment> findByAccountIdInstrumentType(int accountId, InstrumentType instrumentType);
//
//    Investment findByAccountIdSymbol(int accountId, String symbol);

    Collection<Investment> findByAccountId(int accountId);

    @Query(nativeQuery = true,
            value = "SELECT * " +
                    "FROM investments i " +
                    "WHERE i.aid = :accountId AND i.symbol = :symbol")
    Investment findByInvestmentId(int accountId, String symbol);

}
