package com.citi.training.FinancialDashboard.service;

import com.citi.training.FinancialDashboard.entities.User;

import java.util.Collection;

public interface UserService {

    Collection<User> getAllUsers();

    Collection<Double> getNetWorthByUserId(int userId);

    Collection<User> getAllAccountsByUserId(int userId);

    Collection<User> getAllInvestmentAccountsByUserId(int userId);
}
