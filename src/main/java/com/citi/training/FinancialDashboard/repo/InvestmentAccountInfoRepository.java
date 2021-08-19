package com.citi.training.FinancialDashboard.repo;

import com.citi.training.FinancialDashboard.entities.InvestmentAccountInfo;
import com.citi.training.FinancialDashboard.entities.InvestmentType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface InvestmentAccountInfoRepository extends JpaRepository<InvestmentAccountInfo, Integer> {
//    Collection<InvestmentAccountInfo> findByUserId(int userId);

    InvestmentAccountInfo findByAccountId(int accountId);

    Collection<InvestmentAccountInfo> findByInvestmentType(InvestmentType investmentType);
}
