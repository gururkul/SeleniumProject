package com.training.sanity.tests;

import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.OrderProdPOMUFM_033;
import com.training.pom.ProdchkPOMUFM_32;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class ProdOrderUFM_033 {
	private WebDriver driver;
	private String baseUrl;
	private OrderProdPOMUFM_033 OrderProdChk;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		OrderProdChk = new OrderProdPOMUFM_033(driver); 
		
		baseUrl = properties.getProperty("baseURL");
		//screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@Test
	public void CheckProduct() {
		OrderProdChk.ClickPreSchUniform();
		OrderProdChk.Uniform();
		OrderProdChk.Selctsize();
		OrderProdChk.AddToCart();
		OrderProdChk.ChkCartItem();
		OrderProdChk.Checkout();
		OrderProdChk.sendEmail("Neha1234@gmail.com");
		OrderProdChk.sendPassword("Neha123");
		OrderProdChk.loginBtn();
		OrderProdChk.BillingAddr();
		OrderProdChk.ShippingAddr();
		OrderProdChk.EnterText("Please Deliver between 7am to 10 am");
		
		
	}
	
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}
}
