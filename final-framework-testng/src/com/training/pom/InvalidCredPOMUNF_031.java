package com.training.pom;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Alert; 

public class InvalidCredPOMUNF_031{

private WebDriver driver; 
	
	public InvalidCredPOMUNF_031(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='dropdown-toggle']")
	private WebElement MyAccount;

	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right myaccount-menu']//a[contains(text(),'Login')]")
	private WebElement Login;
	
	@FindBy(name="email")
	private WebElement Email; 
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//div[@class='form-group']//a[contains(text(),'Forgotten Password')]")
	private WebElement ForgotPwd;
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement EnterEmail;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement Continue;
	

	public void ClickMyAccount() {
		this.MyAccount.click();
	}
	
	public void Login() {
		this.Login.click();
	}
	public void loginBtn() {
		this.loginBtn.click(); 
	}
	public void Forgot() {
		this.ForgotPwd.click(); 
	}
	public void Continue() {
		this.Continue.click(); 
	}
	public void sendEmail(String Email) {
		this.Email.clear();
		this.Email.sendKeys(Email);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void alertaccept(){
		
		//Alert alert1=driver.switchTo().alert();
		String alertmessage1=driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
		System.out.println(alertmessage1);
		//Alert alert=driver.switchTo().alert();
		//alert.accept();
	}
	
}
