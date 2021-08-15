package com.citi.training.FinancialDashboard.repo;

import com.citi.training.FinancialDashboard.entities.InvestmentAccInfo;
import com.citi.training.FinancialDashboard.entities.InvestmentType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface InvestmentAccInfoRepository extends JpaRepository<InvestmentAccInfo, Integer> {
    Collection<InvestmentAccInfo> findByUserId(int userId);

    InvestmentAccInfo findByAccountId(int accountId);

    Collection<InvestmentAccInfo> findByInvestmentType(InvestmentType investmentType);
}
