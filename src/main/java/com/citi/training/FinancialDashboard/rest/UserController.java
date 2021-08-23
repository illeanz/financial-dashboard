package com.citi.training.FinancialDashboard.rest;


import com.citi.training.FinancialDashboard.entities.Account;
import com.citi.training.FinancialDashboard.entities.User;
import com.citi.training.FinancialDashboard.service.UserService;
import com.citi.training.FinancialDashboard.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(method = RequestMethod.GET, value = "/{userId}")
    public @ResponseBody Double getNetWorthByUserId(@PathVariable int userId) {
        return userService.getNetWorthByUserId(userId);
        //Computed for now instead of aggregation on the front end
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{userId}/account/")
    public Collection<Account> getAllAccountsByUserId(@PathVariable int userId) {
        return userService.getAllAccountsByUserId(userId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}/account/investment")
    public Collection<Account> getAllInvestmentAccountsByUserId(int userId) {
        return userService.getAllInvestmentAccountsByUserId(userId);
    }
}
