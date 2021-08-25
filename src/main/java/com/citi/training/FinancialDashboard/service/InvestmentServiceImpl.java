package com.citi.training.FinancialDashboard.service;

import com.citi.training.FinancialDashboard.entities.Investment;
import com.citi.training.FinancialDashboard.repo.InvestmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Date;

@Service
public class InvestmentServiceImpl implements InvestmentService {

    @Autowired
    private InvestmentRepository investmentRepository;

    @Override
    public int getTotalInvestmentValueByUserId(int userId) {
        return 0;
    }

    @Override
    public Collection<Investment> getInvestment(int aid) {
        return null;
    }

    @Override
    public Collection<Investment> getInvestmentOverDateRange(int userId, Date start, Date end) {
        return null;
    }

    @Override
    public Collection<Investment> getInvestmentDetailBySymbol(int userId, String symbol) {
        return null;
    }

    @Override
    public Collection<Investment> getInvestmentDetailBySymbolInRange(int userId, String symbol, Date start, Date end) {
        return null;
    }
}
