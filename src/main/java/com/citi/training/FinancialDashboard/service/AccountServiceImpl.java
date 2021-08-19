package com.citi.training.FinancialDashboard.service;

import com.citi.training.FinancialDashboard.entities.Investment;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AccountServiceImpl implements AccountService{
    @Override
    public Collection<Investment> getTopGainersByUserId(int userId) {
        return null;
    }

    @Override
    public Collection<Investment> getTopLosersByUserId(int userId) {
        return null;
    }

    @Override
    public Double getTotalCashValueByUserId(int userId) {
        return 0.0;
    }

    @Override
    public Collection<Investment> getIndicesUserId(int userId) {
        return null;
    }
}
