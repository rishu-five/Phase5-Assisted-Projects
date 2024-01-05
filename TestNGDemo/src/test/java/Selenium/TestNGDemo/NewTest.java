package Selenium.TestNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	@Test(priority=1)
	public void signIn() {
		System.out.println("SignIn intiated ");
		
	}
	
	
	@Test(priority=2)
	public void SignUp() {
		System.out.println("test2 intiated ");
	}
	
	
	@Test(priority=3)
	public void Book() {
		System.out.println("Booking intiated ");
	}
	
	@Test(priority=4)
	public void View() {
		System.out.println("Viewing intiated ");
	}
	@Test(priority=5)
	public void LogOut() {
		System.out.println("Logging out intiated ");
	}
	

}
