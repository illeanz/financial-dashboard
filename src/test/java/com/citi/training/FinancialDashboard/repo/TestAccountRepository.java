package com.citi.training.FinancialDashboard.repo;

import com.citi.training.FinancialDashboard.FinancialDashboardApplication;
import com.citi.training.FinancialDashboard.entities.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@ExtendWith(SpringExtension.class)
@DataJpaTest // use an in memory database
@ContextConfiguration(classes= FinancialDashboardApplication.class)
@TestPropertySource(locations = "classpath:application-test.properties") // this is only needed because swagger breaks tests
public class TestAccountRepository {

    @Autowired
    private TestEntityManager manager;

    @Autowired
    private AccountRepository repo;

    private Integer accId;


    @BeforeEach
    public  void setupDatabaseEntryForReadOnlyTests() {
        Account acc = new Account(12345, 1001, "A investment acc", "Investment", 1000.00);
        Account result = manager.persist(acc);
        accId = result.getAccountId();
    }

    @Test
    public void canRetrieveAccountsByUser() {
        Iterable<Account> accs = repo.findByUserId(1001);
        Stream<Account> stream = StreamSupport.stream(accs.spliterator(), false);
        assertThat(stream.count(), equalTo(1L));
        // assertThat(stream.toArray()[0], equalTo(12345));
    }

    @Test
    public void canRetrieveAccountsByAccountType1() {
        Iterable<Account> accs = repo.findByAccountType("Investment");
        Stream<Account> stream = StreamSupport.stream(accs.spliterator(), false);
        assertThat(stream.count(), equalTo(1L));
    }

    @Test
    public void canRetrieveAccountsByAccountType2() {
        Iterable<Account> accs = repo.findByAccountType("Banking");
        Stream<Account> stream = StreamSupport.stream(accs.spliterator(), false);
        assertThat(stream.count(), equalTo(0L));
    }
}
