package sreekanth.MavenTest2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class AppTest {
	
	@BeforeTest
	
	public void setup() {
		System.out.println("Initial setup page");
	}
	
	@Test
	
	public void duringTest() {
		System.out.println("Hello Test");
	}
	
	@AfterTest
	
	public void closeConnection(){
		System.out.println("Tesitng completed");
	}
	
	
}