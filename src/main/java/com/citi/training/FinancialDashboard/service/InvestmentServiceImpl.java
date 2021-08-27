package com.citi.training.FinancialDashboard.service;

import com.citi.training.FinancialDashboard.entities.Investment;
import com.citi.training.FinancialDashboard.entities.InvestmentId;
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
    public Collection<Investment> getInvestment(int accountId) {
        Collection<Investment> returnVal =  investmentRepository.findByAccountId(accountId);
       return returnVal;
    }

    @Override
    public Investment addInvestment(Investment investment) {
        Investment returnVal =  investmentRepository.save(investment);
        return returnVal;
    }

    @Override
    public void deleteInvestment(Investment investment) {
        investmentRepository.delete(investment);
    }

    @Override
    public Investment modifyInvestmentAvgPrice(int accountId, String symbol, double avgPrice) {
        Investment retrieved = investmentRepository.findByInvestmentId(accountId, symbol);
        retrieved.setAveragePrice(avgPrice);
        investmentRepository.save(retrieved);
        return retrieved;
    }

    @Override
    public Investment modifyInvestmentPosition(int accountId, String symbol, int position) {
        Investment retrieved = investmentRepository.findByInvestmentId(accountId, symbol);
        retrieved.setPosition(position);
        investmentRepository.save(retrieved);
        return retrieved;
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
