package com.citi.training.FinancialDashboard.service;

import org.springframework.stereotype.Service;

@Service
public interface InvestmentAccountService {

    Double getTotalInvestmentValueByUserId(int userId);
}
