package com.newjersey.com.monroe;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	

public class LoginTest {

	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
	
		
//		@Test: This is called Annotation; This Annotation tells JUnit to run the public void (Non Static) 
//		to which it is attached.
//		@Test: this is the test method to run
//		@BeforeClass -run once before any of the test methods in the class
//		@Before - Run before @test method 
//		@After - Run after @Test method
//		@AfterClass _Run after all the tests in the class have been run
		
		
		
		
		LoginTest.launchChrome();
		LoginTest.loginTest();
		LoginTest.TearDown();
		
		
		LoginTest.launchChrome();
		LoginTest.NegativeloginTest();
		LoginTest.TearDown();
		

		LoginTest.launchChrome();
		LoginTest.NegativeloginTest1();
		LoginTest.TearDown();

		LoginTest.launchChrome();
		LoginTest.NegativeloginTest2();
		LoginTest.TearDown();

		
	}

	public static void launchChrome() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Driver_Monroe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		}
	
	public static void loginTest () {
		
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		
		
	}
	
public static void NegativeloginTest () {
		
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc1234");
		driver.findElement(By.name("login")).click();
		
		
	}
	
	
public static void NegativeloginTest1 () {
	
	driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
	driver.findElement(By.id("password")).sendKeys("abc1234");
	driver.findElement(By.name("login")).click();
	
	
}
	
public static void NegativeloginTest2 () {
	
	driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
	driver.findElement(By.id("password")).sendKeys("abc1234");
	driver.findElement(By.name("login")).click();
	
	
}
	
	public static void TearDown() {
		
		driver.close();
		
	}
	
}
