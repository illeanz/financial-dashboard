package com.citi.training.FinancialDashboard.rest;


import com.citi.training.FinancialDashboard.entities.Account;
import com.citi.training.FinancialDashboard.entities.User;
import com.citi.training.FinancialDashboard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping(method = RequestMethod.GET, value = "/networth/{userId}")
    public @ResponseBody Double getNetWorthByUserId(@PathVariable int userId) {
        return 100.0;
        //Returning dummy value, aggregation will be computed front-end
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{userId}")
    public User getByUserId(@PathVariable int userId) {
        // Only for testing purposes, wasn't part of original plan
        return userService.getUserById(userId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{userId}/account/")
    public Collection<Account> getAllAccountsByUserId(@PathVariable int userId) {
        return userService.getAllAccountsByUserId(userId);
    }

//    @RequestMapping(method = RequestMethod.GET, value = "/{id}/account/investment")
//    public Collection<Account> getAllInvestmentAccountsByUserId(int userId) {
//        return userService.getAllInvestmentAccountsByUserId(userId);
//    }
}
