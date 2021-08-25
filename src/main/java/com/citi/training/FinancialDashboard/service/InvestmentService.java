package com.citi.training.FinancialDashboard.service;

import com.citi.training.FinancialDashboard.entities.Investment;

import java.util.Collection;
import java.util.Date;

public interface InvestmentService {

    int getTotalInvestmentValueByUserId(int userId);

    Collection<Investment> getInvestment(int aid);

    Collection<Investment> getInvestmentOverDateRange(int userId, Date start, Date end);

    Collection<Investment> getInvestmentDetailBySymbol(int userId, String symbol);

    Collection<Investment> getInvestmentDetailBySymbolInRange(int userId, String symbol, Date start, Date end);
}
