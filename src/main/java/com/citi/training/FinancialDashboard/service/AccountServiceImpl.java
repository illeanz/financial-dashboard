package com.citi.training.FinancialDashboard.service;

import com.citi.training.FinancialDashboard.entities.Account;
import com.citi.training.FinancialDashboard.entities.Investment;
import com.citi.training.FinancialDashboard.repo.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountRepository accountRepository;

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

    @Override
    public Account getAccountById(int aid) {
        Optional<Account> accountOptional = accountRepository.findById(aid);
        if(accountOptional.isPresent())
            return accountOptional.get();
        else
            return null;
    }

    @Override
    public Collection<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Account addNewAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public void deleteAcountByID(int aid) {
        Account toBeDeleted = accountRepository.findById(aid).get();
        accountRepository.delete(toBeDeleted);
    }
}
