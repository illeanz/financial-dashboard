package com.citi.training.FinancialDashboard.repo;

import com.citi.training.FinancialDashboard.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface InvestmentAccountRepository extends JpaRepository<BankingAccount, Integer> {

    InvestmentAccount findByUserId(int userId);

    InvestmentAccount findById(int aid);

    InvestmentAccount save(InvestmentAccount investmentAccount);
}
