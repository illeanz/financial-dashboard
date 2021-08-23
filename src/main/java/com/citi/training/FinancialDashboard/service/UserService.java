package com.citi.training.FinancialDashboard.service;

import com.citi.training.FinancialDashboard.entities.Account;
import com.citi.training.FinancialDashboard.entities.User;

import java.util.Collection;

public interface UserService {

    Collection<User> getAllUsers();

    Double getNetWorthByUserId(int userId);

    Collection<Account> getAllAccountsByUserId(int userId);

    Collection<User> getAllInvestmentAccountsByUserId(int userId);
}
