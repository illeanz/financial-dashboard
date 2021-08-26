package com.citi.training.FinancialDashboard.repo;

import com.citi.training.FinancialDashboard.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

public interface InvestmentAccountRepository extends JpaRepository<BankingAccount, Integer> {

    @Query(nativeQuery = true,
            value = "SELECT * " +
                    "FROM investment_accounts ia " +
                    "WHERE ia.uid = :userId")
    InvestmentAccount findByUserId(int userId);


    @Query(nativeQuery = true,
            value = "SELECT * " +
                    "FROM investment_accounts ia " +
                    "WHERE ia.aid = :accountId")
    Iterable<InvestmentAccount> findByAccountId(int accountId);

    InvestmentAccount save(InvestmentAccount investmentAccount);
}
