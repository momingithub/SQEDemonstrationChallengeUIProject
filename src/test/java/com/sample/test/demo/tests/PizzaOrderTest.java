package com.sample.test.demo.tests;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.sample.test.demo.PizzaOrderPage;
import com.sample.test.demo.TestBase;



public class PizzaOrderTest extends TestBase {
	
	
	@Test
	public void selectPizza() {
		PizzaOrderPage op = new PizzaOrderPage(driver);
		Actions a = new Actions(driver);
		WebElement optionsList = op.selectPizza1();
	    a.moveToElement(optionsList);
		
		List<WebElement> options = driver.findElements(By.className("ui-menu-item"));
	    for(WebElement option : options) {
	    if(option.getText().equals("Small 6 Slices - no toppings $6.75")) {
		option.click();
	}
	}
	}
	
	@Test
	public void vaarifyQuantity() {
		PizzaOrderPage op = new PizzaOrderPage(driver);
		op.setQuantity().click();
		op.setQuantity().sendKeys("3");
		
	}
	
	@Test
	public void validateEmail() {
		PizzaOrderPage op = new PizzaOrderPage(driver);
		op.setEmail().click();
		op.setEmail().sendKeys("mmominn1@gmail.com");
		
	}
	
	@Test
	public void validatePayment() {
		PizzaOrderPage op = new PizzaOrderPage(driver);
		if(!op.chooseCashOnPickUp().isSelected()) {
			op.chooseCashOnPickUp().click();
			assertTrue(op.chooseCashOnPickUp().isSelected());
		}
		
	}
	
	@Test
	public void validateOrder() {
		PizzaOrderPage op = new PizzaOrderPage(driver);
		op.submitOrder().click();
	}
	
	@Test
	public void validateDialog() {
		PizzaOrderPage op = new PizzaOrderPage(driver);
	    String contentOfDialog = op.checkDialog().getText();
	    Assert.assertEquals(contentOfDialog, "Missing email");
	     
	}
	
	
}
