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
import java.util.Optional;

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

    public User getUserById(int userId) {
        Optional<User> userOptional = userRepository.findById(userId);
        if (userOptional.isPresent()) {
            return userOptional.get();
        }
        else return null;
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
//        Collection<Account> matchingAccounts = getAllAccountsByUserId(userId);
//        for (Account account : matchingAccounts) {
//            if(account.getAccountType() == AccountType.Investment)
//                matchingAccounts.add(account);
//        }
//        return matchingAccounts;

        return null;
    }

    @Override
    public User addNewUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUserByID(int userId) {
        User toBeDeleted = userRepository.findById(userId).get();
        userRepository.delete(toBeDeleted);
    }

}
