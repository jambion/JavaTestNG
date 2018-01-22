package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Practice {
	
	@AfterTest // Runs test after all tests in this folder completes. Stays in this scope
	public void PostRequisite() {
		System.out.println("I will execute last in this folder");
	}
	
	@Test
	public void Demo() {
		System.out.println("Test");
	}
	
	@Test
	public void Demo2() {
		System.out.println("Test 2");
	}


}
