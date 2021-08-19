package com.citi.training.FinancialDashboard.repo;

import com.citi.training.FinancialDashboard.entities.BankingAccountInfo;
import com.citi.training.FinancialDashboard.entities.BankingAccount;
import com.citi.training.FinancialDashboard.entities.BankingType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface BankingAccountRepository extends JpaRepository<BankingAccount, Integer> {
//    Collection<BankingAccountInfo> findByUserId(int userId);

    BankingAccountInfo findByAccountId(int accountId);

    Collection<BankingAccountInfo> findByBankingType(BankingType bankingType);
}
