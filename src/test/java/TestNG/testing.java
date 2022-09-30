package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class testing {
	
	@BeforeClass
	private  void beforeclass() {
		System.out.println("before class");
	}
	
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("before method");
	}
	

	@AfterMethod
	private void afterMethod() {
		System.out.println("after method");
		}
	
	
		
	@Test(priority = 2)
	public void test (){
		System.out.println("test method");
	}
	
	@Test(priority = -1)
	public void test01() {
		
		System.out.println("Test method 01");
	}
	
	@Test(priority = -2)
	public void test02() {
		
		System.out.println("Test method 01");
	}
	
	@AfterClass
	private  void afterclass() {
		System.out.println("after class");
	}
}
