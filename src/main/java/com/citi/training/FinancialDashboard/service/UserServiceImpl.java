package com.citi.training.FinancialDashboard.service;

import com.citi.training.FinancialDashboard.entities.Account;
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
        //implementation
        return null;
    }

    @Override
    public Collection<Account> getAllAccountsByUserId(int userId) {
        List userIds = new ArrayList<Integer>();
        userIds.add(userId);
        Collection<Account> temp =  accountRepository.findAllById(userIds);
        return temp;
    }

    @Override
    public Collection<User> getAllInvestmentAccountsByUserId(int userId) {
        return null;
    }

}
