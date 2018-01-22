package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondPractice {
	

	@Test(groups= {"Smoke"})
	public void personalLoan() {
		System.out.println("Personal Loan");
	}
	
	@BeforeTest
	public void prerequisite() {
		System.out.println("I will execute first (Day 2 cleanup)");
	}
	
	
}
