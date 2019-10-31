package com.training.sanity.tests;

import org.testng.annotations.Test;

import com.training.pom.ForgotPOM;
import com.training.pom.InvalidCredPOMUNF_031;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class InvalidCredUNF_031 {
	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	public InvalidCredPOMUNF_031 InvalidLPOM;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		baseUrl = properties.getProperty("baseURL");
		InvalidLPOM = new InvalidCredPOMUNF_031(driver);
		// open the browser 
		driver.get(baseUrl);
	
	}
	@Test
	public void ForgotpwdTest() throws InterruptedException {
		InvalidLPOM.ClickMyAccount();
		InvalidLPOM.Login();
		InvalidLPOM.sendEmail("Neha1234@gmail.com");
		InvalidLPOM.sendPassword("Neha");
		InvalidLPOM.loginBtn();
		Thread.sleep(2000);
		InvalidLPOM.alertaccept();
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		
		Thread.sleep(1000);
		//driver.quit();
	}

}
