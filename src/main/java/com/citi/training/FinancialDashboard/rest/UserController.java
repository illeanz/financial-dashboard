package com.citi.training.FinancialDashboard.rest;


import com.citi.training.FinancialDashboard.entities.User;
import com.citi.training.FinancialDashboard.service.UserService;
import com.citi.training.FinancialDashboard.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public Collection<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping
    public Double getNetWorthByUserId(int userId) {
        return userService.getNetWorthByUserId(userId);
    }

    @GetMapping
    public Collection<User> getAllAccountsByUserId(int userId) {
        return userService.getAllAccountsByUserId(userId);
    }

    @GetMapping
    public Collection<User> getAllInvestmentAccountsByUserId(int userId) {
        return userService.getAllInvestmentAccountsByUserId(userId);
    }
}
