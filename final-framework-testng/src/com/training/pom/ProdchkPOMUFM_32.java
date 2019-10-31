package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProdchkPOMUFM_32 {

private WebDriver driver; 
	
	public ProdchkPOMUFM_32(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id='banner0']//div//img[@class='img-responsive']")
	private WebElement PreSchUniform;
	
	@FindBy(xpath="//div[@class='box-content']//div[2]//div[1]//div[1]//div[1]//a[1]//img[1]")
	private WebElement Productclick;
	
	//Royal blue T-shirt is not present,So selected Yellow Tshirt
	
	@FindBy(xpath="//select[@id='input-option376']")
	private WebElement Selsize;
	
	@FindBy(xpath="//button[@id='button-cart']")
	private WebElement AddToCart;
	
	/*@FindBy(xpath="//button[@id='button-cart']")
	private WebElement ChkCartItem;*/
	
	@FindBy(xpath="//strong[contains(text(),'Checkout')]")
	private WebElement Checkout;
	
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
	
}
