package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMUFM_002 {
	private WebDriver driver; 
	
	public LoginPOMUFM_002(WebDriver driver) {
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
	
	
	public void ClickMyAccount() {
		this.MyAccount.click();
	}
	
	public void Login() {
		this.Login.click();
	}
	public void loginBtn() {
		this.loginBtn.click(); 
	}
	public void sendEmail(String Email) {
		this.Email.clear();
		this.Email.sendKeys(Email);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
}
