package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPOM {
private WebDriver driver; 
	
	public RegistrationPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[@class='dropdown-toggle']")
	private WebElement MyAccount;

	@FindBy(xpath="//a[contains(text(),'Register')]")
	private WebElement Register;
	
	//Register account
	@FindBy(id="input-firstname")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement email; 
	
	@FindBy(name="telephone")
	private WebElement Telephone; 
	
	@FindBy(name="address_1")
	private WebElement Address1; 
	
	@FindBy(name="city")
	private WebElement City; 
	
	@FindBy(name="postcode")
	private WebElement Postcode;
	
	@FindBy(xpath="//select[@id='input-country']")
	private WebElement Country;
	
	@FindBy(xpath="//select[@id='input-zone']")
	private WebElement State;
	
	@FindBy(name="password")
	private WebElement Password;
	
	@FindBy(name="confirm")
	private WebElement PasswordConfirm;
	
	@FindBy(name="agree")
	private WebElement Agree;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement Continue;
	
	public void ClickMyAccount() {
		this.MyAccount.click();
	}
	
	
	public void RegisterAccount() {
	    this.Register.click();
		
	}
	public void sendfirstname(String firstname) {
		this.firstname.clear();
		this.firstname.sendKeys(firstname);
	}
	
	public void sendlasttname(String lastname) {
		this.lastname.clear();
		this.lastname.sendKeys(lastname);
	}
	
	public void sendemail(String email) {
		this.email.clear();
		this.email.sendKeys(email);
	}
	public void sendTelephone(String Telephone) {
		this.Telephone.clear();
		this.Telephone.sendKeys(Telephone);
	}
	public void sendAddress1(String Address1) {
		this.Address1.clear();
		this.Address1.sendKeys(Address1);
	}
	public void sendCity(String City) {
		this.City.clear();
		this.City.sendKeys(City);
	}
	public void sendPostcode(String Postcode) {
		this.Postcode.clear();
		this.Postcode.sendKeys(Postcode);
	}
	public void sendCountry(String Country) {
		Select sel = new Select(this.Country);
		sel.selectByVisibleText(Country);
	}
	
	public void sendState(String State) {
		Select sel = new Select(this.State);
		sel.selectByVisibleText(State);
	}
	public void sendPassword(String Password) {
		this.Password.clear();
		this.Password.sendKeys(Password);
	}
	
	public void sendPasswordConfirm(String PasswordConfirm) {
		this.PasswordConfirm.clear();
		this.PasswordConfirm.sendKeys(PasswordConfirm);
	}
	public void sendAgree() {
		this.Agree.click();
	}
	public void sendContinue() {
		this.Continue.click();
	}
	
}
