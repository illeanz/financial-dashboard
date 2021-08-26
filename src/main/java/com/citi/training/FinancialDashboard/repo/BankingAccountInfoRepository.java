package com.citi.training.FinancialDashboard.repo;

import com.citi.training.FinancialDashboard.entities.BankingAccountInfo;
import com.citi.training.FinancialDashboard.entities.BankingType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface BankingAccountInfoRepository extends JpaRepository<BankingAccountInfo, Integer> {

    Collection<BankingAccountInfo> findBankingAccInfoByUserId(int userId);

    BankingAccountInfo findByAccountId(int accountId);

    Collection<BankingAccountInfo> findByBankingType (BankingType bankingType);
}
