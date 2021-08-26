package com.citi.training.FinancialDashboard.service;

import com.citi.training.FinancialDashboard.entities.BankingAccount;
import com.citi.training.FinancialDashboard.entities.BankingAccountInfo;
import com.citi.training.FinancialDashboard.repo.BankingAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BankingAccountServiceImpl implements  BankingAccountService{

    @Autowired
    private BankingAccountRepository bankingAccountRepository;

    @Override
    public Collection<BankingAccount> findBankingAccountAll() {
        return bankingAccountRepository.findAll();
    }
}
