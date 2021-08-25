package com.citi.training.FinancialDashboard.service;

import org.springframework.stereotype.Service;

@Service
public interface InvestmentAccountService {

    int getTotalInvestmentValueByUserId(int userId);
}
