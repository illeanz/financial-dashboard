package com.citi.training.FinancialDashboard.service;

import com.citi.training.FinancialDashboard.entities.InvestmentAccountInfo;
import com.citi.training.FinancialDashboard.entities.InvestmentType;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface InvestmentAccountInfoService {
    InvestmentAccountInfo findByAccountId(int aid);

    Collection<InvestmentAccountInfo> findByInvestmentType(InvestmentType investmentType);

    Collection<InvestmentAccountInfo> findByUserId(int userId);

    InvestmentAccountInfo addInvestmentAccInfo(InvestmentAccountInfo investmentAccountInfo);

    void deleteInvestmentAccountInfoByAccountId(int aid);
}
