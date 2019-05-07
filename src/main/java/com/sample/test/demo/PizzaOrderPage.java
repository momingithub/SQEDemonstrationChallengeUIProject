package com.sample.test.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PizzaOrderPage extends TestBase {
	
	
	public PizzaOrderPage(WebDriver driver) {
		this.driver = driver;
	}

	By Pizza1 = By.id("pizza1Pizza-button"); 
	
	By Toppings1 = By.className("ui-selectmenu-icon ui-icon ui-icon-triangle-1-s");
	
	By Toppings2 = By.className("ui-selectmenu-icon ui-icon ui-icon-triangle-1-s");
	
	By Quantity = By.id("pizza1Qty");
	
	By Cost = By.id("pizza1Cost");
	
	By Email = By.id("email");
	
	By FirstName = By.id("first");
	
	By LastName = By.id("last");
	
	By City = By.id("city");
	
	By State = By.id("state");
	
	By ZipCode = By.id("zip");
	
	By Phone = By.id("phone");
	
	By CreditCard = By.id("ccpayment");
	
	By CashOnPickUp = By.id("cashpayment");
	
	By PlaceOrder = By.xpath("//button[contains(text(), 'Place Order')]");
	
	By Reset = By.xpath("//button[contains(text(), 'Place Order')]");
   
	By Dialog = By.xpath("//div[@id='dialog']/p[1]");
	
	
	public WebElement selectPizza1() {
		return driver.findElement(Pizza1);
	}

	public WebElement selectToppings1() {
		return driver.findElement(Toppings1);
	}

	public WebElement selectToppings2() {
		return driver.findElement(Toppings2);
	}

	public WebElement setQuantity() {
		return driver.findElement(Quantity);
	}

	public WebElement calculateCost() {
		return driver.findElement(Cost);
	}

	public WebElement setEmail() {
		return driver.findElement(Email);
	}

	public WebElement setFirstName() {
		return driver.findElement(FirstName);
	}

	public WebElement setLastName() {
		return driver.findElement(LastName);
	}

	public WebElement setCity() {
		return driver.findElement(City);
	}

	public WebElement setState() {
		return driver.findElement(State);
	}

	public WebElement setZipCode() {
		return driver.findElement(ZipCode);
	}

	public WebElement setPhone() {
		return driver.findElement(Phone);
	}

	public WebElement chooseCreditCard() {
		return driver.findElement(CreditCard);
	}

	public WebElement chooseCashOnPickUp() {
		return driver.findElement(CashOnPickUp);
	}

	public WebElement submitOrder() {
		return driver.findElement(PlaceOrder);
	}

	public WebElement clickReset() {
		return driver.findElement(Reset);
	}
	
	public WebElement checkDialog() {
		return driver.findElement(Dialog);
	}
	
	
	

}
