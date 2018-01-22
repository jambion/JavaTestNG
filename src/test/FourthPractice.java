package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FourthPractice {
	
//	@BeforeMethod
//	public void testingBeforeMethod() {
//		System.out.println("Test before method on fourth practice");
//	}
	
	
	@Test
	public void WebLoginHouseLoan() {
		// Selenium
		System.out.println("Web login house");
	}
	
	@Test(timeOut=4000)
	public void MobileLoginCarLoan() {
		// Appium
		System.out.println("Mobile Login House Loan");

	}
	
	@Parameters({"URL"})
	@Test(dependsOnMethods= {"WebLoginHouseLoan"})
	public void LoginAPICarLoan(String urlname) {
		// Rest API automation
		System.out.println("Login API House Loan");
		System.out.println("Should print google: " + urlname);

	}
}
