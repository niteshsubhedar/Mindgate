package com.mindgate.main;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindgate.config.ApplicationConfig;
import com.mindgate.pojo.FinancialYearDetails;
import com.mindgate.pojo.MonthsDetails;

public class FinaancialMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		
		ApplicationContext applicationContext =new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
	//	LocalDate startDate=LocalDate.of(2022, 05, 19);
		FinancialYearDetails financialYearDetails=applicationContext.getBean("financialYearDetails",FinancialYearDetails.class);
	financialYearDetails.setYearId(10001);
		financialYearDetails.setYearStartDate(LocalDate.of(2022, 05, 19));
	financialYearDetails.setYearEndDate(LocalDate.of(2022, 12, 31));
		System.out.println(financialYearDetails);
		 
		 System.out.println("_".repeat(50));
		 
		 MonthsDetails monthsDetails =applicationContext.getBean("monthsDetails", MonthsDetails.class);
		monthsDetails.setMonthId(101);
		 monthsDetails.setMonthStartDate(LocalDate.of(2022, 05, 01));
	monthsDetails.setMonthEndDate(LocalDate.of(2022, 05, 30));
		 System.out.println(monthsDetails);
	}

}
