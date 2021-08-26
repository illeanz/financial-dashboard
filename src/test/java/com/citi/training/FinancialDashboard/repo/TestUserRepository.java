package com.citi.training.FinancialDashboard.repo;

import com.citi.training.FinancialDashboard.FinancialDashboardApplication;
import com.citi.training.FinancialDashboard.entities.User;
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
public class TestUserRepository {

    @Autowired
    private TestEntityManager manager;

    @Autowired
    private UserRepository repo;

    private Integer userId;


    @BeforeEach
    public  void setupDatabaseEntryForReadOnlyTests() {
        User user = new User(1001, "123456");
        User result = manager.persist(user);
        userId = result.getId();
    }

    @Test
    public void canRetrieveUsers() {
        Iterable<User> users = repo.findAll();
        Stream<User> stream = StreamSupport.stream(users.spliterator(), false);
        assertThat(stream.count(), equalTo(1L));
    }
}
