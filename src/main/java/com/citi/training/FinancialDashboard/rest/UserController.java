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
        return userService.getUserById(userId);
    }

    @RequestMapping(method = RequestMethod.POST)
    public User addUser(@RequestBody User user) {
        return userService.addNewUser(user);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{userId}")
    public void deleteUserByID(@PathVariable("userId") int userId) {
        userService.deleteUserByID(userId);
    }

//    Both of these two endpoints to be added to accounts controller
//
//    @RequestMapping(method = RequestMethod.GET, value = "/{userId}/account/")
//    public Collection<Account> getAllAccountsByUserId(@PathVariable int userId) {
//        return userService.getAllAccountsByUserId(userId);
//    }

//    @RequestMapping(method = RequestMethod.GET, value = "/{id}/account/investment")
//    public Collection<Account> getAllInvestmentAccountsByUserId(int userId) {
//        return userService.getAllInvestmentAccountsByUserId(userId);
//    }
}
