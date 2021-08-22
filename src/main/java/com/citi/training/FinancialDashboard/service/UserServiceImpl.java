package com.citi.training.FinancialDashboard.service;

import com.citi.training.FinancialDashboard.entities.User;
import com.citi.training.FinancialDashboard.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public Collection<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Collection<Double> getNetWorthByUserId(int userId) {
        return null;
    }

    @Override
    public Collection<User> getAllAccountsByUserId(int userId) {
        return null;
    }

    @Override
    public Collection<User> getAllInvestmentAccountsByUserId(int userId) {
        return null;
    }

}
