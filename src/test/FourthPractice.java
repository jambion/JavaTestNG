package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FourthPractice {
	
	@BeforeMethod
	public void testingBeforeMethod() {
		System.out.println("Test before method on fourth practice");
	}
	
	
	@Test
	public void WebLoginHouseLoan() {
		// Selenium
		System.out.println("Web login house");
	}
	
	@Test
	public void MobileLoginCarLoan() {
		// Appium
		System.out.println("Mobile Login House Loan");

	}
	
	@Test 
	public void LoginAPICarLoan() {
		// Rest API automation
		System.out.println("Login API House Loan");

	}
}
