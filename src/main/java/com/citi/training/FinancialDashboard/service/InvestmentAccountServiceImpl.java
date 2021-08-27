package com.citi.training.FinancialDashboard.service;

import com.citi.training.FinancialDashboard.entities.InvestmentAccount;
import com.citi.training.FinancialDashboard.repo.InvestmentAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Iterator;

@Service
public class InvestmentAccountServiceImpl implements InvestmentAccountService{

    @Autowired
    private InvestmentAccountRepository investmentAccountRepository;

    @Override
    public Double getTotalInvestmentValueByUserId(int userId) {
        Iterable<InvestmentAccount> returnVal =  investmentAccountRepository.findByUserId(userId);
        Double sum = 0d;
        returnVal.forEach(acc -> acc.getValue());
        return sum;
    }

    @Override
    public Iterable<InvestmentAccount> getInvestmentAccountByUserId(int userId) {
        Iterable<InvestmentAccount> returnVal =  investmentAccountRepository.findByUserId(userId);
        return returnVal;
    }

    @Override
    public InvestmentAccount getInvestmentAccountByAccountId(int accountId) {
        Iterable<InvestmentAccount> returnVal = investmentAccountRepository.findByAccountId(accountId);
        return returnVal.iterator().next();
    }

    @Override
    public InvestmentAccount addInvestmentAccount(InvestmentAccount investmentAccount) {
        InvestmentAccount returnVal =  investmentAccountRepository.save(investmentAccount);
        return returnVal;
    }

    @Override
    public void deleteInvestmentAccount(int aid) {
        investmentAccountRepository.deleteById(aid);
    }
}
