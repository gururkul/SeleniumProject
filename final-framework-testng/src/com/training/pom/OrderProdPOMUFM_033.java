package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrderProdPOMUFM_033 {

private WebDriver driver; 
	
	public OrderProdPOMUFM_033(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id='banner0']//div//img[@class='img-responsive']")
	private WebElement PreSchUniform;
	
	@FindBy(xpath="//div[@class='box-content']//div[2]//div[1]//div[1]//div[1]//a[1]//img[1]")
	private WebElement Productclick;
	
	//Royal blue T-shirt is not available,So selected Red Tshirt
	
	@FindBy(xpath="//select[@id='input-option376']")
	private WebElement Selsize;
	
	@FindBy(xpath="//button[@id='button-cart']")
	private WebElement AddToCart;
	
	/*@FindBy(xpath="//button[@id='button-cart']")
	private WebElement ChkCartItem;*/
	
	@FindBy(xpath="//strong[contains(text(),'Checkout')]")
	private WebElement Checkout;
	
	@FindBy(name="email")
	private WebElement Email; 
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='button-login']")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//input[@id='button-payment-address']")
	private WebElement BillingAddrbtn; 
	
	@FindBy(xpath="//input[@id='button-shipping-address']")
	private WebElement ShippingAddrbtn; 
	
	@FindBy(xpath="//textarea[@name='comment']")
	private WebElement EnterText; 
	
	public void ClickPreSchUniform() {
		this.PreSchUniform.click();
	}
	public void Uniform() {
		this.Productclick.click();
	}
	public void Selctsize() {
		Select sel= new Select(Selsize);
		sel.selectByVisibleText("42");
		Selsize.click();
		
	}
	public void AddToCart() {
		this.AddToCart.click();
	}
	public void ChkCartItem() {
		
	WebElement Item= driver.findElement(By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']"));
	Item.click();
	}
	public void Checkout() {
		this.Checkout.click();
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
	public void BillingAddr() {
		this.BillingAddrbtn.click(); 
	}
	public void ShippingAddr() {
		this.ShippingAddrbtn.click(); 
	
	}
	public void EnterText(String Text) {
		this.EnterText.clear();
		this.EnterText.sendKeys(Text);
	}
}
