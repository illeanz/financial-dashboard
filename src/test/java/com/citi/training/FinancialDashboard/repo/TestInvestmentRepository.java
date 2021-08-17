package com.citi.training.FinancialDashboard.repo;

import com.citi.training.FinancialDashboard.FinancialDashboardApplication;
import com.citi.training.FinancialDashboard.entities.Investment;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@ExtendWith(SpringExtension.class)
@DataJpaTest // use an in memory database
@ContextConfiguration(classes= FinancialDashboardApplication.class)
@TestPropertySource(locations = "classpath:application-test.properties") // this is only needed because swagger breaks tests
public class TestInvestmentRepository {

    @Autowired
    private InvestmentRepository repo;

    @Test
    public void canRetrieveInvestmentByUserId() {
        Iterable<Investment> discs = repo.findByUserId(1001);
        Stream<Investment> stream = StreamSupport.stream(discs.spliterator(), false);
        Optional<Investment> firstInvestment = stream.findFirst();
        System.out.println(firstInvestment.toString());
        assertThat(stream.count(), equalTo(1L));
    }
}
