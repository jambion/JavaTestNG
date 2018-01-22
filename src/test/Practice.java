package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Practice {
	
	@AfterTest // Runs test after all tests in this folder completes. Stays in this scope
	public void PostRequisite() {
		System.out.println("I will execute last in this folder");
	}
	
	@Parameters({"URL", "Username"})
	@Test
	public void Demo(String urlname, String username) {
		System.out.println("Test Personal Loan");
		System.out.println(urlname + " " + username);
	}
	
	@Test
	public void Demo2() {
		System.out.println("Test 2");
	}


}
