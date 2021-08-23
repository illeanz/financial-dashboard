package com.citi.training.FinancialDashboard.service;

import com.citi.training.FinancialDashboard.entities.Account;
import com.citi.training.FinancialDashboard.entities.Investment;

import java.util.Collection;

public interface AccountService {


    Collection<Investment> getTopGainersByUserId(int userId);

    Collection<Investment> getTopLosersByUserId(int userId);

    Double getTotalCashValueByUserId(int userId);

    Collection<Investment> getIndicesUserId(int userId);

    Account getAccountById(int aid);
}
