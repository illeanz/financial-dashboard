package com.citi.training.FinancialDashboard.service;

import com.citi.training.FinancialDashboard.entities.Account;
import com.citi.training.FinancialDashboard.entities.AccountType;
import com.citi.training.FinancialDashboard.entities.User;
import com.citi.training.FinancialDashboard.repo.AccountRepository;
import com.citi.training.FinancialDashboard.repo.InvestmentRepository;
import com.citi.training.FinancialDashboard.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private InvestmentRepository investmentRepository;

    @Override
    public Collection<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Double getNetWorthByUserId(int userId) {
        Collection<Account> matchingAccounts = getAllAccountsByUserId(userId);
        Double netwoth = 0.0;
        for (Account account : matchingAccounts) {
         netwoth += account.getValue();
        }
        return netwoth;
    }

    @Override
    public Collection<Account> getAllAccountsByUserId(int userId) {
        List userIds = new ArrayList<Integer>();
        userIds.add(userId);
        Collection<Account> matchingAccounts = new ArrayList<>();
        Collection<Account> accounts =  accountRepository.findAll();
        for (Account account : accounts) {
            if(account.getUserId() == userId)
                matchingAccounts.add(account);
        }
        return matchingAccounts;
    }

    @Override
    public Collection<Account> getAllInvestmentAccountsByUserId(int userId) {
        Collection<Account> matchingAccounts = getAllAccountsByUserId(userId);
        for (Account account : matchingAccounts) {
            if(account.getAccountType() == AccountType.Investment)
                matchingAccounts.add(account);
        }
        return matchingAccounts;
    }

}
