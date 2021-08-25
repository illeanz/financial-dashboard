package com.citi.training.FinancialDashboard.service;

import com.citi.training.FinancialDashboard.entities.InvestmentAccountInfo;
import com.citi.training.FinancialDashboard.entities.InvestmentType;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class InvestmentAccountInfoServiceImpl implements InvestmentAccountInfoService{

    @Override
    public InvestmentAccountInfo findByAccountId(int aid) {
        return null;
    }

    @Override
    public Collection<InvestmentAccountInfo> findByInvestmentType(InvestmentType investmentType) {
        return null;
    }
}
