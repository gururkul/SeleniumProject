package com.training.sanity.tests;

import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.RegistrationPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class ELearningRegistrationUFM_001 {
	
	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	public RegistrationPOM RPOM;

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
		RPOM = new RegistrationPOM(driver);
		// open the browser 
		driver.get(baseUrl);
	}
  @Test
  public void ClickMyAccount() {
	  RPOM.ClickMyAccount();
	  RPOM.RegisterAccount();
	  RPOM.sendfirstname("Neha");
	  RPOM.sendlasttname("B");
	  RPOM.sendemail("neha12345@gmail.com");
	  RPOM.sendTelephone("9241835892");
	  RPOM.sendAddress1("Jayanagar");
	  RPOM.sendCity("Bangalore");
	  RPOM.sendPostcode("560082");
	  RPOM.sendCountry("India");
	  RPOM.sendState("Karnataka");
	  RPOM.sendPassword("Neha123");
	  RPOM.sendPasswordConfirm("Neha123");
	  RPOM.sendAgree();
	  RPOM.sendContinue();
	  
  }
  
  
  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  
	 Thread.sleep(3000);
	 driver.close();
  }

}
