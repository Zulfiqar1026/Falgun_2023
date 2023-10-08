package com.newjersey.com.monroe;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_Junit {

	WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("I am a Before CLass");

	}

	@Before
	public void launchChrome() {
		System.out.println("I am a Before Method");
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Driver_Monroe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void loginTest() {

		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();

	}

//	@Test
	public void NegativeloginTest() {

		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password12")).sendKeys("abc123456");
		driver.findElement(By.name("login")).click();

	}

//	@Test
	public void NegativeloginTest1() {

		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123467889");
		driver.findElement(By.name("login")).click();

	}

	@After
	public void TearDown() {
		System.out.println("I am a After Method");

//		driver.close();
		driver.quit();

	}

	@AfterClass
	public static void afterClass() {
		System.out.println("I am a After CLass");

	}

}
