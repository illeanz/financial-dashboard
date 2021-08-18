package com.citi.training.FinancialDashboard.repo;

import com.citi.training.FinancialDashboard.entities.BankingAccInfo;
import com.citi.training.FinancialDashboard.entities.BankingType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface BankingAccInfoRepository extends JpaRepository<BankingAccInfo, Integer> {
//    Collection<BankingAccInfo> findByUserId(int userId);

    BankingAccInfo findByAccountId(int accountId);

    Collection<BankingAccInfo> findByBankingType (BankingType bankingType);
}
