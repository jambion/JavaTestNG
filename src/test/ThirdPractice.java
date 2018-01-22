package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ThirdPractice {
	
	
	@AfterSuite
	public void AfterEverything() {
		System.out.println("I am executing after everything");
	}
	@Test
	public void WebLoginCarLoan() {
		// Selenium
		System.out.println("Web login car");
	}
	
	@Test
	public void MobileLoginCarLoan() {
		// Appium
		System.out.println("Mobile Login Car Loan");

	}
	
	@BeforeSuite
	public void BeforeEverything() {
		System.out.println("I am executing first");
	}
	
	@Test
	public void MobileSignUpCarLoan() {
		// Appium
		System.out.println("Mobile Sign Up Car Loan");

	}
	
	@Test 
	public void LoginAPICarLoan() {
		// Rest API automation
		System.out.println("Login API Car Loan");

	}

}
