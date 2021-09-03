package com.citi.training.FinancialDashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ComponentScan
public class FinancialDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancialDashboardApplication.class, args);
	}

}
