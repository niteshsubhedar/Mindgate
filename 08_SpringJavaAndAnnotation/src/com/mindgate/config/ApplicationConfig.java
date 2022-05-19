package com.mindgate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.mindgate.pojo.FinancialYearDetails;
import com.mindgate.pojo.MonthsDetails;

@Component
@ComponentScan("com.mindgate.pojo")
public class ApplicationConfig {
	
 @Bean
 public FinancialYearDetails financialYearDetails() {
	 FinancialYearDetails financialYearDetails =new FinancialYearDetails();
	 return financialYearDetails;
 }
 
 @Bean
 public MonthsDetails monthsDetails() {
	 FinancialYearDetails financialYearDetails=new FinancialYearDetails();
	 MonthsDetails monthsDetails =new MonthsDetails();
	 monthsDetails.setFinancialYearDetails(financialYearDetails);
	 return monthsDetails;
 }
}
