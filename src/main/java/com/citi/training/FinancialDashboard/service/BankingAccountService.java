package com.citi.training.FinancialDashboard.service;

import com.citi.training.FinancialDashboard.entities.BankingAccount;
import com.citi.training.FinancialDashboard.entities.BankingAccountInfo;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface BankingAccountService {

    Collection<BankingAccount> findBankingAccountAll();
    Collection<BankingAccount> findBankingAccountByUserId(int userId);

}
