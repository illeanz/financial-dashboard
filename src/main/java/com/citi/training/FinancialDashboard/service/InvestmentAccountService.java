package com.citi.training.FinancialDashboard.service;

import com.citi.training.FinancialDashboard.entities.InvestmentAccount;
import org.springframework.stereotype.Service;

@Service
public interface InvestmentAccountService {

    Double getTotalInvestmentValueByUserId(int userId);

    Iterable<InvestmentAccount> getInvestmentAccountByUserId(int userId);

    InvestmentAccount getInvestmentAccountByAccountId(int aid);

    InvestmentAccount addInvestmentAccount(InvestmentAccount investmentAccount);

    void deleteInvestmentAccount(int aid);
}
