package com.citi.training.FinancialDashboard.repo;

import com.citi.training.FinancialDashboard.FinancialDashboardApplication;
import com.citi.training.FinancialDashboard.entities.AccountHistory;
import com.citi.training.FinancialDashboard.entities.InvestmentInstrument;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.Date;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@ExtendWith(SpringExtension.class)
@DataJpaTest // use an in memory database
@ContextConfiguration(classes= FinancialDashboardApplication.class)
@TestPropertySource(locations = "classpath:application-test.properties") // this is only needed because swagger breaks tests
public class TestAccountHistoryRepository {

    @Autowired
    private AccountHistoryRepository repo;

    @Test
    public void canRetrieveInvestmentByUserId() {
        Iterable<AccountHistory> discs = repo.findByAccountIdDateRange(12345, Date.valueOf("2020-01-01"), Date.valueOf("2021-01-01"));
        Stream<AccountHistory> stream = StreamSupport.stream(discs.spliterator(), false);
        assertThat(stream.count(), equalTo(0L));
    }
}
