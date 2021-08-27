package com.citi.training.FinancialDashboard.service;

import com.citi.training.FinancialDashboard.entities.Investment;

import java.util.Collection;
import java.util.Date;

public interface InvestmentService {

    Collection<Investment> getInvestment(int aid);

    Collection<Investment> getInvestmentOverDateRange(int userId, Date start, Date end);

    Collection<Investment> getInvestmentDetailBySymbol(int userId, String symbol);

    Collection<Investment> getInvestmentDetailBySymbolInRange(int userId, String symbol, Date start, Date end);

    Investment addInvestment(Investment investment);

    void deleteInvestment(Investment investment);

    Investment modifyInvestmentAvgPrice(int accountId, String symbol, double avgPrice);

    Investment modifyInvestmentPosition(int accountId, String symbol, int position);
}
