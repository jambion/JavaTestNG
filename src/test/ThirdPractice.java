package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ThirdPractice {
//	@BeforeClass
//	public void BeforeClassTest() {
//		System.out.println("Before executing anything in the third class");
//	}
//	
//	@AfterClass
//	public void AfterClassTest() {
//		System.out.println("After executing everything in the third class");
//	}
//	
//	@AfterSuite
//	public void AfterEverything() {
//		System.out.println("I am executing after everything");
//	}
	@Parameters({"URL"})
	@Test
	public void WebLoginCarLoan(String urlname) {
		// Selenium
		System.out.println("Web login car");
		System.out.println(urlname);
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLoginCarLoan() {
		// Appium
		System.out.println("Mobile Login Car Loan");

	}
	
//	@BeforeSuite
//	public void BeforeEverything() {
//		System.out.println("I am executing first");
//	}
	
	@Test(dataProvider="getData")
	public void MobileSignUpCarLoan(String username, String password) {
		// Appium
		System.out.println("Mobile Sign Up Car Loan");
		System.out.println(username + ", " + password); 

	}
	
	@Test
	public void LoginAPICarLoan() {
		// Rest API automation
		System.out.println("Login API Car Loan");

	}
	
	@DataProvider
	public Object[][] getData() {
		// First Combination - Username/ Password - Good Credit = row
		// Second - Username/ Password - No Credit
		// Third - Username/ Password - Fraudelent Credit
		Object[][] data = new Object[3][2];
		//1st Set
		data[0][0] = "FirstUserName";
		data[0][1] = "FirstUserPassword";
		
		//2nd Set
		data[1][0] = "SecondUserName";
		data[1][1] = "SecondUserPassword";
		
		//1st Set
		data[2][0] = "ThirdUserName";
		data[2][1] = "ThirdUserPassword";
		
		return data;
	}

}
