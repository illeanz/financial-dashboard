package com.citi.training.FinancialDashboard.service;

import com.citi.training.FinancialDashboard.repo.InvestmentAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvestmentAccountServiceImpl implements InvestmentAccountService{

    @Autowired
    private InvestmentAccountRepository investmentAccountRepository;

    @Override
    public Double getTotalInvestmentValueByUserId(int userId) {
        return investmentAccountRepository.findByUserId(userId).getValue();
    }
}
