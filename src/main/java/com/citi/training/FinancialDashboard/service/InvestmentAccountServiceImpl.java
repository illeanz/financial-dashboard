package com.citi.training.FinancialDashboard.service;

import com.citi.training.FinancialDashboard.entities.Account;
import com.citi.training.FinancialDashboard.entities.BankingAccount;
import com.citi.training.FinancialDashboard.entities.Investment;
import com.citi.training.FinancialDashboard.entities.InvestmentAccount;
import com.citi.training.FinancialDashboard.repo.InvestmentAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InvestmentAccountServiceImpl implements InvestmentAccountService{

    @Autowired
    private InvestmentAccountRepository investmentAccountRepository;

    @Override
    public Double getTotalInvestmentValueByUserId(int userId) {
        Double returnVal =  investmentAccountRepository.findByUserId(userId).getValue();
        return returnVal;
    }

    @Override
    public InvestmentAccount getInvestmentAccountByUserId(int userId) {
        InvestmentAccount returnVal =  investmentAccountRepository.findByUserId(userId);
        return returnVal;
    }

    @Override
    public InvestmentAccount getInvestmentAccountByAccountId(int aid) {
        Optional<InvestmentAccount> acc = Optional.ofNullable(investmentAccountRepository.findById(aid));
        if (acc.isPresent())
            return acc.get();
        else
            return null;
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
