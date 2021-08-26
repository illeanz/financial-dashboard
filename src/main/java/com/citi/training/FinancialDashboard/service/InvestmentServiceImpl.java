package com.citi.training.FinancialDashboard.service;

import com.citi.training.FinancialDashboard.entities.Investment;
import com.citi.training.FinancialDashboard.repo.InvestmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Service
public class InvestmentServiceImpl implements InvestmentService {

    @Autowired
    private InvestmentRepository investmentRepository;


    public int getTotalInvestmentValueByUserId(int userId) {
        return 0;
    }

    @Override
    public Collection<Investment> getInvestment(int aid) {
        return investmentRepository.findByAccountId(aid);
    }

    @Override
    public Investment addInvestment(Investment investment) {
        return investmentRepository.save(investment);
    }

    @Override
    public void deleteInvestment(Investment investment) {
        investmentRepository.delete(investment);
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
